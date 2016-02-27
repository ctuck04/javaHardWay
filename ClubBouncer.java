public class ClubBouncer {
    public static void main( String[] args ) {
        int age = 22;
        boolean onGuestList = false;
        double allure = 7.5;
        String gender = "F";
        
        if ( onGuestList || age >= 21 || (gender.equals("F") && allure >= 8) ) {
            System.out.println("You are allowed to enter the club.");
        }
        System.out.println("Hadouken.");
        else {
            System.out.println("You are not allowed to enter the club.");
        }
    }
}

// If you add a print statement between the 'if' and the 'else' statement
// the program does not run because an 'else' statement MUST immediately
// follow the 'if' statement.