/*
package info.upump.jym.adapters.viewholders

import android.content.Context
import android.net.Uri
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

abstract class AbstsractCycleViewHolder(itemView: View) :
    RecyclerView.ViewHolder(itemView), View.OnClickListener {
    protected var title: TextView
    protected var date: TextView
    protected var imageView: ImageView
    protected var cycle: Cycle? = null
    protected var itemView: View
    protected var context: Context

    init {
        this.itemView = itemView
        context = itemView.context
        title = itemView.findViewById(R.id.cycle_card_layout_title)
        date = itemView.findViewById(R.id.cycle_card_layout_info_date)
        imageView = itemView.findViewById(R.id.cycle_card_layout_image)
        itemView.setOnClickListener(this)
    }

    fun bind(cycle: Cycle) {
        this.cycle = cycle
        title.setText(cycle.getTitle())
        setVariableViews()
        setPic()
    }

    abstract fun setVariableViews()

    */
/*
        protected void setPic() {
            Uri uri = null;
            if (cycle.getImage() != null) {
                uri = Uri.parse(cycle.getImage());
            }
            RequestOptions options = new RequestOptions()
                    .transforms(new RoundedCorners(50))
                    .centerCrop()
                    .error(R.drawable.iview_place_erore_exercise_50)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .priority(Priority.HIGH);

            if (cycle.getDefaultImg() != null) {
                int ident = context.getResources().getIdentifier(cycle.getDefaultImg(), "drawable", context.getPackageName());
                Glide.with(context).load(ident).apply(options).into(imageView);
            } else Glide.with(itemView.getContext()).load(uri).apply(options).into(imageView);
        }
    *//*

    protected fun setPic() {
        var uri: Uri? = null
        if (cycle.getImage() != null) {
            uri = Uri.parse(cycle.getImage())
        }
        val options: RequestOptions = RequestOptions()
            .transforms(RoundedCorners(50))
            .centerCrop()
            .error(R.drawable.iview_place_erore_exercise_50)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .priority(Priority.HIGH)
        if (cycle.getDefaultImg() != null) {
            val ident = context.resources.getIdentifier(
                cycle.getDefaultImg(),
                "drawable",
                context.packageName
            )
            Glide.with(context).load(ident).transform(RoundedCorners(50)).centerCrop()
                .error(R.drawable.iview_place_erore_exercise_50)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .priority(Priority.HIGH)
                .into(imageView)
        } else Glide.with(itemView.context).load(uri).transform(RoundedCorners(50)).centerCrop()
            .error(R.drawable.iview_place_erore_exercise_50)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .priority(Priority.HIGH).into(imageView)
    }

    override fun onClick(v: View) {
        startActivity()
    }

    abstract fun startActivity()
}*/
