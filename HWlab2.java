/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package h.wlab2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author User
 */
public class HWlab2 {
    
    static void reverse(Integer x[]){
        Collections.reverse(Arrays.asList(x));
        System.err.println("Reverse Array:" + Arrays.asList(x));
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer [] x={1,2,3,4,5};
        System.err.println("Original Array" + Arrays.asList(x));
        reverse(x);
        // TODO code application logic here
    }
    
}
 