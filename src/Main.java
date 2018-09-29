import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(new FileReader("products.txt"))) {
            System.out.printf("%-14s%-6s%-12s%-10s%n", "Наименование", "Цена", "Количество", "Стоимость");
            System.out.println("-----------------------------------------------------");

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
                double result = d * a;
                System.out.print(String.format("%10.2f%n", result));
            }
            System.out.println("-----------------------------------------------------");
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}

