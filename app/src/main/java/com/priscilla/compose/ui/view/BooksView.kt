package com.priscilla.compose.ui.view

import android.annotation.SuppressLint
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.priscilla.compose.viewmodel.MainViewModel
import com.priscilla.compose.utils.DataManager
import com.priscilla.compose.bean.URLGroupData

/**
 * Created by Priscilla Cheung on 2021年12月11日02:38:17
 */
//搜索框
@Composable
fun bodyView(itemClickListener: ((String)->Unit)) {
    Column {
        searchView()
        recyclerView(DataManager.getGroupData()){
            itemClickListener.invoke(it)
        }
    }
}
//搜索框
@SuppressLint("UnrememberedMutableState")
@Composable
fun searchView() {
    val mainViewModel: MainViewModel = viewModel()
    TextField(
        value = mainViewModel.searchText,
        onValueChange = { mainViewModel.searchText = it },
        modifier = Modifier
            .padding(15.dp)
            .fillMaxWidth(),
        singleLine = true,
    )
}

//列表

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun recyclerView(titleList: List<URLGroupData>, itemClickListener: ((String)->Unit)) {
    //Material Design -- Google 设计规范
    //可滑动的纵向列表
    LazyVerticalGrid(GridCells.Fixed(2),modifier = Modifier.padding(bottom = 50.dp)){
        items(titleList) { item ->
            Surface(
                Modifier.padding(start = 16.dp, end = 16.dp, top = 5.dp, bottom = 5.dp).clickable {
                    itemClickListener.invoke(item.title)
                },
                elevation = 8.dp,
                shape = RoundedCornerShape(8.dp),

            ) {
                Text(
                    text = item.title,
                    Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}