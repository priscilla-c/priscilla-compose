package com.priscilla.compose.ui.view

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.priscilla.compose.R
import com.priscilla.compose.bean.URLItemData
import com.priscilla.compose.ui.theme.Gray
import com.priscilla.compose.ui.theme.Purple500
import com.priscilla.compose.utils.DataManager
import com.priscilla.compose.utils.Store

//列表

    @Composable
    fun recyclerView(titleList: List<URLItemData>,modifier: Modifier,defaultView:Boolean,itemClickListener: ((String)->Unit)) {
        //Material Design -- Google 设计规范
        //可滑动的纵向列表
        //选中状态 貌似只能是基础属性?
        val urlList =  remember {mutableStateListOf<Boolean>()}
        LazyColumn(modifier = modifier){
            items(titleList.size) { item ->
                urlList.add(titleList[item].isEnshrine)
                Surface(
                    Modifier
                        .padding(start = 16.dp, end = 16.dp, top = 5.dp, bottom = 5.dp)
                        .clickable {
                            itemClickListener.invoke(titleList[item].url)
                        },
                    elevation = 8.dp,
                    shape = RoundedCornerShape(8.dp),

                    ) {
                    Row (verticalAlignment = Alignment.CenterVertically){
                        Icon(
                            painter = painterResource(R.drawable.ic_enshine),
                            contentDescription = "收藏",
                            tint = if (urlList[item]) Purple500 else Gray,
                            modifier = Modifier
                                .padding(16.dp)
                                .clickable {
                                    urlList[item]= !titleList[item].isEnshrine
                                    titleList[item].isEnshrine = !titleList[item].isEnshrine
                                    Store.put(titleList[item])
                                }
                        )
                        Text(
                            text = titleList[item].title,
                            Modifier
                                .fillMaxWidth()
                        )

                    }
                }
            }
        }
    }

    //单元测试
    @Preview(showBackground = true)
    @Composable
    fun Text() {

    }
