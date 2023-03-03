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
import androidx.compose.runtime.*
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import com.ClassicaMusic.inventory.data.Item
import com.ClassicaMusic.inventory.data.ItemsRepository
import com.ClassicaMusic.inventory.data.OrderUiState
import com.ClassicaMusic.inventory.ui.Ask
import com.ClassicaMusic.inventory.ui.OrderViewModel
import com.example.inventory.ui.item.ItemEntryViewModel.king.piramide
import com.example.inventory.ui.item.ItemEntryViewModel.kingWork.sol

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


    private val _mar = piramide.toMutableStateList()
    val mar: List<Int>
        get() = _mar


    private var Palabras: MutableSet<String> = mutableSetOf()
    private var Palabra: MutableSet<Int> = mutableSetOf()

    private var Pala: MutableSet<String> = mutableSetOf()
    private var World: MutableSet<String> = mutableSetOf()
    private var Worlds: List<Item> = listOf()
    private var Wolf: List<String> = listOf()
    lateinit var pina: String
    lateinit var hulk: String
    lateinit var hilk: String
    lateinit var bull: String
   // ----------------------------------


    val texto : String by lazy { reloj(bull) }
    val telo : String by lazy { ecua(hilk) }
    val exit : MutableSet<String> by lazy { nilo()}
    val essit : MutableSet<Int> by lazy { amazo()}

    // ----------------------------------

    private var k: Int = 0
    private val TAG: String = "book"


    /**
     * Updates the [itemUiState] with the value provided in the argument. This method also triggers
     * a validation for input values.
     */



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
                   // Log.d(TAG, " Este es shin en Book---c--->>> es: $elit!")
                }
                e += 1
                var eng = artoUiState.value.alfin

                Log.d(TAG, " Este es shin en Book------>>> es: $eng!")
                checko()
            }
        }
    }



    fun PalabrasUsa(guessdWord: String, mas: Int, l: Long, m: List<Item> ) {
        pina = guessdWord
        Worlds = m
        var p = k
        var h=k
        var z = Worlds.size
        World.add(pina)
        var mit = World.size
        for (i in 0..z-1){
            if(Worlds[i].name == pina){
                //chucki(i,pina)
                Pala.add(pina)
                nilo()
                Palabra.add(i)
                amazo()
                h+=1
                if(mit == mas-1){
                    mir(h)
                    sir(h)
                    var nil = h.toString()

                    ecua(nil)
                    Log.d(TAG, "Hello -----------en--------------medida 0: $h !")
                }

            }
        }


        if (mit >= mas-1) {
            mir(8)
            Log.d(TAG, "Hello -----------en--------------medida 0: $mit!")


            val pi = 151000 - l
            val time = pi.toString()
            bull = time
            reloj(bull)

            Log.d(TAG, "Hello -----------en--------------medida 0: $pi !")
            Log.d(TAG, "Hello -----------en--------------medida 0: $pi !")

        }
    }

    fun subir (){
        chocko(10, texto)
        chocko(11, telo)
    }
    fun nilo(): MutableSet<String> {
        return Pala
    }
    fun amazo(): MutableSet<Int> {
        return Palabra
    }


    fun montain(): Flow<String> {
        val uno = "texto"
        val flow = flow<String> { emit("uno")  }
        return flow
    }




    val gol : Flow<String> = montain()

    fun ecua(h: String): String {
        hulk = h
        return hulk
    }


    suspend fun InsertarBD(i:Int, n:String){
        updateUiStateto(i, n)
        inserItem()
    }
    fun chocko(i:Int, n:String) {
        viewModelScope.launch {
            InsertarBD(i, n)
        }
    }

    suspend fun BorrarBD(i:Int, n:String){
        updateUiStateto(i, n)
        borrarItem()
    }
    fun zanahoria(i:Int, n:String) {
        viewModelScope.launch {
            BorrarBD(i, n)

        }
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




    fun topdio(h: String): Flow<String> {
        pina = h
        val flow = flow<String> { emit(pina )  }
        return flow
    }




    val bit : Flow<String> = topdio("hello")



    object king{

        var piramide = number()

        fun number(): List<Int> {
            val miel = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16)
            return miel
        }
    }


    var camello = sol.toMutableStateList()

    fun mir(h:Int){
        if (camello.contains(h)){
            camello.remove(h)
        }
        prueba()

    }
    fun sir(h:Int) {
        if (mar.contains(h)) {
            _mar.remove(h)
        }
        prueba()
    }





    fun prueba() {
        var g = k
        val mir = mar.size
        Log.d(TAG, " Este es shin en Book---1--->>> es: $mir!")
        val miler = camello.size
        Log.d(TAG, " Este es shin en Book----1-->>> es: $miler!")
    }

    var we = prueba()

    object kingWork{

        var sol = number()

        fun number(): List<Int> {
            val miel = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16)
            return miel
        }
    }



    fun trelo() {
        pina = "hulk"
        hulk = "ok"
        hilk = "elo"
        bull = "miel"
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


    var readAll = itemsRepository.getAllItemsStream()






    suspend fun uptaItem() {
        itemsRepository.updateItem(itemUiState.toItem())

    }


    suspend fun inserItem() {
        itemsRepository.insertItem(itemUiState.toItem())

    }

    suspend fun borrarItem() {
        itemsRepository.deleteItem(itemUiState.toItem())

    }

    suspend fun getItems() {
        itemsRepository.getAllItem()

    }

    fun setFlavor(item: String) {
        _artoUiState.update { currentState ->
            currentState.copy(name = item)
        }
        //Elefe(item)
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


    fun reloj(j:String): String {
        bull = j
        return bull
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

