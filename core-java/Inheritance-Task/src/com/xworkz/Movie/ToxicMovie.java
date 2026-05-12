package com.xworkz.Movie;

public class ToxicMovie extends Movie {
    String type;
    double ticketPrice;

    public ToxicMovie(MOVIETYPE movietype, String[] movieNames, double cost, TakiesName takiesName, boolean movieRelese, String type, double ticketPrice) {
        super(movietype, movieNames, cost, takiesName, movieRelese);
        this.type = type;
        this.ticketPrice = ticketPrice;
    }
    public void movieInfo(){
        System.out.println("Execute the movie information in Toxic Movie...");
    }
    public void moviePopularity(){
        System.out.println("Execute the Movie Popularity in Movie...");
    }
    public String toString(){
        return "Type:"+type + ",Ticket Price:"+ticketPrice;
    }
}
