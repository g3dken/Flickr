package com.davidg.syncinteractive.test.ui.base;

import android.arch.lifecycle.ViewModel;
import android.databinding.ObservableBoolean;
import com.davidg.syncinteractive.test.utils.rx.SchedulerProvider;
import io.reactivex.disposables.CompositeDisposable;


public abstract class BaseViewModel<N> extends ViewModel {

    private N mNavigator;
    private final SchedulerProvider mSchedulerProvider;
    private final ObservableBoolean mIsLoading = new ObservableBoolean(false);

    private CompositeDisposable mCompositeDisposable;

    public BaseViewModel(SchedulerProvider schedulerProvider) {
        this.mSchedulerProvider = schedulerProvider;
    }


    public void setNavigator(N navigator) {
        this.mNavigator = navigator;
    }

    public void onViewCreated() {
        this.mCompositeDisposable = new CompositeDisposable();
    }

    public void onDestroyView() {
        mCompositeDisposable.dispose();
    }


    public N getNavigator() {
        return mNavigator;
    }

    public SchedulerProvider getSchedulerProvider() {
        return mSchedulerProvider;
    }

    public CompositeDisposable getCompositeDisposable() {
        return mCompositeDisposable;
    }

    public ObservableBoolean getIsLoading() {
        return mIsLoading;
    }

    public void setIsLoading(boolean isLoading) {
        mIsLoading.set(isLoading);
    }

}
