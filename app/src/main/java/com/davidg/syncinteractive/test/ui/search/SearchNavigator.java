package com.davidg.syncinteractive.test.ui.search;

import com.davidg.syncinteractive.test.data.model.api.SearchModel;

interface SearchNavigator {
    void onResponseSuccess(SearchModel searchModel);
    void onResponseFailed();
}
