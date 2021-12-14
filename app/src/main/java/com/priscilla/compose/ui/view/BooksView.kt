package com.priscilla.compose.ui.view

import android.annotation.SuppressLint
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material.LocalTextStyle
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.priscilla.compose.bean.URLItemData_
import com.priscilla.compose.ui.theme.Gray
import com.priscilla.compose.ui.theme.Purple500
import com.priscilla.compose.viewmodel.MainViewModel
import com.priscilla.compose.utils.DataManager
import com.priscilla.compose.utils.Store
import com.priscilla.compose.utils.Store.start
import java.time.format.TextStyle

/**
 * Created by Priscilla Cheung on 2021年12月11日02:38:17
 */
//搜索框
@Composable
fun bodyView(inputEnter: () -> kotlin.Unit, itemClickListener: ((String) -> Unit)) {
    Column {
        val titleList = remember { mutableStateListOf<String>() }
        for (i in DataManager.getGroupData()) {
            titleList.add(i.title)
        }
        searchView(titleList) {
            inputEnter.invoke()
        }
        recyclerView(titleList) {
            itemClickListener.invoke(it)
        }
    }
}

//搜索框
@SuppressLint("UnrememberedMutableState")
@Composable
fun searchView(titleList: SnapshotStateList<String>, inputEnter: () -> Unit) {
    val mainViewModel: MainViewModel = viewModel()
    if (mainViewModel.searchText.isNotBlank()) {
        fuzzyQuery(titleList, mainViewModel.searchText)
    }
    BasicTextField(
        value = mainViewModel.searchText,
        onValueChange = {
            mainViewModel.searchText = it
            fuzzyQuery(titleList, it)
        },
        cursorBrush = SolidColor(Purple500),
        modifier = Modifier
            .padding(start = 15.dp,top = 5.dp,end = 15.dp,bottom = 5.dp)
            .height(30.dp)
            .fillMaxWidth(),
        singleLine = true,
        keyboardActions = KeyboardActions {
            inputEnter.invoke()
        },
        decorationBox = { innerTextField ->
            Surface(elevation = 8.dp, shape = RoundedCornerShape(8.dp),) {
                Box( contentAlignment = Alignment.CenterStart ,modifier = Modifier.padding(start = 10.dp)){
                    if (mainViewModel.searchText.isEmpty()) {
                        Text(
                            text = "搜索分类或书籍名称",
                            color = Gray,
                            fontSize = 14.sp,
                        )
                    }
                    innerTextField()
                }
            }
        }
    )
}

fun fuzzyQuery(titleList: SnapshotStateList<String>, it: String) {
    titleList.clear()
    if (it.isNotBlank()) {
        for (i in DataManager.getGroupData()) {
            if (i.title.contains(it) && !titleList.contains(i.title))
                titleList.add(i.title)
            for (u in Store.queryCreate(URLItemData_.groupTitle.equal(i.title)).build()
                .start()) {
                if (u.title.contains(it) && !titleList.contains(i.title))
                    titleList.add(i.title)
            }
        }
    } else {
        for (i in DataManager.getGroupData()) {
            titleList.add(i.title)
        }
    }
}
//列表

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun recyclerView(titleList: SnapshotStateList<String>, itemClickListener: ((String) -> Unit)) {
    //Material Design -- Google 设计规范
    //可滑动的纵向列表
    LazyVerticalGrid(GridCells.Fixed(2), modifier = Modifier.padding(bottom = 50.dp)) {
        items(titleList) { item ->
            Surface(
                Modifier
                    .padding(start = 16.dp, end = 16.dp, top = 5.dp, bottom = 5.dp)
                    .clickable {
                        itemClickListener.invoke(item)
                    },
                elevation = 8.dp,
                shape = RoundedCornerShape(8.dp),

                ) {
                Text(
                    text = item,
                    Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}