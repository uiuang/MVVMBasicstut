package com.zsc7454.data

/**
 * @类名称：Quote
 * @单位：无
 * @联系人：朱世闯
 * @联系方式：18715096987@163.com
 * @创建时间：2019/3/13-20:36
 * @功能描述：
 */
data class Quote(val quoteText: String, val author: String) {
    override fun toString(): String {
        return "$quoteText - $author"
    }
}