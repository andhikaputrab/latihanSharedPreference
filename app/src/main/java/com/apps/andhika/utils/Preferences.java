package com.apps.andhika.utils;

import android.content.Context;
import android.content.SharedPreferences;

import com.apps.andhika.com.apps.andhika.latihansharedpreference.model.UserModel;

public class Preferences {

    private static final String PREF_SESSION = "com.apps.andhika.latihanpreference.session";

    private static final String REGISTER_USERNAME = "REGISTER_USERNAME";
    private static final String REGISTER_PASSWORD = "REGISTER_PASSWORD";
    private static final String REGISTER_PHONE = "REGISTER_PHONE";
    private static final String LOGIN_STATUS = "LOGIN_STATUS";

    private Context context;

    public Preferences(Context context){
        this.context = context;
    }

    public static void setUserPreferences(Context context, UserModel userModel){
        SharedPreferences preferences = context.getSharedPreferences(PREF_SESSION, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();

        editor.putString(REGISTER_USERNAME, userModel.getUsername());
        editor.putString(REGISTER_PASSWORD, userModel.getPassword());
        editor.putString(REGISTER_PHONE, userModel.getPhone());
        editor.apply();
    }
    public static String getRegisteredUsername(Context context){
        SharedPreferences preferences = context.getSharedPreferences(PREF_SESSION, Context.MODE_PRIVATE);
        return preferences.getString(REGISTER_USERNAME, UtilStatic.DEFAULT_STRING);
    }
    public static String getRegisteredPassword(Context context){
        SharedPreferences preferences = context.getSharedPreferences(PREF_SESSION, Context.MODE_PRIVATE);
        return preferences.getString(REGISTER_PASSWORD, UtilStatic.DEFAULT_STRING);
    }
    public static String getRegisteredPhone(Context context){
        SharedPreferences preferences = context.getSharedPreferences(PREF_SESSION, Context.MODE_PRIVATE);
        return preferences.getString(REGISTER_PHONE, UtilStatic.DEFAULT_STRING);
    }

    public static void setLoggedInStatus(Context context, boolean statusLogin){
        SharedPreferences preferences = context.getSharedPreferences(PREF_SESSION, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();

        editor.putBoolean(LOGIN_STATUS, statusLogin);
        editor.apply();
    }
    public static boolean getLoggedInStatus(Context context){
        SharedPreferences preferences = context.getSharedPreferences(PREF_SESSION, Context.MODE_PRIVATE);
        return preferences.getBoolean(LOGIN_STATUS, UtilStatic.DEFAULT_BOOLEAN);
    }

    public static void setLogout(Context context){
        SharedPreferences preferences = context.getSharedPreferences(PREF_SESSION, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.remove(LOGIN_STATUS);
        editor.apply();
    }
}
