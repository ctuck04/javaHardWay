import java.util.Scanner;

public class BMICategories {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        double heightInInches, weightInPounds, Meters, Kilos, bmi;
        
        System.out.print( "Enter your height in inches: " );
        heightInInches = keyboard.nextDouble();
        
        System.out.print( "Enter your weight in pounds: " );
        weightInPounds = keyboard.nextDouble();
        
        Meters = heightInInches * .0254;
        
        Kilos = weightInPounds * .454;
        
        bmi = Kilos / (Meters * Meters);
        
        System.out.println( "Your BMI is: " + bmi);
        
        System.out.print( "BMI category: " );
        if ( bmi < 15.0 ) {
            System.out.println( "very severely underweight" );
        }
        else if ( bmi <= 16.0 ) {
            System.out.println( "underweight" );
        }
        else if ( bmi < 18.5 ) {
            System.out.println( "underweight" );
        }
        //if ( bmi < 25.0 ) {
            //System.out.println( "normal weight" );
        //}
        else if ( bmi < 25.0 ) {
            System.out.println( "underweight" );
        }
        else if ( bmi < 30.0 ) {
            System.out.println( "overweight" );
        }
        else if ( bmi < 35.0 ) {
            System.out.println( "moderately obese" );
        }
        else if ( bmi < 40.0 ) {
            System.out.println( "severly obese" );
        }
        else {
            System.out.println( "very severely/\"morbidly\" obese" );
        }
    }
}