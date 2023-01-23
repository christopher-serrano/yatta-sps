package yatta.serranocjm.sps.di

import android.content.Context
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val networkModule = module {
}

val repositoryModule = module {
}

val dataModule = module {
    single { androidContext().getSharedPreferences("Prefs", Context.MODE_PRIVATE) }
}

val databaseModule = module {
}

val viewModelModule = module {
}

val utilsModule = module {
}
