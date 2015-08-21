package com.thecodebuilders.layoutapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    protected Button[] buttons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpListeners();
    }

    private void setUpListeners() {
        //store the buttons in an array
        buttons = new Button[]{
                (Button) findViewById(R.id.buttonStreamer),
                (Button) findViewById(R.id.buttonScores),
                (Button) findViewById(R.id.buttonLibrary),
                (Button) findViewById(R.id.buttonBuildIt),
                (Button) findViewById(R.id.buttonXYZ),
                (Button) findViewById(R.id.buttonCapstone),
        };

        //iterate through the buttons and set the action that occurs when clicked
        for (int i = 0; i < buttons.length; i++) {
            final int finalI = i;
            buttons[i].setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "This launches " + buttons[finalI].getText().toString().toUpperCase(), Toast.LENGTH_LONG).show();
                }
            });
        }
    }


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
