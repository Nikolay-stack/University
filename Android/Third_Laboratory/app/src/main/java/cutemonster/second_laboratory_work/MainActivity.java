package cutemonster.second_laboratory_work;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements ListFragment.OnItemSelectedListener {

    private final static String TAG = "FRAG";
    public static boolean fragAdded = false;

    private AddedFragment adder;
    android.app.FragmentManager fm;
    FragmentTransaction ft;


    public static int planetIndex = 0;


    public static String[] planetImage = {
            "hst_mars_opp_9709a.jpg",
            "jupiter_gany.jpg",
            "saturn.jpg"
    };


    public static String[] planetLabel = {"Mars", "Jupiter", "Saturn"};


    public static String[] amplifyRemark = {
            "Mars is called the red planet. It has a thin atmosphere and polar ice caps.",
            "Jupiter is the largest planet, and has very strong magnetic fields.",
            "Saturn has the lowest density of any planet, less than that of water."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "in onCreate, fragAdded =" + fragAdded);

    }

    public void onPause() {
        super.onPause();



        if (fragAdded && adder != null) {

            fm = getFragmentManager();
            ft = fm.beginTransaction();
            ft.remove(adder);
            ft.commit();
            fragAdded = false;
            Log.i(TAG, "Removing fragment in MainActivity.onPause(). fragAdded=" + fragAdded);
        }
    }

    public void onResume() {
        super.onResume();
        Log.i(TAG, "in onResume, fragAdded =" + fragAdded);
    }


    @Override
    public void onItemSelected(int buttonNumber) {

        Log.i("FRAG", "onItemSelected in MainActivity");



        DetailFragment fragment =
                (DetailFragment) getFragmentManager().findFragmentById(R.id.detailFragment);

        if (fragment == null || !fragment.isInLayout()) {
            Log.i(TAG, "No instance of Detail_Fragment in this view, so launch new screen");
        } else {
            Log.i(TAG, "Instance of Detail_Fragment found in this view, so update the view");
        }


        switch (buttonNumber) {


            case R.id.button01:
                planetIndex = 0;
                break;


            case R.id.button02:
                planetIndex = 1;
                break;


            case R.id.button03:
                planetIndex = 2;
                break;



            case R.id.button04:

                if (fragment == null) Log.i(TAG, "fragment is null");

                if (fragment != null && fragment.isInLayout()) {

                    Log.i(TAG, "fragAdded before transaction=" + fragAdded);


                    if (fragAdded) {
                        fm = getFragmentManager();
                        ft = fm.beginTransaction();
                        ft.remove(adder);

                        ft.commit();
                        fragAdded = false;



                    } else {
                        adder = new AddedFragment();
                        fm = getFragmentManager();
                        ft = fm.beginTransaction();
                        ft.add(R.id.newFragment, adder);


                        ft.addToBackStack(null);

                        ft.commit();


                        fragAdded = true;
                    }
                    Log.i(TAG, "fragAdded after transaction=" + fragAdded);
                }
                break;
        }



        if (fragment != null && fragment.isInLayout()) {

            fragment.setText(planetLabel[planetIndex]);
            fragment.setImage(planetImage[planetIndex]);
            if (adder != null && adder.isAdded()) adder.setText(amplifyRemark[planetIndex]);


        } else {

            Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
            startActivity(intent);

        }
    }
}