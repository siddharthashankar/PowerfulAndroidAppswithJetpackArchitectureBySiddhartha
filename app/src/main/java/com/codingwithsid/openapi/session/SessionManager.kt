package com.codingwithsid.openapi.session

import android.app.Application
import com.codingwithsid.openapi.persistence.AuthTokenDao

class SessionManager
constructor(
        val authTokenDao: AuthTokenDao,
        val application: Application
)
{
}