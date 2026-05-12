package com.xworkz.Movie;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Movie {
    MOVIETYPE movietype;
    String[] movieNames;
    double cost;
    TakiesName takiesName;
    boolean movieRelese;

    public Movie(MOVIETYPE movietype, String[] movieNames, double cost, TakiesName takiesName, boolean movieRelese) {
        this.movietype = movietype;
        this.movieNames = movieNames;
        this.cost = cost;
        this.takiesName = takiesName;
        this.movieRelese = movieRelese;
    }
    public void movieInfo(){
        System.out.println("Executing the Movie Information...");
    }
    public void moviePopularity(){
        System.out.println("Execute the Movie Popularity in Movie...");
    }
    public String toString(){
        return "Movie Type:"+movietype+",Movie Names:"+ Arrays.toString(movieNames)+",Cost:"+cost +",Takies Name:"+takiesName +",Movie Relese:"+movieRelese;
    }
}
