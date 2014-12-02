package com.example.dhruv.livenyc1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.view.View;
import android.widget.Button;





public class Select_Options extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select__options);
        
        
        Button cameraa = (Button)findViewById(R.id.cbutton);
        Button settin = (Button)findViewById(R.id.settings_b);
        
        /*cameraa.setOnClickListener((v) -> {

            Intent ca = new Intent(Select_Options.this, CameraList.class);
            startActivity(ca);

        });*/

        cameraa.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ca = new Intent(Select_Options.this, CameraList.class);
                startActivity(ca);

            }
        });
        
        settin.setOnClickListener(new OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          Intent se = new Intent(Select_Options.this, Settings.class);
                                          startActivity(se);

                                      }
                                  });
            //Intent se = new Intent(Select_Options.this, Settings.class);
            //startActivity(se);
        //});
        
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_select__options, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
