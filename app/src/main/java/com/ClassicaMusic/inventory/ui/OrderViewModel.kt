package com.ClassicaMusic.inventory.ui


//import kotlinx.coroutines.flow.internal.NopCollector.emit
//import kotlinx.coroutines.flow.internal.NopCollector.emit

import android.util.Log
import androidx.compose.runtime.*
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ClassicaMusic.inventory.data.Item
import com.ClassicaMusic.inventory.data.OrderUiState
import com.ClassicaMusic.inventory.ui.OrderViewModel.garci.oclose
import com.ClassicaMusic.inventory.ui.OrderViewModel.julian.libre
import com.ClassicaMusic.inventory.ui.OrderViewModel.pegatina.tigre
import com.ClassicaMusic.inventory.ui.OrderViewModel.tina.leon

import com.example.inventory.R
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import java.text.NumberFormat
import java.text.SimpleDateFormat
import java.util.*
import kotlin.properties.Delegates

/** Price for a single cupcake */
private const val PRICE_PER_CUPCAKE = 2.00

/** Additional cost for same day pickup of an order */
private const val PRICE_FOR_SAME_DAY_PICKUP = 3.00

/**
 * [OrderViewModel] holds information about a cupcake order in terms of quantity, flavor, and
 * pickup date. It also knows how to calculate the total price based on these order details.
 */




class OrderViewModel(createSavedStateHandle: SavedStateHandle) : ViewModel(

){

    /**
     * Cupcake state for this order
     */

    val _uiState = MutableStateFlow(OrderUiState(pickupOptions = pickupOptions()))
    val uiState: StateFlow<OrderUiState> = _uiState.asStateFlow()



    //--------------------------
    private val _tasks = libre.toMutableStateList()
    val tasks: List<Affirmation>
        get() = _tasks

    //-----------------------------
    private var
            Work: MutableSet<String> = mutableSetOf<String>("")
    private var Oficio: MutableSet<String> = mutableSetOf<String>("")
    private var Trabajo: MutableSet<String> = mutableSetOf<String>("")
    private var k: Int = 0
    private var h: Int = 0

    var taskUiState by mutableStateOf(HulkUiState())
        private set




    lateinit var pora: String
    lateinit var pino: String
    var pico by Delegates.notNull<Int>()
    lateinit var erGuss: String
    lateinit var oro: String
    lateinit var user: String
    var can by Delegates.notNull<Int>()
    var ten by Delegates.notNull<Int>()
    lateinit var pori: String
    lateinit var pini: String
    var pi by Delegates.notNull<Int>()


    private var userIndixe: MutableSet<String> = mutableSetOf()

    private var userEnter: MutableSet<String> = mutableSetOf()

    private var userEnty: MutableSet<String> = mutableSetOf()

    ///------------------------------

    private var userdPalabras: MutableSet<String> = mutableSetOf()


    private var userdas: MutableSet<String> = mutableSetOf()

    // __________________________________________________
    var userPalabras by mutableStateOf("")
        private set

    private var Palabras: MutableSet<String> = mutableSetOf()

    // __________________________________________________
    var EnPalabras by mutableStateOf("")
        private set

    //---------------------------
    private var userdWords: MutableSet<String> = mutableSetOf()
    private var intercambio: MutableSet<String> = mutableSetOf()

    private var usePalabras: MutableSet<String> = mutableSetOf()
    private var verNumb: MutableSet<Int> = mutableSetOf()
    private var ToldPalabras: List<String> = listOf()
        private set

    // __________________________________________________
    var userGues by mutableStateOf("")
        private set
    lateinit var pera: List<String>
    lateinit var pura: List<String>
    lateinit var pina: List<String>

    var UserGuess: List<String> = listOf()
    var UserTutu: MutableSet<String> = mutableSetOf<String>("")
    var Usertutus: List<String> = listOf()
    var Usertotos: List<Int> = listOf()

    var Usertitis: List<String> = listOf()
    var UserYuyu: MutableSet<String> = mutableSetOf<String>("")
    var UserMars: MutableSet<String> = mutableSetOf<String>("")
    var UserLuna: MutableSet<String> = mutableSetOf<String>("")
    var UserJuess: MutableSet<String> = mutableSetOf<String>("")
        private set
    var itil: List<String> = listOf()
    var carro by mutableStateOf("")
        private set

    // __________________________________________________
    var UserMontain by mutableStateOf("")
        private set   // var UserLuna = arena
    //_-----------------------------------------------
    private val _wrap = oclose.toMutableStateList()
    val wrap: List<Ask>
        get() = _wrap
    //---------------------------------------------

    ///-------------------------------------------

    fun morta(){

    }
    val parw: List<Ask> = listOf()

    //_________________________________________________
    private var traelc: MutableSet<String> = mutableSetOf<String>("")

    //var i : Int = `0`
    private val TAG: String = "Reebook"
    //private val TAG: String = "Reeboojjjk"
    //------------------------------------------------
    /**
     * Set the quantity [numberCupcakes] of cupcakes for this order's state and update the price
     */
    fun setQuantity(numberCupcakes: Int) {
        _uiState.update { currentState ->
            currentState.copy(
                quantity = numberCupcakes,
                price = calculatePrice(quantity = numberCupcakes)
            )
        }
    }


    object julian {
        var libre = loadAffirmations().shuffled()

        val k = 0

    }




    /**
     * Set the [desiredFlavor] of cupcakes for this order's state.
     * Only 1 flavor can be selected for the whole order.
     */
    object garci {
        var oclose = loadAsk().shuffled()
        val l = 0

    }

    // var util = "hello inca"
//---------------------------------------------------
//var UserLuna = moyi()
    val ULuna: MutableSet<String> = mutableSetOf<String>("")

    var elefante = tigre.toMutableStateList()
    var camello = leon.toMutableStateList()
    var uno = elefante.size
    var cano = click4(uno)

    val tula = camello - elefante
    val entry = tula.size
    var eloncuente = click1(entry)
    var bulion = click7(tula)



    object pegatina {
        lateinit var cart: String
        var UserLima: MutableSet<String> = mutableSetOf<String>("")

        val tigre = moyi()
        fun moyi(): MutableSet<String> {
            for (i in 1..49) {
                cart = loadAffirmations()[i].key
                UserLima.add(cart)

            }
            return UserLima

        }

    }



    //----------------------------------------------
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
     var trelo = _uiState.value.alfin
     var nin = elefante - trelo
     var max = camello - elefante



    fun hola() {
        pora = "hello"
        oro = "world"
        erGuss = "-:)"
        user = "elo"
        pino =  "hijo"
        pori = "verde"
        can = 11
        ten = 1
        pura = listOf("a", "b", "c")
        pera = listOf("a", "b", "c", "d")
        pico = 1
        pi = 0

    }


    fun modmar(): List<Ask> {
        val parw = wrap.reversed()
        return parw
    }

    fun setFlavor(desiredFlavor: String) {
        _uiState.update { currentState ->
            currentState.copy(flavor = desiredFlavor)
        }
        Log.d(TAG, "Hello -----------enter--------el-------nilo: $desiredFlavor!")
    }

    fun setNaipe(item: List<String>) {
        _uiState.update { currentState ->
            currentState.copy(alfin = item)
        }
        //Elefe(item)
    }

    fun setNami(item: String) {
        _uiState.update { currentState ->
            currentState.copy(name = item)
        }
        //Elefe(item)
    }

    fun setScore(item: String) {
        _uiState.update { currentState ->
            currentState.copy(score = item)
        }
        Log.d(TAG, "Hello -----------enter--------el-------nilo: $item!")
    }


    fun setTimer(time: Long) {
        _uiState.update { currentState ->
            currentState.copy(time = time)
        }
    }


    fun Date(item: String) {
        _uiState.update { currentState ->
            currentState.copy(date = item)
        }
        //Elefe(item)
    }


    /**
     * Set the [pickupDate] for this order's state and update the price
     */
    fun setDate(pickupDate: String) {
        _uiState.update { currentState ->
            currentState.copy(
                date = pickupDate,
                price = calculatePrice(pickupDate = pickupDate)
            )
        }
    }

    fun Datey(UseGuess: List<String>) {
        _uiState.update { currentState ->
            currentState.copy(
                alfin = UseGuess
            )
        }
        val u = _uiState.value.alfin
        click6(u)
        return
    }

    fun Ditey(UseGuess: List<Item>) {
        _uiState.update { currentState ->
            currentState.copy(
                torre = UseGuess
            )
        }

    }

    fun Deti(u: List<String>): SnapshotStateList<String> {
        val min = u.toMutableStateList()
        return min
    }

    init {
        reset()
        modmar()
        hola()
        k = 0
    }

    var f = k
    var r = k
    var si = k
    var e = k
    var w = k
    var m = k
    var te = k





    /**
     * Reset the order state
     */
    fun resetOrder() {
        _uiState.value = OrderUiState(pickupOptions = pickupOptions())
    }


    fun timer(l: Long){
        setTimer(l)
        Log.d(TAG, " El tiempo trascurrido durante el juego es------>>> es: $l!")
    }

    /**
     * Returns the calculated price based on the order details.
     */
    private fun calculatePrice(
        quantity: Int = _uiState.value.quantity,
        pickupDate: String = _uiState.value.date
    ): String {
        var calculatedPrice = quantity * calculateScore(_uiState.value.quantity)
        // If the user selected the first option (today) for pickup, add the surcharge
        if (pickupOptions()[0] == pickupDate) {
            calculatedPrice += PRICE_FOR_SAME_DAY_PICKUP
        }
        val formattedPrice = NumberFormat.getCurrencyInstance().format(calculatedPrice)
        return formattedPrice
    }

    private fun calculateScore(w: Int): Double {
        val t = 19
        val ruc = (t * w).toDouble()
        return ruc
    }

    fun remove(item: Affirmation, User: Int) {
        if (f <= User) {
            _tasks.remove(item)
            f += 1
            green(f)
        }

    }


    fun reset() {
        Work.clear()
        Trabajo.clear()
        Oficio.clear()
        UserJuess.clear()
        UserTutu.clear()
        UserYuyu.clear()
        UserMars.clear()
        UserLuna.clear()

    }


    fun remove(item: Ask, User: Int) {
        if (r <= User) {
            _wrap.remove(item)
            r += 1
        }
    }


    fun removae(item: String) {
       pina = elefante.toMutableList()
        var  oscu = pina.size.toString()
        var mir = camello - elefante
        var nit = mir.size.toString()
        setScore(oscu)

        nir(nit)
        Log.d(TAG, " Los elementos son igual a-------------------->>> es: $nit!")

    }

    fun playa(){
        var mir = camello - elefante

        Log.d(TAG, " Los elementos son igu------------------->>> es: $mir!")

    }
    //var lisme = playa()


    fun green(s: Int) {
        //  Log.d(TAG, " Este es shin en dook------>>> es: $s!")

    }

    fun grey(s: Int) {
        Log.d(TAG, " Este es el tamani de palabras----->>> es: $s!")
    }

    fun click(s: List<String>) {
        Log.d(TAG, " Click este es el valor pura en Affirmation->>> es: $s!")
    }

    fun click6(s: List<String>) {
        Log.d(TAG, " Llevo la preparacion de Equipos para la salida->>> es: $s!")
    }

    fun click1(s: Int) {
        // checkUserGuess()
        Log.d(TAG, " Click este es el valor de pura en Ask--->>> es: $s!")
    }

    fun click7(s: List<String>) {
        Log.d(TAG, " Este es el valorde click7  a salida->>> es: $s!")
    }


    fun click3(l: Long) {
        Log.d(TAG, " Los tiempos son ----------------------->>> es: $l!")
    }

    fun click4(l: Int) {
        Log.d(TAG, " Los elemantos son igual a-------------------->>> es: $l!")
        mast()
    }


    fun click5(l: Int) {
        //checkScore()

        Log.d(TAG, " Los elemantos son igual a-------------------->>> es: $l!")
    }


    fun PalabrasUsa(guessdWord: String, mas: Int, l: Long ) {
        userGues = guessdWord
        var mil = userdWords
        var ecu = _uiState.value.alfin
        setTimer(l)
        Log.d(TAG, " Los elemantos son igual a-------------------->>> es: $l!")
        if (elefante.contains(userGues) && ecu.contains(userGues) ) {
            elefante.remove(userGues)
            var time = 50 - elefante.size
            var she = time.toString()
            pora = she

            userdWords.add(userGues)

            Log.d(TAG, " Los elemantos son igual a--------she---nnn--------->>> es: $pora!")
            Log.d(TAG, " Los elemantos son igual a-------------------->>> es: $userdWords!")
            nir(pora)
       }

    }


    fun flavores(i:Int, n:String){
        pora=n


    }




  fun PalabrasUsad(guessdWord: String, mas: Int) {

        userGues = guessdWord
        userdWords.add(userGues)
        var entry = listade(userdWords)
        //Log.d(TAG, " Los elemantos son igual a---------en----------->>> es: $entry!")
        var last = _uiState.value.alfin
        Log.d(TAG, " Los elemantos son igual a----------as---------->>> es: $last!")
        var sun = entry.size
        if (sun == mas-1){
            var cal = entry - last
            var res = cal.size
            var fin = mas - res
            var miel = fin.toString()

            Date(miel)
            setFlavor(miel)
            setNami(miel)
            pora = miel

            taskUiState.key  = miel
            Log.d(TAG, " Los elemantos son igual a---------miel----------->>> es: $miel!")
        }

    }





    var minte = mast()

    fun mast(){
        var mas = _uiState.value.alfin
        Log.d(TAG, " Los elemantos son igual a-------------on------->>> es: $mas!")
    }

    fun Ulises(s:String, d:Int){
        if (true) {
            userEnter.add(s)
        }

    }




    fun AskUsa(guessdWord: String, t: Int) {
        if (w <= t) {
            userPalabras = guessdWord
            var hulk = Pickat(userPalabras)
            te += 1
        }

    }

    fun checkMito() {
        viewModelScope.launch {
            scull()
        }
    }


    fun Pickat(userGues: String): MutableSet<String> {
        userdPalabras.add(userGues)
        val pi = userdPalabras
        val e = pi.size
        return userdPalabras
    }

    fun mitin(quantity: Int): Int {
        var mar = loadAffirmations()[1].key
        var ecua = quantity
        Log.d(TAG, "Mill -----------en-----frit----------mitin: $ecua!")
        var yup = elefante.size
        Log.d(TAG, "Mill -----------en-valor obtenido--------------mitin: $yup!")
        var tula = camello - elefante
        var etodo = tula.size
        var enoce = etodo - ecua
        UserMontain = enoce.toString()
        updateUiState(UserMontain)
        Log.d(TAG, "Mill -----------en-valor obtenido--------------mitin: $enoce!")
        return enoce
    }

    var  ti = elefante.size
    var barco = ti.toString()


    suspend fun scull(): Int {
       // val pico = mitin(_uiState.value.quantity)
        Log.d(TAG, "Hello -----------enter---------------nilo: $pico!")
        return pico
    }


    fun PalabrasAsk(userGues: String, f: Int): MutableSet<String> {
        oro = userGues
        userIndixe.add(oro)
        return userIndixe
    }


    suspend fun fibonacci(s: String): Flow<String> = flow {
        emit(oro)
    }

    suspend fun esmeman(): List<String> {
        if (elefante.size <= 40) {
            pura = camello - elefante
        }
        return pura
    }



    fun tardio(): Flow<String>{
        val flow = flow<String> { emit("pora")  }
        return flow

    }
    fun tatdio(h: String): Flow<String> {
        pori = h
        val flow = flow<String> { emit(pori)  }
        return flow

    }
    fun tupdio(h: String): Flow<String> {
        pora = "tigre"
        pora = h
        val flow = flow<String> { emit(pora)  }
        return flow

    }



    fun tapdio(h: String): Flow<String> {
        pini = h
        val flow = flow<String> { emit(pini)  }
        return flow

    }


    fun topdio(h: String): Flow<String> {
        pini = h
        val flow = flow<String> { emit(pini)  }
        return flow
    }

    fun montain(h: String): Flow<String> {
        pini = h
        val flow = flow<String> { emit(pini)  }
        return flow
    }



    val gol : Flow<String> = tatdio("mini")

    val bit : Flow<String> = topdio("hello")
    val aro : Flow<String> = tupdio(tiempo())
    val bat : Flow<String> = tapdio(scoro())



    fun tiempo(): String {
        var nano = _uiState.value.time
        var nini = nano.toString()
        return nini
    }



    fun scoro(): String {
        var nano = _uiState.value.score
        return nano


    }

    private  val  _vela = MutableStateFlow("")
    val vela = _vela.asStateFlow()


    fun nir(h:String){
        pora = h
        _vela.update { count -> pora  }
    }

    fun primate(){
        var enc = _vela.value
        Log.d(TAG, " Este es el vk en vela------>>> es: $enc!")
    }


    //var we = nir(pora)
    var he = primate()


    private  val  _aumento = MutableStateFlow(0)
    val aumento = _aumento.asStateFlow()


    fun mir(){
        _aumento.update { aun -> aun + 1}
    }



    var tden = mir()
    var tin = mir()
    var ton = mir()

    fun examen(){
        var enc = _aumento.value
        Log.d(TAG, " Este es el valor de aumento------>>> es: $enc!")
    }

    var min = examen()



    fun updateUiState(i: String) {
        taskUiState = HulkUiState(i)
    }

    ////---Wrap--------
    fun listade(a: MutableSet<String>): List<String> {
        val ls = a.asSequence().toList()
        return ls

    }

    fun listar(a: List<String>): MutableSet<String> {
        val ls = a.asSequence().toMutableSet()
        return ls

    }

    fun listare(a: List<Item>): List<String> {
        val ls = a.asSequence().map { it -> it.name }.toList()
        return ls

    }


    fun mask(a: List<String>, b: List<String>, c: Int): Int {
        var m = 0
        for (i in 0..c) {
            if (a[i] == b[i]) {
                m += 1
            }
        }
        return m
    }

    fun score(a: List<String>, b: List<String>): Int {
        val two = a - b
        val tree = two.size
        return tree
    }

    fun gulf(item: List<String>) {
        val toque = item

    }


    fun gulfi(item: String) {
        val toque = item
        setFlavor(item)
        Log.d(TAG, "Hello -----------enter---------------hulk: $toque!")
    }
    /**
     * Returns a list of date options starting with the current date and the following 3 dates.
     */
    fun dulf(item: List<String>) {
        val toque = item
        Log.d(TAG, "Hello -----------enter---------------nilo: $toque!")
    }

    fun maxi(item: List<Item>): List<Item> {
        var min = listare(item)
        setNaipe(min)
        //Log.d(TAG, "Hello -----------enter---------------nilo: $min!")
        return item
    }


    private fun pickupOptions(): List<String> {
        val dateOptions = mutableListOf<String>()
        val formatter = SimpleDateFormat("E MMM d", Locale.getDefault())
        val calendar = Calendar.getInstance()
        // add current date and the following 3 dates.
        repeat(4) {
            dateOptions.add(formatter.format(calendar.time))
            calendar.add(Calendar.DATE, 1)
        }
        return dateOptions
    }

}


data class HulkUiState(var key: String = "")

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

data class Ask(val key : String, val drawable: Int)
private fun loadAsk(): List<Ask> {
    return listOf<Ask>(
        Ask("appreciate", R.drawable.undraw_appreciate_it_re_yc8h),
        Ask("appreciation", R.drawable.undraw_appreciation_yy29),
        Ask("automobile_repair", R.drawable.undraw_automobile_repair_ywci),
        Ask("baby", R.drawable.undraw_baby_re_fr9r),
        Ask("barista", R.drawable.undraw_barista_re_fm8w),
        Ask("basketball", R.drawable.undraw_basketball_re_7701),
        Ask("beach_day", R.drawable.undraw_beach_day_cser),
        Ask("blooming", R.drawable.undraw_blooming_re_2kc4),
        Ask("buddies", R.drawable.undraw_buddies_2ae5),
        Ask("by_my_car", R.drawable.undraw_by_my_car_xhk6),
        Ask("cat", R.drawable.undraw_cat_s1wg),
        Ask("cooking_ceye", R.drawable.undraw_cooking_ceye),
        Ask("decorate_christmas_tree", R.drawable.undraw_decorate_christmas_tree_rmj0),
        Ask("doctors", R.drawable.undraw_doctors_p6aq),
        Ask("dog", R.drawable.undraw_dog_re_63j1),
        Ask("educator", R.drawable.undraw_educator_re_ju47),
        Ask("electricity", R.drawable.undraw_electricity_k2ft),
        Ask("elements", R.drawable.undraw_elements_re_25t9),
        Ask("engineering_team", R.drawable.undraw_engineering_team_a7n2),
        Ask("experience_design", R.drawable.undraw_experience_design_re_dmqq),
        Ask("family", R.drawable.undraw_family_vg76),
        Ask("female_avatar", R.drawable.undraw_female_avatar_efig),
        Ask("fingerprint_login", R.drawable.undraw_fingerprint_login_re_t71l),
        Ask("flying_drone", R.drawable.undraw_flying_drone_u3r2),
        Ask("gifts", R.drawable.undraw_gifts_0ceh),
        Ask("good_doggy", R.drawable.undraw_good_doggy_re_eet7),
        Ask("grand_slam", R.drawable.undraw_grand_slam_84ep),
        Ask("halloween", R.drawable.undraw_halloween_re_2kq1),
        Ask("happy_new_year", R.drawable.undraw_happy_new_year_di92),
        Ask("healthy_habit", R.drawable.undraw_healthy_habit_rdky),
        Ask("home_run", R.drawable.undraw_home_run_oyhw),
        Ask("in_love", R.drawable.undraw_in_love_993n),
        Ask("landscape_photographer", R.drawable.undraw_landscape_photographer_156c),
        Ask("love_is", R.drawable.undraw_love_is_in_the_air_4uud),
        Ask("make_it_rain", R.drawable.undraw_make_it_rain_re_w9pc),
        Ask("male_avatar", R.drawable.undraw_male_avatar_g98d),
        Ask("mindfulness", R.drawable.undraw_mindfulness_6xt3),
        Ask("passing", R.drawable.undraw_passing_by_0un9),
        Ask("pic_profile", R.drawable.undraw_pic_profile_re_7g2h),
        Ask("profile_pic", R.drawable.undraw_profile_pic_re_iwgo),
        Ask("pumpkin", R.drawable.undraw_pumpkin_re_bm46),
        Ask("ready_for_waves", R.drawable.undraw_ready_for_waves_vlke),
        Ask("reminder", R.drawable.undraw_reminder_re_fe15),
        Ask("running", R.drawable.undraw_running_wild_h6ao  ),
        Ask("scientist", R.drawable.undraw_scientist_klqc),
        Ask("snow_games", R.drawable.undraw_snow_games_tq9r),
        Ask("summer", R.drawable.undraw_summer_1wi4),
        Ask("team", R.drawable.undraw_team_up_re_84ok),
        Ask("traveling", R.drawable.undraw_traveling_qio0),
        Ask("winter_skating", R.drawable.undraw_winter_skating_re_qouk),
        Ask("woman", R.drawable.undraw_woman_re_afr8)
    )
}


