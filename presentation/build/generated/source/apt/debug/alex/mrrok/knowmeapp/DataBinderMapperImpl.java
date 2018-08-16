package alex.mrrok.knowmeapp;

import alex.mrrok.knowmeapp.databinding.ActivityAccountSettingsBindingImpl;
import alex.mrrok.knowmeapp.databinding.ActivityAddNewsBindingImpl;
import alex.mrrok.knowmeapp.databinding.ActivityAnotheUserBindingImpl;
import alex.mrrok.knowmeapp.databinding.ActivityFragmentmapBindingImpl;
import alex.mrrok.knowmeapp.databinding.ActivityListuserfragmentBindingImpl;
import alex.mrrok.knowmeapp.databinding.ActivityLoginBindingImpl;
import alex.mrrok.knowmeapp.databinding.ActivityMapBindingImpl;
import alex.mrrok.knowmeapp.databinding.ActivitySettingsBindingImpl;
import alex.mrrok.knowmeapp.databinding.ActivitySignupBindingImpl;
import alex.mrrok.knowmeapp.databinding.ActivityUserAccountBindingImpl;
import alex.mrrok.knowmeapp.databinding.ActivityUserAccountWithViewBindingImpl;
import alex.mrrok.knowmeapp.databinding.ActivityVpuserBindingImpl;
import alex.mrrok.knowmeapp.databinding.CustomMarkerLayoutBindingImpl;
import alex.mrrok.knowmeapp.databinding.ItemNewsBindingImpl;
import alex.mrrok.knowmeapp.databinding.ItemUserBindingImpl;
import android.databinding.DataBinderMapper;
import android.databinding.DataBindingComponent;
import android.databinding.ViewDataBinding;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYFRAGMENTMAP = 1;

  private static final int LAYOUT_ACTIVITYUSERACCOUNTWITHVIEW = 2;

  private static final int LAYOUT_ACTIVITYSIGNUP = 3;

  private static final int LAYOUT_ACTIVITYLISTUSERFRAGMENT = 4;

  private static final int LAYOUT_ACTIVITYSETTINGS = 5;

  private static final int LAYOUT_ACTIVITYMAP = 6;

  private static final int LAYOUT_ACTIVITYLOGIN = 7;

  private static final int LAYOUT_ACTIVITYACCOUNTSETTINGS = 8;

  private static final int LAYOUT_ITEMUSER = 9;

  private static final int LAYOUT_CUSTOMMARKERLAYOUT = 10;

  private static final int LAYOUT_ACTIVITYADDNEWS = 11;

  private static final int LAYOUT_ACTIVITYANOTHEUSER = 12;

  private static final int LAYOUT_ACTIVITYVPUSER = 13;

  private static final int LAYOUT_ACTIVITYUSERACCOUNT = 14;

  private static final int LAYOUT_ITEMNEWS = 15;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(15);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(alex.mrrok.knowmeapp.R.layout.activity_fragmentmap, LAYOUT_ACTIVITYFRAGMENTMAP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(alex.mrrok.knowmeapp.R.layout.activity_user_account_with_view, LAYOUT_ACTIVITYUSERACCOUNTWITHVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(alex.mrrok.knowmeapp.R.layout.activity_signup, LAYOUT_ACTIVITYSIGNUP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(alex.mrrok.knowmeapp.R.layout.activity_listuserfragment, LAYOUT_ACTIVITYLISTUSERFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(alex.mrrok.knowmeapp.R.layout.activity_settings, LAYOUT_ACTIVITYSETTINGS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(alex.mrrok.knowmeapp.R.layout.activity_map, LAYOUT_ACTIVITYMAP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(alex.mrrok.knowmeapp.R.layout.activity_login, LAYOUT_ACTIVITYLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(alex.mrrok.knowmeapp.R.layout.activity_account_settings, LAYOUT_ACTIVITYACCOUNTSETTINGS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(alex.mrrok.knowmeapp.R.layout.item_user, LAYOUT_ITEMUSER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(alex.mrrok.knowmeapp.R.layout.custom_marker_layout, LAYOUT_CUSTOMMARKERLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(alex.mrrok.knowmeapp.R.layout.activity_add_news, LAYOUT_ACTIVITYADDNEWS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(alex.mrrok.knowmeapp.R.layout.activity_anothe_user, LAYOUT_ACTIVITYANOTHEUSER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(alex.mrrok.knowmeapp.R.layout.activity_vpuser, LAYOUT_ACTIVITYVPUSER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(alex.mrrok.knowmeapp.R.layout.activity_user_account, LAYOUT_ACTIVITYUSERACCOUNT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(alex.mrrok.knowmeapp.R.layout.item_news, LAYOUT_ITEMNEWS);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYFRAGMENTMAP: {
          if ("layout/activity_fragmentmap_0".equals(tag)) {
            return new ActivityFragmentmapBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_fragmentmap is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYUSERACCOUNTWITHVIEW: {
          if ("layout/activity_user_account_with_view_0".equals(tag)) {
            return new ActivityUserAccountWithViewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_user_account_with_view is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSIGNUP: {
          if ("layout/activity_signup_0".equals(tag)) {
            return new ActivitySignupBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_signup is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLISTUSERFRAGMENT: {
          if ("layout/activity_listuserfragment_0".equals(tag)) {
            return new ActivityListuserfragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_listuserfragment is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSETTINGS: {
          if ("layout/activity_settings_0".equals(tag)) {
            return new ActivitySettingsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_settings is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAP: {
          if ("layout/activity_map_0".equals(tag)) {
            return new ActivityMapBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_map is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLOGIN: {
          if ("layout/activity_login_0".equals(tag)) {
            return new ActivityLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_login is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYACCOUNTSETTINGS: {
          if ("layout/activity_account_settings_0".equals(tag)) {
            return new ActivityAccountSettingsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_account_settings is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMUSER: {
          if ("layout/item_user_0".equals(tag)) {
            return new ItemUserBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_user is invalid. Received: " + tag);
        }
        case  LAYOUT_CUSTOMMARKERLAYOUT: {
          if ("layout/custom_marker_layout_0".equals(tag)) {
            return new CustomMarkerLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for custom_marker_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYADDNEWS: {
          if ("layout/activity_add_news_0".equals(tag)) {
            return new ActivityAddNewsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_add_news is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYANOTHEUSER: {
          if ("layout/activity_anothe_user_0".equals(tag)) {
            return new ActivityAnotheUserBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_anothe_user is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYVPUSER: {
          if ("layout/activity_vpuser_0".equals(tag)) {
            return new ActivityVpuserBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_vpuser is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYUSERACCOUNT: {
          if ("layout/activity_user_account_0".equals(tag)) {
            return new ActivityUserAccountBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_user_account is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMNEWS: {
          if ("layout/item_news_0".equals(tag)) {
            return new ItemNewsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_news is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    final int code = tag.hashCode();
    switch(code) {
      case -235745006: {
        if(tag.equals("layout/activity_fragmentmap_0")) {
          return R.layout.activity_fragmentmap;
        }
        break;
      }
      case -1815578956: {
        if(tag.equals("layout/activity_user_account_with_view_0")) {
          return R.layout.activity_user_account_with_view;
        }
        break;
      }
      case -474702252: {
        if(tag.equals("layout/activity_signup_0")) {
          return R.layout.activity_signup;
        }
        break;
      }
      case 1059855861: {
        if(tag.equals("layout/activity_listuserfragment_0")) {
          return R.layout.activity_listuserfragment;
        }
        break;
      }
      case -415786017: {
        if(tag.equals("layout/activity_settings_0")) {
          return R.layout.activity_settings;
        }
        break;
      }
      case -1648892318: {
        if(tag.equals("layout/activity_map_0")) {
          return R.layout.activity_map;
        }
        break;
      }
      case -237232145: {
        if(tag.equals("layout/activity_login_0")) {
          return R.layout.activity_login;
        }
        break;
      }
      case 196492849: {
        if(tag.equals("layout/activity_account_settings_0")) {
          return R.layout.activity_account_settings;
        }
        break;
      }
      case -1243181053: {
        if(tag.equals("layout/item_user_0")) {
          return R.layout.item_user;
        }
        break;
      }
      case -1627407753: {
        if(tag.equals("layout/custom_marker_layout_0")) {
          return R.layout.custom_marker_layout;
        }
        break;
      }
      case 1491352557: {
        if(tag.equals("layout/activity_add_news_0")) {
          return R.layout.activity_add_news;
        }
        break;
      }
      case -1173275903: {
        if(tag.equals("layout/activity_anothe_user_0")) {
          return R.layout.activity_anothe_user;
        }
        break;
      }
      case -1513696383: {
        if(tag.equals("layout/activity_vpuser_0")) {
          return R.layout.activity_vpuser;
        }
        break;
      }
      case 1492751989: {
        if(tag.equals("layout/activity_user_account_0")) {
          return R.layout.activity_user_account;
        }
        break;
      }
      case -1455977205: {
        if(tag.equals("layout/item_news_0")) {
          return R.layout.item_news;
        }
        break;
      }
    }
    return 0;
  }

  @Override
  public String convertBrIdToString(int id) {
    String tmpVal = InnerBrLookup.sKeys.get(id);
    return tmpVal;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(alex.mrrok.knowmeapp.BR._all, "_all");
      sKeys.put(alex.mrrok.knowmeapp.BR.viewModel, "viewModel");
    }
  }
}
