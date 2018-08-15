package com.ril.deliveryapp.data.remote;

import com.ril.deliveryapp.data.model.LoginRequest;
import com.ril.deliveryapp.data.model.LoginResponse;
import com.ril.deliveryapp.utils.CommonUtils;
import com.rx2androidnetworking.Rx2AndroidNetworking;

import io.reactivex.Single;

public class AppApiHelper implements ApiHelper {
    @Override
    public Single<LoginResponse> doServerLoginApiCall(LoginRequest loginRequest) {
        return Rx2AndroidNetworking.post(ApiEndPoints.ENDPOINT_SERVER_LOGIN)
                .addHeaders("Authorization", CommonUtils.setAuthorization())
                .addHeaders("Content-Type: application/json")
                .addBodyParameter(loginRequest)
                .build()
                .getObjectSingle(LoginResponse.class);
    }
}
