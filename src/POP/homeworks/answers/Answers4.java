package POP.homeworks.answers;

public class Answers4 {

    public static void main(String[] args) {

        String[] students = {
                "Men",
                "Sen",
                "Fen",
                "Gen",
                "Ren",
                "Wen",
                "Qen",
                "Ven",
                "Ben",
                "Nen",
                "Ten",
                "Len",
                "Aen",
                "Oen",
                "Pen",
                "Sen",
                "Aen",
                "Nen",
                "Ken",
                "Jen"
        };

        for (int viewer = 0; viewer < students.length; viewer++){
            if (students[viewer].startsWith("A")){
                System.out.println(viewer + 1 + " A:lar -> " + students[viewer]);
            }else{
                System.out.println(viewer + 1 + " Boshqalar: -> " + students[viewer]);
            }
        }

    }
}
