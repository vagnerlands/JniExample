package com.example.vagner.jniexample;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    //local member - to be used
    GL2JNIView mView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /* Create a TextView and set its content.
         * the text is retrieved by calling a native
         * function.
         */
        TextView  tv = new TextView(this);
        //tv.setText(stringFromJNI());
        //Log.d("JNI", tv.getText().toString());
        //setContentView(tv);

        mView = new GL2JNIView(getApplication());
        setContentView(mView);
        //setContentView(R.layout.activity_main);
    }

    @Override protected void onPause() {
        super.onPause();
        mView.onPause();
    }

    @Override protected void onResume() {
        super.onResume();
        mView.onResume();
    }

    /* A native method that is implemented by the
     * 'hello-jni' native library, which is packaged
     * with this application.
     */
    //public native String  stringFromJNI();

    /* This is another native method declaration that is *not*
     * implemented by 'hello-jni'. This is simply to show that
     * you can declare as many native methods in your Java code
     * as you want, their implementation is searched in the
     * currently loaded native libraries only the first time
     * you call them.
     *
     * Trying to call this function will result in a
     * java.lang.UnsatisfiedLinkError exception !
     */
    //public native String  unimplementedStringFromJNI();

    /* this is used to load the 'hello-jni' library on application
 * startup. The library has already been unpacked into
 * /data/data/com.example.hellojni/lib/libhello-jni.so at
 * installation time by the package manager.
 */
//    static {
//        System.loadLibrary("hello-jni");
//    }
}
