package OOP.class_objects;

public class France {
    public static void main(String[] args) {


        Shahrihon bobur = new Shahrihon();

        bobur.printDokonlar();
        bobur.printStadionlar();
        bobur.printHospital();

        int result = bobur.hospitalSize = 100;
        System.out.println(result);


        Shahrihon umidjon = new Shahrihon();

        umidjon.printDokonlar();
        umidjon.printStadionlar();
        umidjon.printHospital();
        System.out.println(umidjon.hospitalSize);

    }
}
