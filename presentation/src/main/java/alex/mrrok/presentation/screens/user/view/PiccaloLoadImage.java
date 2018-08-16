package alex.mrrok.presentation.screens.user.view;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class PiccaloLoadImage {
    @BindingAdapter("android:src")
    public static void loadImage(ImageView view, String url) {
        Picasso.get().load(url).into(view);
    }

}
