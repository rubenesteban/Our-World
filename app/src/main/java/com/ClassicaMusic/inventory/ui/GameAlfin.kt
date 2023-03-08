package com.ClassicaMusic.inventory.ui


import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ClassicaMusic.inventory.data.Item


@ExperimentalFoundationApi
@Composable
fun WellTaskList(
    list: List<Item>,
    onCloseItem: (Item) -> Unit,
    onAddTask: (Item) -> Unit,
    onAddItem: () -> Unit,
    onOddItem: () -> Unit,
    modifier: Modifier = Modifier
) {
    LazyRow(modifier = Modifier) {
        items(items = list, key = { item -> item.name })
        { item ->  WellQouItem( item.name, onClose = {onCloseItem(item)} ,
            onAdd = {onAddTask(item)}, onOur = {onAddItem() }, onAur = {onOddItem() }
            ) }
    }
}



@Composable
fun WellQouItem(

    taskName :String,
    onClose: () -> Unit,
    onAdd: () -> Unit,
    onOur: () -> Unit,
    onAur: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = Modifier
            .width(333.dp)
            .height(509.dp)
            .padding(8.dp)
            .clickable {
                    onClose()
                    onAdd()
                    onOur()
                    onAur()

            },
        elevation = 10.dp)
    {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {


            Text(text = taskName, fontSize = 18.sp)

        }
    }
}