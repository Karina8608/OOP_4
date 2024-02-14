
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


//        Суммирование
        System.out.println("<---Суммирование--->");
        List<Integer> arrayInt = new ArrayList<>(Arrays.asList(3, 15, 21));
        Calculator calculator = new Calculator();
        System.out.println("calculator.sum(arrayInt) = " + calculator.sum(arrayInt));
        List<Double> arrayDouble = new ArrayList<>(Arrays.asList(1.25,2.35,3.78,14.568,5.0,6.0,7.0,8.0,9.1,10.5));
        System.out.println("calculator.sum(arrayDouble) = " + calculator.sum(arrayDouble));

//        Умножение
        System.out.println("<---Умножение--->");
        System.out.println("calculator.multiply(arrayInt) = " + calculator.multiply(arrayInt));
        System.out.println("calculator.multiply(arrayDouble) = " + calculator.multiply(arrayDouble));

//        Деление
        System.out.println("<---Деление--->");
        System.out.println("calculator.division(arrayInt) = " + calculator.division(arrayInt));
        System.out.println("calculator.division(arrayDouble) = " + calculator.division(arrayDouble));
//        Бинарный перевод
        System.out.println("<---Бинарный перевод--->");
        System.out.println("calculator.binary(arrayInt) = " + calculator.binary(arrayInt));
        System.out.println("calculator.binary(arrayDouble) = " + calculator.binary(arrayDouble));
    }
}