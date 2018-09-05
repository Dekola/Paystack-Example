package test.kola.mypaystackexample;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("/")
    Call<PayStackResponse> getResponse(@Query("Authorization") String s);
}
