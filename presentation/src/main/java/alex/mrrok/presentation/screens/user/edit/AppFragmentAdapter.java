package alex.mrrok.presentation.screens.user.edit;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import alex.mrrok.presentation.screens.user.list.mainpage.fragmentmaps.MapsFragment;
import alex.mrrok.presentation.screens.user.list.mainpage.fragmentuserlist.UserListFragment;
import alex.mrrok.presentation.screens.user.list.mainpage.fragmentuserpage.UserPageFragment;

public class AppFragmentAdapter extends FragmentStatePagerAdapter {

    private final static int PAGE_COUNT = 3;

    public AppFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new MapsFragment();
            case 1:
                return new UserListFragment();
            case 2:
                return new UserPageFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }
}
