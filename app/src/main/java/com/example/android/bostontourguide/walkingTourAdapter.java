package com.example.android.bostontourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by pankhuriagarwal on 11/7/16.
 */

public class walkingTourAdapter extends ArrayAdapter<properties> {


    private static final String LOG_TAG = com.example.android.bostontourguide.walkingTourAdapter.class.getSimpleName();
    ListView listView;
    /**
     * Created by anshulmittal on 10/13/16.
     */


    private Activity mContext;
    private ArrayList<properties> wordAudio;

    public walkingTourAdapter(Activity context, ArrayList<properties> Word) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, Word);
        mContext = context;

        wordAudio = Word;

    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.listviewdesign, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        properties currentProperties = getItem(position);


        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView headerTextView = (TextView) listItemView.findViewById(R.id.mainHeader);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        headerTextView.setText(currentProperties.getMainHeader());


        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        int image = currentProperties.getImage();
        if (image == 0) {
            imageView.setVisibility(View.GONE);
        }

        imageView.setImageResource(image);


        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView bottomLeftTextView = (TextView) listItemView.findViewById(R.id.bottomLeft);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        bottomLeftTextView.setText(currentProperties.getBottomLeft());


        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView bottomRightTextView = (TextView) listItemView.findViewById(R.id.bottomRight);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        bottomRightTextView.setText(currentProperties.getBottomRight());


        return listItemView;
    }

}




