package com.example.nodet.examenandroidbruno;

/**
 * Created by nodet on 18/12/17.
 */

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ApiService {


    @POST("Jugador/{email}")
    Call<Usuario> getLogin(@Path("email") String user, @Body Login loginBody);
    @POST("update/{email}")
    Call<Answer> updateJugador(@Path("email") String user, @Body Login loginBody);//enviem email, nova contrassenya
    @POST("newJugador/{email}")
    Call<Usuario> getNouJugador(@Path("email")String user, @Body Login loginBody);




}
