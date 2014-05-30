/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package labprint5;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class LabPrint5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyborad = new Scanner(System.in);
        System.out.print("a = ");
        long a = keyborad.nextLong();
        System.out.print("b = ");
        long b = keyborad.nextLong();
        
        if ((b < a)||(a < b)) {
            for (long i = b; i <= a; i++) {
            System.out.println("I = "+i);
        }
            
        for (long i = a; i <= b; i++) {
            System.out.println("I = "+i);
        }
    }
    
  }
}
