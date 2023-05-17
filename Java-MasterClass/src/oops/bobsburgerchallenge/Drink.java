package oops.bobsburgerchallenge;

public class Drink {

    private String type;

    private String size;

    private double price;


    public Drink(){
        type = "soda";
        size = "medium";
        price = 2.99;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Drink(String type, String size) {
        this.type = type;
        this.size = size;

        switch(size){
            case "small":
                price = 1.99;
                break;

            case "medium":
                price = 2.99;
            break;

            case "large":
                price = 3.99;
                break;
        }
    }

    public double getPrice() {
        return price;
    }
}
