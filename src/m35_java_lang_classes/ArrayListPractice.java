package m35_java_lang_classes;


import java.util.*;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<String> groceriesList = new ArrayList<>();

        System.out.println(groceriesList);

        // add(object): appends the specific element to the end of a List.

        groceriesList.add("Eggs");
        groceriesList.add("Paper Towels");
        groceriesList.add("Apples");
        groceriesList.add("Cooking Oil");

        System.out.println(groceriesList);

        // add(index,object): insert the specific element at a specific position index in the List.
        groceriesList.add(2, "Chicken");
        System.out.println(groceriesList);

        // size(): Returns the number of elements in List.
        System.out.println(groceriesList.size());

        // get(): Returns the element at the given index.
        String firstElement = groceriesList.get(0);
        System.out.println("firstElement = " + firstElement);
        String lastElement = groceriesList.get(groceriesList.size() -1 );
        System.out.println("lastElement=" + lastElement);

        // set(index, object): Replaces the element at the given index with the given element.
        groceriesList.set(2,"Orange");
        System.out.println(groceriesList);

        // Remove(int): Remove/Returns value at the given index.
        groceriesList.remove(1);
        System.out.println(groceriesList);

        // remove(object): Removes the first occurrence of the specified element from this list, if it is present.
        groceriesList.remove("Eggs");
        System.out.println(groceriesList);

        // IndexOf(object): Returns the index the first occurrence of a specific element.
        System.out.println(groceriesList.indexOf("Oranges"));






    }
}
