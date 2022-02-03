/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remov;
import java.util.Random;

/**
 *
 * @author User
 */
public class HW_lab2_remov {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7};
        removeElements(array);
        // TODO code application logic here
    }
    static void removeElements(int [] array){
        Random r=new Random();
        while (array.length>0) {
            int index=r.nextInt(array.length);
            System.out.println("INDEX="+index+"ELEMENT="+array[index]);
            int[] array1=new int[array.length-1];
            for (int i = 0; i < index; i++) 
                array1[i]=array[i];
                for (int i = index; i < array.length-1; i++)
                    array1[i]=array[i];
                array=array1;
                    
                
                
            
            
        }
    }
    
}
