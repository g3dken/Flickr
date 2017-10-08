package com.davidg.syncinteractive.test.di.builder;

import com.davidg.syncinteractive.test.ui.search.SearchActivity;
import com.davidg.syncinteractive.test.ui.search.SearchActivityModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;


@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = SearchActivityModule.class)
    abstract SearchActivity bindSearchActivity();

}
