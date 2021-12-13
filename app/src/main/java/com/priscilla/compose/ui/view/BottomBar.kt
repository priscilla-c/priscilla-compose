package com.priscilla.compose.ui.view

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import com.priscilla.compose.ui.theme.Gray
import com.priscilla.compose.ui.theme.Purple500
import com.priscilla.compose.utils.DataManager

/**
 * Created by Priscilla Cheung on 2021年12月11日02:01:40
 */
//bottomBar
@Composable
fun bottomBar(selectPosition: Int,onSelectedChanged:(Int)->Unit) {
    Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
        for (i in 0..2){
            bottomBarItem(
                i,
                Modifier.weight(1f),
                selectPosition
            ){
                onSelectedChanged.invoke(i)
            }
        }
    }
}
//bottomBarItem
@Composable
fun bottomBarItem(position: Int, weight: Modifier,selectPosition:Int,onSelectedChanged:()->Unit) {
    val titleList = DataManager.getTabTitleList()
    val resList =  DataManager.getTabResList()
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = weight.clickable {onSelectedChanged.invoke() }) {
        Icon(
            painter = painterResource(id = resList[position]),
            contentDescription = titleList[position],
            tint = if (selectPosition == position) Purple500 else Gray
        )
        Text(titleList[position], color = if (selectPosition == position) Purple500 else Gray,fontSize = 12.sp)
    }
}