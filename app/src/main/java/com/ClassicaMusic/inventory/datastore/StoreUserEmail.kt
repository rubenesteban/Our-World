package com.ClassicaMusic.inventory.datastore


import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
//import androidx.datastore.preferences.preferencesDataStore

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map



class StoreUserEmail(private val context: Context) {

    // to make sure there is only one instance
    companion object {
        val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "settings")
        val EXAMPLE_COUNTER = intPreferencesKey("example_counter")
    }

    // to get the email
    //val EXAMPLE_COUNTER = intPreferencesKey("example_counter")
    val exampleCounterFlow: Flow<Int> = context.dataStore.data
        .map { preferences ->
            // No type safety.
            preferences[EXAMPLE_COUNTER] ?: 0
        }

    // to save the email
    suspend fun incrementCounter(i:Int) {
        context.dataStore.edit { settings ->
            val currentCounterValue = settings[EXAMPLE_COUNTER] ?: 0
            settings[EXAMPLE_COUNTER] = currentCounterValue + i
        }
    }
}