package edu.cs4730.smsdemo;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

/*
 * nothing to see here.  See the MainFragment code.
 */

public class MainActivity extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction()
                .add(R.id.container, new MainFragment()).commit();
    }


}
