package alex.mrrok.data.database;

import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import android.support.annotation.NonNull;

import java.io.File;

import alex.mrrok.data.database.dao.DaoContract;
import alex.mrrok.data.entity.UserInfo;

@Database(entities = {UserInfo.class},
        version = 1,
        exportSchema = false)
//@TypeConverters() - конекртный класс который что то конвертирует
public abstract class UserInfoDataBase extends RoomDatabase {

    private static final String DATABASE_NAME = "USER_INFO_DATABASE";

    private static UserInfoDataBase dataBase = null;

    public static UserInfoDataBase getInstance(Context context) {
        // миграция базы данных , меняем типо версию
        // еще это используем в Dagger2 для того что бы он забацал его
        if (dataBase == null) {
            dataBase = create(context);
        }
        return dataBase;
    }


    // используется для тестов
    @NonNull
    public static UserInfoDataBase getInstanceInMemory(Context context) {
        return Room.inMemoryDatabaseBuilder(context,
                UserInfoDataBase.class)
                .build();
    }

    @NonNull
    private static UserInfoDataBase create(Context context) {
        return Room.databaseBuilder(context,
                UserInfoDataBase.class, DATABASE_NAME)
                .fallbackToDestructiveMigration()
                .build();
    }

    public static boolean removeDataBase(Context context) {
        File dbFile = context.getDatabasePath(DATABASE_NAME);
        if (dbFile.exists()) {
            return dbFile.delete();
        } else {
            return false;
        }
    }

    public abstract DaoContract daoContract();

}