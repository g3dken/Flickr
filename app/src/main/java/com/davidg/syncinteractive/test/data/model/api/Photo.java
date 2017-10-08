package com.davidg.syncinteractive.test.data.model.api;

import android.os.Parcel;
import android.os.Parcelable;

public class Photo implements Parcelable {

    private String isfamily;
    private String width_l;
    private String ispublic;
    private String height_l;
    private String height_o;
    private String width_o;
    private String url_z;
    private String isfriend;
    private String id;
    private String farm;
    private String height_z;
    private String title;
    private String width_z;
    private String url_o;
    private String owner;
    private String secret;
    private String server;
    private String url_l;
    private String ownername;
    private Description description;


    protected Photo(Parcel in) {
        isfamily = in.readString();
        width_l = in.readString();
        ispublic = in.readString();
        height_l = in.readString();
        height_o = in.readString();
        width_o = in.readString();
        url_z = in.readString();
        isfriend = in.readString();
        id = in.readString();
        farm = in.readString();
        height_z = in.readString();
        title = in.readString();
        width_z = in.readString();
        url_o = in.readString();
        owner = in.readString();
        secret = in.readString();
        server = in.readString();
        url_l = in.readString();
        ownername = in.readString();
        description = in.readParcelable(Description.class.getClassLoader());
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(isfamily);
        dest.writeString(width_l);
        dest.writeString(ispublic);
        dest.writeString(height_l);
        dest.writeString(height_o);
        dest.writeString(width_o);
        dest.writeString(url_z);
        dest.writeString(isfriend);
        dest.writeString(id);
        dest.writeString(farm);
        dest.writeString(height_z);
        dest.writeString(title);
        dest.writeString(width_z);
        dest.writeString(url_o);
        dest.writeString(owner);
        dest.writeString(secret);
        dest.writeString(server);
        dest.writeString(url_l);
        dest.writeString(ownername);
        dest.writeParcelable(description, flags);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Photo> CREATOR = new Creator<Photo>() {
        @Override
        public Photo createFromParcel(Parcel in) {
            return new Photo(in);
        }

        @Override
        public Photo[] newArray(int size) {
            return new Photo[size];
        }
    };

    public String getOwnername() {
        return ownername;
    }

    public void setOwnername(String ownername) {
        this.ownername = ownername;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public String getIsfamily() {
        return isfamily;
    }

    public void setIsfamily(String isfamily) {
        this.isfamily = isfamily;
    }

    public String getWidth_l() {
        return width_l;
    }

    public void setWidth_l(String width_l) {
        this.width_l = width_l;
    }

    public String getIspublic() {
        return ispublic;
    }

    public void setIspublic(String ispublic) {
        this.ispublic = ispublic;
    }

    public String getHeight_l() {
        return height_l;
    }

    public void setHeight_l(String height_l) {
        this.height_l = height_l;
    }

    public String getHeight_o() {
        return height_o;
    }

    public void setHeight_o(String height_o) {
        this.height_o = height_o;
    }

    public String getWidth_o() {
        return width_o;
    }

    public void setWidth_o(String width_o) {
        this.width_o = width_o;
    }

    public String getUrl_z() {
        return url_z;
    }

    public void setUrl_z(String url_z) {
        this.url_z = url_z;
    }

    public String getIsfriend() {
        return isfriend;
    }

    public void setIsfriend(String isfriend) {
        this.isfriend = isfriend;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFarm() {
        return farm;
    }

    public void setFarm(String farm) {
        this.farm = farm;
    }

    public String getHeight_z() {
        return height_z;
    }

    public void setHeight_z(String height_z) {
        this.height_z = height_z;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWidth_z() {
        return width_z;
    }

    public void setWidth_z(String width_z) {
        this.width_z = width_z;
    }

    public String getUrl_o() {
        return url_o;
    }

    public void setUrl_o(String url_o) {
        this.url_o = url_o;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getUrl_l() {
        return url_l;
    }

    public void setUrl_l(String url_l) {
        this.url_l = url_l;
    }

    @Override
    public String toString() {
        return "ClassPojo [isfamily = " + isfamily + ", width_l = " + width_l + ", ispublic = " + ispublic + ", height_l = " + height_l + ", height_o = " + height_o + ", width_o = " + width_o + ", url_z = " + url_z + ", isfriend = " + isfriend + ", id = " + id + ", farm = " + farm + ", height_z = " + height_z + ", title = " + title + ", width_z = " + width_z + ", url_o = " + url_o + ", owner = " + owner + ", secret = " + secret + ", server = " + server + ", url_l = " + url_l + "]";
    }
}