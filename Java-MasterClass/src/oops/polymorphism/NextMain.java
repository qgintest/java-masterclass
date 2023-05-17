package oops.polymorphism;

public class NextMain {

    public static void main(String[] args) {
        Movie theMovie = Movie.getMovie("Adventure", "Star Wars");
        theMovie.watchMovie();

        //Compile complains below because it is asking if every type of movie be an adventure, and its not
        //a.k.a comedy isn't an adventure, a way around it is to use casting
        //Adventure anotherMovie = Movie.getMovie("Adventure", "Star Wars");

        //below has casting however it expects an adventure instance but if you pass in 'C' comedy for type, a runtime exception
        //will result. ClassCastException. Expected Adventure, got Comedy
        //Adventure anotherMovie = (Adventure) Movie.getMovie("c", "Star Wars");


        //below will have a runtime exception about class cast exception
        Adventure jaws = (Adventure) Movie.getMovie("c", "Jaws");
        jaws.watchMovie();

        Object comedy = Movie.getMovie("C", "Airplane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchingComedy();


        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchingComedy();

        Object unknownObject = Movie.getMovie("C", "Airplane");
        if(unknownObject.getClass().getSimpleName()=="Comedy"){
            Comedy c = (Comedy) unknownObject;
            c.watchingComedy();
        }else if(unknownObject instanceof Adventure){
            ((Adventure) unknownObject).watchingAdventure();
        }else if(unknownObject instanceof ScienceFiction scfy){
            scfy.watchingScienceFiction();
        }

    }
}
