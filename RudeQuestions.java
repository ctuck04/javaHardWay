import java.util.Scanner;

public class RudeQuestions {
    public static void main( String[] args ) {
        String name;
        int age, powerLevel;
        double weight, income;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print( "Hello. What is your name? " );
        name = keyboard.next();
        
        System.out.print( "Hi, " + name + "! How old are you? " );
        age = keyboard.nextInt();
        
        System.out.println( "So you're " + age + ", eh? That's not very old." );
        System.out.print( "How much do you weigh, " + name + "? " );
        weight = keyboard.nextDouble();
        
        System.out.println( weight + "! Better keep that quiet!!");
        
        System.out.println( "What is your power level?" );
        powerLevel = keyboard.nextInt();
        System.out.println( "You're power level is over " + powerLevel + "?! Impressive!" );
        
        // System.out.println( weight + "! Better keep that quiet!!");
        System.out.print("Finally, what's your income, " + name + "? " );
        income = keyboard.nextDouble();
        
        System.out.print( "Hopefully that is " + income + " per hour" );
        System.out.println( " and not per year!" );
        System.out.print( " Well, thanks for answering my rude questions, " );
        // You're not welcome.
        System.out.println( name + ".");
    }
}
/* Guess #1: The program will simply convert your integer to a double if you type an integer
where the program is expecting a double */

/* Guess #2: The program will not blow up if you enter a numeric value where the program
is expecting a string because numeric values can be converted to strings. */

/* Any time I typed in a string where the program expected a numeric value, the program
blew up. The reverse did not make the program blow up, however. In the reverse scenario, 
the numeric value was simply converted to a string. */

