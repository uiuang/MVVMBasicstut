package com.zsc7454.data

/**
 * @类名称：QuoteRepository
 * @单位：无
 * @联系人：朱世闯
 * @联系方式：18715096987@163.com
 * @创建时间：2019/3/13-20:56
 * @功能描述：
 */
class QuoteRepository private constructor(private val quoteDao: FakeQuoteDao){

    fun addQuote(quote: Quote) {
        quoteDao.addQuote(quote)
    }
    fun getQuotes()=quoteDao.getQuote()

    companion object {
        @Volatile
        private var instance: QuoteRepository? = null
        fun getInstance(quoteDao: FakeQuoteDao) =
            instance ?: synchronized(this) {
                instance ?: QuoteRepository(quoteDao).also {
                    instance = it
                }
            }
    }
}