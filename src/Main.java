import com.sun.jdi.IntegerValue;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        int[] arr = generateRandomArray();
        int total = 0;
        for (int i=0; i < arr.length; i++){
            total += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей");

    }
    public static void task2() {
        int[] arr = generateRandomArray();
        int maxSalary = Integer.MIN_VALUE;
        int minSalary = Integer.MAX_VALUE;
        for (int i=0; i < arr.length; i++){
            if (arr [i] > maxSalary) {
                maxSalary = arr[i];
            }
            if (arr [i] < minSalary){
                minSalary = arr[i];
            }
        }
        System.out.println("Минимальная трата за день составила " + minSalary + " рублей");
        System.out.println("Минимальная трата за день составила " + maxSalary + " рублей");
    }
    public static void task3() {
        int[] arr = generateRandomArray();
        double total = 0;
        for (int i=0; i < arr.length; i++){
            total += arr[i];
        }
        double average = total / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
    }
    public static void task4() {
        int[] arr = generateRandomArray();
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--){
            System.out.print(reverseFullName[i]);
        }
    }
}