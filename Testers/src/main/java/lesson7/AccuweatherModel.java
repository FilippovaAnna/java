package lesson7;

import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


import java.io.IOException;


public class AccuweatherModel implements WeatherModel {
    private static final String PROTOСOL = "https";
    private static final String BASE_HOST = "dataservice.accuweather.com";
    private static final String FORECASTS = "forecasts";
    private static final String VERSION = "v1";
    private static final String DAILY = "daily";
    private static final String ONE_DAY = "1day";
    private static final String FIVE_DAYS = "5day";
    private static final String API_KEY = "RJ2QuJWi64GjUto1nOqmMb2tuy5TUwjJ";
    private static final String API_KEY_QUERY_PARAM = "apikey";
    private static final String LOCATIONS = "locations";
    private static final String CITIES = "cities";
    private static final String AUTOCOMPLETE = "autocomplete";

    private static final OkHttpClient okHttpClient = new OkHttpClient();
    private static final ObjectMapper objectMapper = new ObjectMapper();



    @Override
    public void getWeather(String city, Period period) throws IOException {
        HttpUrl httpUrl = null;
        switch (period) {
            case NOW:
                String selectedCity = null;
                httpUrl = new HttpUrl.Builder()
                        .scheme(PROTOСOL)
                        .host(BASE_HOST)
                        .addPathSegment(FORECASTS)
                        .addPathSegment(VERSION)
                        .addPathSegment(DAILY)
                        .addPathSegment(ONE_DAY)
                        .addPathSegment(detectCityKey(city))
                        .addQueryParameter(API_KEY_QUERY_PARAM, API_KEY)
                        .build();
                break;

            case FIVE_DAYS:
                httpUrl = new HttpUrl.Builder()
                        .scheme(PROTOСOL)
                        .host(BASE_HOST)
                        .addPathSegment(FORECASTS)
                        .addPathSegment(VERSION)
                        .addPathSegment(DAILY)
                        .addPathSegment(FIVE_DAYS)
                        .addPathSegment(detectCityKey(city))
                        .addQueryParameter(API_KEY_QUERY_PARAM, API_KEY)
                        .build();
                break;

        }
        Request request = new Request.Builder()
                .url(httpUrl)
                .build();

        Response weatherResponse = okHttpClient.newCall(request).execute();
        System.out.println(weatherResponse);
    }


    private static String detectCityKey(String selectCity) throws IOException {
        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme(PROTOСOL)
                .host(BASE_HOST)
                .addPathSegment(LOCATIONS)
                .addPathSegment(VERSION)
                .addPathSegment(CITIES)
                .addPathSegment(AUTOCOMPLETE)
                .addQueryParameter(API_KEY_QUERY_PARAM, API_KEY)
                .addQueryParameter("q", selectCity)
                .build();

        Request request = new Request.Builder()
                .url(httpUrl)
                .get()
                .addHeader("accept", "application/json")
                .build();

        Response cityCodeResponse = okHttpClient.newCall(request).execute();
        String cityCodeString = cityCodeResponse.body().string();

       String cityCode = objectMapper.readTree(cityCodeString).get(0).at("/Key").asText();
        return cityCode;


    }
    public static void main(String[]args) throws IOException{
        System.out.println(detectCityKey("Moscow"));
    }
}