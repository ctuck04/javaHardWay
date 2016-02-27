import java.util.Scanner;

public class RunningTotal {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        int total = 0;
        int current = 0;
        System.out.println("Type in a bunch of values and I'll add them up. ");
        System.out.println("I'll stop when you type a zero.");
        //System.out.println("First Value: ");
        System.out.println("Type an integer and press Enter to get started!");
        current = keyboard.nextInt();
        
        //if ( current == 0 ) {
            //System.out.println( " The final total is: " + total);
        //}
        
        while ( current != 0 ) {
            System.out.print("Value: ");
            current = keyboard.nextInt();
            if ( current == 0 ) {
                System.out.println( "The final total is: " + total);
                break;
            }
            total += current;
            System.out.println("The total so far is: " + total);
        }
        
        //if ( current = 0 ) {
            //System.out.println( "The final total is: " + total);
        //}
        //else ( current == 0 ){
            //System.out.println("The final total is " + total);
        //}
    }
}