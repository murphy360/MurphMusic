package com.andrios.murphmusic;

/**
 * Created by Corey on 7/22/2016.
 */
public class AndriosData {
    private String[][] genres = new String[5][2];


    public AndriosData(){
        genres[0][0] = "Country";
        genres[0][1] = "android_logo";


        genres[1][0] = "Rap";
        genres[1][1] = "android_logo";


        genres[2][0] = "Dance";
        genres[2][1] = "android_logo";


        genres[3][0] = "Irish";
        genres[3][1] = "android_logo";

        genres[4][0] = "R&B";
        genres[4][1] = "android_logo";
    }

    public String[][] getGenres(){
        return genres;
    }

}
