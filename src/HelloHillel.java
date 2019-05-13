public class HelloHillel {
    public static void main(String[] args) {
        System.out.println("Hello Hillel!!!))");
        int myNumber = 3425;
        System.out.println(myNumber);
        int[] numbers = {1, 4, 6, 8, 10};
        int[] numbers2 = new int[5];
        String[] myStrings = new String[436];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] <= 7) {
                System.out.println(numbers[i]);
            } else if (numbers[i] == 10) {
                System.out.println("10000000000!");
            } else {
                System.out.println("Bye!");
            }
        }
    }
}

