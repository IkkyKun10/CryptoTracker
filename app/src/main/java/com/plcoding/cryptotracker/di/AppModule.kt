package com.plcoding.cryptotracker.di

import com.plcoding.cryptotracker.core.data.networking.HttpClientFactory
import com.plcoding.cryptotracker.crypto.data.networking.RemoteCoinDataSource
import com.plcoding.cryptotracker.crypto.domain.CoinDataSource
import com.plcoding.cryptotracker.crypto.presentation.coin_list.CoinListViewModel
import io.ktor.client.engine.cio.CIO
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.bind
import org.koin.dsl.module

/**
 * @author riezky maisyar
 */

val appModule = module {
    single { HttpClientFactory.create(CIO.create()) }
    single { RemoteCoinDataSource(get()) }.bind<CoinDataSource>()

    viewModelOf(::CoinListViewModel)
}