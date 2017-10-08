package com.davidg.syncinteractive.test.ui.search;

import com.davidg.syncinteractive.test.utils.rx.SchedulerProvider;

import dagger.Module;
import dagger.Provides;


@Module
public class SearchActivityModule {

    @Provides
    SearchViewModel provideSearchViewModel(SchedulerProvider schedulerProvider) {
        return new SearchViewModel(schedulerProvider);
    }

}
