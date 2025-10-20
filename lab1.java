import java.util.Random;
import java.util.Scanner;

public class lab1 {
    //1.2
    public int sumLastNums(int x) {
        int lastDigit = x % 10;// Получаем последнюю цифру числа x
        int secondlastDigit  = (x / 10)%10;// Убираем посаледнюю цифру и получаем предпоследнюю
        return lastDigit + secondlastDigit;// Возвращаем сумму 2 последних чисел
    }

    //1.4
    public boolean isPositive(int x) {
        return x > 0;// Возвращаем true если x полож
    }

    //1.6
    public boolean isUpperCase(char x) {
        if (x >= 'A' && x <= 'Z')// Проверяем, является ли символ заглавной буквой
            return true;
        else
            return false;
    }

    //1.8
    public boolean isDivisor(int a, int b) {
        if  (a % b == 0 || b % a == 0)// Проверяем ,делится ли одно число на другое
             return true;
        else
             return false;
    }

    //1.10
    public int lastNumSum(int a, int b) {
        return (a % 10) + (b % 10);// Возвращаем сумму последних цифр
    }

    //2.2
    public double safeDiv(int x, int y) {
        if (y == 0) {
            return 0;// Возвращаем 0 при делении на 0
        }
        return (double) x / y;// Выполняем деление с приведением к double
    }

    //2.4
    public String makeDecision(int x, int y) {
        if (x > y) {
            return x + " > " + y;
        } else if (x < y) {
            return x + " < " + y;
        } else {
            return x + " == " + y;
        }
    }

    //2.6
    public boolean sum3(int x, int y, int z) {
        if (x + y == z)
            return true;
        if (x + z == y)
            return true;
        if (y + z == x)
            return true;
        else
            return false;// Ни одна комбинация не подходит
    }

    //2.8
    public String age(int x) {
        String suffix;
        if (x % 10 == 1 && x % 100 != 11) {
            suffix = "год";// Для чисел оканчивающихся на 1(кроме11)
        } else if (x % 10 >= 2 && x % 10 <= 4 && (x % 100 < 12 || x % 100 > 14)) {
            suffix = "года";// Для чисел оканчивающихся на 2-4(кроме12-14)
        } else {
            suffix = "лет";// Для всех остальных случаев
        }
        return x + " " + suffix;// Возвращаем отформатированную строку
    }

    //2.10
    public void printDays(String x) {
        switch (x) {
            case "понедельник":
                System.out.println("понедельник");
            case "вторник":
                System.out.println("вторник");
            case "среда":
                System.out.println("среда");
            case "четверг":
                System.out.println("четверг");
            case "пятница":
                System.out.println("пятница");
            case "суббота":
                System.out.println("суббота");
            case "воскресенье":
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("это не день недели");
        }
    }

    //3.2
    public String reverseListNums(int x){
        String result = "";
        for (int i = x; i >= 0; i--){// Цикл от x до 0
            result += i;// Добавляем число
            if (i > 0){
                result+=" ";// Добавляем пробел между числами
            }
        }
        return result;// Возвращаем строку с последовательностью
    }

    //3.4
    public int pow(int x,int y){
        if (y < 0){
            System.out.println("Ошибка:отрицательная степень");
            return 1;
        }
        int result = 1;// Начальное значение
        for ( int i = 0;i < y; i++){// Цикл y раз
            result *= x;// Умножаем рез на x
        }
        return result;// Возвращаем x в степени y
    }

    //3.6
    public boolean equalNum(int x){
        if (x < 0) {
            x -=x;
        }
        int lastDigit = x % 10;
        while (x > 0) {
            if (x % 10 != lastDigit) {// Сравниваем тек цифру с последней
                return false;// Цифрцы разные
            }
            x /= 10;// Убираем последнюю цифру
        }
        return true;
    }

    //3.8
    public void leftTriangle(int x){
        for (int i = 1;i <= x;i++) {// Цикл по строкам
            for (int j = 1;j <= i;j++) {// Цикл по звездочкам в строке
                System.out.print("*");// Печатаем звездочку
            }
            System.out.println();// Переход на новую строку
        }
    }

    //3.10
    public void guessGame(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(10);// Генерируем число от 0 до 9
        int attempts = 0;// Счетчик попыток
        int userGuess;// Переменная для догадки пользователя
        do {
            System.out.println("Введите число от 0 до 9: ");
            userGuess = scanner.nextInt();
            attempts++;// Увелич счетчик попыток
            if (userGuess == randomNumber) {
                System.out.println("Вы угадали! ");
            } else {
                System.out.println("Вы не угадали, введите число от 0 до 9: ");
            }
        } while (userGuess != randomNumber);// Повторяем пока не угадают
        System.out.println("Вы отгадали число за " + attempts + " попытки(ок)");
    }

    //4.2
    public int findLast(int[] arr,int x) {
        for (int i = arr.length - 1;i >= 0;i--) {// Идем с конца массива
            if (arr[i] == x) {// Если нашли элемент
                return i;// Возвращаем индекс
            }
        }
        return -1;// Элемент не найден
    }

    //4.4
    public int[] add(int[] arr,int x,int pos){
        if (pos < 0 || pos > arr.length){
            System.out.println("Ошибка:неверная позиция вставки");
            return arr;
        }
        int[] newArr = new int[arr.length + 1];// Создаем новый массив на 1 элемент больше
        for (int i = 0; i < pos;i++) {
            newArr[i] = arr[i];// Копируем элементы до позиции вставки
        }
        newArr[pos] = x;// Вставляем новый элемент
        for (int i = pos; i < arr.length;i++){
            newArr[i+1] = arr[i];// Копируем оставшиеся элементы после вставки
        }
        return newArr;// Возвращаем новый массив с добав эл
    }

    //4.6
    public void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {// Пока указатели не встретились
            int temp = arr[left];// Сохраняем знач левого элемента
            arr[left] = arr[right];// Заменяем левый элемент правым
            arr[right] = temp;// Заменяем правый элемент сохраняем знач
            left++;// Двигаем левый указ вправо
            right--;// Двигаем правый указ влево
        }
    }

    //4.8
    public int[] concat(int[] arr1,int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];// Создаем массив суммарного размера
        for (int i = 0; i < arr1.length; i++) {// Копируем элементы из первого массива
            result[i] = arr1[i];// Заполняем начало res массива
        }
        for (int i = 0; i < arr1.length; i++) {// Копируем элементы из второго массива
            result[arr1.length + i] = arr2[i];// Добавляем после элементов первого массива
        }
        return result;// Возвращаем объединенный массив
    }

    //4.10
    public int[] deleteNegative(int[] arr){
        int count = 0;// Счетчик для полож чисел
        for (int num : arr){// Считаем количество полож чисел в массиве
            if (num >= 0){
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;// Индекс для заполнения нового массива
        for (int num : arr){// Копируем только полож числа в новый массив
            if (num >= 0){// Если эл полож
                result[index++] = num;// Добавляем в результат и увелич индекс
            }
        }
        return result;// Возвращаем массив без отрицц элементов
    }



}
