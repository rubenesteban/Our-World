
package com.ClassicaMusic.inventory.ui

import android.content.Context
import android.content.Intent
import androidx.annotation.StringRes
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.ClassicaMusic.inventory.data.OrderUiState
import com.example.inventory.R
import com.ClassicaMusic.inventory.data.DataSource.quantityOptions
import com.ClassicaMusic.inventory.datastore.StoreUserEmail
import com.example.inventory.ui.item.ItemEntryViewModel
import kotlinx.coroutines.launch


/**
 * enum values that represent the screens in the app
 */
enum class CupcakeScreen(@StringRes val title: Int) {
    Start(title = R.string.app_name),
    Flavor(title = R.string.choose_flavor),
    Pickup(title = R.string.choose_pickup_date),
    Sunday(title = R.string.order_summary),
    Summary(title = R.string.order_summary)
}


/**
 * Composable that displays the topBar and displays back button if back navigation is possible.
 */
@Composable
fun CupcakeAppBar(
    currentScreen: CupcakeScreen,
    canNavigateBack: Boolean,
    navigateUp: () -> Unit,
    modifier: Modifier = Modifier
) {
    TopAppBar(
        title = { Text(stringResource(currentScreen.title)) },
        modifier = modifier,
        navigationIcon = {
            if (false) {
                IconButton(onClick = navigateUp) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = stringResource(R.string.back_button)
                    )
                }
            }
        }
    )
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CupcakeApp(
    modifier: Modifier = Modifier,
    viewModel: OrderViewModel = viewModel(),
    mainviewModel: ItemEntryViewModel = viewModel(factory = AppViewModelProvider.Factory),
    navController: NavHostController = rememberNavController()
) {
    // Get current back stack entry
    val backStackEntry by navController.currentBackStackEntryAsState()
    // Get the name of the current screen
    val currentScreen = CupcakeScreen.valueOf(
        backStackEntry?.destination?.route ?: CupcakeScreen.Start.name
    )


    Scaffold(
        topBar = {
            CupcakeAppBar(
                currentScreen = currentScreen,
                canNavigateBack = navController.previousBackStackEntry != null,
                navigateUp = { navController.navigateUp() }
            )
        }
    ) { innerPadding ->
        val uiState by viewModel.uiState.collectAsState()


        val result by mainviewModel.readAll.collectAsState(initial = emptyList())

        NavHost(
            navController = navController,
            startDestination = CupcakeScreen.Start.name,
            modifier = modifier.padding(innerPadding)
        ) {
            composable(route = CupcakeScreen.Start.name) {
                StartOrderScreen(
                    quantityOptions = quantityOptions,
                    onNextButtonClicked = {
                        viewModel.setQuantity(it)
                        navController.navigate(CupcakeScreen.Flavor.name)
                        viewModel.uiState.value.alfin
                    }
                )
            }
            composable(route = CupcakeScreen.Flavor.name) {
               // val context = LocalContext.current

                GameScreen(
                    orderUiState = uiState,
                    elfin = uiState.alfin,
                    onNextButtonClicked = {
                        navController.navigate(CupcakeScreen.Pickup.name)
                        viewModel.uiState.value.alfin
                        viewModel.uiState.value.torre
                    },
                    onSelectionChanged = {viewModel.setFlavor(it)},
                )
            }
            composable(route = CupcakeScreen.Pickup.name) {
                //val context = LocalContext.current
                GameAsk(
                    orderUiState = uiState,
                    elfin = uiState.alfin,
                    onNextButtonClicked = {
                        viewModel.uiState.value.quantity
                    navController.navigate(CupcakeScreen.Sunday.name)
                        viewModel.setFlavor(it)

                    },
                    onSelectionChanged = {viewModel.setFlavor(it)},
                    onCancelGame = { cancelOrderAndNavigateToStart(viewModel, navController)},
                    totalTime = 151L * 1000L,
                )
            }

            composable(route = CupcakeScreen.Sunday.name) {
                // val context = LocalContext.current

                GameEqual(
                    orderUiState = uiState,
                   // hulkUiState = HulkUiState,

                    onNextButtonClicked = {
                        navController.navigate(CupcakeScreen.Summary.name)
                        viewModel.setScore(it)
                        mainviewModel.theckList(result,uiState.quantity)

                    },
                    onSelectionChanged = {viewModel.setScore(it)},

                )
            }
            composable(route = CupcakeScreen.Summary.name) {
                val context = LocalContext.current
                OrderSummaryScreen(
                    orderUiState = uiState,
                    onCancelButtonClicked = {
                        cancelOrderAndNavigateToStart(viewModel, navController)
                    },
                    onSendButtonClicked = { subject: String, summary: String ->
                        shareOrder(context, subject = subject, summary = summary)
                    },

                )
            }
        }
    }
}

/**
 * Resets the [OrderUiState] and pops up to [CupcakeScreen.Start]
 */
private fun cancelOrderAndNavigateToStart(
    viewModel: OrderViewModel,
    navController: NavHostController
) {
    viewModel.resetOrder()
    navController.popBackStack(CupcakeScreen.Start.name, inclusive = false)
}

/**
 * Creates an intent to share order details
 */
private fun shareOrder(context: Context, subject: String, summary: String) {
    // Create an ACTION_SEND implicit intent with order details in the intent extras
    val intent = Intent(Intent.ACTION_SEND).apply {
        type = "text/plain"
        putExtra(Intent.EXTRA_SUBJECT, subject)
        putExtra(Intent.EXTRA_TEXT, summary)
    }
    context.startActivity(
        Intent.createChooser(
            intent,
            context.getString(R.string.new_cupcake_order)
        )
    )
}
