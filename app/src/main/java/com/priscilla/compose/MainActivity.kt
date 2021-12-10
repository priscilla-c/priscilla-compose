package com.priscilla.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Send
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.priscilla.compose.bean.UrlData
import com.priscilla.compose.utils.DataManager
import com.priscilla.compose.utils.URLGroupData

class MainActivity : ComponentActivity() {
    var searchText: String by mutableStateOf("")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Basics()
        }
    }

    @Composable
    fun Basics() {
        Scaffold(topBar = {
            TopAppBar {
                Text("Compose", Modifier.padding(start = 16.dp), fontSize = 20.sp)
            }
        }) {
            //FrameLayout
            val mTitleList = DataManager.getGroupData()
            Column {
                searchView()
                recyclerView(mTitleList)
            }
        }

    }

    @Composable
    fun searchView() {
        TextField(
            value = searchText,
            onValueChange = { searchText = it },
            Modifier
                .padding(15.dp)
                .fillMaxWidth().height(20.dp)
        )
    }

    @Composable
    fun recyclerView(titleList: List<URLGroupData>) {
        //Material Design -- Google 设计规范
        //可滑动的纵向列表
        LazyColumn(Modifier.fillMaxWidth()) {
            items(titleList) { item ->
                Surface(
                    Modifier.padding(start = 16.dp, end = 16.dp, top = 5.dp, bottom = 5.dp),
                    elevation = 8.dp,
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Text(text = item.title,
                        Modifier
                            .fillMaxWidth()
                            .padding(16.dp))
                }
            }
        }
    }

    //单元测试
    @Preview(showBackground = true)
    @Composable
    fun Text() {
        Basics()
    }
}
