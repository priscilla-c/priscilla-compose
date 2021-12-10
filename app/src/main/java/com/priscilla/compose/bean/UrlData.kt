package com.priscilla.compose.bean

/**
 * Created by Priscilla Cheung on 2021年12月10日14:53:14
 */
data class UrlData(val title: String, val itemList: List<UrlItemData>) {
    data class UrlItemData(val itemTitle: String, val url: String)
}