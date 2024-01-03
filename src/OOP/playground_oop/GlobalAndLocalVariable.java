package OOP.playground_oop;

public class GlobalAndLocalVariable {
    public static void main(String[] args) {

        String numberOfTables = "207";
        String numberOfSofa = "8976";

        System.out.println(numberOfTables + numberOfSofa);

        int result = Integer.parseInt(numberOfTables) + Integer.parseInt(numberOfSofa);

        System.out.println(result);


        double newNumber1 = Double.parseDouble(numberOfTables);
        double newNumber2 = Double.parseDouble(numberOfSofa);

        System.out.println(newNumber1 + newNumber2);


        System.out.println(numberOfTables.charAt(2));
    }
}
