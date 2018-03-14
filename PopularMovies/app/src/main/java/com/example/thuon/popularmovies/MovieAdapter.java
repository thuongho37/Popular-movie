
package com.example.thuon.popularmovies;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class MovieAdapter extends ArrayAdapter<String> {
    private ImageView mImageView;

    public MovieAdapter(Activity context, List<String> movieArray) {

        super(context, 0, movieArray);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        String androidFlavor = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_detail, parent, false);
        }

        mImageView= (ImageView) convertView.findViewById(R.id.movie_image);
        Picasso.with(getContext()).load("http://image.tmdb.org/t/p/w185/"+androidFlavor).into(mImageView);


        return convertView;
    }
}

