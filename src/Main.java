import java.util.Scanner;
import java.util.InputMismatchException;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Multiplier multy = new Multiplier();
        Adder ad = new Adder();
        Divider di = new Divider();
        Subtractor su = new Subtractor();

        try {
            int a = inputFromUser();
            int b = inputFromUser();
            int m = multy.calculate(a, b);
            int s = su.calculate(a, b);
            int d = di.calculate(a, b);
            int a1 = ad.calculate(a, b);
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

    public static int inputFromUser() {
        System.out.println("Введите  целочисленное числ: ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        return x;
    }
}
