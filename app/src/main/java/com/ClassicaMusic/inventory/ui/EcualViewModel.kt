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


    var userGues by mutableStateOf("")
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

//    val primo : String by lazy { mumber(reloj()) }
   // val prima : String by lazy { cull}
   // val inpar : Flow<String> by lazy { checko() }
    val par : String by lazy { reloj() }
   // val primo : String by lazy { rijon()}
   //val gulfi : Flow<String> by lazy { Wolfi }

    fun reloj(): String {
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
            // electro()

            var ecu = _uiState.value.alfin
            setTimer(l)
            var nil = 151000 - l
            var nix = nil.toString()
            userdWords.add(userGues)
            var mil = userdWords.size

            Log.d(TAG, " Los elemantos son igual a-------------------->>> es: $l!")
            for (i in 0..mas-2){
                if (userGues == ecu[i]) {
                    userEnty.add(userGues)
                    var ecu = userEnty.size.toString()
                    var elot = userEnty.size
                    setMile(elot)
                    var ti = false
                    numpar()
                    if (elot >= 1) {
                        setMile(elot)
                        if (elot > 1) {
                            val elo = listade(userEnty)
                            setNaipe(elo)
                            // numpar()
                            setMile(elot)
                            ti = true
                            // ipar(elot)
                        }
                    }
                    if(ti && mil == mas){
                        numpar()
                    }
                }
            }
        }
    }




    val gol : Flow<String> = par()


    lateinit var hulk: String
    lateinit var bull: String



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
        // pora = desiredFlavor
        _uiState.update { currentState ->
            currentState.copy(mile = desiredFlavor)
        }
        Log.d(TAG, "ffffffffffffffffffffffffffffffffffffHello -----------en--------mmmmmmmmmmmmm------medida 10: $desiredFlavor  !")
        userGues = desiredFlavor.toString()

    }


    fun greeckList(): Flow<String> {
        viewModelScope.launch {
            val job1 = async { numpar() }
            var cul = job1.await()
            val job2 = async { prudenty() }
            var cull = job2.await()
            //var miel = lite(cul)

            val flow = flow<String> { emit(cull)  }

            setFlow(flow)
        }

        var ter = _uiState.value.caballo
        return ter

    }

    val go: Flow<String> = greeckList()


    suspend fun prudenty(): String {
       // val job3 = numpar().run { this }
        numpar().collect{it-> Work.add(it)}
        // val mil = tu

        val tin = Work.size.toString()
        val min = listade(Work)
        val yup = min[0]
        hulk = yup

        Log.d(TAG, "fffffffffffffffffffffrrrrrrrrrfffffffffffffffHello -----------en--------mmmmmmmmmmmmm------medida 0: $hulk!")


        return hulk

    }


    suspend fun numpar(): Flow<String> {
        var rih =_uiState.value.mile.toString()
        //var tir = rih.size.toString()
        userGues = rih
        Log.d(TAG, "ffffffffffffffffffffffffffffffffffffHello -----------en--------mmmmmmmmmmmmm------medida 0: $userGues!")

        val flow = flow<String> { emit(rih)  }
        return flow
    }

    fun setFlow(desiredFlavor: Flow<String>) {
        // pora = desiredFlavor
        _uiState.update { currentState ->
            currentState.copy(caballo = desiredFlavor)
        }

    }

    fun listade(a: MutableSet<String>): List<String> {
        val ls = a.asSequence().toList()
        return ls

    }




}


