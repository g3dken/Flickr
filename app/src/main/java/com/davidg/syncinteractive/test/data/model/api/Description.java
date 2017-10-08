package com.davidg.syncinteractive.test.data.model.api;

import android.os.Parcel;
import android.os.Parcelable;

public class Description implements Parcelable{

    private String _content;

    protected Description(Parcel in) {
        _content = in.readString();
    }

    public static final Creator<Description> CREATOR = new Creator<Description>() {
        @Override
        public Description createFromParcel(Parcel in) {
            return new Description(in);
        }

        @Override
        public Description[] newArray(int size) {
            return new Description[size];
        }
    };

    public String get_content() {
        return _content;
    }

    public void set_content(String _content) {
        this._content = _content;
    }

    @Override
    public String toString() {
        return "ClassPojo [_content = " + _content + "]";
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(_content);
    }
}