package m38_oop_part1_constructor;

public class StudentClient {

    public static void main(String[] args) {

        Student student1 = new Student("Ozodbek", 20,3455);


        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.id);


    }
}
