package com.zsc7454.utils

import com.zsc7454.data.FakeDatabase
import com.zsc7454.data.QuoteRepository
import com.zsc7454.ui.quotes.QuotesViewModelFactory

/**
 * @类名称：InjectorUtils
 * @单位：无
 * @联系人：朱世闯
 * @联系方式：18715096987@163.com
 * @创建时间：2019/3/13-21:07
 * @功能描述：
 */
object InjectorUtils {
    fun provideQuotesViewModelFactory():QuotesViewModelFactory{
        var quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)

    }
}