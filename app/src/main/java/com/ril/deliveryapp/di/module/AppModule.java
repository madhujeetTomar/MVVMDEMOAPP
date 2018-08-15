package com.ril.deliveryapp.di.module;


import com.ril.deliveryapp.data.remote.ApiHelper;
import com.ril.deliveryapp.data.remote.AppApiHelper;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    @Singleton
    ApiHelper provideApiHelper(AppApiHelper appApiHelper) {
        return appApiHelper;
    }

}
