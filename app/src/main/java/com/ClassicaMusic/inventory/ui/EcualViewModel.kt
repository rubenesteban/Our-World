package com.ClassicaMusic.inventory.ui

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ClassicaMusic.inventory.data.Item
import com.ClassicaMusic.inventory.data.OrderUiState
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.*

class EcualViewModel (createSavedStateHandle: SavedStateHandle) : ViewModel(

) {
    val _uiState = MutableStateFlow(OrderUiState(pickupOptions = pickupOptions()))
    val uiState: StateFlow<OrderUiState> = _uiState.asStateFlow()


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




}


