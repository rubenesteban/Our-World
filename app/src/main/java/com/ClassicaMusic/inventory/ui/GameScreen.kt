package com.ClassicaMusic.inventory.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.TabRowDefaults.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel

import com.ClassicaMusic.inventory.data.OrderUiState

import com.example.inventory.ui.item.ItemEntryViewModel
import kotlin.concurrent.timerTask

//import kotlinx.coroutines.DefaultExecutor.delay

/**
 * Composable that displays the list of items as [RadioButton] options,
 * [onSelectionChanged] lambda that notifies the parent composable when a new value is selected,
 * [onCancelButtonClicked] lambda that cancels the order when user clicks cancel and
 * [onNextButtonClicked] lambda that triggers the navigation to next screen
 */

@ExperimentalFoundationApi
@Composable
fun GameScreen(
    orderUiState: OrderUiState,
    elfin:List<String>,
    modifier: Modifier = Modifier,
    onNextButtonClicked:() -> Unit ={},
    onSelectionChanged:(String) -> Unit ={},
    viewModel: OrderViewModel = viewModel(),
    mainviewModel: ItemEntryViewModel = viewModel(factory = AppViewModelProvider.Factory)

    ) {

    var selectedValue by rememberSaveable{ mutableStateOf("")}

    val result by mainviewModel.readAll.collectAsState(initial = emptyList())



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
                onClick = onNextButtonClicked

            ) {
                Text(text = "Look For", fontSize = 18.sp)
            }
        }
        Divider(thickness = 1.dp, modifier = modifier.padding(bottom = 8.dp))
        Row(
            modifier = modifier
                .padding(16.dp),
        ) {
            WellnesTaskList(
                list = viewModel.tasks,
                onCloseTask = { tasks -> viewModel.remove(tasks, orderUiState.quantity) },
                onAlfinTask = { tasks -> mainviewModel.chickMito( tasks.key, orderUiState.quantity)},
                onAddTask = { viewModel.marte(orderUiState.quantity) })
        }
    }
}




