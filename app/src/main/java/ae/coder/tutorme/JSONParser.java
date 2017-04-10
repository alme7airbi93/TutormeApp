package ae.coder.tutorme;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


public class JSONParser
{

    public static Country parseFeed(String content)
    {

        try {
            List<Country> countries = new ArrayList<>();
            JSONObject jsonObject = new JSONObject(content);
            JSONArray weather = jsonObject.getJSONArray("weather");
            Country country = new Country();
            country.setDiscription(weather.getJSONObject(0).getString("description"));
            country.setName(jsonObject.getString("name"));
            JSONObject main = jsonObject.getJSONObject("main");
            country.setTempreture(main.getDouble("temp"));




            countries.add(country);
            return country;
            } catch (JSONException e1)
        {
            e1.printStackTrace();
        }


        return  null;
        }
    }

