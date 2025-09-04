package com.learning.myapplication.data

import android.content.SharedPreferences
import javax.inject.Inject

class UserDao @Inject constructor(
    private val prefs: SharedPreferences
) {
    fun getToken(): String? = prefs.getString("auth_token", null)
}

