package com.burdukov.nuneperepytat.ui.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.burdukov.nuneperepytat.R


public class FeelViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView)
    {

        val image: ImageView =itemView.findViewById(R.id.img_feel)
        val caption: TextView =itemView.findViewById(R.id.text_feel)

    }
