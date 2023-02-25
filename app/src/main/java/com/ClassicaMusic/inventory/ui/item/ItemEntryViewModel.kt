/*
 * Copyright (C) 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.inventory.ui.item

import android.util.Log
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import com.ClassicaMusic.inventory.data.Item
import com.ClassicaMusic.inventory.data.ItemsRepository
import com.ClassicaMusic.inventory.data.OrderUiState

import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import java.time.temporal.ValueRange
import java.util.*

/**
 * View Model to validate and insert items in the Room database.
 */
class ItemEntryViewModel(private val itemsRepository: ItemsRepository) : ViewModel() {

    /**
     * Holds current item ui state
     */
    var itemUiState by mutableStateOf(OrderUiState())
        private set

    var taskUiState by mutableStateOf(HomeUiState())
        private set


    private val _artoUiState = MutableStateFlow(HulkUiState())
    var artoUiState: StateFlow<HulkUiState> = _artoUiState.asStateFlow()


    private var Palabras: MutableSet<String> = mutableSetOf()
    private var Pala: MutableSet<String> = mutableSetOf()
    private var World: MutableSet<String> = mutableSetOf()
    private var Worlds: List<Item> = listOf()
    lateinit var pina: String
    lateinit var hulk: String

    private var k: Int = 0
    private val TAG: String = "book"


    /**
     * Updates the [itemUiState] with the value provided in the argument. This method also triggers
     * a validation for input values.
     */



    fun checkMito(g: String, h: Int) {
        viewModelScope.launch {
            pina = g
            if (e <= h) {
                Palabras.add(pina)
                var eli = itemUiState.alfin
                // Log.d(TAG, " Este es shin en Book------>>> es: $eli!")
                var pelo = Palabras.size
                var tin = getItem()
                //var mas = listade(tin)
                if (pelo == h) {
                    //Log.d(TAG, " Este es shin en Book de relatividad------>>> es: $Palabras!")
                    var tren = listade(Palabras)
                    setNaipe(tren)
                    for (i in 0..h-1){
                        updateUiStateto(i, tren[i])
                        inserItem()
                    }
                    var elo = updateUiSta(tren)
                    updateUiState(tren)
                    uptaItem()
                }
                e += 1
                var english = artoUiState.value.alfin
                Log.d(TAG, " Este es shin en Book------>>> es: $english!")
                checko()
            }
        }
    }

    fun chickMito(g: String, h: Int) {
        viewModelScope.launch {
            pina = g
            if (e <= h) {
                Palabras.add(pina)
                var eli = itemUiState.alfin
                //Log.d(TAG, " Este es shin en Book------>>> es: $eli!")
                var pelo = Palabras.size
                var tren = listade(Palabras)
                //Log.d(TAG, " Este es shin en Last------>>> es: $tren!")
                if (pelo == h) {
                    //Log.d(TAG, " Este es shin en Book de relatividad------>>> es: $Palabras!")
                    for (i in 0..h-1){
                        updateUiStateto(i, tren[i])
                        inserItem()

                    }
                    var elo = taskUiState.itemList
                    setNaipe(tren)
                    //Log.d(TAG, " Este es shin en Book------>>> es: $elo!")
                    updateUiSta(tren)
                    var hulk = elote()
                    updateUiState(tren)
                    uptaItem()
                    var elit = getiItem()
                    Log.d(TAG, " Este es shin en Book---c--->>> es: $elit!")
                }
                e += 1
                var eng = artoUiState.value.alfin

                Log.d(TAG, " Este es shin en Book------>>> es: $eng!")
                checko()
            }
        }
    }



    fun PalabrasUsa(guessdWord: String, mas: Int, l: Long ) {
        pina = guessdWord


    }






    fun listade(a: MutableSet<String>): List<String> {
        val ls = a.asSequence().toList()
        //chicko()
        return ls

    }

    fun listadi(a: MutableSet<String>): List<String> {
        val ls = a.asSequence().toList()
        //chicko()
        return ls

    }

    fun listadeflow(a: Unit): String {
        val ls = a as List<*>
        var ten = ls[0].toString()
        return ten

    }

    fun dulf(item: List<String>) {
        val toque = item
        Log.d(TAG, "Hello -----------en---------------shenshen: $toque !")
        var eloquen = itemUiState.alfin
        // Log.d(TAG, "Hello -----------enter---------------Ganges: $eloquen!")
        // elote()
    }




    fun trelo() {
        pina = "hulk"
        hulk = "ok"
    }


    init {
        trelo()
        //checko()

        k = 0
    }

    var e = k
    var r = k
    var hola = taskUiState.itemList

    fun cark(){
        hola
        // Log.d(TAG, "Hello -----------en--------------shenshen: $hola !")
    }

    /**
     * Inserts an [Item] in the Room database
     */
    suspend fun saveItem() {
        itemsRepository.insertItem(itemUiState.toItem())

    }

    fun checko() {
        viewModelScope.launch {
            val huj = getsItem()
            setNaipe(huj)
            Log.d(TAG, "Hello -----------en---------------shenshen:$huj !")
        }
    }

    fun setNaipe(item: List<String>) {
        _artoUiState.update { currentState ->
            currentState.copy(alfin = item)
        }
        //Elefe(item)
    }

    var minte = mast()

    fun mast(){
        val mas = itemUiState.alfin
        Log.d(TAG, " Los elemantos son igual a-------------on------->>> es: $mas!")
    }


    suspend fun getiItem(): String {
        var uno =  itemsRepository.getItemStream(1)
        var mil = uno.onEach { values -> hulk = values?.name ?: String() }.collect()
        Log.d(TAG, "Hello -----------en--------------shenshen: $hulk !")
        return hulk
    }
    var readAll = itemsRepository.getAllItemsStream()
    suspend fun gitiItem(): String {
        var uno =  itemsRepository.getItemStream(1)
        var mil = uno.onEach { values -> hulk = values?.name ?: String() }.collect()
        Log.d(TAG, "Hello -----------en--------------shenshen: $hulk !")
        return hulk
    }

    suspend fun getItem(): List<Item> {
        val gun = itemsRepository.getAllItemsStream()
        val ten = gun.onEach { values -> Worlds = values }.collect()
        Log.d(TAG, "Hello -----------en--------------shenshen: $World !")
        return Worlds
    }


    suspend fun getsItem(): List<String> {
        val gun = itemsRepository.getAllItemsStream()
        val ten = gun.onEach { values -> hulk = values.toString() }.collect()
        Log.d(TAG, "Hello -----------en--------------shenshen: $World !")
        World.add(hulk)
        val en = listade(World)
        Log.d(TAG, "Hello -----------en--------------shenshen: $en !")
        return en
    }




    fun chicko() {
        viewModelScope.launch {
            val gun = itemsRepository.getAllItemsStream()
            val ten = gun.onEach { values -> hulk = values.toString() }.collect()
            Log.d(TAG, "Hello -----------en--------------shenshen: $World !")
            World.add(hulk)
        }
    }
    suspend fun uptaItem() {
        itemsRepository.updateItem(itemUiState.toItem())

    }


    suspend fun inserItem() {
        itemsRepository.insertItem(itemUiState.toItem())

    }


    suspend fun getItems() {
        itemsRepository.getAllItem()

    }




    fun updateUiStateto(id: Int, name: String) {
        itemUiState = OrderUiState(id = id, name = name)
    }

    fun updateUiSta(alfin: List<String>) {
        itemUiState = OrderUiState(alfin= alfin)
    }

    fun updateUiState(i: List<String>) {
        taskUiState = HomeUiState(i)
    }




    fun elote(){
        val tin = taskUiState.itemList
        Log.d(TAG, "Hello -----------enter---------------homeviewmodel: $tin!")
        // checko()

    }


}



data class HomeUiState(val itemList: List<String> = listOf())





data class HulkUiState(val Id: Int = 0, val name: String = "", val alfin: List<String> = listOf())

/**
 * Represents Ui State for an Item.
 */


/**
 * Extension function to convert [ItemUiState] to [Item]. If the value of [ItemUiState.price] is
 * not a valid [Double], then the price will be set to 0.0. Similarly if the value of
 * [ItemUiState] is not a valid [Int], then the quantity will be set to 0
 */
fun OrderUiState.toItem(): Item = Item(
    id = id,
    name = name
)

/**
 * Extension function to convert [Item] to [ItemUiState]
 */

/**
 * Extension function to convert [Item] to [ItemDetails]
 */

