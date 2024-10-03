package com.burdukov.nuneperepytat.data.repository

import com.burdukov.nuneperepytat.R
import com.burdukov.nuneperepytat.data.model.State

class StateRepository {

    val state_list= arrayListOf(
        State(
            id_state = 1,
            title = "Как снять тревожность",
            text_state = "краткое описание",
            linc = "https://e.qlavbukh.ru/1027713",
            image_state = R.drawable.state_image_1




    ),
        State(
            id_state = 2,
            title = "Полный релакс",
            text_state = "краткое описание",
            linc = "https://www.fashiontime.ru/beauty/overviews/1326613.html",
            image_state = R.drawable.state_image_2



        )
    )
}