package com.ClassicaMusic.inventory.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.TabRowDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel

import com.ClassicaMusic.inventory.data.OrderUiState
import com.example.inventory.ui.item.ItemEntryViewModel
import kotlinx.coroutines.async
import kotlinx.coroutines.delay


@ExperimentalFoundationApi
@Composable
fun GameAsk(
    modifier: Modifier = Modifier,
    orderUiState: OrderUiState,
    elfin:List<String>,
    viewModel: OrderViewModel = viewModel(),
    onNextButtonClicked:(String) -> Unit ,
    onSelectionChanged:(String) -> Unit ={},
    initialValue: Float = 1f,
    totalTime: Long,
    onCancelGame:() -> Unit = {},
    mainviewModel: ItemEntryViewModel = viewModel(factory = AppViewModelProvider.Factory),
    equalviewModel: EcualViewModel = viewModel()

) {

   val result by mainviewModel.readAll.collectAsState(initial = emptyList())
   val resulta by mainviewModel.primo.collectAsState(initial = emptyList<Item?>())
    var selectedValue by rememberSaveable{ mutableStateOf("")}
    val red by equalviewModel.go.collectAsState(initial = emptyArray<Int>())


    var salud by remember {
        mutableStateOf("")
    }

    val eko = red.toString()
    selectedValue = eko


    val scope = rememberCoroutineScope()

    var value by remember {
        mutableStateOf(initialValue)
    }



    var currentTime by remember {
        mutableStateOf(totalTime)
    }
    var isTimerRunning by remember {
        mutableStateOf(true)
    }


    LaunchedEffect(key1 = currentTime, key2 = isTimerRunning) {
        if(currentTime > 0 && isTimerRunning) {
            delay(10L)
            currentTime -= 88L
            value = currentTime / totalTime.toFloat()
        }else{onCancelGame()}

    }





    Column( modifier = modifier
        .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)) {

        Row(modifier = Modifier) {
            Button(
                modifier = modifier
                    .width(151.dp)
                    .height(70.dp)
                    .padding(start = 8.dp),
                onClick = {onNextButtonClicked(eko)}

            ) {
                Text(text = "Find", fontSize = 18.sp)
            }
            Box(
                modifier = Modifier
                    .width(151.dp)
                    .height(70.dp)
                    .padding(start = 16.dp),
            ){
                Text(
                    text = (currentTime / 10L).toString(),
                    fontSize = 44.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            }

        }
        TabRowDefaults.Divider(thickness = 1.dp, modifier = modifier.padding(bottom = 8.dp))
        Row(modifier = modifier
            .padding(16.dp),
        ){

            WellnesWrapList(
                list = viewModel.wrap,
                onCloseTask = { wrap -> viewModel.remove(wrap,orderUiState.quantity)},
                onAddTask = { wrap -> viewModel.PalabrasUsa(wrap.key,orderUiState.quantity, currentTime, result) },
                onOddTask = {wrap -> mainviewModel.PalabrasUsa(wrap.key,orderUiState.quantity, currentTime, result) },

                onAlfinTask = {viewModel.theckList(result )})

            WellnesWrapList(
                list = viewModel.modmar(),
                onCloseTask = { wrap -> viewModel.remove(wrap,orderUiState.quantity)},
                onAddTask = {wrap -> viewModel.PalabrasUsa(wrap.key,orderUiState.quantity, currentTime, result) },
                onOddTask = {wrap -> mainviewModel.PalabrasUsa(wrap.key,orderUiState.quantity, currentTime, result) },

                onAlfinTask = {viewModel.theckList(result)})

        }
    }
}

