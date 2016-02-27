import java.util.Scanner;

public class ShallowGrandmother {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        int age, happy, birthYear;
        double income, cute;
        boolean allowed, allowed2;
        
        System.out.print( "Enter your age: " );
        age = keyboard.nextInt();
        
        System.out.print( "Enter your yearly income: " );
        income = keyboard.nextDouble();
        
        System.out.print( "How cute are you, on a scale from 0.0 to 10.0? " );
        cute = keyboard.nextDouble();
        
        System.out.print( "On a scale from 1 to 10, how happy do you make my grandchild: " );
        happy = keyboard.nextInt();
        
        System.out.print( "What year were you born: " );
        birthYear = keyboard.nextInt();
        
        allowed  = ( age > 25 && age < 40 && ( income > 50000 || cute >= 8.5 ) );
        allowed2 = ( birthYear >= 1980 && birthYear <= 1990 && happy >= 8); 
        
        System.out.println( "Allowed to date my grandchild? " + allowed );
        System.out.println( "What does your OTHER grandmother think? " + allowed2 );
    }
}