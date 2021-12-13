package com.priscilla.compose.bean

import io.objectbox.annotation.Entity
import io.objectbox.annotation.Id

/**
 * Created by Priscilla Cheung on 2021年12月10日17:29:36
 */
@Entity
data class URLGroupData(
    @Id
    var id: Long = 0,
    var title: String = ""
)