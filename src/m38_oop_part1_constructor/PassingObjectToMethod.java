package m38_oop_part1_constructor;

public class PassingObjectToMethod {

    static int counter = 0;
    public static void main(String[] args) {

        QATester testerInGermany = new QATester();
        increaseExperiance(testerInGermany);
        System.out.println(testerInGermany.overAllExperiance + " yil tajriba Germaniya");

        QATester testerInBAA = new QATester();
        increaseExperiance(testerInBAA);
        System.out.println(testerInBAA.overAllExperiance + " yil tajriba BAA");


    }


    public static void increaseExperiance(QATester tester){
        if (tester.overAllExperiance < counter){
            tester.overAllExperiance++;
            counter++;
        } else if (tester.overAllExperiance == counter) {
            counter++;
        }
    }
}
