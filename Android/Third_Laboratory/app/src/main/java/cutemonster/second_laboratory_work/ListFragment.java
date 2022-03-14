package cutemonster.second_laboratory_work;

import android.app.Fragment;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ListFragment extends Fragment {

    private OnItemSelectedListener listener;
    private static final String TAG = "FRAG";


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_overview, container, false);

        Button button1 = (Button) view.findViewById(R.id.button01);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onItemSelected(R.id.button01);
            }
        });

        Button button2 = (Button) view.findViewById(R.id.button02);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onItemSelected(R.id.button02);
            }
        });

        Button button3 = (Button) view.findViewById(R.id.button03);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onItemSelected(R.id.button03);
            }
        });

        Button button4 = (Button) view.findViewById(R.id.button04);



        if (getResources().getConfiguration().orientation != Configuration.ORIENTATION_LANDSCAPE)
            button4.setVisibility(View.INVISIBLE);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onItemSelected(R.id.button04);
            }
        });

        return view;
    }



    @Override
    public void onPause() {
        super.onPause();
    }




    @Override
    public void onAttach(Context context) {

        super.onAttach(context);

        Log.i(TAG, "List_Fragment attached to " + getActivity().getComponentName().getClassName());


        try {
            listener = (OnItemSelectedListener) getActivity();
        } catch (ClassCastException e) {
            throw new ClassCastException(getActivity().getComponentName().getClassName()
                    + " must implement ListFragment.OnItemSelectedListener");
        }

    }


    public interface OnItemSelectedListener {
        public void onItemSelected(int buttonNumber);
    }
}
