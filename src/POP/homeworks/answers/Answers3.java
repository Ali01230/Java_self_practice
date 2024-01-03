package POP.homeworks.answers;

public class Answers3 {

    public static void main(String[] args) {

        String[] student = {
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

        for (String viewer : student){
            if (viewer.startsWith("A")){
                System.out.println("A:lar -> " + viewer);
            }else{
                System.out.println("Boshqalar: -> " + viewer);
            }
        }

    }
}
