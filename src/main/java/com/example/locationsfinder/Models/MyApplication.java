package com.example.locationsfinder.Models;

import android.app.Application;

public class MyApplication extends Application {
    private String data;
    public String getData() {return data;}
    public void setData(String data) {this.data = data;}
}