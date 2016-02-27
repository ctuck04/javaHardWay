import java.util.Scanner;

public class CoinFlip {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        String coin, again;
        int streak = 0;
        boolean gotHeads;
        //String again = 0, coin;
        
        System.out.println("Would you like to play?");        
        again = keyboard.next();
        
        while (again.equals("y")) {
            gotHeads = Math.random() < 0.5;
            //System.out.println( gotHeads);
            if ( gotHeads ) {
                coin = "HEADS";
                streak++;
                System.out.println("\tThat's " + streak + " in a row....");
                System.out.println("\tWould you like to flip again (y/n)?");
                again = keyboard.next();
            }
            else {
                coin = "TAILS";
                System.out.println("\tYou flip a coin and it is..." + coin);
                System.out.println("\tYou lose everything!");
                System.out.println("\tYou should have quit while you were aHEAD...");
                streak = 0;
                again = "n";
            }
        }
        System.out.println("\tFinal score..." + streak);
    }
}
    
            
            //if ( gotHeads ) {
                //streak++;
                //System.out.println("\tThat's " + streak + " in a row....");
        
            
        
        //do {
            //gotHeads = Math.random() < 0.5;
            
            //if ( gotHeads )
                //coin = "HEADS";
            //else 
                //coin = "TAILS";
                
            //System.out.println("You flip a coin and it is..." + coin);
            
            //if ( gotHeads ) {
                //streak++;
                //System.out.println("\tThat's " + streak + " in a row....");
                //System.out.print("\tWould you like to flip again (y/n)?");
                //again = keyboard.next();
            //}
            //else {
                //System.out.println("\tYou lose everything!");
                //System.out.println("\tShould've quit while you were aHEAD....");
                //streak = 0;
                //again = "n";
           // }
        //} while ( again.equals("y") );
        
        //System.out.println( "Final score: " + streak );
   // }
//}