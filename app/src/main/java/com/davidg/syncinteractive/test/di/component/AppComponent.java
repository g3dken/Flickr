package com.davidg.syncinteractive.test.di.component;

import android.app.Application;

import com.davidg.syncinteractive.test.App;
import com.davidg.syncinteractive.test.di.builder.ActivityBuilder;
import com.davidg.syncinteractive.test.di.module.AppModule;
import javax.inject.Singleton;
import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;


@Singleton
@Component(modules = {AndroidInjectionModule.class, AppModule.class, ActivityBuilder.class})
public interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(Application application);

        AppComponent build();

    }

    void inject(App app);

}
