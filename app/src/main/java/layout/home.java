package layout;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.zetterstrom.com.forecast.models.DataPoint;

import com.google.gson.Gson;

import net.weatheraf.weatherandroidforecast.R;

import org.json.JSONObject;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;



/**
 * A simple {@link Fragment} subclass.
 */
public class home extends Fragment implements Updatable{

    private TextView currentTemp, currentCondition, precipitation;
    private TextView[][] hourlyViews = new TextView[12][]; // 2d array of text views for the hourly forecast.
    private ImageView[] hourlyIcons = new ImageView[12];
    private ImageView conditionImage;

    public home() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        SharedPreferences sharedPreferences = getActivity().getSharedPreferences("prefs", Context.MODE_PRIVATE);

        // setting up fields
        currentTemp= (TextView) view.findViewById(R.id.currentTemp);
        currentCondition = (TextView) view.findViewById(R.id.currentCondition);
        precipitation = (TextView) view.findViewById(R.id.precipitation);
        conditionImage = (ImageView) view.findViewById(R.id.currentImageView);

        // setting up hourly forecast stuff
        hourlyViews[0] = new TextView[]{(TextView)view.findViewById(R.id.time0), (TextView)view.findViewById(R.id.summary0), (TextView)view.findViewById(R.id.precipitation0)};
        hourlyViews[1] = new TextView[]{(TextView)view.findViewById(R.id.time1), (TextView)view.findViewById(R.id.summary1), (TextView)view.findViewById(R.id.precipitation1)};
        hourlyViews[2] = new TextView[]{(TextView)view.findViewById(R.id.time2), (TextView)view.findViewById(R.id.summary2), (TextView)view.findViewById(R.id.precipitation2)};
        hourlyViews[3] = new TextView[]{(TextView)view.findViewById(R.id.time3), (TextView)view.findViewById(R.id.summary3), (TextView)view.findViewById(R.id.precipitation3)};
        hourlyViews[4] = new TextView[]{(TextView)view.findViewById(R.id.time4), (TextView)view.findViewById(R.id.summary4), (TextView)view.findViewById(R.id.precipitation4)};
        hourlyViews[5] = new TextView[]{(TextView)view.findViewById(R.id.time5), (TextView)view.findViewById(R.id.summary5), (TextView)view.findViewById(R.id.precipitation5)};
        hourlyViews[6] = new TextView[]{(TextView)view.findViewById(R.id.time6), (TextView)view.findViewById(R.id.summary6), (TextView)view.findViewById(R.id.precipitation6)};
        hourlyViews[7] = new TextView[]{(TextView)view.findViewById(R.id.time7), (TextView)view.findViewById(R.id.summary7), (TextView)view.findViewById(R.id.precipitation7)};
        hourlyViews[8] = new TextView[]{(TextView)view.findViewById(R.id.time8), (TextView)view.findViewById(R.id.summary8), (TextView)view.findViewById(R.id.precipitation8)};
        hourlyViews[9] = new TextView[]{(TextView)view.findViewById(R.id.time9), (TextView)view.findViewById(R.id.summary9), (TextView)view.findViewById(R.id.precipitation9)};
        hourlyViews[10] = new TextView[]{(TextView)view.findViewById(R.id.time10), (TextView)view.findViewById(R.id.summary10), (TextView)view.findViewById(R.id.precipitation10)};
        hourlyViews[11] = new TextView[]{(TextView)view.findViewById(R.id.time11), (TextView)view.findViewById(R.id.summary11), (TextView)view.findViewById(R.id.precipitation11)};

        hourlyIcons[0] = (ImageView)view.findViewById(R.id.image0);
        hourlyIcons[1] = (ImageView)view.findViewById(R.id.image1);
        hourlyIcons[2] = (ImageView)view.findViewById(R.id.image2);
        hourlyIcons[3] = (ImageView)view.findViewById(R.id.image3);
        hourlyIcons[4] = (ImageView)view.findViewById(R.id.image4);
        hourlyIcons[5] = (ImageView)view.findViewById(R.id.image5);
        hourlyIcons[6] = (ImageView)view.findViewById(R.id.image6);
        hourlyIcons[7] = (ImageView)view.findViewById(R.id.image7);
        hourlyIcons[8] = (ImageView)view.findViewById(R.id.image8);
        hourlyIcons[9] = (ImageView)view.findViewById(R.id.image9);
        hourlyIcons[10] = (ImageView)view.findViewById(R.id.image10);
        hourlyIcons[11] = (ImageView)view.findViewById(R.id.image11);

        //Getting darkSky data
        Gson gson = new Gson();
        String json = sharedPreferences.getString("weatherData", "");

        updateWeather();

        return view;

    }

    public void updateWeather(){/*
        // applying weather info
        currentTemp.setText(String.valueOf(weatherData.getCurrently().getTemperature() + "\u00b0"));
        currentCondition.setText(weatherData.getCurrently().getSummary());

        // precipitation value
        String rain = weatherData.getCurrently().getPrecipType();
        if (rain == null) rain = "0%";
        rain += " rain";
        precipitation.setText(rain);

        //updating hourly weather
        List hourlyData = weatherData.getHourly().getData();
        for (int i = 0; i < 12; i ++){
            TextView[] currentRow = hourlyViews[i]; // get the matching text view
            DataPoint currentData = (DataPoint)hourlyData.get(i);

            // set the text values
            java.util.Date time = new java.util.Date(currentData.getTime() * 1000);
            StringBuilder sb = new StringBuilder(time.toString());
            sb.delete(0, sb.length() - 17);
            sb.delete(sb.length() - 12, sb.length());
            DateFormat dateFormat = new SimpleDateFormat("hh:mm");
            Date newTime = null;
            try {
                newTime = dateFormat.parse(sb.toString());
                System.out.println(dateFormat);
                System.out.println(new SimpleDateFormat("hh:mm a").format(newTime));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            currentRow[0].setText(new SimpleDateFormat("hh:mm a").format(newTime));
            currentRow[1].setText(currentData.getSummary()); //// TODO: 4/18/17 format this and add additional data

        }

*/
    }

}
