package oops.polymorphism;

import java.util.Locale;

public class Movie {

    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public void watchMovie(){
        String instanceType = this.getClass().getSimpleName();
        System.out.println(name + " is a " + instanceType + " film");
    }

    //example of a factory method in software design programming
    public static Movie getMovie(String type, String title){
        return switch(type.toUpperCase().charAt(0)){
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }
}

class Comedy extends Movie{
    public Comedy(String name) {
        super(name);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.println("Watching....Comedy movie");
    }

    public void watchingComedy(){
        System.out.println("Watching comedy");
    }
}

class Adventure extends Movie{
    public Adventure(String name) {
        super(name);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.println("Watching.... Adventure movie");
    }

    public void watchingAdventure(){
        System.out.println("Watching an adventure");
    }

}

class ScienceFiction extends Movie{
    public ScienceFiction(String name) {
        super(name);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.println("Watching.... Science fiction movie");
    }

    public void watchingScienceFiction(){
        System.out.println("Watching Science Fiction");
    }
}
