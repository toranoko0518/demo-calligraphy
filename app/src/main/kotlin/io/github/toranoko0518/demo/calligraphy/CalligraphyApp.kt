package io.github.toranoko0518.demo.calligraphy

import android.app.Application
import uk.co.chrisjenx.calligraphy.CalligraphyConfig

@Suppress("unused")
class CalligraphyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        CalligraphyConfig.initDefault(
            CalligraphyConfig.Builder()
                .setDefaultFont(R.font.raleway)
                .build()
        )
    }
}
