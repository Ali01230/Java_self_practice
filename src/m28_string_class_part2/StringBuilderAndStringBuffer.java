package m28_string_class_part2;

public class StringBuilderAndStringBuffer {
    public static void main(String[] args) {


        // StringBuilder

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Muhammadali");
        stringBuilder.append(" QA Tester");

        stringBuilder.insert(stringBuilder.indexOf(" Test"), " Automation");

        stringBuilder.replace(stringBuilder.indexOf("al"), stringBuilder.indexOf(" QA"), "Ali");


        stringBuilder.delete(stringBuilder.indexOf(" QA"), stringBuilder.indexOf(" Auto"));

        stringBuilder.deleteCharAt(stringBuilder.length() - 1);


        System.out.println("Result: StringBuilder : -> " + stringBuilder);


        // StringBuffer

        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append("Muhammadali");
        stringBuffer.append(" QA Tester");

        stringBuffer.insert(stringBuffer.indexOf(" Test"), " Automation");

        stringBuffer.replace(stringBuffer.indexOf("al"), stringBuffer.indexOf(" QA"), "Ali");


        stringBuffer.delete(stringBuffer.indexOf(" QA"), stringBuffer.indexOf(" Auto"));

        stringBuffer.deleteCharAt(stringBuffer.length() - 1);


        System.out.println("Result: StringBuffer : -> " + stringBuffer);



        // DIFFERENCE


        int datas = 10000;
        long time;


        StringBuffer bfr = new StringBuffer();
        time = System.currentTimeMillis();
        for (int i = datas; i >0 ; i++) {
            bfr.append("");
        }
        System.out.println("StringBuffer: " + (System.currentTimeMillis() - time));

        StringBuilder blr = new StringBuilder();
        time = System.currentTimeMillis();
        for (int i = datas; i >0 ; i++) {
            blr.append("");
        }
        System.out.println("StringBuilder: " + (System.currentTimeMillis() - time));


        String a = "Bye";
        String str = new String("Hi");

    }
}
