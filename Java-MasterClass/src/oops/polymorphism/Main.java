package oops.polymorphism;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Movie movie = new Comedy("bruce");
        //movie.watchMovie();

        //using polymprphism to watch a variety of movies
        Movie theMovie = Movie.getMovie("Adventure", "Star Wars");
        theMovie.watchMovie();

        Scanner s = new Scanner(System.in);
        while(true){
            System.out.print("Enter type (A for Adventure, C for comedy, S for science fiction, or Q for Quit): ");
            String type = s.nextLine();
            if("Qq".contains(type)){
                break;
            }
            System.out.print("End Movie Title: ");
            String title = s.nextLine();
            Movie aeMovie = Movie.getMovie(type, title);
            aeMovie.watchMovie();
        }


    }
}
