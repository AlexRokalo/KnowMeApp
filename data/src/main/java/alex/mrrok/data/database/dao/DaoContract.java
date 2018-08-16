package alex.mrrok.data.database.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import alex.mrrok.data.entity.UserInfo;
import io.reactivex.Completable;
import io.reactivex.Flowable;

@Dao
public interface DaoContract {

    @Insert
    void insert(UserInfo value);

    @Query("SELECT * FROM " + UserInfo.TABLE_NAME + " WHERE email LIKE :emailPerson")
    Flowable<UserInfo> getUser(String emailPerson);

    @Query("DELETE FROM " + UserInfo.TABLE_NAME)
    void deleteAll();

    @Update
    void update(UserInfo value);

}
