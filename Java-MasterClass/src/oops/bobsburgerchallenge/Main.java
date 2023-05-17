package oops.bobsburgerchallenge;

public class Main {

    public static void main(String[] args) {

//        Item coke = new Item("drink", "coke", 1.50);
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();
//
//        Item avocado = new Item("Topping", "avocado", 1.50);
//        avocado.printItem();

        Burger burger = new Burger("regular", 4.00);
        burger.addToppings("BACON", "CHEESE", "MAYO");
        burger.printItem();

//        MealOrder defaultMeal = new MealOrder();
//        defaultMeal.addToppings(3);
//        defaultMeal.getMealDetails();
//
//        //MealOrder customizedMeal = new MealOrder(burger, drink, side);
    }
}
