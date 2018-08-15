package com.ril.deliveryapp.di.builder;


import com.ril.deliveryapp.ui.login.LoginActivity;
import com.ril.deliveryapp.ui.login.LoginActivityModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilder {


    @ContributesAndroidInjector(modules = LoginActivityModule.class)
    abstract LoginActivity bindLoginActivity();
}
