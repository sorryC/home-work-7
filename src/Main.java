public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();

        //Задание 1

        int sum = 0;
        for (int spending : arr) {
            sum += spending;

        }
        System.out.print("Сумма трат за мес. составила = " + sum + " рублей.");

        //Задание 2
        int min = arr[0];
        int max = arr[0];
        for (int spending : arr) {
            if (min > spending) {
                min = spending;

            } else if ( max< spending) {
                    max = spending;
            }
        }
        System.out.printf(" Мин сумма составила = %s рублей. Макс сумма составила %s рублей. ", min,max);

        //Задание 3
        System.out.println(" " + (double) sum / arr.length + " = Cредняя трата за день");

        //Задание 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char symvol = 0;
        for (int i = 0; i < reverseFullName.length/2; i++) {
            char sumvol = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length-1-i];
            reverseFullName[reverseFullName.length-1-i]= symvol;
        }
        System.out.println(reverseFullName);
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}

