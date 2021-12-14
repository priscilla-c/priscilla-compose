package com.priscilla.compose.ui.activity

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.os.Build
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.priscilla.compose.BOOK_LIST_PAGE
import com.priscilla.compose.MAIN_PAGE
import com.priscilla.compose.WEB_PAGE
import com.priscilla.compose.bean.URLItemData_
import com.priscilla.compose.ui.theme.*
import com.priscilla.compose.ui.view.*
import com.priscilla.compose.utils.DataManager
import com.priscilla.compose.utils.Store
import com.priscilla.compose.utils.Store.start
import com.priscilla.compose.utils.hideSoftKeyboard
import com.priscilla.compose.utils.statusBar
import com.priscilla.compose.viewmodel.MainViewModel


class MainActivity : ComponentActivity() {
    private var nowTitle: String by mutableStateOf("")
    var nowURL: String by mutableStateOf("")
    var pageType: Int by mutableStateOf(MAIN_PAGE)

    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //设置View
        setContent {
            PriscillaComposeTheme {
                val mainViewModel: MainViewModel = viewModel()
                Basics(mainViewModel.selectPosition) {
                    //tabLayout
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
    private fun Basics(
        selectPosition: Int,
        onSelectedChanged: (Int) -> Unit,
    ) {
        Scaffold(topBar = {
            //Toolbar
            TopAppBar(Modifier.height(40.dp), backgroundColor = White) {
                val titleList = DataManager.getTabTitleList()
                toolbar(
                    when {
                        nowURL.isNotBlank() -> nowTitle
                        nowTitle.isNotBlank() -> nowTitle
                        else -> titleList[selectPosition]
                    }
                )
            }
        }, bottomBar = {
            //BottomBar
            if (pageType == MAIN_PAGE)
                BottomAppBar(backgroundColor = White, modifier = Modifier.height(50.dp)) {
                    bottomBar(selectPosition) {
                        onSelectedChanged.invoke(it)
                    }
                }
            else {
            }
        }) {
            //FrameLayout
            when(selectPosition){
                0->{
                    when (pageType) {
                        MAIN_PAGE -> {
                            bodyView(inputEnter = {
                                hideSoftKeyboard()
                            }) {
                                nowTitle = it
                                pageType = BOOK_LIST_PAGE
                            }
                        }
                        BOOK_LIST_PAGE -> {
                            val titleList =  DataManager.getItemData(nowTitle)
                            recyclerView(titleList,Modifier,false) {
                                startWebView(it)
                            }
                        }
                        WEB_PAGE -> {
                            webView(url = nowURL)
                        }
                    }
                }
                1 ->{
                    val titleList =  Store.queryCreate(URLItemData_.isEnshrine.equal(true)).build().start()
                    recyclerView(titleList,Modifier.padding(bottom = 50.dp),true) {
                        startWebView(it)
                    }
                }
                2->{

                }
            }


        }
    }

    private fun startWebView(it: String) {
        /*val type = it.substring(it.length-3,it.length)
        if (type.isNotBlank() && type == "pdf"){
            val cm: ClipboardManager =
                getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
            val mClipData = ClipData.newPlainText("Label", it)
            cm.setPrimaryClip(mClipData)
            Toast.makeText(this, "下载链接已复制", Toast.LENGTH_SHORT).show()
        }else{
            nowURL = it
            pageType = WEB_PAGE
        }*/
        openBrowser(this,it)
    }


    //单元测试
    @Preview(showBackground = true)
    @Composable
    fun Test() {

    }

    //再按一次退出程序
    private var mExitTime: Long = 0
    override fun onBackPressed() {
        when (pageType) {
            MAIN_PAGE -> {
                //若popWindow为isShowing显示时按返回键关闭popWindow，否则记录时间，根据时间差退出程序
                if (System.currentTimeMillis() - mExitTime < 2000) {
                    super.onBackPressed()
                } else {
                    mExitTime = System.currentTimeMillis()
                    Toast.makeText(this, "再按一次退出程序", Toast.LENGTH_SHORT).show()
                }
            }
            BOOK_LIST_PAGE -> {
                nowTitle = ""
                pageType = MAIN_PAGE
            }
            WEB_PAGE -> {
                nowURL = ""
                pageType = BOOK_LIST_PAGE
            }
        }

    }

    var clickListener: ((Int) -> Unit)? = null
}
