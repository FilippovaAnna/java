package lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;



public class main {
    public static void main(String[] args) throws IOException {

        URL url = new URL("http://dataservice.accuweather.com/forecasts/v1/daily/5day/294021?apikey=RJ2QuJWi64GjUto1nOqmMb2tuy5TUwjJ");
        InputStream inputStream = url.openStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        String line;

        while ((line = bufferedReader.readLine())!= null){
            System.out.println(line);
        }

        bufferedReader.close();


    }
}
