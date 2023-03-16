package com.ClassicaMusic.inventory.ui

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ClassicaMusic.inventory.data.Item
import com.ClassicaMusic.inventory.data.OrderUiState
import kotlinx.coroutines.async
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.*

class EcualViewModel (createSavedStateHandle: SavedStateHandle) : ViewModel(

) {
    val _uiState = MutableStateFlow(OrderUiState(pickupOptions = pickupOptions()))
    val uiState: StateFlow<OrderUiState> = _uiState.asStateFlow()

    private var userEnty: MutableSet<String> = mutableSetOf()
    private var userdWords: MutableSet<String> = mutableSetOf()
    private var     Work: MutableSet<String> = mutableSetOf()
    private var     Working: MutableSet<Int> = mutableSetOf(0)






    lateinit var hulk: String
    lateinit var bull: String




    var userGues by mutableStateOf("")
        private set

    var userAsk by mutableStateOf("")
        private set

    private val TAG: String = "Reeboojjjk"
   // val ecua : String by lazy { par()}

    fun maxi(item: List<Item>): String {
        var eco = listare(item)
        var mil = eco[1]
        Log.d(TAG, "Hello --ppppppppppppppppp---------en--------mmmmmmmmmmmmm------medida 0: $mil   !")
        return hulk
    }

    fun setFlavor(desiredFlavor: String) {
        // pora = desiredFlavor
        _uiState.update { currentState ->
            currentState.copy(flavor = desiredFlavor)
        }

    }

   // val go : String by lazy { reloj() }
    //val go : String by lazy { reloj() }
   // val go : String by lazy { reloj() }
   // val primo : String by lazy { rijon()}
   //val gulfi : Flow<String> by lazy { Wolfi }



    fun reloj(): String {
        viewModelScope.launch {
            val job3 = async { prudby() }
            val cull = job3.await()
            val tri = cull.toString()
            //val flow = flow<Int> { emit(tri)  }

            updateUiState(tri)

        }

        val ter = _uiState.value.flavor
        return ter

    }

    private fun time(): String {
        var k = hulk
        return k
    }


    suspend fun avion(j:String): String {
        var yup = hulk

        Log.d(TAG, "Hello --ppppppppppppppppp---------en--------mmmmmmmmmmmmm------medida 0:    !")

        return j
    }



    fun kilo(h:String): String {
        return h

    }


    // private var Wolfi: Flow<String> = flowOf()



    fun PalabrasUsa(guessdWord: String, mas: Int, l: Long, m: List<Item> ) {
        viewModelScope.launch {
            userGues = guessdWord
            var min = listare(m)
            setNaipe(min)
            Ditey(m)
            var ecu = _uiState.value.alfin
            setTimer(l)
            var nil = 151000 - l
            var nix = nil.toString()
           // setMike(nil)
           // bumpar()
            userdWords.add(userGues)
            var mil = userdWords.size
            Log.d(TAG, " Los elemantos son igual a-------------------->>> es: $l!")
            for (i in 0..mas-2){
                if (userGues == ecu[i]) {
                    userEnty.add(userGues)
                    var ecu = userEnty.size.toString()
                    var elot = userEnty.size
                    //setMile(elot)
                    var ti = false
                    //bumpar()
                    if (elot >= 1) {
                       // setMile(elot)
                        if (elot > 1) {
                            val elo = listade(userEnty)
                            setNaipe(elo)
                            // numpar()
                            setMile(elot)
                            ti = true
                            global()

                        }
                    }
                    if(ti && mil == mas){
                      // bumpar()
                       //prudby()

                    }
                }
            }
        }
    }




   // val gol : Flow<String> = par()



    init {
        hulk= "link"
        bull = "gol"
    }

    fun hulink(){
        Log.d(TAG, "Hello -----------en--de par en hulink------mmmmmmmmmmmmm------medida 0: $ !")

    }

    fun par(): Flow<String> {
        var lit = "par"

        Log.d(TAG, "Hello -----------en--par-------mmmmmmmmmmmmm------medida 0: hello~!  !")
        val flow = flow<String> { emit("par")  }
        return flow
    }

    fun bar(): Flow<String> {

        Log.d(TAG, "Hello -----------en--------mmmmmmmmmmmmm------medida 0: $bull   !")
        val flow = flow<String> { emit("par")  }
        return flow
    }


    fun linkpar(h:String): Flow<String> {
        bull = h
        Log.d(TAG, "Hello -----------en--------mmmmmmmmmmmmm------medida 0: $bull   !")
        val flow = flow<String> { emit(bull)  }
        return flow
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
    fun listare(a: List<Item>): List<String> {
        val ls = a.asSequence().map { it -> it.name }.toList()
        return ls

    }

    var itemUiState by mutableStateOf(OrderUiState())
        private set

    fun updateUiSta(alfin:Int) {
        itemUiState = OrderUiState(mile = alfin)
    }


    fun updateUiState(alfin:String) {
        itemUiState = OrderUiState(flavor = alfin)
    }


    fun setNaipe(item: List<String>) {
        _uiState.update { currentState ->
            currentState.copy(alfin = item)
        }
        //Elefe(item)
    }


    fun Ditey(UseGuess: List<Item>) {
        _uiState.update { currentState ->
            currentState.copy(
                torre = UseGuess
            )
        }

    }

    fun setTimer(time: Long) {
        _uiState.update { currentState ->
            currentState.copy(time = time)
        }
    }


    fun setMile(desiredFlavor: Int) {
        _uiState.update { currentState ->
            currentState.copy(mile = desiredFlavor)
        }
        Log.d(TAG, "ffffffffffffffffffffffffffffffffffffHello -----------en--------mmmmmmmmmmmmm------medida 10: $desiredFlavor  !")
        userGues = desiredFlavor.toString()

    }


    fun setMike(desiredFlavor: Long) {
        // pora = desiredFlavor
        _uiState.update { currentState ->
            currentState.copy(time = desiredFlavor)
        }

    }


    fun greeckList(): Flow<Int> {
        viewModelScope.launch {
            val job1 = async { prudby() }
            val cul = job1.await()
            if(cul >=1){
                updateUiSta(cul)
            }
            Log.d(TAG, "50ffffffffffffffffffffffffffholaffffffffffHello -----------en--------mmmmmmmmmmmmm------medida 50: $userGues!")

            userAsk = userGues
            hulk  = userGues
            setFlavor(userAsk)
            if ( userAsk == hulk) {
                globo()
            }
           val mu  = _uiState.value.mile
           val mil = flow<Int> {emit(mu)}
            setFliw(mil)
            //val mu  = _uiState.value.mile
           // val mil = flow<Int> {emit(mu)}
            //setFliw(mil)
        }

        val ter = _uiState.value.tigrillo
        return ter

    }

    fun grickList(): Flow<String> {
        viewModelScope.launch {
            val resto : String by lazy { time() }
            val job3 = async { numpar() }
            val cull = job3.await()
            val tri = cull
            //val flow = flow<Int> { emit(tri)  }
            if ( userAsk == userGues ) {
                //updateUiState(cull)
                hulk = userAsk
                time()
                reloj()

            }

            Log.d(TAG, "grickListffffffffffffffffffffffffffholaffffffffffHello -----------en--------mmmmmmmmmmmmm------medida 0: $userAsk!")
           val eli = resto
            val mil = flow<String> {emit(eli)}
            setFlow(mil)
        }

        val ter = _uiState.value.caballo
        return ter

    }





    fun ExampleckList(): String {
        viewModelScope.launch {

            val resul = viewModelScope.async{
                10*10

            }.await()
            var elo = resul.toString()
            setFlavor(elo)
        }

        val ter = _uiState.value.flavor
        return ter

    }







    fun global(): Flow<Int> {
        val resto : Flow<Int> by lazy { greeckList() }
        //griockList()
        return resto
    }

    fun griockList(): Flow<String> {
        viewModelScope.launch {
            val job3 = async { decahedro() }
            val cull = job3.await()
            val rih = cull
            userGues = rih
            Log.d(TAG, "GGGGGGGGGGGGGGGGGGGGGGGGGGGGGriockListfffffffffHello -----------en--------mmmmmmmmmmmmm------medida 0: $userGues!")

            val flow = flow<String> { emit(rih)  }


             setFlow(flow)
        }

        val ter = _uiState.value.caballo
        return ter

    }


    fun westList(): String {
        viewModelScope.launch {
            val job3 = async { reloj() }
            val cull = job3.await()
            setFlavor(cull)
        }

        val ter = _uiState.value.flavor
        return ter

    }


    fun oestList(): Flow<String> {
        viewModelScope.launch {
            val job3 = async { reloj() }
            val cull = job3.await()
            val tri = cull
            val flow = flow<String> { emit(tri)  }

            setFlow(flow)
        }

        val ter = _uiState.value.caballo
        return ter

    }
    fun NothtList(): Flow<String> {
        viewModelScope.launch {
            val job3 = async { ExampleckList() }
            val cull = job3.await()
            val tri = cull
            val flow = flow<String> { emit(tri)  }

            setFlow(flow)
        }

        val ter = _uiState.value.caballo
        return ter

    }

    fun decahedro(): String {
        viewModelScope.launch {
            val job3 = async { prodby() }
            val cull = job3.await()
            val tri = cull
            //val flow = flow<Int> { emit(tri)  }

            updateUiState(cull)

        }

        val ter = _uiState.value.flavor
        return ter

    }




    val gor: Flow<String> = oestList()
    val go : Flow<Int> by lazy { global() }
    val gog : Flow<String> by lazy{ NothtList() }
    //val carrro : String by lazy { reloj() }


    fun globo(): Flow<String> {
        val resto : Flow<String> by lazy { grickList() }
        return resto
    }




    suspend fun numpar(): Flow<String> {
        val rih = westList()
        userGues = rih
        Log.d(TAG, "numparfffffffffHello -----------en--------mmmmmmmmmmmmm------medida 0: $userGues!")

        val flow = flow<String> { emit(rih)  }

         return flow
    }


    suspend fun nipar(): Flow<String> {
        val rih = ExampleckList()
        userGues = rih
        Log.d(TAG, "numparfffffffffHello -----------en--------mmmmmmmmmmmmm------medida 0: $userGues!")

        val flow = flow<String> { emit(rih)  }

        return flow
    }



    suspend fun bumpar(): Flow<Int> {
        val rih =_uiState.value.mile
        val elo = rih.toString()
        val flow = flow<Int> { emit(rih)  }
        userGues = elo
        Log.d(TAG, "fffffseoffffffffffffffffffffffffHello -----------en--------mmmmmmmmmmmmm------medida 0: $userGues!")

        return flow
    }


    suspend fun prudby(): Int {
        bumpar().collect{it-> Working.add(it)}
        val tin = Working.size
        val tina = Working.size.toString()
        userGues = tina
        Log.d(TAG, "Este es el tanano del array -----------------mmmmmmmmmmmmm------medida 0: $userGues !")

        val eli = tin-1
        val min = listadint(Working)
        val yupi = min[eli].toString()
        val yup = min[eli]
        userGues = yupi

        Log.d(TAG, "Hello -----------en--de par en hulink------mmmmmmmmmmmmm------medida 0: $userGues !")

        return yup
    }


    suspend fun prodby(): String {
        numpar().collect{it-> Work.add(it)}
        val tin = Work.size
        val tina = Work.size.toString()
        userGues = tina
        Log.d(TAG, "prodbyEste es el tanano del array -----------------mmmmmmmmmmmmm------medida 0: $userGues !")

        val eli = tin-1
        val min = listade (Work)
        val yupi = min[eli].toString()
        val yup = min[eli]
        userGues = yupi
        setFlavor(yup)
        Log.d(TAG, "prodbyHello -----------en--de par en hulink------mmmmmmmmmmmmm------medida 0: $userGues !")

        return yup
    }




    fun setFlow(desiredFlavor: Flow<String>) {
        // pora = desiredFlavor
        _uiState.update { currentState ->
            currentState.copy(caballo = desiredFlavor)
        }

    }

    fun setFliw(desiredFlavor: Flow<Int>) {
        // pora = desiredFlavor
        _uiState.update { currentState ->
            currentState.copy(tigrillo = desiredFlavor)
        }

    }


    fun listade(a: MutableSet<String>): List<String> {
        val ls = a.asSequence().toList()
        return ls

    }

    fun listadint(a: MutableSet<Int>): List<Int> {
        val ls = a.asSequence().toList()
        return ls

    }



}


