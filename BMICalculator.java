import java.util.Scanner;

public class BMICalculator {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        double m, kg, FeetHeight, TotalHeight, feet, inches, pounds, bmi;
    
        System.out.print( "Your height (feet only): " );
        feet = keyboard.nextDouble();
        FeetHeight = feet * 12;
        
        System.out.print( "Your height (inches): ");
        inches = keyboard.nextDouble();
        
        TotalHeight = FeetHeight + inches;
        
        m = TotalHeight / 39.37;
    
        System.out.print( "Your weight in pounds: " );
        pounds = keyboard.nextDouble();
        kg = pounds * .454;
    
        bmi = kg / (m*m);
    
        System.out.println( "Your BMI is " + bmi );
    }
    
}