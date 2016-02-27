public class ThereAndBackAgain {
    public static void main( String[] args ) {
        System.out.println( "Here." );
        erebor();
        System.out.println( "Back first time." );
        //erebor();
        System.out.println( "Back second time." );
    }
    
    public static void erebor() {
        System.out.println( "There." );
    }
}

//When you remove the parentheses on erebor you get an error message that says
//erebor is not a statement.

//If you remove the second function call, there will be no line of text between
//line 5 and line 7.