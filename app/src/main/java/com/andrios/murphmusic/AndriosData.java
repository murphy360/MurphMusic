package com.andrios.murphmusic;

/**
 * Created by Corey on 7/22/2016.
 */
public class AndriosData {
    private String[][] genres = new String[6][2];


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

    public String[][] getGenres(){
        return genres;
    }

}
