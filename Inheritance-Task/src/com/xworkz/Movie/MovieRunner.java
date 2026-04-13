package com.xworkz.Movie;

public class MovieRunner {
    public static void main(String[] args) {
        MOVIETYPE movietype = new MOVIETYPE("Love Story","Krushnan Pranaya Sakhi");
        String[] movieNames ={"Toxic","Appu","Sallar","James"};
        System.out.println("Information of Parent Class");
        Movie movie = new Movie(movietype,movieNames,200,TakiesName.MARUTHI_THEATRE,true);
        movie.movieInfo();
        movie.moviePopularity();
        System.out.println(movie.toString());

        System.out.println("Information of Child Class");
        ToxicMovie toxicMovie = new ToxicMovie(movietype,movieNames, movie.cost,movie.takiesName, movie.movieRelese, "Mass Movie",200.0);
        toxicMovie.movieInfo();
        toxicMovie.moviePopularity();
        System.out.println(toxicMovie.toString());

    }
}
