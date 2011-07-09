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
import com.punchcard.*;

// imports
import android.app.Activity;
import android.os.Bundle;
import android.view.View;

/**
 * Activity that lets the user punch in and out
 *
 * @author Brandon Valosek
 */
public class PunchActivity extends Activity {

   private PunchcardApp _app = null;

   /**
   * Called when the activity is first created.
   */
   @Override public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);

      // set app context
      _app = (PunchcardApp)getApplicationContext ();

      // inflate the view
      setContentView(R.layout.punch_layout);
   }

   /**
   * Called by all buttons on the view when pressed
   *
   * Set in XML
   *
   * @author Brandon Valosek
   */
   public void onButtonClick (View v) {
      switch (v.getId()) {
         // punch in
         case R.id.ui_punch_in:
            _app.punchIn ();
         break;

         // punch out
         case R.id.ui_punch_out:
            _app.punchOut ();
         break;
      }
   }
}
