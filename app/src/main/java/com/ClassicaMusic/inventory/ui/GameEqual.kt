package com.ClassicaMusic.inventory.ui



import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.TabRowDefaults.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.ClassicaMusic.inventory.data.Item

import com.ClassicaMusic.inventory.data.OrderUiState
import com.ClassicaMusic.inventory.datastore.StoreUserEmail

import com.example.inventory.ui.item.ItemEntryViewModel
import kotlinx.coroutines.async


//import kotlinx.coroutines.DefaultExecutor.delay

/**
 * Composable that displays the list of items as [RadioButton] options,
 * [onSelectionChanged] lambda that notifies the parent composable when a new value is selected,
 * [onCancelButtonClicked] lambda that cancels the order when user clicks cancel and
 * [onNextButtonClicked] lambda that triggers the navigation to next screen
 */

@ExperimentalFoundationApi
@Composable
fun GameEqual(
    orderUiState: OrderUiState,
    //hulkUiState:HulkUiState,
    modifier: Modifier = Modifier,
    onNextButtonClicked:(String) -> Unit ,
    onSelectionChanged:(String) -> Unit ={},
    viewModel: OrderViewModel = viewModel(),
    mainviewModel: ItemEntryViewModel = viewModel(factory = AppViewModelProvider.Factory),
    equalviewModel: EcualViewModel = viewModel()


) {

    val result by mainviewModel.readAll.collectAsState(initial = emptyList())
    var selectedValue by rememberSaveable{ mutableStateOf("")}
    var tedValue by rememberSaveable{ mutableStateOf("")}
    val redi by mainviewModel.primo.collectAsState(initial = emptyList<com.ClassicaMusic.inventory.data.Item?>())
    val red by equalviewModel.go.collectAsState(initial = emptyArray<String>())
    val pi = orderUiState.quantity









    var salud by remember {
        mutableStateOf("")
    }

    val eko = salud
    selectedValue = eko


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

            fun sink(a: List<com.ClassicaMusic.inventory.data.Item?>): String {
                val elo = listare(a as List<Item>)
                val ni = elo.size
                val ky = elo.size.toString()
               // val hu = orderUiState.quantity
               // val lk = 49 - ni
               // val rin = lk.toString()
              ////  val ny = elo[ni-1]

                return ky

            }

            val job3 = async { sink(result) }
            val cull = job3.await()
            // val tri = cull
            //val flow = flow<String> { emit(tri)  }

            // val nilo =
            salud = cull

        }.await()

        //salud = "nilo"

    }





    Column(
        modifier = modifier
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {

        Row(modifier = Modifier) {
            Button(
                modifier = modifier
                    .width(303.dp)
                    .height(70.dp)
                    .padding(start = 33.dp),
                onClick = {onNextButtonClicked(eko)}

            ) {
                Text(text = "Module", fontSize = 18.sp)
            }
        }
        Divider(thickness = 1.dp, modifier = modifier.padding(bottom = 8.dp))
        Row(
            modifier = modifier
                .padding(16.dp),
        ) {
            WellTaskList(
                list = result,
                onCloseItem = {item -> viewModel.removae(item.name)},
                onAddTask = {item ->viewModel.Plavores(item.id, item.name)},
                onAddItem = { viewModel.setScore(eko)},
                onOddItem = { viewModel.setScore(eko)}
            )
        }
    }
}




