package alex.mrrok.data.phonedata;

import android.content.Context;
import android.content.SharedPreferences;


public class SaveUserKey implements UserKeyContract {

    private static SharedPreferences sharedPreferences;
    private static SharedPreferences.Editor editor;

    private SaveUserKey() {
    }

    public static void create(Context context) {
        if (sharedPreferences == null) {
            sharedPreferences = context.getSharedPreferences(APP_STORAGE_NAME, Context.MODE_PRIVATE);
        }
    }

    public static void saveUserKey(String email) {
        editor = sharedPreferences.edit();
        editor.putString(LOG, "1");
        editor.putString(ID, email);
        editor.commit();
    }

    public static String checkRegistration() {
        return sharedPreferences.getString(LOG, "");
    }

    public static String getEmail() {
        return sharedPreferences.getString(ID, "");
    }

    public static void deleteUserKey() {
        editor = sharedPreferences.edit();
        editor.clear();
        editor.commit();
    }
}
