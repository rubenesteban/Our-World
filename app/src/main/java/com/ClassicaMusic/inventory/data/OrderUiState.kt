package com.ClassicaMusic.inventory.data

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

/**
 * Data class that represents the current UI state in terms of [quantity], [flavor],
 * [dateOptions], selected pickup [date] and [price]
 */
data class OrderUiState(
    /** Selected cupcake quantity (1, 6, 12) */
    val quantity: Int = 0,
    val time: Long = 0,
    val mile: Int = 0,
    val score:String = "",

    //val time: Boolean = false,

    /** Flavor of the cupcakes in the order (such as "Chocolate", "Vanilla", etc..) */
    val flavor: String = "",
    /** Selected date for pickup (such as "Jan 1") */
    val date: String = "",
    /** Total price for the order */
    val price: String = "",
    /** Available pickup dates for the order*/
    val pickupOptions: List<String> = listOf(),

//-----------
    val alfin: List<String> = listOf(),

    val torre: List<Item> = listOf(),

    val caballo: Flow<String> = flowOf(),

    val id: Int = 0,
    val name: String = ""
)



/**
 * Extension function to convert [Item] to [ItemUiState]
 */

fun OrderUiState.toItem(): Item = Item(
    id = id,
    name = name,
    d = 15.0,
    i = 25
)
