package alex.mrrok.presentation.screens.user.list.mainpage.fragmentuserlist;

import android.app.SearchManager;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import alex.mrrok.knowmeapp.R;
import alex.mrrok.knowmeapp.databinding.ActivityListuserfragmentBinding;
import alex.mrrok.presentation.base.BaseMvvmActivity;
import alex.mrrok.presentation.base.BaseMvvmFragment;
import alex.mrrok.presentation.screens.user.list.mainpage.fragmentmaps.MapsFragment;
import alex.mrrok.presentation.screens.user.list.mainpage.fragmentmaps.MapsFragmentViewModel;
import alex.mrrok.presentation.screens.user.list.mainpage.fragmentuserpage.FragmentRouter;

public class UserListFragment extends BaseMvvmFragment<UserListFragmentViewModel, ActivityListuserfragmentBinding
        , FragmentRouter> {
    @Override
    protected UserListFragmentViewModel provideViewModel() {
        return ViewModelProviders.of(this).get(UserListFragmentViewModel.class);
    }

    @Override
    protected int provideLayoutId() {
        return R.layout.activity_listuserfragment;
    }

    @Override
    protected FragmentRouter provideRouter() {
        return (FragmentRouter) (((BaseMvvmActivity) getActivity()).getRouter());
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser) {
            viewModel.searchUser("");
            new MapsFragmentViewModel();
        }
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.w("onActivityCreatedLIST", "WORK");
        binding.recyclerView.setAdapter(viewModel.adapter);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        binding.recyclerView.setHasFixedSize(true);
//        binding.recyclerView.setNestedScrollingEnabled(false);

        Toolbar toolbar = binding.fragmentToolbar;
        toolbar.setTitle("Find");
        AppCompatActivity activity = (AppCompatActivity) getActivity();
        activity.setSupportActionBar(toolbar);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.search, menu);
        //getting the search view from the menu
        MenuItem searchViewItem = menu.findItem(R.id.menuSearch);

        //getting search manager from systemservice
        SearchManager searchManager = (SearchManager) getActivity().getSystemService(Context.SEARCH_SERVICE);

        //getting the search view
        final SearchView searchView = (SearchView) searchViewItem.getActionView();

        //you can put a hint for the search input field
        searchView.setQueryHint("Search user...");
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getActivity().getComponentName()));

        //by setting it true we are making it iconified
        //so the search input will show up after taping the search iconified
        //if you want to make it visible all the time make it false
        searchView.setIconifiedByDefault(true);

        //here we will get the search query
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                //do the search here
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                viewModel.searchUser(newText);
                return false;
            }
        });
    }
}
