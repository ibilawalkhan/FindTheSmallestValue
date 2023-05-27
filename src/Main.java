import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter some numbers: ");
        int num = input.nextInt();
        int min = num;

        for(int i = 0; i < 5; i++) {
            num = input.nextInt();

            if(num < min) {
                min = num;
            }
        }

        System.out.println("The smallest value is " + min);
    }
}