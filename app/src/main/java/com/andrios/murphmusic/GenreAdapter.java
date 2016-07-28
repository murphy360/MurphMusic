package com.andrios.murphmusic;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Corey on 7/22/2016.
 *
 * Creates a list of ImageViews + TextView listitems that fill GridView in MainActivity.
 * Lists Genres in Alphabetical Order
 *
 */
public class GenreAdapter extends BaseAdapter {
    private Context context;
    private final String[][] genreValues;

    //Constructor
    public GenreAdapter(Context context, String[][] genreValues) {
        this.context = context;
        this.genreValues = genreValues;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View gridView;

        if (convertView == null) {
            String imageName = genreValues[position][1];
            String genreName = genreValues[position][0];
            gridView = new View(context);
            // get layout from list_item_genre.xml
            gridView = inflater.inflate(R.layout.list_item_genre, null);
            // set value into textview
            TextView textView = (TextView) gridView
                    .findViewById(R.id.grid_item_label);
            textView.setText(genreName);
            // set image based on selected text
            ImageView imageView = (ImageView) gridView
                    .findViewById(R.id.grid_item_image);
            //retrieve image in res/drawable and set image in ImageView
            //TODO Figure out efficient image allocation... this area will run into issues allocating images

            int resID = context.getResources().getIdentifier(imageName, "drawable", "com.andrios.murphmusic");

            imageView.setImageResource(resID );
            gridView.setTag(genreName);
        } else {
            gridView = (View) convertView;
        }
        return gridView;
    }

    @Override
    public int getCount() {
        return genreValues.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

}

