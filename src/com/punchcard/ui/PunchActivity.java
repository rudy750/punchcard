/* ----------------------------------------------------------------------------
 * Punchcard for Android
 *
 * PunchActivity.java
 *
 * Contributers:
 * Brandon Valosek <bvalosek@gmail.com>
 * --------------------------------------------------------------------------*/

package com.punchcard.ui;

// our stuff
import com.punchcard.R;

// imports
import android.app.Activity;
import android.os.Bundle;

/**
 * Activity that lets the user punch in and out
 *
 * @author Brandon Valosek
 */
public class PunchActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.punch_layout);
    }
}
