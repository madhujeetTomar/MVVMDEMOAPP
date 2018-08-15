package com.ril.deliveryapp.data;

import com.ril.deliveryapp.data.local.db.DBHelper;
import com.ril.deliveryapp.data.local.pref.PreferencesHelper;
import com.ril.deliveryapp.data.model.LoginResponse;
import com.ril.deliveryapp.data.remote.ApiHelper;

public interface DataManager extends DBHelper, PreferencesHelper, ApiHelper {
    void updateUserInfo(LoginResponse loginResponse);

    enum LoggedInMode {

        LOGGED_IN_MODE_LOGGED_OUT(0),
        LOGGED_IN_MODE_GOOGLE(1),
        LOGGED_IN_MODE_FB(2),
        LOGGED_IN_MODE_SERVER(3);

        private final int mType;

        LoggedInMode(int type) {
            mType = type;
        }

        public int getType() {
            return mType;
        }
    }
}
