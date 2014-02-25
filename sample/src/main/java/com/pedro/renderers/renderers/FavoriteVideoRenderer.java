package com.pedro.renderers.renderers;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.pedro.renderers.R;
import com.pedro.renderers.Video;
import com.squareup.picasso.Picasso;


/**
 * Favorite video renderer created to implement the presentation logic for videos.
 *
 * @author Pedro Vicente Gómez Sánchez.
 */
public class FavoriteVideoRenderer extends VideoRenderer {

    /*
     * Constructor
     */

    public FavoriteVideoRenderer(Context context) {
        super(context);
    }

    /*
     * Implemented methods
     */


    @Override
    protected void renderLabel() {
        label.setText("FAVORITE");
    }

    @Override
    protected void renderMarker(Video video) {
        Picasso.with(context).load(R.drawable.fav_active).into(marker);
    }

}