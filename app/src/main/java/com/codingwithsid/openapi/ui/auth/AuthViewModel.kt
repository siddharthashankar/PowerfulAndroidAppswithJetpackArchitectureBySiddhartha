package com.codingwithsid.openapi.ui.auth

import androidx.lifecycle.ViewModel
import com.codingwithsid.openapi.repository.auth.AuthRepository

class AuthViewModel
constructor(
        val authRepository: AuthRepository
): ViewModel()
{
}