package test.kola.mypaystackexample;

import android.app.Application;

import co.paystack.android.PaystackSdk;

/**
 * Created by ribads on 8/15/18.
 */
public class App extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        PaystackSdk.initialize(getApplicationContext());
    }
}
