package com.learning.myapplication.data

import javax.inject.Inject

class UserRepository @Inject constructor(
    private val userDao: UserDao, // Could be Room, SharedPreferences, or API
) {
    suspend fun isLoggedIn(): Boolean {
        // Example: check token from DB/SharedPreferences
        return userDao.getToken() != null
    }
}
