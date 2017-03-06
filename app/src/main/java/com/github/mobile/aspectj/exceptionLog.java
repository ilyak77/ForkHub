package com.github.mobile.aspectj;

import android.util.Log;

/**
 * Created by apple on 3/6/17.
 */

public class exceptionLog {

    private exceptionLog(){

    }

    public  static void log(String tag, String message){
        Log.d(tag, message);
    }
}
