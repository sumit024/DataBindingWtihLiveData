package com.app_devs.housequotes

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import java.util.*

object QuotesRepository {
    private val quotesList:List<String> = listOf(
    "I've found that when you want to know the truth about someone that " +
            "someone is probably the last person you should ask.",
            "Humanity is overrated.",
            "Reality is almost always wrong.",
            "We all make mistakes, and we all pay a price.",
            "It's one of the great tragedies of life — something always changes.",
            "Arrogance has to be earned.",
            "If you can fake sincerity, you can fake pretty much anything.",
            "People don’t get what they deserve. They just get what they get, and there’s nothing any of us can do about it.",
            "Everybody Lies. The only variable is about what.",
            "Truth begins in lies."

    )

    private val currentQuoteObj=MutableLiveData<String>()
    val currentQuote:LiveData<String>
    get() = currentQuoteObj

    init {
        currentQuoteObj.value= quotesList.first()
    }

    private fun getRandomQuote():String{
        val random=Random()
        return quotesList[random.nextInt(quotesList.size)]
    }
    fun changeCurrentQuote()
    {
        currentQuoteObj.value= getRandomQuote()
    }

}
