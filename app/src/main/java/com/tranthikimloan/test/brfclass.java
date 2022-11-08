package com.tranthikimloan.test;

public class brfclass {
    public  String name;
            String ratingValue;
            String ratingCount;
            String address;
             int photo;

    public brfclass(String name, String ratingValue, String ratingCount, String address, int photo) {
        this.name = name;
        this.ratingValue = ratingValue;
        this.ratingCount = ratingCount;
        this.address = address;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRatingValue() {
        return ratingValue;
    }

    public void setRatingValue(String ratingValue) {
        this.ratingValue = ratingValue;
    }

    public String getRatingCount() {
        return ratingCount;
    }

    public void setRatingCount(String ratingCount) {
        this.ratingCount = ratingCount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
