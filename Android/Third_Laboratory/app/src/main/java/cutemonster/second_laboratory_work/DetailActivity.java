package cutemonster.second_laboratory_work;

import android.content.res.Configuration;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private final static String TAG = "FRAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.i(TAG, "DetailActivity created");


        if (getResources().getConfiguration().orientation ==
                Configuration.ORIENTATION_LANDSCAPE) {
            finish();
            return;
        }
        setContentView(R.layout.activity_detail);
        TextView view = (TextView) findViewById(R.id.planetLabel);
        view.setText(MainActivity.planetLabel[MainActivity.planetIndex]);

    }
}