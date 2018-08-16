package alex.mrrok.presentation.screens.user.list.mainpage;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;

import alex.mrrok.knowmeapp.R;
import alex.mrrok.knowmeapp.databinding.ActivityUserAccountBinding;
import alex.mrrok.presentation.base.BaseMvvmActivity;
import alex.mrrok.presentation.screens.user.edit.AppFragmentAdapter;
import alex.mrrok.presentation.screens.user.list.mainpage.fragmentmaps.MapsFragment;
import alex.mrrok.presentation.screens.user.list.mainpage.fragmentuserpage.UserPageFragment;
import alex.mrrok.presentation.screens.user.list.mainpage.fragmentuserlist.UserListFragment;
import devlight.io.library.ntb.NavigationTabBar;

public class MainPageActivity extends BaseMvvmActivity<MainPageViewModel,
        ActivityUserAccountBinding, MainPageRouter> {

    public static final int DELAY_MILLIS = 3000;

    @Override
    protected MainPageViewModel provideViewModel() {
        return ViewModelProviders.of(this).get(MainPageViewModel.class);
    }

    @Override
    protected int provideLayoutID() {
        return R.layout.activity_user_account;
    }

    @Override
    protected MainPageRouter provideRouter() {
        return new MainPageRouter(this);
    }

    @Override
    public View onCreateView(String name, Context context, AttributeSet attrs) {

        return super.onCreateView(name, context, attrs);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initUI();
    }


    private void initUI() {
        final ViewPager viewPager = binding.viewPager;
        viewPager.setOffscreenPageLimit(1);
        viewPager.setAdapter(new AppFragmentAdapter(getSupportFragmentManager()));

        initNavigationTabBar(viewPager);

    }

    private void initNavigationTabBar(ViewPager viewPager) {
        final String[] colors = getResources().getStringArray(R.array.default_preview);

        final NavigationTabBar navigationTabBar = binding.ntbHorizontal;
        final ArrayList<NavigationTabBar.Model> models = new ArrayList<>();
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.ic_first),
                        Color.parseColor(colors[0]))
                        .selectedIcon(getResources().getDrawable(R.drawable.ic_sixth))
                        .title("Map")
                        .badgeTitle("NTB")
                        .build()
        );
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.ic_third),
                        Color.parseColor(colors[2]))
                        .selectedIcon(getResources().getDrawable(R.drawable.ic_seventh))
                        .title("Find")
                        .badgeTitle("state")
                        .build()
        );
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.ic_fourth),
                        Color.parseColor(colors[3]))
                        .title("Account")
                        .badgeTitle("icon")
                        .build()
        );
        navigationTabBar.setModels(models);
        navigationTabBar.setViewPager(viewPager, 2);

        navigationTabBar.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(final int position, final float positionOffset, final int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(final int position) {
                navigationTabBar.getModels().get(position).hideBadge();
            }

            @SuppressLint("LongLogTag")
            @Override
            public void onPageScrollStateChanged(final int state) {
            }
        });
    }

}
