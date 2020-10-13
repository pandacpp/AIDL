package com.panda.servicedemo;

import android.os.Parcel;
import android.os.Parcelable;

//原文链接：https://www.jianshu.com/p/d1fac6ccee98
//原文链接：https://www.bilibili.com/video/BV1vE411j7ZL?p=2

public class User implements Parcelable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    protected User(Parcel in) {
        name = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };
}
