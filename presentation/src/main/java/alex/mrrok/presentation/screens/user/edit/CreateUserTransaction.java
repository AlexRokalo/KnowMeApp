package alex.mrrok.presentation.screens.user.edit;

import android.util.Log;

import alex.mrrok.domain.entity.UserGeoPosition;
import alex.mrrok.domain.entity.UserInformation;
import alex.mrrok.domain.entity.UserRegister;

public class CreateUserTransaction {

    private UserGeoPosition userGeoPosition;
    private UserInformation userInformation;
    private UserRegister userRegister;


    public UserGeoPosition geoTransaction(String email) {
        userGeoPosition = new UserGeoPosition();
        userGeoPosition.setEmail(email);

        return userGeoPosition;
    }

    public UserInformation createUserInfo(String name, String nickName, String email) {
        userInformation = new UserInformation();
        userInformation.setName(name);
        userInformation.setNickName(nickName);
        userInformation.setEmail(email);

        return userInformation;

    }


    public UserInformation setInfo(String name, String nickName, String phone,
                                   String photo, String userInfo, String email) {
        userInformation = new UserInformation();
        userInformation.setName(name);
        userInformation.setNickName(nickName);
        userInformation.setPhone(phone);
        userInformation.setUserInfo(userInfo);
        userInformation.setPhoto(photo);
        userInformation.setEmail(email);
        Log.e("userInformation",photo);

        return userInformation;
    }


    public UserRegister createUser(String email, String password) {
        userRegister = new UserRegister();
        userRegister.setEmail(email);
        userRegister.setPassword(password);

        return userRegister;
    }

}