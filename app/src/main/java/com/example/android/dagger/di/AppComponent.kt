package com.example.android.dagger.di

import com.example.android.dagger.registration.RegistrationActivity
import dagger.Component

/**
 * Created by Bugra on 21.04.2020.
 */

@Component
interface AppComponent {

    fun inject(activity: RegistrationActivity)

}