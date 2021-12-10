package com.priscilla.compose.ui.view

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.priscilla.compose.utils.DataManager

/**
 * Created by Priscilla Cheung on 2021年12月11日01:59:58
 */
//Toolbar
@Composable
fun toolbar(selectPosition:Int){
    val titleList = DataManager.getTabTitleList()
    Text(
        text = titleList[selectPosition],
        modifier = Modifier.fillMaxWidth(),
        textAlign = TextAlign.Center,
        fontSize = 20.sp,
    )
}