package general_practice;

import java.util.Arrays;

public class MyString {

    private char[] characters;

    public MyString(){
        this.characters = new char[0];
    }

    public MyString(String s){
        this.characters = s.toCharArray();
    }

    public int length(){
        return characters.length;
    }

    @Override
    public String toString() {
        return new String(characters);
    }
}
