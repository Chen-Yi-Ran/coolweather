package com.example.coolweather.util;


import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {

    //sendOkHttpRequest()方法中有一个okHttp3.Callback参数，okHttp在enqueue()已经帮我们开启了子线程
    //会在子线程中去执行Http请求，并将最后的请求结果回调到okhttp3.Callback中
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback)
    {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
