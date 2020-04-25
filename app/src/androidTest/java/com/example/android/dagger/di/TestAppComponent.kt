package com.example.android.dagger.di

import dagger.Component
import javax.inject.Singleton

/**
 * Created by Bugra on 26.04.2020.
 */

@Singleton
@Component(modules = [TestStorageModule::class, AppSubcomponents::class])
interface TestAppComponent : AppComponent