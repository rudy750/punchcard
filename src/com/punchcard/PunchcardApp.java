/* ----------------------------------------------------------------------------
 * Punchcard for Android
 *
 * PunchcardApp.java
 *
 * Contributers:
 * Brandon Valosek <bvalosek@gmail.com>
 * --------------------------------------------------------------------------*/

package com.punchcard;

// imports
import android.app.Application;

/**
 * The main application class
 *
 * All state information and general app logic / data should be kept here.
 *
 * @author Brandon Valosek
 */
public class PunchcardApp extends Application {

   /**
    * called when the application loads
    */
   @Override public void onCreate () {

   }

   /** Adds a punch-in event
    *
    * This will eventually probably move out from the App class into a more
    * specific class that manages punching in and out
    *
    * @author Brandon Valosek
    */
   public void punchIn () {
      // TODO: stuff
   }

   /** Adds a punch-out even
    *
    * @author Brandon Valosek
    */
   public void punchOut () {
      // TODO: stuff
   }
}
