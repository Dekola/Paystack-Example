package test.kola.mypaystackexample;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface ApiInterface {
    @GET("transaction/verify/ChargedFromAndroid_1536150957523/")
    Call<PayStackResponse> getResponse(@Header("Authorization") String s);
}