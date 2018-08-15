package com.ril.deliveryapp.di.component;


import android.app.Application;

import com.ril.deliveryapp.DeliveryApplication;
import com.ril.deliveryapp.di.builder.ActivityBuilder;
import com.ril.deliveryapp.di.module.AppModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Singleton
@Component(modules = {AndroidInjectionModule.class, AppModule.class, ActivityBuilder.class})
public interface AppComponent {
    void inject(DeliveryApplication app);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
}
