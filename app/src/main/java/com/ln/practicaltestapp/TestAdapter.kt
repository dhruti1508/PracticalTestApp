package com.ln.practicaltestapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class TestAdapter(val context: Context, var places: List<Data>) : RecyclerView.Adapter<TestAdapter.ArticleViewHolder>()
{
    class ArticleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        var imgItem = itemView.findViewById<ImageView>(R.id.imgItem)
        var txtName = itemView.findViewById<TextView>(R.id.txtName)
        var txtBank = itemView.findViewById<TextView>(R.id.txtBank)
        var txtOne = itemView.findViewById<TextView>(R.id.txt1)
        var txtTwo = itemView.findViewById<TextView>(R.id.txt2)
        var txtOff = itemView.findViewById<TextView>(R.id.txtOff)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder
    {
        val view = LayoutInflater.from(context).inflate(R.layout.item_layout, parent , false)
        return ArticleViewHolder(view)
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int)
    {
        val article : Data = places.get(position)
        holder.txtName.text = article.title
        holder.txtBank.text = article.field?.get(0).toString()
        holder.txtOne.text = article.actualPrice
        holder.txtTwo.text = article.offerPrice
        holder.txtOff.text = article.discount.toString().plus(" % off")

        Glide.with(context).load(article.offerImage).into(holder.imgItem)


//        holder.card_view.setOnClickListener(View.OnClickListener
//        {
//
//            val i1 = Intent(context, PlaceDetails::class.java)
//            i1.putExtra("place_id", places.get(position).placeId)
//            context.startActivity(i1)
//
//
//        })

    }

    override fun getItemCount(): Int
    {
        return places.size
    }
}