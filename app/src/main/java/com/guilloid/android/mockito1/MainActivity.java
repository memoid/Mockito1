package com.guilloid.android.mockito1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static Intent createQuery(Context context, String query, String value) {
        Intent i = new Intent(context, MainActivity.class);
        i.putExtra("QUERY", query);
        i.putExtra("VALUE", value);
        return i;
    }

}
