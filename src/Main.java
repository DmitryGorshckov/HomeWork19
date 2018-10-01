import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(new FileReader("products.txt"))) {
            System.out.printf("%-14s%-6s%-12s%-10s%n", "Наименование", "Цена", "Количество", "Стоимость");
            System.out.println("-----------------------------------------------------");

            double result = 0;
            double res = 0;

            while (sc.hasNext()) {

                sc.hasNext();
                String s = sc.next();
                System.out.print(String.format("%-12.25s", s));

                sc.hasNextDouble();
                Double d = sc.nextDouble();
                System.out.print(String.format("%7.2f%2s", d, "X"));

                sc.hasNextInt();
                int a = sc.nextInt();
                System.out.print(String.format("%5d%2s", a, "="));
                result = d * a;
                System.out.print(String.format("%10.2f%n", result));
                 res=res+result;
            }
            System.out.println("-----------------------------------------------------");
            System.out.println(String.format("%-1s%23s%10.2f","Итого","=", res));
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}

