/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author jeffe_000
 */
public class Hw01a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        int A;
        
        Scanner READ = new Scanner(System.in);
        
        System.out.println("Enter a filename");
        String fileName = READ.next();
        //I READ FROM A FILE
        
        Scanner fileScanner = new Scanner(new FileReader(fileName));
        
        String line1 = fileScanner.nextLine();
        String line2 = fileScanner.nextLine();
        
        
        
        
        System.out.println("please enter a number.");
        A = READ.nextInt();
        
        if ( A == 1){
            System.out.println("please enter a stock ticker.");
            String tickers = READ.next();
            //I COMPARE TICKERS
            switch (tickers){
                case "AaPL":
                    System.out.println(line1);
                    break;
                case "MSFT":
                    System.out.println(line2);
                    break;
                default:
                    System.out.println("Unknown Stock");
                    break;
                    //THEN I PRINT THE OUTPUT
                    //DO NOT KNOW HOW TO SELECT SPECIFIC DOUBLES OR FLOATS FROM A LINE
            
            }
            
            } else if (A == 2 ){
                System.out.println("Enter a Price.");
                double price = READ.nextDouble();
                
            } else if (A == 3 ){
                System.out.println("Goodbye");
            } else{
                System.out.println(A + " is not a valid input.");
            }
                
                
                
            
            
            
            
            
            
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
