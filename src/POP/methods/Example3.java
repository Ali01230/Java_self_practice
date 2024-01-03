package POP.methods;

public class Example3 {
    public static void main(String[] args) {

        System.out.println(Example1.calculator(4, 4));
        System.out.println(Example1.myGlobalVariable);

        printArraoyOfGenders();

    }

    static void printArraoyOfGenders() {

        String[] names = {
                "   Muhammadali",
                "  Komil",
                "Asaloy",
                "  Nargizaxon",
                "Asadbek"
        };

        int[] ages = {
                22,
                34,
                32,
                18,
                22
        };

        Example1.separateGender(names,ages);
    }
}
