package com.mahmoud_ashraf.to_do_list;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * This layout defines the main activity screen and displays a list of tasks (if they exist),
 * and a floating action button that launches another activity.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
