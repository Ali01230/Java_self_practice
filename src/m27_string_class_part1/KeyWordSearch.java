package m27_string_class_part1;

@SuppressWarnings("SpellCheckingInspection")
public class KeyWordSearch {
    public static void main(String[] args) {
        String text = "Code without tests is broken by design";
        String text2 = "";
        String keyword = "DESIGN";

        boolean r = containsKeyword(text, keyword);



        // contains()

        System.out.println("Result: contains() -> " + text.contains(keyword));



        // startsWith()

        System.out.println("Result: startsWith() -> " + text.startsWith("Code"));
        System.out.println("Result: startsWith() with offset -> " + text.startsWith("out", text.indexOf("out")));

        // endsWith()

        System.out.println("Result: endsWith() 1 -> " + text.endsWith("Code"));
        System.out.println("Result: endsWith() 2 -> " + text.endsWith("design"));


        // isEmpty()

        System.out.println("Result: isEmpty() 1 -> "  + text.isEmpty());


        // isBlank()  bo'sh joy uchun tekshiradi
        System.out.println("Result: isBlank() 1 -> "  + text2.isBlank());


    }

    static boolean containsKeyword(String text, String keyword){

        text = text.toLowerCase();
        keyword = keyword.toLowerCase();

        return text.contains(keyword);
    }
}
