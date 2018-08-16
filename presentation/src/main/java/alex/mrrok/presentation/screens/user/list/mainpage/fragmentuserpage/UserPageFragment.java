package alex.mrrok.presentation.screens.user.list.mainpage.fragmentuserpage;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;

import alex.mrrok.data.phonedata.SaveUserKey;
import alex.mrrok.knowmeapp.R;
//import alex.mrrok.knowmeapp.databinding.ActivityUserAccountBinding;
//import alex.mrrok.presentation.base.BaseMvvmActivity;
import alex.mrrok.knowmeapp.databinding.ActivityVpuserBinding;
import alex.mrrok.presentation.base.BaseMvvmActivity;
import alex.mrrok.presentation.base.BaseMvvmFragment;
import alex.mrrok.presentation.screens.user.list.loginpage.LoginPageActivity;
import alex.mrrok.presentation.screens.user.list.mainpage.fragmentuserlist.UserListFragment;
import alex.mrrok.presentation.screens.user.list.mainpage.fragmentuserlist.UserListFragmentViewModel;

public class UserPageFragment extends BaseMvvmFragment<UserPageFragmentViewModel, ActivityVpuserBinding,
        FragmentRouter> {

    @Override
    protected UserPageFragmentViewModel provideViewModel() {
        return ViewModelProviders
                .of(this).get(UserPageFragmentViewModel.class);
    }

    @Override
    protected int provideLayoutId() {
        return R.layout.activity_vpuser;
    }

    @Override
    protected FragmentRouter provideRouter() {
        return (FragmentRouter) (((BaseMvvmActivity) getActivity()).getRouter());
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser) {
        }
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.w("onActivityCreatedUSER", "WORK");
        SaveUserKey.create(getActivity());
        startCheck(SaveUserKey.checkRegistration());

        binding.recyclerViewNews.setAdapter(viewModel.adapter);
        binding.recyclerViewNews.setLayoutManager(new LinearLayoutManager(getActivity()));
        binding.recyclerViewNews.setHasFixedSize(true);

    }

    public void startCheck(String check) {
        if (!check.equals("1")) {
            Intent intent = new Intent(getActivity(), LoginPageActivity.class);
            startActivity(intent);
        } else viewModel.id.onNext(SaveUserKey.getEmail());
    }

}
