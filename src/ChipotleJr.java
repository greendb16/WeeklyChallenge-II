import java.util.ArrayList;
import java.util.Random;

public class ChipotleJr {
    private static Random rand = new Random();
    private static String[] rice = {"White", "Brown", "No"};
    private static String[] meat = {"Chicken", "Steak", "Carnidas", "Chorizo", "Sofritas", "Veggies"};
    private static String[] beans = {"Black", "Pinto", "No"};
    private static String[] veggies = {"Lettuce", "Fajita Veggies", "No Veggies", "Lettuce and Fajita Veggies"};
    private static String[] salsa = {"Hot", "Medium", "Mild", "No", "Hot, Medium, and Mild"};

    private static int ingredients = 0;
    private static double cost =0;
    private static double total =0;
    private static String riceChoice;
    private static String meatChoice;
    private static String beansChoice;
    private static String veggiesChoice;
    private static String salsaChoice;
    private static String cheeseChoice;
    private static String guacChoice;
    private static String quesoChoice;
    private static String sourCreamChoice;

    public static void main(String[] args) {


        ArrayList<String> output = new ArrayList<>();

        for (int j = 1; j <= 25; j++) {
            ingredients=0;
            meat();
            rice();
            salsa();
            veggies();
            beans();
            cheese();
            guac();
            queso();
            sourCream();
            cost();


            output.add("Burrito " + j + ":\t" + riceChoice + " rice, " + meatChoice + ", " + salsaChoice + " salsa, " + beansChoice + " beans, " + veggiesChoice + cheeseChoice + guacChoice + quesoChoice + sourCreamChoice + "\tPrice: $" +cost );
        }
        for (String burrito : output) {
            System.out.println(burrito);
        }
        System.out.println("Total cost:\t$"+total);
    }


    private static void rice() {
        int riceRand = rand.nextInt(3);
        riceChoice = rice[riceRand];
        if(riceRand!= 2){
            ingredients++;
        }
    }


    private static void beans() {
        int beansRand = rand.nextInt(3);
        beansChoice = beans[beansRand];
        if (beansRand !=2)
        {ingredients++;
        }
    }


    private static void salsa() {
        int salsaRand = rand.nextInt(5);
        salsaChoice = salsa[salsaRand];

        if(salsaRand==4){
            ingredients+=3;
        }
        else if (salsaRand != 3)
            ingredients++;
        }



    private static void veggies() {
        int veggiesRand = rand.nextInt(4);
        veggiesChoice = veggies[veggiesRand];
        if(veggiesRand==3){
            ingredients+=2;
        }
        else if(veggiesRand !=2) {
            ingredients++;
        }
    }


    private static void meat() {
        int meatRand = rand.nextInt(6);
        meatChoice = meat[meatRand];
        ingredients++;
    }

    private static void cheese() {
        int randCheese = rand.nextInt(2);
        if (randCheese == 0) {
            cheeseChoice = ", Cheese";
            ingredients++;
        } else {
            cheeseChoice = "";
        }
    }

    public static void guac() {
        int randQuac = rand.nextInt(2);
        if (randQuac == 0) {
            guacChoice = ", Quac";
            ingredients++;
        } else {
            guacChoice = "";
        }
    }

    public static void queso() {
        int randQueso = rand.nextInt(2);
        if (randQueso == 0) {
            quesoChoice = ", Queso";
            ingredients++;
        } else {
            quesoChoice = "";
        }
    }

    public static void sourCream() {
        int randSourCream = rand.nextInt(2);
        if (randSourCream == 0) {
            sourCreamChoice = ", Sour Cream";
            ingredients++;
        } else {
            sourCreamChoice = "";

        }
    }
    private static void cost(){
        cost = ((ingredients*.50) + 3.00);
        total+=cost;
    }
}

