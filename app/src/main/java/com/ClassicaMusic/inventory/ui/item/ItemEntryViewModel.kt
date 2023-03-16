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
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ClassicaMusic.inventory.data.Item
import com.ClassicaMusic.inventory.data.ItemsRepository
import com.ClassicaMusic.inventory.data.OrderUiState
import com.ClassicaMusic.inventory.ui.OrderViewModel

import com.example.inventory.R
import com.example.inventory.ui.item.ItemEntryViewModel.king.piramide
import com.example.inventory.ui.item.ItemEntryViewModel.kingWork.sol

import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
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
    private var Brabas: MutableSet<String> = mutableSetOf()
    private var Palabra: MutableSet<Int> = mutableSetOf()

    private var
            Pala: MutableSet<String> = mutableSetOf()
    private var World: MutableSet<String> = mutableSetOf()
    private var Worlds: List<Item> = listOf()
    private var Horlds: List<Item> = listOf()
    private var Wolf: List<String> = listOf()
    private var Wolfi: Flow<String> = flowOf()
    private var Wolfy: Flow<Item?> = flowOf()
    lateinit var pina: String
    lateinit var hulk: String
    lateinit var hilk: String
    lateinit var bull: String
    // ----------------------------------


    val texto: String by lazy { reloj(agua) }

    //val telo : String by lazy { i }
    val exit: MutableSet<String> by lazy { nilo() }
    val essit: MutableSet<Int> by lazy { amazo() }
    val inpar: Flow<String> by lazy { primor() }
    val primo: Flow<Item?> by lazy { remolacha(1) }
    val agua: String by lazy { red() }
    // ----------------------------------

    private var k: Int = 0
    private val TAG: String = "book"
    object tina {
        lateinit var cart: String
        var UserLima: MutableSet<String> = mutableSetOf<String>("")

        val leon = moyi()
        fun moyi(): MutableSet<String> {
            for (i in 1..49) {
                cart = loadAffirmations()[i].key
                UserLima.add(cart)

            }
            return UserLima

        }

    }


    /**
     * Updates the [itemUiState] with the value provided in the argument. This method also triggers
     * a validation for input values.
     */

    var hipotamo = OrderViewModel.tina.leon

    fun ecole(){
        for (i in 0..48){
            var elo = listade(hipotamo)
            chocko(i+1, elo[i])
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
                    for (i in 0..h - 1) {
                        liston(i, tren[i])


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


    fun PalabrasUsa(guessdWord: String, mas: Int, l: Long, m: List<Item>) {
        viewModelScope.launch {
            pina = guessdWord
            Worlds = m
            var p = k
            var h = k
            var z = Worlds.size
            World.add(pina)
            var mit = World.size
            for (i in 0..z - 1) {
                if (Worlds[i].name == pina) {
                    //chucki(i,pina)
                    Pala.add(pina)
                    nilo()
                    var mill = Pala.size.toString()
                    var millu = Pala.size
                    hilk = mill

                    h = mit - millu
                    zanahoria(i, pina)


                }
            }

            val nio = 151000 - l
            val tri = nio.toString()
            hulk = tri
            if (mit == mas - 1) {
                mir(h)
                liston(mas,hilk)
                liston(mas+1, hulk)
                //liston(2,hulk)
                Log.d(TAG, "Hello -----------en--------------medida 0: $h !")
            }


        }
    }

    fun subir (){
        chocko(10, texto)
       // chocko(11, telo)
    }
    fun nilo(): MutableSet<String> {
        return Pala
    }
    fun amazo(): MutableSet<Int> {
        return Palabra
    }


    fun montain(): Flow<String> {
        var uno = primo.toString()
        var eco = listare(uno as List<Item>)
        var elo = eco[1]
        val flow = flow<String> { emit(elo)  }
        return flow
    }


    suspend fun par(): Flow<String> {
        bull = _artoUiState.value.name
        Log.d(TAG, "Hello -----------en--------mmmmmmmmmmmmm------medida 0: $bull   !")

        val flow = flow<String> { emit("5")  }
        return flow
    }

    fun inpar(): Flow<String> {
        bull = _artoUiState.value.name
        Log.d(TAG, "Hello -----------en--------mmmmmmmmmmmmm------medida 0: $bull   !")

        val flow = flow<String> { emit("5")  }
        return flow
    }
   suspend fun  ecuador(): String {
       var uno = primo.toString()
       var eco = listare(uno as List<Item>)
       Log.d(TAG, "Hello -----------en--------mmmmmmmmmmmmm------medida 0: $uno   !")
       var elo = eco[1]
       return uno
    }




    val gole : Flow<Item?> = remolacha(5)
    val gol : Flow<String> = inpar()
    val go : Flow<String> = inpar()



    fun ecua(h: String): String {
        hulk = h
        return hulk
    }


    fun primor(): Flow<String> {
        bull = "chicko()"
        Log.d(TAG, "Hello -----------en--------mmmmmmmmmmmmm------medida 0: $bull   !")

        val flow = flow<String> { emit(bull)  }
        return flow
    }

    fun libro(){
        var mil = primo
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


    suspend fun AptualizarBD(i:Int, n:String){
        updateUiStateto(i, n)
        uptaItem()
    }
    fun liston(i:Int, n:String) {
        viewModelScope.launch {
            AptualizarBD(i, n)
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

    fun remolacha(i:Int): Flow<Item?> {
        viewModelScope.launch {
           val ruc :Flow<Item?> = getItems(5)
            Wolfy = ruc
        }
        return Wolfy
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


    fun listare(a: List<Item>): List<String> {
        val ls = a.asSequence().map { it -> it.name }.toList()
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
         k = 0
        ecole()
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

    fun checko(): Flow<String> {

        viewModelScope.launch {
            val eco:Flow<String> = par()
            Wolfi = eco
        }

        return Wolfi
    }

    fun chicko(): String {

        viewModelScope.launch {
           bull = ecuador()
            Log.d(TAG, "Hello -----------en----hhhhhhhhhhh----------shenshen: $bull !")
        }
            var efo = bull
        return efo
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

    suspend fun getItems(id: Int): Flow<Item?> {
       var hulj = itemsRepository.getItemStream(id)
        return hulj
    }



    fun setFlavor(item: String) {
        _artoUiState.update { currentState ->
            currentState.copy(name = item)
        }
        //Elefe(item)
    }

    fun updateUiSteto( score: String) {
        itemUiState = OrderUiState(score = score)
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

        return j
    }

    fun red(): String {
        hulk = bull
        return hulk
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
    name = name,
    d = 15.0,
    i = 25
)

/**
 * Extension function to convert [Item] to [ItemUiState]
 */

/**
 * Extension function to convert [Item] to [ItemDetails]
 */



data class Item(val Id : Int, val name: String = "")


data class Affirmation(val key : String, val drawable: Int)
private fun loadAffirmations(): List<Affirmation> {
    return listOf<Affirmation>(
        Affirmation("appreciate", R.drawable.undraw_appreciate_it_re_yc8h),
        Affirmation("appreciation", R.drawable.undraw_appreciation_yy29),
        Affirmation("automobile_repair", R.drawable.undraw_automobile_repair_ywci),
        Affirmation("baby", R.drawable.undraw_baby_re_fr9r),
        Affirmation("barista", R.drawable.undraw_barista_re_fm8w),
        Affirmation("basketball", R.drawable.undraw_basketball_re_7701),
        Affirmation("beach_day", R.drawable.undraw_beach_day_cser),
        Affirmation("blooming", R.drawable.undraw_blooming_re_2kc4),
        Affirmation("buddies", R.drawable.undraw_buddies_2ae5),
        Affirmation("by_my_car", R.drawable.undraw_by_my_car_xhk6),
        Affirmation("cat", R.drawable.undraw_cat_s1wg),
        Affirmation("cooking_ceye", R.drawable.undraw_cooking_ceye),
        Affirmation("decorate_christmas_tree", R.drawable.undraw_decorate_christmas_tree_rmj0),
        Affirmation("doctors", R.drawable.undraw_doctors_p6aq),
        Affirmation("dog", R.drawable.undraw_dog_re_63j1),
        Affirmation("educator", R.drawable.undraw_educator_re_ju47),
        Affirmation("electricity", R.drawable.undraw_electricity_k2ft),
        Affirmation("elements", R.drawable.undraw_elements_re_25t9),
        Affirmation("engineering_team", R.drawable.undraw_engineering_team_a7n2),
        Affirmation("experience_design", R.drawable.undraw_experience_design_re_dmqq),
        Affirmation("family", R.drawable.undraw_family_vg76),
        Affirmation("female_avatar", R.drawable.undraw_female_avatar_efig),
        Affirmation("fingerprint_login", R.drawable.undraw_fingerprint_login_re_t71l),
        Affirmation("flying_drone", R.drawable.undraw_flying_drone_u3r2),
        Affirmation("gifts", R.drawable.undraw_gifts_0ceh),
        Affirmation("good_doggy", R.drawable.undraw_good_doggy_re_eet7),
        Affirmation("grand_slam", R.drawable.undraw_grand_slam_84ep),
        Affirmation("halloween", R.drawable.undraw_halloween_re_2kq1),
        Affirmation("happy_new_year", R.drawable.undraw_happy_new_year_di92),
        Affirmation("healthy_habit", R.drawable.undraw_healthy_habit_rdky),
        Affirmation("home_run", R.drawable.undraw_home_run_oyhw),
        Affirmation("in_love", R.drawable.undraw_in_love_993n),
        Affirmation("landscape_photographer", R.drawable.undraw_landscape_photographer_156c),
        Affirmation("love_is", R.drawable.undraw_love_is_in_the_air_4uud),
        Affirmation("make_it_rain", R.drawable.undraw_make_it_rain_re_w9pc),
        Affirmation("male_avatar", R.drawable.undraw_male_avatar_g98d),
        Affirmation("mindfulness", R.drawable.undraw_mindfulness_6xt3),
        Affirmation("passing", R.drawable.undraw_passing_by_0un9),
        Affirmation("pic_profile", R.drawable.undraw_pic_profile_re_7g2h),
        Affirmation("profile_pic", R.drawable.undraw_profile_pic_re_iwgo),
        Affirmation("pumpkin", R.drawable.undraw_pumpkin_re_bm46),
        Affirmation("ready_for_waves", R.drawable.undraw_ready_for_waves_vlke),
        Affirmation("reminder", R.drawable.undraw_reminder_re_fe15),
        Affirmation("running", R.drawable.undraw_running_wild_h6ao  ),
        Affirmation("scientist", R.drawable.undraw_scientist_klqc),
        Affirmation("snow_games", R.drawable.undraw_snow_games_tq9r),
        Affirmation("summer", R.drawable.undraw_summer_1wi4),
        Affirmation("team", R.drawable.undraw_team_up_re_84ok),
        Affirmation("traveling", R.drawable.undraw_traveling_qio0),
        Affirmation("winter_skating", R.drawable.undraw_winter_skating_re_qouk),
        Affirmation("woman", R.drawable.undraw_woman_re_afr8)
    )
}
