package com.example.administrator.fmxima.Utils;

import com.example.administrator.fmxima.entities.HomeEntity;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.Date;

import retrofit2.Call;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;
import retrofit2.http.GET;

/**
 * Created by Administrator on 16-1-22.
 */
public class NetWorkUtil {

    public interface Service{
        @GET("/mobile/discovery/v1/recommends?channel=and-c57&device=android&includeActivity=true&includeSpecial=true&scale=2&version=4.3.44.2")
        Call<HomeEntity> getHome();
    }


    private static Service service;

    static {
        Gson gson = new GsonBuilder().registerTypeAdapter(Date.class, new TypeAdapter<Date>() {
            @Override
            public void write(JsonWriter out, Date value) throws IOException {
                out.value(value.getTime());
            }

            @Override
            public Date read(JsonReader in) throws IOException {
                long l = in.nextLong();
                return new Date(l);
            }
        }).create();
        service = new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create(gson))
                .baseUrl("http://mobile.ximalaya.com").build().create(Service.class);
    }

    public static Service getService() {
        return service;
    }
}

















