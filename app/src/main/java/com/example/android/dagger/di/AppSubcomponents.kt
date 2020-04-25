package com.example.android.dagger.di

import com.example.android.dagger.login.LoginComponent
import com.example.android.dagger.registration.RegistrationComponent
import com.example.android.dagger.user.UserComponent
import dagger.Module

/**
 * Created by Bugra on 25.04.2020.
 */

@Module(subcomponents = [RegistrationComponent::class, LoginComponent::class, UserComponent::class])
class AppSubcomponents