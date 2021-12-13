package com.priscilla.compose.bean

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import io.objectbox.annotation.Convert
import io.objectbox.annotation.Entity
import io.objectbox.annotation.Id

/**
 * Created by Priscilla Cheung on 2021年12月11日23:57:42
 */
@Entity
data class URLItemData(
    @Id
    var id: Long = 0,
    var groupTitle: String = "",
    var title: String = "",
    var url: String = "",
    var isEnshrine: Boolean = false
)
