package alex.mrrok.data.database;

import alex.mrrok.data.database.dao.DaoContract;
import alex.mrrok.data.database.dao.DaoContract_Impl;
import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Callback;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Configuration;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.RoomOpenHelper;
import android.arch.persistence.room.RoomOpenHelper.Delegate;
import android.arch.persistence.room.util.TableInfo;
import android.arch.persistence.room.util.TableInfo.Column;
import android.arch.persistence.room.util.TableInfo.ForeignKey;
import android.arch.persistence.room.util.TableInfo.Index;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;

@SuppressWarnings("unchecked")
public class UserInfoDataBase_Impl extends UserInfoDataBase {
  private volatile DaoContract _daoContract;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `UserInfoDbEntity` (`phone` TEXT, `photo` TEXT, `email` TEXT NOT NULL, `userInfo` TEXT, `name` TEXT, `nickname` TEXT, `idObject` TEXT, PRIMARY KEY(`email`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"bb5de0f1938bc02bdc2f3bb9d0cd7474\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `UserInfoDbEntity`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsUserInfoDbEntity = new HashMap<String, TableInfo.Column>(7);
        _columnsUserInfoDbEntity.put("phone", new TableInfo.Column("phone", "TEXT", false, 0));
        _columnsUserInfoDbEntity.put("photo", new TableInfo.Column("photo", "TEXT", false, 0));
        _columnsUserInfoDbEntity.put("email", new TableInfo.Column("email", "TEXT", true, 1));
        _columnsUserInfoDbEntity.put("userInfo", new TableInfo.Column("userInfo", "TEXT", false, 0));
        _columnsUserInfoDbEntity.put("name", new TableInfo.Column("name", "TEXT", false, 0));
        _columnsUserInfoDbEntity.put("nickname", new TableInfo.Column("nickname", "TEXT", false, 0));
        _columnsUserInfoDbEntity.put("idObject", new TableInfo.Column("idObject", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUserInfoDbEntity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUserInfoDbEntity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUserInfoDbEntity = new TableInfo("UserInfoDbEntity", _columnsUserInfoDbEntity, _foreignKeysUserInfoDbEntity, _indicesUserInfoDbEntity);
        final TableInfo _existingUserInfoDbEntity = TableInfo.read(_db, "UserInfoDbEntity");
        if (! _infoUserInfoDbEntity.equals(_existingUserInfoDbEntity)) {
          throw new IllegalStateException("Migration didn't properly handle UserInfoDbEntity(alex.mrrok.data.entity.UserInfo).\n"
                  + " Expected:\n" + _infoUserInfoDbEntity + "\n"
                  + " Found:\n" + _existingUserInfoDbEntity);
        }
      }
    }, "bb5de0f1938bc02bdc2f3bb9d0cd7474", "f2bd7b7fd91aeb35aaeb51b6a1d6e0bb");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "UserInfoDbEntity");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `UserInfoDbEntity`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public DaoContract daoContract() {
    if (_daoContract != null) {
      return _daoContract;
    } else {
      synchronized(this) {
        if(_daoContract == null) {
          _daoContract = new DaoContract_Impl(this);
        }
        return _daoContract;
      }
    }
  }
}
