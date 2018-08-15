package com.ril.deliveryapp.data;

import android.content.Context;

import com.google.gson.Gson;
import com.ril.deliveryapp.data.local.db.DBHelper;
import com.ril.deliveryapp.data.local.pref.PreferencesHelper;
import com.ril.deliveryapp.data.model.LoginRequest;
import com.ril.deliveryapp.data.model.LoginResponse;
import com.ril.deliveryapp.data.remote.ApiHelper;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Single;

@Singleton
public class AppDataManager implements DataManager
{
    private final ApiHelper mApiHelper;

    private final Context mContext;

    private final DBHelper mDbHelper;

    private final Gson mGson;

    private final PreferencesHelper mPreferencesHelper;

    @Inject
    public AppDataManager(Context context, DBHelper dbHelper, PreferencesHelper preferencesHelper, ApiHelper apiHelper, Gson gson) {
        mContext = context;
        mDbHelper = dbHelper;
        mPreferencesHelper = preferencesHelper;
        mApiHelper = apiHelper;
        mGson = gson;
    }

    @Override
    public Single<LoginResponse> doServerLoginApiCall(LoginRequest request) {
        return mApiHelper.doServerLoginApiCall(request);
    }

    @Override
    public void updateUserInfo(LoginResponse loginResponse) {

    }
}