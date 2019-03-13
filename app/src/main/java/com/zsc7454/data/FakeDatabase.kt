package com.zsc7454.data

/**
 * @类名称：FakeDatabase
 * @单位：无
 * @联系人：朱世闯
 * @联系方式：18715096987@163.com
 * @创建时间：2019/3/13-20:51
 * @功能描述：
 */
class FakeDatabase private constructor() {
    var quoteDao = FakeQuoteDao()
        private set

    companion object {
        @Volatile
        private var instance: FakeDatabase? = null

        fun getInstance() =
            instance ?: synchronized(this) {
                instance ?: FakeDatabase().also {
                    instance = it
                }

            }

    }
}