package com.apps.ifaldyprayanda.viewpagerslider.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.recyclerview.widget.RecyclerView
import com.apps.ifaldyprayanda.viewpagerslider.R

class ViewPagerAdapter(var context: Context): RecyclerView.Adapter<ViewPagerAdapter.ViewPagerHolder>() {

    //create 4x2 array contains color and icon
    var colorIconMatrix = arrayOf<IntArray>(
        intArrayOf(android.R.color.background_light, R.drawable.reg),
        intArrayOf(android.R.color.darker_gray, R.drawable.login_screen_),
        intArrayOf(android.R.color.white, R.drawable.tes),
        intArrayOf(android.R.color.darker_gray, R.drawable.otp_screen)
    )


    class ViewPagerHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        lateinit var img_view: ImageView
        lateinit var container: RelativeLayout

        //init
        init{
            img_view = itemView.findViewById(R.id.img_view) as ImageView
            container = itemView.findViewById(R.id.container) as RelativeLayout
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerHolder {
        return ViewPagerHolder(LayoutInflater.from(context).inflate(R.layout.item_page, parent, false))
    }

    override fun getItemCount(): Int {
        return colorIconMatrix.size
    }

    override fun onBindViewHolder(holder: ViewPagerHolder, position: Int) {
        holder.img_view.setImageResource(colorIconMatrix[position][1]) // array number 1 is image
        holder.container.setBackgroundResource(colorIconMatrix[position][0]) // array number 0 is background color

    }
}