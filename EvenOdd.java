import java.util.*;

public class EvenOdd {
    public static void main(String args[]) {
        EvenOdd eo = new EvenOdd();

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");

        int num = scan.nextInt();

        eo.findEvenOdd(num);
    }

    public void findEvenOdd(int num) {

        if (num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}