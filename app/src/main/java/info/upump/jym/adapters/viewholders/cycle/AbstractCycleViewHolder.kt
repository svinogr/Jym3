package info.upump.jym.adapters.viewholders.cycle

import android.content.Context
import android.net.Uri
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.Priority
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import info.upump.jym.R
import info.upump.jym.databinding.CycleCardLayoutBinding
import info.upump.jym.models.Cycle

abstract class AbstractCycleViewHolder(binding: CycleCardLayoutBinding) :
    RecyclerView.ViewHolder(binding.root), View.OnClickListener {
    protected var title: TextView = binding.cycleCardLayoutTitle
    protected var img: ImageView = binding.cycleCardLayoutImage
    protected var date: TextView = binding.cycleCardLayoutInfoDate
    protected lateinit var cycle: Cycle
    protected var context: Context = binding.root.context

    fun bind(cycle: Cycle) {
        this.cycle = cycle
        title.text = cycle.title
        setVariableViews()
        setImg()
    }

    private fun setImg() {
        var uri: Uri? = null
        /*       if (cycle.getImage() != null) {
                   uri = Uri.parse(cycle.getImage())
               }*/
        cycle.image?.let {
            uri = Uri.parse(cycle.image)
        }

        val options: RequestOptions = RequestOptions()
            .transforms(RoundedCorners(50))
            .centerCrop()
            .error(R.drawable.iview_place_erore_exercise_50)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .priority(Priority.HIGH)

        cycle.defaultImg?.let {
            val identifier =
                context.resources.getIdentifier(cycle.defaultImg, "drawable", context.packageName)
            Glide.with(context).load(identifier).transform(RoundedCorners(50)).centerCrop()
                .error(R.drawable.iview_place_erore_exercise_50)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .priority(Priority.HIGH)
                .into(img)
            return
        }

        uri?.let {
            Glide.with(itemView.context).load(uri).transform(RoundedCorners(50)).centerCrop()
                .error(R.drawable.iview_place_erore_exercise_50)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .priority(Priority.HIGH).into(img)
            return
        }

/*
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
            .priority(Priority.HIGH).into(imageView)*/
    }

    abstract fun setVariableViews()

}