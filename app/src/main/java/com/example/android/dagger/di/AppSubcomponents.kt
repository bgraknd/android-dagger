package com.example.android.dagger.di

import com.example.android.dagger.registration.RegistrationComponent
import dagger.Module

/**
 * Created by Bugra on 25.04.2020.
 */

@Module(subcomponents = [RegistrationComponent::class])
class AppSubcomponents