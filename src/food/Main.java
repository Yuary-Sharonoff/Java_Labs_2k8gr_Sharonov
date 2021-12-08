package food;

public class Main {
    public static void main(String[] args) throws Exception {
        Food[] breakfast = new Food[20];
        int itemsSoFar = 10;
        int CheeseAm = 5, AppleAm = 3, MilkAm = 2;
        Cheese Ch = new Cheese();


        for (String arg : args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("Cheese")) {
                breakfast[itemsSoFar] = new Cheese();
            } //

            itemsSoFar++;
        }
        System.out.println("amount of products");
        for (int i = 0; i < 20; i++) {
            if (breakfast[i] != null) {
                if (breakfast[i].equals(Ch)) {
                    CheeseAm++;
                }//
            } else break;
        }
        System.out.println( " Amount of cheese is "  + "");
        for (Food item : breakfast) {
            if (item != null) {
                item.consume();
            } else break;
        }
        System.out.println("Have a nice day!");
    }
}

