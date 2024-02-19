package m46_error_exception_handling;

public class Person {

    private String name;
    private int age;

    public String getName() {
        return name;
    }


    public void setName(String name) {
        try {
            validateName(name);
            this.name = name;
        } catch (InvalidNameException e) {
            // Handle the exception, log it, or perform any necessary actions
            System.err.println("Invalid name: " + e.getMessage());
            System.out.println(e.getFieldName());
        }
    }

    private void validateName(String name) throws InvalidNameException {
        if (name.isEmpty()) {
            // Throw InvalidNameException with a custom message
            throw new InvalidNameException("this", "You have entered nothing!!");
        }
        // No exception thrown if the name is valid
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0){
            this.age = age;
        }else {
            throw new RuntimeException("Age must be above 0 !!");
        }
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
