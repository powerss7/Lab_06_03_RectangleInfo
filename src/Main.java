import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double length = 0;
        double width = 0;
        String trash = "";

        System.out.print("\nWhat is the width of your rectangle? ");
        if (in.hasNextDouble())
        {
            width = in.nextDouble();
            in.nextLine(); //have to clear the buffer after reading a number
            System.out.println("You said that your width is " + width);
        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid number");
            System.exit(0);
        }

        System.out.print("\nWhat is the lenght of your rectangle? ");
        if (in.hasNextDouble())
        {
            length = in.nextDouble();
            in.nextLine(); //have to clear the buffer after reading a number
            System.out.println("You said that your length is " + length);
        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid number");
            System.exit(0);
        }

        System.out.println("The area of your rectangel is " + length * width);
        System.out.println(diagonal);
    }
}