
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.ClassicaMusic.inventory.data.Item
import com.ClassicaMusic.inventory.ui.components.FormattedPriceLabel

import com.ClassicaMusic.inventory.data.OrderUiState
import com.ClassicaMusic.inventory.datastore.StoreUserEmail

import com.example.inventory.R
import com.example.inventory.ui.item.ItemEntryViewModel
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import org.w3c.dom.Text


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

    val list by mainviewModel.primo.collectAsState(initial = emptyList<Item?>())
    val foll by mainviewModel.gol.collectAsState(initial = emptyArray<String>())
    val fill by viewModel.bit.collectAsState(initial = emptyArray<String>())


    val result by mainviewModel.readAll.collectAsState(initial = emptyList())
    var selectedValue by rememberSaveable{ mutableStateOf("")}
    var seleValue by rememberSaveable{ mutableStateOf(0)}


    var score by remember { mutableStateOf(0) }
    var amor by remember {
        mutableStateOf(0)
    }

    val bat = foll
    val aro = fill
    val context = LocalContext.current
    //val scope = rememberCoroutineScope()
    val dataStore = StoreUserEmail(context)
    val savedEmail = dataStore.exampleCounterFlow.collectAsState(initial = 0)

    var email by remember { mutableStateOf("") }


    email = orderUiState.score

    seleValue = amor
    var tri = amor.toString()


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
        Pair(stringResource(R.string.flavor), "$tri"),
        // Summary line 3: display selected pickup date
        Pair(stringResource(R.string.pickup_date), "$tri")
    )







    val scope = rememberCoroutineScope()

    var iScoreRunning by remember {
        mutableStateOf(true)
    }


    LaunchedEffect(key1 = iScoreRunning) {
        scope.async {
            iScoreRunning


            fun listare(a: List<com.ClassicaMusic.inventory.data.Item>): List<String> {
                val ls = a.asSequence().map { it -> it.name }.toList()
                return ls

            }

            fun sink(a: List<com.ClassicaMusic.inventory.data.Item?>): Int {
                val elo = listare(a as List<Item>)
                val hul = elo.size.toString()
                val ni = elo.size
               // val hu = orderUiState.quantity
               // val lk = 49 - ni
                //val rin = lk.toString()
               // val vul = a[ni].name
                //val cue = vul as Int

                return ni

            }

            val job3 = async { sink(result) }
            val cull = job3.await()
            // val tri = cull
            //val flow = flow<String> { emit(tri)  }

            // val nilo =
            amor = cull

        }.await()

        //salud = "nilo"

    }

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
            subtotal = orderUiState.score,
            modifier = Modifier.align(Alignment.End)
        )
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = { scope.launch { dataStore.incrementCounter(amor) }  }
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