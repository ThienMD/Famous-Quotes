package com.thienpv.famousquote

public class Quotes {
    private val vietnam = arrayOf(
        // Add your Vietnamese quotes here
        "Đi một ngày đàng, học một sàng khôn",
        "Học một lúc, nhớ một đời",
        "Học hành chẳng quên",
        "Có công mài sắt, có ngày nên kim",
        "Đầu xuôi đuôi lọt",
        "Đi chân trần mà đạp vào gai",
        "Được an ăn lành",
        "Đường xa quen mình đi, đường gần lạ mình đến",
        "Gần mực thì đen, gần đèn thì sáng",
        "Giỏi giang cũng chỉ là người thôi",
        "Học không canh kỳ, học đến già còn hỏi han",
        "Không thầy đố mày làm nên",
        "Làm quan ăn lộc của nhà nước, làm dân ăn lộc của thiên nhiên",
        "Lương tâm là thanh gươm",
        "Một cây làm chẳng nên non, ba cây chụm lại nên hòn núi cao",
        "Nghèo đói sinh sự tình",
        "Nước đục thả câu",
        "Quả báo là quả ăn",
        "Thân nhân nghĩa thúy, bè bạn tình nghĩa",
        "Trăm nghe không bằng một thấy",
        "Trèo cao ngã đau",
        "Trót dại phải giữ",
        "Trót yêu phải cưới",
        "Tròn vo lành lặn",
        "Trót đa tình, khó lòng chung thủy",
    )

    private val english = arrayOf(
        "The journey of a thousand miles begins with one step.",
        "Education is the most powerful weapon which you can use to change the world.",
        "The only way to do great work is to love what you do.",
        "In the end, it's not the years in your life that count. It's the life in your years.",
        "Life is what happens when you're busy making other plans.",
        "The purpose of our lives is to be happy.",
        "Success is not the key to happiness. Happiness is the key to success.",
        "The best way to predict the future is to create it.",
        "Don't count the days, make the days count.",
        "The greatest glory in living lies not in never falling, but in rising every time we fall.",
        "The future belongs to those who believe in the beauty of their dreams.",
        "The best and most beautiful things in the world cannot be seen or even touched - they must be felt with the heart.",
        "It is during our darkest moments that we must focus to see the light.",
        "Whoever is happy will make others happy too.",
        "In this life we cannot do great things. We can only do small things with great love.",
        "The only thing necessary for the triumph of evil is for good men to do nothing.",
        "I can't change the direction of the wind, but I can adjust my sails to always reach my destination.",
        "Believe you can and you're halfway there.",
        "To handle yourself, use your head; to handle others, use your heart.",
        "Too many of us are not living our dreams because we are living our fears.",
        "I would rather die of passion than of boredom.",
        "The only limit to our realization of tomorrow will be our doubts of today.",
        "The only impossible journey is the one you never begin.",
        "In order to write about life first you must live it.",
        "Life is either a daring adventure or nothing at all.",
        "The good life is one inspired by love and guided by knowledge.",
        "The unexamined life is not worth living.",
        "Turn your wounds into wisdom.",
        "Do all things with love.",
        "This above all: to thine own self be true.",
        "Where there is love there is life.",
        "The power of imagination makes us infinite.",
        "Life is really simple, but we insist on making it complicated.",
        "Love the life you live. Live the life you love.",
        "Life is either a daring adventure or nothing at all.",
        "You have within you right now, everything you need to deal with whatever the world can throw at you.",
        "Believe you can and you're halfway there.",
        "Change your thoughts and you change your world.",
        "The purpose of life is not to be happy. It is to be useful, to be honorable, to be compassionate, to have it make some difference that you have lived and lived well.",
        "I find that the harder I work, the more luck I seem to have.",
        "Don't judge each day by the harvest you reap but by the seeds that you plant.",
        "The future belongs to those who believe in the beauty of their dreams.",
        "Go confidently in the direction of your dreams. Live the life you have imagined.",
        "It is never too late to be what you might have been.",
        "When one door of happiness closes, another opens; but often we look so long at the closed door that we do not see the one which has been opened for us.",
        "Do not go where the path may lead, go instead where there is no path and leave a trail.",
        "Life is what happens to us while we are making other plans.",
        "Your time is limited, don't waste it living someone else's life.",
        "The purpose of life is a life of purpose.",
        "You only live once, but if you do it right, once is enough.",
        "In three words I can sum up everything I've learned about life: it goes on.",
        "Life is really simple, but we insist on making it complicated.",
        "Life is what happens when you're busy making other plans.",
    )

    fun generateVietnamQuote(): String {
        val randomIndex = (vietnam.indices).random()
        return vietnam[randomIndex]
    }

    fun generateEnglishQuote(): String {
        val randomIndex = (english.indices).random()
        return english[randomIndex]
    }
}