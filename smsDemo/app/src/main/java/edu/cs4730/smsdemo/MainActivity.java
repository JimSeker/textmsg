package edu.cs4730.smsdemo;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

/*
 * nothing to see here.  See the MainFragment code.
 */

public class MainActivity extends AppCompatActivity {


    public static final int REQUEST_PERM_ACCESS = 100;
    String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction()
                .add(R.id.container, new MainFragment()).commit();
    }


    /**
     * Callback received when a permissions request has been completed.
     */
    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Log.v(TAG, "onRequest result called.");
        boolean file = false, cam = false;

        switch (requestCode) {
            case REQUEST_PERM_ACCESS:
                //received result for GPS access
                Log.v(TAG, "Received response for permissions request.");
                for (int i = 0; i < grantResults.length; i++) {
                    if ((permissions[i].compareTo(Manifest.permission.SEND_SMS) == 0) &&
                        (grantResults[i] == PackageManager.PERMISSION_GRANTED))
                        Toast.makeText(getBaseContext(), "permission granted, press send again!!", Toast.LENGTH_SHORT).show();
                    else if ((permissions[i].compareTo(Manifest.permission.READ_PHONE_STATE) == 0) &&
                        (grantResults[i] == PackageManager.PERMISSION_GRANTED))
                        Toast.makeText(getBaseContext(), "permission granted, press send again!", Toast.LENGTH_SHORT).show();
                }

                return;
            default:
                super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }


}
