package com.ril.deliveryapp.data.remote;

import com.ril.deliveryapp.data.model.LoginRequest;
import com.ril.deliveryapp.data.model.LoginResponse;

import io.reactivex.Single;

public interface ApiHelper {

    Single<LoginResponse> doServerLoginApiCall(LoginRequest loginRequest);


}
