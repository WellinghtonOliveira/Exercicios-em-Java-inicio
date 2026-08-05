import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        int[] nums = new int[10];

        for (int i = 0; i < 10; i++) {
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                if (num <= 0) {
                    num = 1;
                }
                nums[i] = num;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.printf("X[%d] = %d\n", i, nums[i]);
        }

        scanner.close();
    }
}
