package test.kola.mypaystackexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class GetResponseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_respose);

        String url = "https://api.paystack.co/";

        Retrofit retrofit = new retrofit2.Retrofit.Builder().baseUrl(url).addConverterFactory(GsonConverterFactory.create()).build();
        ApiInterface apiInterface = retrofit.create(ApiInterface.class);
        Call<PayStackResponse> newsCall = apiInterface.getResponse("Bearer sk_test_bab6f4dbc6120c164e24a3a2b161bbb88f91d723");
            newsCall.enqueue(new Callback<PayStackResponse>() {
            @Override
            public void onResponse(Call<PayStackResponse> call, Response<PayStackResponse> response) {
                if (response.isSuccessful()) {
                    PayStackResponse response1 = response.body();
                    if (response1 != null) {
                        if (response1.getData().getAuthorization().getAuthorizationCode() != null) {
                            Log.i("paycode", response1.getData().getAuthorization().getAuthorizationCode());
//                            AUTH_sh5jazofom
                            Toast.makeText(GetResponseActivity.this, "yy- "+response1.getData().getAuthorization().getAuthorizationCode(), Toast.LENGTH_SHORT).show();
                        }
                        else Toast.makeText(GetResponseActivity.this, response1.getData().getPaidAt()+ " error 2", Toast.LENGTH_SHORT).show();
                    }
                    else Toast.makeText(GetResponseActivity.this, "null news", Toast.LENGTH_SHORT).show();
                }
                else Toast.makeText(GetResponseActivity.this, "error", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<PayStackResponse> call, Throwable t) {

            }
        });
    }
}

