package com.example.imageapplication;

public class NativeProcessing {

    static{
        System.loadLibrary("imageApplication");
    }

    public native String StringFromJNI();
}
