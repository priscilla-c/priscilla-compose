package com.priscilla.compose.utils

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity

/**
 * Created by Priscilla Cheung on 2021年12月11日22:17:26
 */
inline fun <reified T:ComponentActivity> ComponentActivity.startActivity(bundle: Bundle? = null){
    startActivity(Intent(this,T::class.java).apply {
        if(bundle!=null) putExtras(bundle)
    })
}