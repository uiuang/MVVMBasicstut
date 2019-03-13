package com.zsc7454.ui.quotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.zsc7454.R
import com.zsc7454.data.Quote
import com.zsc7454.utils.InjectorUtils
import kotlinx.android.synthetic.main.activity_quote.*
import kotlin.text.Typography.quote

class QuoteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quote)
        initializeUi()
    }

    private fun initializeUi() {
        val factory = InjectorUtils.provideQuotesViewModelFactory()
        val viewModel = ViewModelProviders.of(this, factory)
            .get(QuotesViewModel::class.java)

        viewModel.getQuotes().observe(this, Observer {quotes->
            val stringBuilder = StringBuilder()
            quotes.forEach { quote->
                stringBuilder.append("$quote\n\n")
                textView_quotes.text = stringBuilder.toString()
            }
        })
        button_add_quote.setOnClickListener {
            val quote = Quote(editText_quote.text.toString(), editText_author.text.toString())
            viewModel.addQuote(quote)
            editText_author.setText("")
            editText_quote.setText("")

        }
    }
}
