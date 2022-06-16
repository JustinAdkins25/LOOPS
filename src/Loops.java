import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = 1;
        int i = 1;
        int sum = 0;
        System.out.println("Please enter a positive integer greater 1: ");
        n = scan.nextInt();



        while (i <= n) {
            if (n % i == 0) {
                sum = sum + i;


            }

            ++i;


        }
        System.out.println("The sum of the factors of " + n + " is "+ sum);
    }



    }


