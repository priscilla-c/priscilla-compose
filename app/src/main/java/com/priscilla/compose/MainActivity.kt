package com.priscilla.compose

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.app.priscilla.utils.statusBar
import com.priscilla.compose.ui.theme.*
import com.priscilla.compose.ui.view.bodyView
import com.priscilla.compose.ui.view.bottomBar
import com.priscilla.compose.ui.view.toolbar
import com.priscilla.compose.utils.DataManager
import com.priscilla.compose.utils.URLGroupData

class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //设置View
        setContent {
            PriscillaComposeTheme {
                val mainViewModel:MainViewModel = viewModel()
                Basics(mainViewModel.selectPosition){
                    mainViewModel.selectPosition = it
                }
            }
        }
        //设置导航栏
        statusBar {
            setScreen(false)
        }
    }

    /**
     * 整个页面由三部分构成 toolBar bottomBar 主布局
     * 纵向网格列表Bug,下边距流出一个bottomBar的距离
     */
    @Composable
    fun Basics(selectPosition: Int,onSelectedChanged:(Int)->Unit) {
        Scaffold(topBar = {
            TopAppBar(Modifier.height(40.dp),backgroundColor = White) {
               toolbar(selectPosition)
            }
        }, bottomBar = {
            BottomAppBar(backgroundColor = White, modifier = Modifier.height(50.dp)) {
                bottomBar(selectPosition){
                    onSelectedChanged.invoke(it)
                }
            }
        }) {
            //FrameLayout
            bodyView()
        }
    }


    //单元测试
    @Preview(showBackground = true)
    @Composable
    fun Text() {
        val mainViewModel:MainViewModel = viewModel()
        Basics(mainViewModel.selectPosition){
            mainViewModel.selectPosition = it
        }
    }
}
