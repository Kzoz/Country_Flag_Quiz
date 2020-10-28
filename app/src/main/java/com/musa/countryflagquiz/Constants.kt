package com.musa.countryflagquiz

object Constants{

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1 ,"What country does this flag belong to?",
            R.drawable.ic_flag_of_andorra,"Lithuania", "Romania",
            "Andorra", "Guinea-Bissau",3
        )
        questionList.add(que1)

        val que2 = Question(
            2 ,"What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,"Botswana", "Peru",
            "Uruguay", "Argentina",4
        )
        questionList.add(que2)

        val que3 = Question(
            3 ,"What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,"Australia", "New Zealand",
            "United Kingdom", "Samoa",1
        )
        questionList.add(que3)

        val que4 = Question(
            4 ,"What country does this flag belong to?",
            R.drawable.ic_flag_of_barbados,"Romania", "Barbados",
            "Bosnia and herzegovina", "Belize",2
        )
        questionList.add(que4)

        val que5 = Question(
            5 ,"What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,"Djibouti", "Fiji",
            "Micronesia", "Guatemala",2
        )
        questionList.add(que5)

        val que6 = Question(
            6 ,"What country does this flag belong to?",
            R.drawable.ic_flag_of_bhutan,"Bahamas", "Macao",
            "Yemen", "Bhutan",4
        )
        questionList.add(que6)

        val que7 = Question(
            7 ,"What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,"Brunei", "Congo",
            "Belgium", "Germany",3
        )
        questionList.add(que7)

        val que8 = Question(
            8 ,"What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,"Australia", "New Zealand",
            "Ethiopia", "Tonga",2
        )
        questionList.add(que8)

        val que9 = Question(
            9 ,"What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,"Kuwait", "Iran",
            "Irak", "Saudi Arabia",1
        )
        questionList.add(que9)

        val que10 = Question(
            10 ,"What country does this flag belong to?",
            R.drawable.ic_flag_of_kyrgyzstan,"Kyrgyzstan", "Latvia",
            "Paraguay", "Gambia",1
        )
        questionList.add(que10)

        val que11 = Question(
            11 ,"What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,"Libya", "Jamaica",
            "France", "Brazil",4
        )
        questionList.add(que11)

        val que12 = Question(
            12 ,"What country does this flag belong to?",
            R.drawable.ic_flag_of_burundi,"Cameroon", "Italy",
            "Burundi", "Namibia",3
        )
        questionList.add(que12)

        val que13 = Question(
            13 ,"What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,"Begium", "Angola",
            "Bulgaria", "Germany",4
        )
        questionList.add(que13)

        val que14 = Question(
            14 ,"What country does this flag belong to?",
            R.drawable.ic_flag_of_india,"China", "India",
            "Côte d'ivoire", "Finland",2
        )
        questionList.add(que14)

        val que15 = Question(
            15 ,"What country does this flag belong to?",
            R.drawable.ic_flag_of_liechtenstein,"Monaco", "Laos",
            "Marshall Islands", "Liechtenstein",4
        )
        questionList.add(que15)

        return questionList
    }

}
