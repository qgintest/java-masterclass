package oops.bobsburgerchallenge;

public class Side {

    private String type;

    private double price;

    public Side(){
        type = "fries";
        price = 4.99;
    }

    public Side(String type) {
        this.type = type;

        switch (type){
            case "fries":
                price = 4.99;
                break;
            default:
                price = 5.99;
        }
    }

    public double getPrice() {
        return price;
    }
}
