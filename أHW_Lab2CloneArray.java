/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clonearray;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class CloneArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int originalArray[];
        int cloneARRAY[];
        int size;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        size=input.nextInt();
        originalArray=new int[size];
        cloneARRAY=new int[size];
        
        System.err.println("Enter element of the originalArray");
        for (int i = 0; i < size; i++) {
            originalArray[i]=input.nextInt();
            
        }
        input.close();
        cloneARRAY=originalArray.clone();
        System.out.println("elements of the originalArray");
        for (int i = 0; i < originalArray.length; i++) {
                        System.out.print(originalArray[i] + "");

        }
        System.out.println("\n\n elements of the colneArray");
                for (int i = 0; i < cloneARRAY.length; i++) {
                    System.out.print(cloneARRAY[i] + "");
           
        }
        // TODO code application logic here
    }
    
}
