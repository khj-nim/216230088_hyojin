package com.example.hyojinkim.june14_c;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Toast;
import android.os.Handler;
import android.widget.RadioGroup;




public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Handler myHandler = new Handler();
        Runnable myRunnable = new Runnable() {
            @Override
            public void run() {

                String nGoFloor = "";
                for (int i = 0; i < lstGeneral.size(); i++) {
                    nGoFloor = nGoFloor + lstGeneral.get(i)+"\n";
                }

                Toast.makeText(MainActivity.this, nGoFloor, Toast.LENGTH_SHORT).show();
                myHandler.postDelayed(this,3000);
            }
        };

        myHandler.postDelayed(myRunnable,3000);


            RadioButton r1 = (RadioButton) findViewById(R.id.radioButton1);
            RadioButton r2 = (RadioButton) findViewById(R.id.radioButton2);
            r1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()

            {
                @Override
                public void OnCheckedChangeListener (CompoundButton buttonview,boolean isChecked){
                Toast.makeText(getApplicationContext(),
                        "A class",
                        Toast.LENGTH_SHORT).show();
                }
            });
            r2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()

            {
                @Override
                public void OnCheckedChangeListener (CompoundButton buttonview,boolean isChecked){
                Toast.makeText(getApplicationContext(),
                        "C class",
                        Toast.LENGTH_SHORT).show();
                }
            });

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        Button mBtn1 = (Button) findViewById(R.id.button111);

        mBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                startActivity(intent);


            }
        });
    }



    public void onClick_toast(view v) {
        Toast toast_01 = Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT);
        toast_01.show();
    } //알림메세지



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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