package OOP.constructor_encapsulation;

public class Example2 {
    public static void main(String[] args) {

        FootballPlayers ronaldo = new FootballPlayers("Ronaldo", 7);

        ronaldo.setName("Cristiano Ronaldo");
        System.out.println(ronaldo.getName());

        ronaldo.setPlayerNumber(8);
        System.out.println(ronaldo.getPlayerNumber());

    }
}
