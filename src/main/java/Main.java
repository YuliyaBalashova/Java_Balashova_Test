import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scFirst = new Scanner(System.in);
        System.out.print("Введите число ");
        double num = scFirst.nextDouble();
        if (num > 7) {
            System.out.println("Привет");
        }
        Scanner scTwo = new Scanner(System.in);
        System.out.print("Введите имя ");
        String name = scTwo.nextLine();
        if (Objects.equals(name, "Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }

        EnterArray.enterArray(4,9,12,144,55,66,47,18);  // 1 вариант

        Scanner scThree = new Scanner(System.in);  // 2 вариант
        System.out.print("Введите длину массива ");
        byte j = 0;
        if(scThree.hasNextInt()) { // возвращает истину если с потока ввода можно считать целое число
            j = scThree.nextByte(); // считывает целое число с потока ввода и сохраняем в переменную
        } else {
            System.out.println("Число не целое");
        }
        int[] numArray = new int[j];
        for (int i = 0; i < j; i++) {
            System.out.print("Введите число ");
            byte h = scThree.nextByte();
            numArray[i] = h;
        }
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] % 3 == 0) {
                System.out.println(numArray[i]);
            }
        }
    }
}