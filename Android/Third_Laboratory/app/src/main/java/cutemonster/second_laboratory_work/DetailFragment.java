package cutemonster.second_laboratory_work;

import java.io.IOException;
import java.io.InputStream;

import android.app.Fragment;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailFragment extends Fragment {

    private ImageView imageView;
    private final static String TAG = "FRAG";


    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detail, container, false);

        return view;
    }


    @Override
    public void onPause(){
        super.onPause();
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState){

        super.onActivityCreated(savedInstanceState);
        Log.i(TAG, getActivity().getComponentName().getClassName()+" has started");

        setImage(MainActivity.planetImage[MainActivity.planetIndex]);
        setText(MainActivity.planetLabel[MainActivity.planetIndex]);

    }


    @Override
    public void onAttach(Context context) {

        super.onAttach(context);
        Log.i(TAG, "Detail_Fragment attached to " + getActivity().getComponentName().getClassName());

    }


    public void setText(String text) {
        TextView view = (TextView) getView().findViewById(R.id.planetLabel);
        view.setText(text);
    }


    public void setImage(String assetFile){

        try {

            imageView = (ImageView)getView().findViewById(R.id.image);

            InputStream is = getActivity().getAssets().open(assetFile);

            Drawable drawable = Drawable.createFromStream(is, null);

            imageView.setImageDrawable(drawable);
        }
        catch(IOException ex) {
            return;
        }
    }
}