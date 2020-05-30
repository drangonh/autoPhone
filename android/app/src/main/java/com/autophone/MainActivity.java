package com.autophone;

import com.facebook.react.ReactActivity;
import android.support.v4.app.ActivityCompat;
import android.os.Bundle;

public class MainActivity extends ReactActivity {

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        return "autoPhone";
    }

    /*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);

         setContentView(R.layout.activity_main);

         ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.SEND_SMS} , -1);
         //probably some other stuff hereSendSMSPackage.getInstance().onActivityResult(requestCode, resultCode, data);
    }
    */
}
