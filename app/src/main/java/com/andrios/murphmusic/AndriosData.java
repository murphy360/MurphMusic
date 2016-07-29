package com.andrios.murphmusic;

import java.util.Arrays;

/**
 * Created by Corey on 7/22/2016.
 * This class is used to create dummy and real data for my application.
 */
public class AndriosData {
    private String[][] genres = new String[6][2];


    /**
     * Default Constructor.  Creates Dummy data.
     * TODO replace dummy load with data pulled from a server.
     */
    public AndriosData(){
        genres[0][0] = "Country";
        genres[0][1] = "button_country";

        genres[1][0] = "Jazz";
        genres[1][1] = "button_jazz";

        genres[2][0] = "Classical";
        genres[2][1] = "button_classical";

        genres[3][0] = "Irish";
        genres[3][1] = "button_irish";

        genres[4][0] = "Pop";
        genres[4][1] = "button_pop";

        genres[5][0] = "Reggae";
        genres[5][1] = "button_reggae";
    }

    /**
     *
     * @return Alphabetically sorted 2D array of Genres
     * TODO Research efficiency of this sorting algorithm.
     */
    public String[][] getGenres(){
        Arrays.sort(genres, new ColumnComparator(1));
        return genres;
    }


}
