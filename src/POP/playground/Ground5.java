package POP.playground;

public class Ground5 {
    public static void main(String[] args) {

        int result = sum(10);
        System.out.println(result);
    }

     static int sum(int k) {
        if (k <= 1){
            return 1;
        }else{
            return k * sum(k - 1);
        }
    }
}
