import java.util.Scanner;
import java.util.InputMismatchException;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        try {
            int a = inputfromUser();
            int b = inputfromUser();
            int m = Multiplier.calculate(a, b);
            int s = Subtractor.calculate(a, b);
            int d = Divider.calculate(a, b);
            int a1 = Adder.calculate(a, b);
            System.out.println(m);
            System.out.println(s);
            System.out.println(d);
            System.out.println(a1);
        }
        catch(InputMismatchException e){
            System.out.println("Неправильно введена информация ");
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }

    }

    public static int inputfromUser() {
        System.out.println("Введите  целочисленное числ: ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        return x;
    }
}
