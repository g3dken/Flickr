package com.davidg.syncinteractive.test.data.model.api;

public class SearchModel {
    private Photos photos;

    private String stat;

    public Photos getPhotos() {
        return photos;
    }

    public void setPhotos(Photos photos) {
        this.photos = photos;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    @Override
    public String toString() {
        return "ClassPojo [photos = " + photos + ", stat = " + stat + "]";
    }
}