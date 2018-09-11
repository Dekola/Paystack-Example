package test.kola.mypaystackexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.Calendar;

import co.paystack.android.Paystack;
import co.paystack.android.PaystackSdk;
import co.paystack.android.Transaction;
import co.paystack.android.api.request.ChargeRequestBody;
import co.paystack.android.model.Card;
import co.paystack.android.model.Charge;
import co.paystack.android.model.Token;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PaystackSdk.initialize(getApplicationContext());

        String cardNumber = "4084084084084081";
//        String cardNumber = "5060666666666666666";
        int expiryMonth = 11; //any month in the future
        int expiryYear = 18; // any year in the future. '2018' would work also!
        String cvv = "408";  // cvv of the test card
//        String cvv = "123";
        int pin = 1234;

        Card card = new Card(cardNumber, expiryMonth, expiryYear, cvv);
        if (card.isValid()) {
            Toast.makeText(this, "valid", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "not valid", Toast.LENGTH_SHORT).show();
        }

//        PaystackSdk.createToken(card, new Paystack.TokenCallback() {
//            @Override
//            public void onCreate(Token token) {
//            }
//
//            @Override
//            public void onError(Exception error) {
//
//            }
//        });

        Charge charge = new Charge();
        charge.setAmount(200000);
        charge.setEmail("test@pays.co");
        charge.setReference("ChargedFromAndroid_" + Calendar.getInstance().getTimeInMillis());
//        charge.setCurrency("Dollars");
        charge.setTransactionCharge(2000);
        charge.setCard(card);

//        ChargedFromAndroid_1536150957523
//        sk_test_bab6f4dbc6120c164e24a3a2b161bbb88f91d723
//        ChargedFromAndroid_1536150957523
//        AUTH_sh5jazofom
        PaystackSdk.chargeCard(this, charge, new Paystack.TransactionCallback() {
            @Override
            public void onSuccess(Transaction transaction) {
//                Toast.makeText(getApplicationContext(), " : onSuccess", Toast.LENGTH_SHORT).show();
                Log.i("mytoken",  transaction.getReference());
            }

            @Override
            public void beforeValidate(Transaction transaction) {
                Toast.makeText(getApplicationContext(), "beforeValidate", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onError(Throwable error, Transaction transaction) {
                Toast.makeText(getApplicationContext(), "onError", Toast.LENGTH_SHORT).show();
            }

        });
    }
}
