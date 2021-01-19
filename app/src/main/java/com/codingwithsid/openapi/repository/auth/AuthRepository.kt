package com.codingwithsid.openapi.repository.auth

import com.codingwithsid.openapi.api.auth.OpenApiAuthService
import com.codingwithsid.openapi.persistence.AccountPropertiesDao
import com.codingwithsid.openapi.persistence.AuthTokenDao
import com.codingwithsid.openapi.session.SessionManager

class AuthRepository
constructor(
        val authTokenDao: AuthTokenDao,
        val accountPropertiesDao: AccountPropertiesDao,
        val openApiAuthService: OpenApiAuthService,
        val sessionManager: SessionManager
)
{
}