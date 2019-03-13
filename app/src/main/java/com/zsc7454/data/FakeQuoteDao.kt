package com.zsc7454.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

/**
 * @类名称：FakeQuoteDao
 * @单位：无
 * @联系人：朱世闯
 * @联系方式：18715096987@163.com
 * @创建时间：2019/3/13-20:45
 * @功能描述：
 */
class FakeQuoteDao {
    private val quoteList = mutableListOf<Quote>()
    private val quotes = MutableLiveData<List<Quote>>()

    init {
        quotes.value = quoteList
    }

    fun addQuote(quote: Quote) {
        quoteList.add(quote)
        quotes.value = quoteList

    }

    fun getQuote() = quotes as LiveData<List<Quote>>


}