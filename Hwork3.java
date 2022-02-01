/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwork3;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Hwork3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a=new int[10];
        Scanner n=new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i]=n.nextInt();
            
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
            
        }
        // TODO code application logic here
    }
    
}
