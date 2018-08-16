package android.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new alex.mrrok.knowmeapp.DataBinderMapperImpl());
    addMapper(new com.android.databinding.library.baseAdapters.DataBinderMapperImpl());
  }
}
