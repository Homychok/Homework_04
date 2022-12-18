public class Main {
    public static void main(String[] args) {
        lessonwork1();
        lessonwork2();
        lessonwork3();
        lessonwork4();
        homework1();
    }
    public static void lessonwork1() {
        System.out.println("Самостоятельная задача 1");
        {
            int[] numberOne = new int[3];
            numberOne[0] = 1;
            numberOne[1] = 2;
            numberOne[2] = 3;
            System.out.print(numberOne[0]);
            System.out.print(numberOne[1]);
            System.out.println(numberOne[2]);
        }
        {
            double[] numberTwo = {1.57d, 7.654d, 9.986d};
            System.out.println(numberTwo[0]);
        }
        {
            int[] numberThree = new int[5];
            numberThree[0] = 15;
            for (int i = 0; i < numberThree.length; i++) {
                numberThree[i] = i + 1;
                System.out.println(numberThree[i]);
            }
        }
    }
    public static void lessonwork2() {
        System.out.println("Самостоятельная задача 2");
        {
            int[] numberOne = new int[3];
            numberOne[0] = 1;
            numberOne[1] = 2;
            numberOne[2] = 3;
            System.out.print(numberOne[0] + ",");
            System.out.print(numberOne[1] + ",");
            System.out.println(numberOne[2]);
        }
        {
            double[] numberTwo = {1.57d, 7.654d, 9.986d};
            System.out.print(numberTwo[0] + ",");
            System.out.print(numberTwo[1] + ",");
            System.out.println(numberTwo[2]);
        }
        {
            int[] numberThree = new int[5];
            numberThree[0] = 15;
            numberThree[1] = 18;
            numberThree[2] = 21;
            numberThree[3] = 25;
            numberThree[4] = 29;
            System.out.print(numberThree[0] + ",");
            System.out.print(numberThree[1] + ",");
            System.out.print(numberThree[2] + ",");
            System.out.print(numberThree[3] + ",");
            System.out.println(numberThree[4]);
        }
    }

    public static void lessonwork3() {
        System.out.println("Самостоятельная задача 3");
        {
            int[] numberOne = new int[3];
            numberOne[0] = 1;
            numberOne[1] = 2;
            numberOne[2] = 3;
            System.out.print(numberOne[2] + ",");
            System.out.print(numberOne[1] + ",");
            System.out.println(numberOne[0]);
        }
        {
            double[] numberTwo = {1.57d, 7.654d, 9.986d};
            System.out.print(numberTwo[2] + ",");
            System.out.print(numberTwo[1] + ",");
            System.out.println(numberTwo[0]);
        }
        {
            int[] numberThree = new int[5];
            numberThree[0] = 15;
            numberThree[1] = 18;
            numberThree[2] = 21;
            numberThree[3] = 25;
            numberThree[4] = 29;
            System.out.print(numberThree[4] + ",");
            System.out.print(numberThree[3] + ",");
            System.out.print(numberThree[2] + ",");
            System.out.print(numberThree[1] + ",");
            System.out.println(numberThree[0]);
        }
    }
    public static void lessonwork4() {
        System.out.println("Самостоятельная задача 4");
        {
            int[] numberOne = new int[3];
            numberOne[0] = 12;
            numberOne[1] = 13;
            numberOne[2] = 14;
            for (int i = 0; i < numberOne.length; i++) {
                if (numberOne[i] % 2 != 0) {
                    numberOne[i] = numberOne[i] + 1;
                    System.out.println(numberOne[i]);
                } else {
                    System.out.println(numberOne[i]);
                }
            }
        }
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void homework1() {
        System.out.println("Домашняя задача 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int index = 0; index < arr.length; index++) {
            sum += arr[index];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        int maxNum = arr[arr.length - 1];
        System.out.println("Maximum number = " + maxNum);
        int minNum = arr[arr.length - 1];
        System.out.println("Minimum number = " + minNum);
        double total = sum / 30;
        System.out.println("Средняя сумма трат за месяц составила " + total + " рублей");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        if (Character.isUpperCase(reverseFullName[0])) {
            System.out.println(reverseFullName);  // print something
        } else {
            for (int i = reverseFullName.length - 1; i >= 0; i--) {
                System.out.print(reverseFullName[i]);
            }
        }
    }
}