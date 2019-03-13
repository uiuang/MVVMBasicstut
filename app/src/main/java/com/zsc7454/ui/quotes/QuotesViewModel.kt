package com.zsc7454.ui.quotes

import androidx.lifecycle.ViewModel
import com.zsc7454.data.Quote
import com.zsc7454.data.QuoteRepository

/**
 * @类名称：QuotesViewModel
 * @单位：无
 * @联系人：朱世闯
 * @联系方式：18715096987@163.com
 * @创建时间：2019/3/13-21:00
 * @功能描述：
 */
class QuotesViewModel(private val quoteRepository: QuoteRepository): ViewModel() {
    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)

}