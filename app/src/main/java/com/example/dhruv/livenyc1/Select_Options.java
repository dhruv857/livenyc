package com.example.dhruv.livenyc1;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Select_Options extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select__options);
        
        
        Button cameraa = (Button)findViewById(R.id.cbutton);
        //Button settin = (Button)findViewById(R.id.setting);
        Button error = (Button)findViewById(R.id.rerror);
        
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
        
        /*settin.setOnClickListener(new OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          Intent se = new Intent(Select_Options.this, Settings.class);
                                          startActivity(se);

                                      }
                                  });*/




            //Intent se = new Intent(Select_Options.this, Settings.class);
            //startActivity(se);
        //});
        
        
        
    }

    public void sendFeedback(View v) {
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"xf90360n@pace.edu", "dhruv.scorpio@gmail.com","weihuang023@yahoo.com"});
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Feedback of LiveCam");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "What do you think?");
        try {
            startActivity(Intent.createChooser(emailIntent, "Send mail..."));
            finish();
            Log.i("Finished sending email...", "");
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(Select_Options.this,
                    "There is no email client installed.", Toast.LENGTH_SHORT).show();
            
        }

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
