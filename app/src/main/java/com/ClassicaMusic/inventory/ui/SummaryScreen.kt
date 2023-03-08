
package com.ClassicaMusic.inventory.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Divider
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.ClassicaMusic.inventory.data.Item
import com.ClassicaMusic.inventory.ui.components.FormattedPriceLabel

import com.ClassicaMusic.inventory.data.OrderUiState
import com.ClassicaMusic.inventory.datastore.StoreUserEmail

import com.example.inventory.R
import com.example.inventory.ui.item.ItemEntryViewModel
import kotlinx.coroutines.launch


/**
 * This composable expects [orderUiState] that represents the order state, [onCancelButtonClicked] lambda
 * that triggers canceling the order and passes the final order to [onSendButtonClicked] lambda
 */
@Composable
fun OrderSummaryScreen(
    orderUiState: OrderUiState,
    onCancelButtonClicked: () -> Unit,
    onSendButtonClicked: (String, String) -> Unit,
    modifier: Modifier = Modifier,
    viewModel: OrderViewModel = viewModel(),
    mainviewModel: ItemEntryViewModel = viewModel(factory = AppViewModelProvider.Factory)


){
    val resources = LocalContext.current.resources

    val list by mainviewModel.readAll.collectAsState(initial = emptyList<Item>())
    val foll by mainviewModel.gol.collectAsState(initial = emptyArray<String>())
    val fill by viewModel.bit.collectAsState(initial = emptyArray<String>())

    val bat = foll
    val aro = fill
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    val dataStore = StoreUserEmail(context)
    val savedEmail = dataStore.getEmail.collectAsState(initial = "")

    var email by remember { mutableStateOf("") }

    email = orderUiState.name
    val numberOfCupcakes = resources.getQuantityString(
        R.plurals.cupcakes,
        orderUiState.quantity,
        orderUiState.quantity
    )
    //Load and format a string resource with the parameters.
    val orderSummary = stringResource(
        R.string.order_details,
        numberOfCupcakes,
        orderUiState.flavor,
        orderUiState.date,
        orderUiState.quantity

    )
    val newOrder = stringResource(R.string.new_cupcake_order)
    //Create a list of order summary to display
    val items = listOf(
        // Summary line 1: display selected quantity
        Pair(stringResource(R.string.quantity), numberOfCupcakes),
        // Summary line 2: display selected flavor
        Pair(stringResource(R.string.flavor), orderUiState.score),
        // Summary line 3: display selected pickup date
        Pair(stringResource(R.string.pickup_date), savedEmail.value!!)
    )

    Column (
        modifier = modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items.forEach { item ->
            Text(item.first.uppercase())
            Text(text = item.second, fontWeight = FontWeight.Bold)
            Divider(thickness = 1.dp)
        }
        Spacer(modifier = Modifier.height(8.dp))
        FormattedPriceLabel(
            subtotal = orderUiState.flavor,
            modifier = Modifier.align(Alignment.End)
        )
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = { scope.launch { dataStore.saveEmail(email) }  }
        ) {
            Text(stringResource(R.string.send))
        }
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = { onSendButtonClicked(newOrder, orderSummary) }
        ) {
            Text(stringResource(R.string.send))
        }
        OutlinedButton(
            modifier = Modifier.fillMaxWidth(),
            onClick = onCancelButtonClicked
        ) {
            Text(stringResource(R.string.cancel))
        }
        Spacer(modifier = Modifier.height(48.dp))

    }
}
/**
@Preview
@Composable
fun OrderSummaryPreview(){
    OrderSummaryScreen(
        orderUiState = OrderUiState(0,"hello", "Test", "Test", "$300.00"),
        onSendButtonClicked = { subject: String, summary: String -> },
        onCancelButtonClicked = {}
    )
}
*/