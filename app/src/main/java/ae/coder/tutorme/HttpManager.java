package ae.coder.tutorme;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;



public class HttpManager {


    public static String getData(String uri)
    {
        BufferedReader reader = null;
        HttpURLConnection connection;

        try {
            URL url = new URL(uri);
            connection = (HttpURLConnection) url.openConnection();
            reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            StringBuilder builder = new StringBuilder();
            String line = "";

            while ((line = reader.readLine()) != null) {
                builder.append(line + "\n");
            }

            return builder.toString();
             } catch (MalformedURLException mfue) {
            mfue.printStackTrace();
             } catch (IOException ioe) {
            ioe.printStackTrace();
             }
        finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {


                }
            }
        }
        return null;
    }



}
