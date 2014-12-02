package com.example.dhruv.livenyc1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.NumberPicker;
import android.widget.Toast;


public class Settings extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        NumberPicker np = (NumberPicker) findViewById(R.id.numberPicker);
        int interval=2000;

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            interval = extras.getInt("interval");
        }
        np.setMaxValue(9);
        np.setMinValue(1);
        np.setValue(interval/1000);
        //setContentView(np);
    }

    public void setInterval(View view)
    {


        String address = getIntent().getExtras().getString("loc");
        NumberPicker np = (NumberPicker) findViewById(R.id.numberPicker);
        int interval = np.getValue();
        Intent intent = new Intent(Settings.this, Feed.class);
        intent.putExtra("interval",interval*1000);
        intent.putExtra("loc",address);
        startActivity(intent);
    }


    }
