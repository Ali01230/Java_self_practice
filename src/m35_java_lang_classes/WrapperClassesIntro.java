package m35_java_lang_classes;

import org.w3c.dom.css.CSSStyleRule;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class WrapperClassesIntro {

    public static void main(String[] args) {

        int a = 5;
        Integer b = a; // autoboxing

        int c = b;  // unboxing


        // Wrapper classes are immutable

        int[] nums = {1,2,3,4};

        Integer[] numss = new Integer[5];


//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Byte.MAX_VALUE);
//
//        System.out.println(Double.parseDouble("1.0") + Double.parseDouble("1.0"));


        char letter = 'A';
        int number = 5;

        System.out.println(Character.isDigit(number));
        System.out.println(Character.isLetter(letter));


        Math.max(5, 7);

        int[] tvs = {1,2,3};
        tvs[1] = 0;

        System.out.println(Arrays.toString(tvs));


        ArrayList<String> lastNames = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Character> numberss = new ArrayList<>();

    }
    }



