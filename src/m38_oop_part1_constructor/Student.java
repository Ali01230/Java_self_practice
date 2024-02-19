package m38_oop_part1_constructor;

public class Student {

    public String name;
    public int age;
    public int id;



   public Student(String name, int age){
       this.name = name;
       this.age = age;
   }

    public Student(String name, int age, int id){
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public void heyyow(){
        System.out.println("YOOO");
    }



    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
