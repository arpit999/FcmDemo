package com.production.hometech.fcmdemo;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.io.IOException;

import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences ;

//    paste asset files into the C:\wamp\www\fcmtest(make a folder fcmtest) and create database(fcm_db) and import file fcm_info.sql for store token

//    Make sure server key for the firebase with long value
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void SendTokenToServer(View view) {

        sharedPreferences = getApplicationContext().getSharedPreferences(getString(R.string.FCM_PREF), Context.MODE_PRIVATE);

        Log.i("Notificatioin", "SendTokenToServer: token = "+sharedPreferences.getString(getString(R.string.FCM_TOKEN), ""));
        new GetData().execute();

    }


    public class GetData extends AsyncTask<Void, Void, Void> {

        ProgressDialog progressDialog;
        String responseString;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            progressDialog = new ProgressDialog(MainActivity.this);
            progressDialog.setMessage("Please wait....");
            progressDialog.setCancelable(true);
            progressDialog.show();
        }

        @Override
        protected Void doInBackground(Void... voids) {

            sharedPreferences.getString(getString(R.string.FCM_TOKEN), "");

            OkHttpClient client = new OkHttpClient();
            RequestBody formBody = new FormBody.Builder()
                    .add("fcm_token", sharedPreferences.getString(getString(R.string.FCM_TOKEN), ""))
                    .build();
            Request request = new Request.Builder()
//                    .url("http://192.168.1.104/fcmtest/fcm_insert.php")
                    .url("http://192.168.0.102/fcmtest/fcm_insert.php")
                    .post(formBody)
                    .build();

            try {

                Response response = client.newCall(request).execute();
                if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);
                {

                    responseString = response.body().string();
                    System.out.println(responseString);
                    response.body().close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            progressDialog.dismiss();

        }
    }

}
