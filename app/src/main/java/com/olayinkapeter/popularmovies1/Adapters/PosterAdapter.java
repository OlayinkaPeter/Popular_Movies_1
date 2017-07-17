package com.olayinkapeter.popularmovies1.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.olayinkapeter.popularmovies1.MainActivity;
import com.olayinkapeter.popularmovies1.R;
import com.squareup.picasso.Picasso;

/**
 * Created by olayinkapeter on 19/03/16.
 */

public class PosterAdapter extends BaseAdapter {


    private Context mContext;


    public PosterAdapter(Context c) {
        mContext = c;
    }


    public int getCount() {
        return MainActivity.images.size();
    }


    public Object getItem(int position) {
        return null;
    }


    public long getItemId(int position) {
        return 0;
    }


    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView poster;
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            poster = (ImageView) inflater.inflate(R.layout.movie_poster, parent, false);
        } else {
            poster = (ImageView) convertView;
        }

        Picasso.with(mContext).load(MainActivity.images.get(position)).into(poster);

        return poster;
    }

}

