/*
 * Andrew Thompson
 * October 2, 2018
 * This program tells the user how much water was used to make their compuer/monitor combos
 */

package u1_a2_p1_manufacturing;


/**
 *
 * @author antho6229
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class U1_A2_P1_Manufacturing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyedInput = new Scanner(System.in);
        
        //declare constants
        final double WATER_PER_COMBO = 1.5;
        
        //declare variables
        DecimalFormat df = new DecimalFormat("###.##");
        int numCombos;
        double waterUsed;
        
        //get input
        System.out.println("Enter the number of computer/monitor combos you have.");
        numCombos = keyedInput.nextInt();
        
        //calculate
        waterUsed = numCombos * WATER_PER_COMBO;
        
        //output
        System.out.println("\n" + df.format(waterUsed) + " tons of water were used.");
        
        
    }
    
}
