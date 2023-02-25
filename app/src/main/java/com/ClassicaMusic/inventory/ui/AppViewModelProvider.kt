package com.ClassicaMusic.inventory.ui


import android.app.Application
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.ClassicaMusic.inventory.InventoryApplication
import com.example.inventory.ui.item.ItemEntryViewModel


/**
 * Provides Factory to create instance of ViewModel for the entire Inventory app
 */
object AppViewModelProvider {
    val Factory = viewModelFactory {

        initializer {
            OrderViewModel(this.createSavedStateHandle())
        }

        initializer {
            ItemEntryViewModel(inventoryApplication().container.itemsRepository)
        }


    }
}

/**
 * Extension function to queries for [Application] object and returns an instance of
 * [InventoryApplication].
 */
fun CreationExtras.inventoryApplication(): com.ClassicaMusic.inventory.InventoryApplication =
    (this[AndroidViewModelFactory.APPLICATION_KEY] as com.ClassicaMusic.inventory.InventoryApplication)
