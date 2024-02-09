package m29_arrays_part1;

import java.util.Arrays;

public class ArrayElements {

    public static void main(String[] args) {


        String[] names = {"Ozodbek   Karimov ", "Muhammadali   Makhmudov","Usmonkhuja   Muydinov"};

        findFirstLetterFromArray(names);


    }

    private static void findFirstLetterFromArray(String[] names) {
        String[] newName= new String[names.length];

        for (int i = 0; i < names.length; i++) {

            String eachName = names[i];

            newName[i] = eachName.charAt(0) + "." + eachName.charAt(eachName.indexOf("Muy"));

        }

        System.out.println(Arrays.toString(newName));
    }

}




