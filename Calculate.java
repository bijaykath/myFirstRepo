import java.util.Scanner;
public class Calculate {
    public static void main(String args []) {
        int num1, num2, max;
        /*input two number */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Number");
        num1 = sc.nextInt ();
        num2 = sc.nextInt();
        /*check whether a is greater than b or not */
        if (num1 > num2)
            max = num1;
        else
            max=num2;
        /*print the larget number*/
        System.out.println(max);

    }

}
