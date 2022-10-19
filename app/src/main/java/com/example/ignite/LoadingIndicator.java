package com.example.ignite;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.LayoutInflater;

public class LoadingIndicator {

    private Activity activity;
    private AlertDialog alertDialog;

    public LoadingIndicator(Activity activity) {
        this.activity = activity;
    }

    void startLoading(){
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        LayoutInflater inflater = activity.getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.loading_bar,null));
        builder.setCancelable(true);

        alertDialog= builder.create();
        alertDialog.show();
    }

    void dismissDialog(){
        alertDialog.dismiss();
    }
}
