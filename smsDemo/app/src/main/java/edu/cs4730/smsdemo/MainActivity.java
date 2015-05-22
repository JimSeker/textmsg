package edu.cs4730.smsdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/*
 * nothing to see here.  See the MainFragment code.
 */

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction()
                .add(R.id.container, new MainFragment()).commit();
    }


}
