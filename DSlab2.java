/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dslab2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class DSlab2 {
    
    public static int[] reveres(int[] x){
        int n=x.length-1;
        for (int i = 0; i < x.length/2; i++) {
            int t=x[i];
            x[i]=x[n];
               x[n]=t;
            n--;
        }
        return x;
    }
    public static int[] shiftRight(int[] a){
        int n=a[a.length-1];
        for (int i = a.length-1; i >0; i--) {
            a[i]=a[i-1];
         
        }
        a[0]=n;
        return a;
    }
    public static int[] shiftleft(int[] a){
        int n=a[0];
        for (int i = 0; i <a.length-1; i++) {
            a[i]=a[i+1];
         
        }
        a[a.length-1]=n;
        return a;
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Arrayopreation tesr= new Arrayopreation();
        Scanner in=new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            if (tesr.addElemente(in.nextInt())==0) 
                System.err.println("added sucessf");
                else
                System.err.println("array is full");
            System.out.println(Arrays.toString(tesr.x));}
            for (int i = 0; i < 7; i++) {
            if (tesr.deletElement(in.nextInt())==0) 
                System.err.println("added sucessf");
                else
                System.err.println("array is full");
            System.out.println(Arrays.toString(tesr.x));
                
            
            
        }
        
        //int x[]={11,12,13,14,15};
       
        //System.out.println("print reveres");
       // System.out.println(Arrays.toString(reveres(x)));
         //System.out.println("print shiftRidt");
        //System.out.println(Arrays.toString(shiftRight(x)));
        //System.out.println("print shiftRidt");
        //System.out.println(Arrays.toString(shiftleft(x)));
        // TODO code application logic here
        }
    
}
