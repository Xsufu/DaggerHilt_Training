package com.example.daggerhilttraining

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/*
    Указываем, что это модуль через соответствующую аннотацию
    @InstallIn устанавливает область видимости инъекции
 */

@Module
@InstallIn(SingletonComponent::class)
object MainModule {

    /*
        Функции создаются для каждого стороннего класса.
        Данные функции - инструкции по созданию классов для Hilt
     */
    @Provides
    @Singleton
    fun provideThirdPartyClass(basicTPClass: BasicTPClass): ThirdPartyClass {
        return ThirdPartyClass(basicTPClass)
    }

    @Provides
    fun provideBasicClass(): BasicTPClass {
        return BasicTPClass()
    }
}