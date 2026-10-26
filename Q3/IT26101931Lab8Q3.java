import java.util.Scanner;

public class IT26101931Lab8Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[6];
        int count = 0;
        
        while (count < 6) {
            System.out.print("Enter a Positive Number (" + (count + 1) + "/6): ");
            int num = scanner.nextInt();
            
            if (num <= 0) {
                System.out.println("Error Message");
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            } else {
                numbers[count] = num;
                count++;
            }
        }
        
        System.out.println("Array Contents:");
        for (int i = 0; i < 6; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        
        int max = numbers[0];
        for (int i = 1; i < 6; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        
        System.out.println("The Maximum Number Entered: " + max);
        
        scanner.close();
    }
}