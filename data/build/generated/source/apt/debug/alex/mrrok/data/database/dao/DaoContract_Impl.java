package alex.mrrok.data.database.dao;

import alex.mrrok.data.entity.UserInfo;
import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityDeletionOrUpdateAdapter;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.RxRoom;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.database.Cursor;
import io.reactivex.Flowable;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.concurrent.Callable;

@SuppressWarnings("unchecked")
public class DaoContract_Impl implements DaoContract {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfUserInfo;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfUserInfo;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public DaoContract_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUserInfo = new EntityInsertionAdapter<UserInfo>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `UserInfoDbEntity`(`phone`,`photo`,`email`,`userInfo`,`name`,`nickname`,`idObject`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserInfo value) {
        if (value.getPhone() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getPhone());
        }
        if (value.getPhoto() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getPhoto());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getEmail());
        }
        if (value.getUserInfo() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getUserInfo());
        }
        if (value.getName() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getName());
        }
        if (value.getNickname() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getNickname());
        }
        if (value.getIdObject() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getIdObject());
        }
      }
    };
    this.__updateAdapterOfUserInfo = new EntityDeletionOrUpdateAdapter<UserInfo>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `UserInfoDbEntity` SET `phone` = ?,`photo` = ?,`email` = ?,`userInfo` = ?,`name` = ?,`nickname` = ?,`idObject` = ? WHERE `email` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserInfo value) {
        if (value.getPhone() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getPhone());
        }
        if (value.getPhoto() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getPhoto());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getEmail());
        }
        if (value.getUserInfo() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getUserInfo());
        }
        if (value.getName() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getName());
        }
        if (value.getNickname() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getNickname());
        }
        if (value.getIdObject() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getIdObject());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getEmail());
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM UserInfoDbEntity";
        return _query;
      }
    };
  }

  @Override
  public void insert(UserInfo value) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfUserInfo.insert(value);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(UserInfo value) {
    __db.beginTransaction();
    try {
      __updateAdapterOfUserInfo.handle(value);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAll() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public Flowable<UserInfo> getUser(String emailPerson) {
    final String _sql = "SELECT * FROM UserInfoDbEntity WHERE email LIKE ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (emailPerson == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, emailPerson);
    }
    return RxRoom.createFlowable(__db, new String[]{"UserInfoDbEntity"}, new Callable<UserInfo>() {
      @Override
      public UserInfo call() throws Exception {
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfPhone = _cursor.getColumnIndexOrThrow("phone");
          final int _cursorIndexOfPhoto = _cursor.getColumnIndexOrThrow("photo");
          final int _cursorIndexOfEmail = _cursor.getColumnIndexOrThrow("email");
          final int _cursorIndexOfUserInfo = _cursor.getColumnIndexOrThrow("userInfo");
          final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
          final int _cursorIndexOfNickname = _cursor.getColumnIndexOrThrow("nickname");
          final int _cursorIndexOfIdObject = _cursor.getColumnIndexOrThrow("idObject");
          final UserInfo _result;
          if(_cursor.moveToFirst()) {
            _result = new UserInfo();
            final String _tmpPhone;
            _tmpPhone = _cursor.getString(_cursorIndexOfPhone);
            _result.setPhone(_tmpPhone);
            final String _tmpPhoto;
            _tmpPhoto = _cursor.getString(_cursorIndexOfPhoto);
            _result.setPhoto(_tmpPhoto);
            final String _tmpEmail;
            _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
            _result.setEmail(_tmpEmail);
            final String _tmpUserInfo;
            _tmpUserInfo = _cursor.getString(_cursorIndexOfUserInfo);
            _result.setUserInfo(_tmpUserInfo);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            _result.setName(_tmpName);
            final String _tmpNickname;
            _tmpNickname = _cursor.getString(_cursorIndexOfNickname);
            _result.setNickname(_tmpNickname);
            final String _tmpIdObject;
            _tmpIdObject = _cursor.getString(_cursorIndexOfIdObject);
            _result.setIdObject(_tmpIdObject);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
