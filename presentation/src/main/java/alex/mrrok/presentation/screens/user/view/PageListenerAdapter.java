package alex.mrrok.presentation.screens.user.view;

import android.databinding.BindingAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;

public class PageListenerAdapter {

    @BindingAdapter("onPageChangeListener")
    public static void setOnPageChangeListener(ViewPager viewPager, ViewPager.OnPageChangeListener listener) {
        Log.e("setOnPageChangeListener", "WORK");

        // clear listeners first avoid adding duplicate listener upon calling notify update related code
        viewPager.clearOnPageChangeListeners();
        viewPager.addOnPageChangeListener(listener);
    }
}
