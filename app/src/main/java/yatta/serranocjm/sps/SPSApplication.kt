package yatta.serranocjm.sps

import android.app.Application
import com.jakewharton.threetenabp.AndroidThreeTen
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import yatta.serranocjm.sps.di.CoreModule

class SPSApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin()
        CoreModule.init()
        AndroidThreeTen.init(this)
    }

    private fun initKoin() {
        startKoin {
            androidLogger()
            androidContext(this@SPSApplication)
        }
    }
}
