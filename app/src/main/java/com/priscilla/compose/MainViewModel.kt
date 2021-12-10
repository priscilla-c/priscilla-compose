package com.priscilla.compose

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

/**
 * Created by Priscilla Cheung on 2021年12月11日02:08:33
 */
class MainViewModel: ViewModel() {
     var selectPosition: Int by mutableStateOf(0)
     var searchText: String by mutableStateOf("")

}