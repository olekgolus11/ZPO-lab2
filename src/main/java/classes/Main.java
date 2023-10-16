package classes;

public class Main {
    public static void main(String[] args) {
        UInteger number = UInteger.valueOf(1);
        UInteger number2 = UInteger.valueOf(2);

        number.subtract(number2);
        System.out.println(UInteger.MAX_VALUE);
    }
}