package com.priscilla.compose.viewmodel

import androidx.compose.runtime.*
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.lifecycle.ViewModel
import com.priscilla.compose.BOOK_LIST_PAGE
import com.priscilla.compose.MAIN_PAGE
import com.priscilla.compose.bean.URLItemData

/**
 * Created by Priscilla Cheung on 2021年12月11日02:08:33
 */
class MainViewModel: ViewModel() {
     var selectPosition: Int by mutableStateOf(0)
     var searchText: String by mutableStateOf("")

}