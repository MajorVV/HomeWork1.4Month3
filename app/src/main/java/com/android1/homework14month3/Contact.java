package com.android1.homework14month3;

import android.graphics.drawable.Drawable;

public class Contact {
    private String name;
    private String phone_number;
    private int image;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public Contact(String name, String phone_number, int image) {
        this.name = name;
        this.phone_number = phone_number;
        this.image = image;
    }
}
