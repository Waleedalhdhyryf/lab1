/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_lab4;

import static java.lang.Math.E;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class DS_lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayQeue<Character> myQeue=new ArrayQeue<>(5);
        Scanner in=new Scanner(System.in);
         System.out.println("input q elemrnt");
         for (int i = 0; i < 5; i++) {
            myQeue.enqeue(in.next().charAt(0));
             System.out.println("the frist element: " +myQeue.frist());
             System.out.println("the size Array:" +myQeue.size());
        }
                  while(!myQeue.isEmpty()){
                      System.out.print(myQeue.deqeue() +"\t");
                  }
        // TODO code application logic here
    }
    
}
