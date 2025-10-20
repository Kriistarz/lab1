import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y, z;
        lab1 t = new lab1();
        System.out.println("Задача 1.2");
        System.out.println("Введите число:");
        x = scanner.nextInt();
        System.out.println("Сумма двух последних знаков " + t.sumLastNums(x));


        System.out.println("Задача 1.4");
        System.out.println("Введите число:");
        x = scanner.nextInt();
        System.out.println(t.isPositive(x));


        System.out.println("Задача 1.6");
        System.out.println("Введите число:");
        char chars = scanner.next().charAt(0);// Считываем символ для проверки на заглавную букву
        System.out.println(t.isUpperCase(chars));


        System.out.println("Задача 1.8");
        int a, b;// Объявляем переменные для хранения 2 чисел
        System.out.println("Введите 2 числa:");
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println(t.isDivisor(a, b));


        System.out.println("Задача 1.10");
        System.out.println("Введите число a: ");
        a = scanner.nextInt();
        System.out.println("Введите число b: ");
        b = scanner.nextInt();
        int result = t.lastNumSum(a, b);
        System.out.println("Введите число a: ");
        a = scanner.nextInt();
        int result1 = t.lastNumSum(a, result);
        System.out.println("Введите число a: ");
        a = scanner.nextInt();
        int result2 = t.lastNumSum(a, result1);
        System.out.println("Введите число a: ");
        a = scanner.nextInt();
        int result3 = t.lastNumSum(a, result2);
        System.out.println("Итог " + result3);


        System.out.println("Задача 2.2");
        System.out.println("Введите 2 числa:");
        x = scanner.nextInt();
        y = scanner.nextInt();
        double res = t.safeDiv(x, y);
        System.out.println("Результат деления: " + res);


        System.out.println("Задача 2.4");
        System.out.println("Введите 2 числa:");
        x = scanner.nextInt();
        y = scanner.nextInt();
        System.out.println(t.makeDecision(x, y));


        System.out.println("Задача 2.6");
        System.out.println("Введите 3 числa:");
        x = scanner.nextInt();
        y = scanner.nextInt();
        z = scanner.nextInt();
        System.out.println("Результат " + t.sum3(x, y, z));


        System.out.println("Задача 2.8");
        System.out.println("Введите число:");
        x = scanner.nextInt();
        System.out.println(t.age(x));


        System.out.println("Задача 2.10");
        System.out.println("Введите день недели:");
        String day = scanner.next();
        t.printDays(day);


        System.out.println("Задача 3.2");
        System.out.println("Введите число:");
        x = scanner.nextInt();
        System.out.println(t.reverseListNums(x));


        System.out.println("Задача 3.4");
        System.out.println("Введите 2 числa:");
        x = scanner.nextInt();
        y = scanner.nextInt();
        System.out.println(t.pow(x, y));


        System.out.println("Задача 3.6");
        System.out.println("Введите число:");
        x = scanner.nextInt();
        System.out.println(t.equalNum(x));


        System.out.println("Задача 3.8");
        System.out.println("Введите число:");
        x = scanner.nextInt();
        t.leftTriangle(x);


        System.out.println("Задача 3.10");
        t.guessGame();


        System.out.println("Задача 4.2");
        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Введите x: ");
        x = scanner.nextInt();
        result = t.findLast(arr, x);
        if (result != -1) {
            System.out.println("Результат: " + result);
        } else {
            System.out.println("Число " + x + " не найдено в массиве");
        }


        System.out.println("Задача 4.4");
        System.out.println("Введите размер массива: ");
        size = scanner.nextInt();
        arr = new int[size];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Введите x: ");
        x = scanner.nextInt();
        System.out.println("Введите позицию для вставки: ");
        int pos = scanner.nextInt();
        int[] resul = t.add(arr, x, pos);
        System.out.println("Результат: " + Arrays.toString(resul));


        System.out.println("\nЗадача 4.6");
        System.out.println("Введите размер массива: ");
        size = scanner.nextInt();
        arr = new int[size];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        t.reverse(arr);
        System.out.println("\nРезультат: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }


        System.out.println("\nЗадача 4.8");
        System.out.println("Введите размер первого массива: ");
        size = scanner.nextInt();
        int[] arr1 = new int[size];
        System.out.println("Введите элементы первого массива: ");
        for (int i = 0; i < size; i++) {
            arr1[i] = scanner.nextInt();
        }
        System.out.println("Введите размер второго массива: ");
        size = scanner.nextInt();
        int[] arr2 = new int[size];
        System.out.println("Введите элементы второго массива: ");
        for (int i = 0; i < size; i++) {
            arr2[i] = scanner.nextInt();
        }
        int[] result4 = t.concat(arr1,arr2);
        System.out.println("Результат: " + Arrays.toString(result4));


        System.out.println("Задача 4.10");
        System.out.println("Введите размер первого массива: ");
        size = scanner.nextInt();
        arr = new int[size];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] result5 = t.deleteNegative(arr);
        System.out.println("Результат: " + Arrays.toString(result5));
        }


}

