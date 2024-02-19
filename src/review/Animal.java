package review;

public abstract class Animal {

    private String name;



    private int age;

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new InvalidNameException("name of the animal can not be set to null or empty");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age == age || name.isEmpty()){
            throw new InvalidAgeException("Age can not be set to null or empty");
        }
        this.age = age;
    }
    private final String breed;


    private final String gender;

    private final String color;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public String getGender() {
        return gender;
    }

    public String getColor() {
        return color;


        }
    public Animal(String name, int age, String breed, String gender, String color) {

        if ( !(gender.equalsIgnoreCase("female" ) || (gender.equalsIgnoreCase("male")) )){
           throw new InvalidGenderExcaption("Gender of the animal can only be male or female");

        }
        setName(name);
        setAge(age);
        this.breed = breed;
        this.gender = gender;
        this.color = color;
    }

    public abstract void eat();



    @Override
    public String toString() {
        return getClass().getSimpleName()+ "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                ", gender='" + gender + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

