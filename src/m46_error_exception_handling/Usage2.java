package m46_error_exception_handling;

import java.util.ArrayList;

public class Usage2 {

    public static void main(String[] args) {

//        ArrayList<Person> personArrayList = new ArrayList<>();   //   OutOfMemoryError
//
//        while (true){
//            personArrayList.add(new Person());
//        }

        //A();  //    StackOverflowError

    }


    static void A(){
        while (true){
            A();
        }
    }

}
