/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dslab2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Arrayopreation {
    int []x;
    int numofElementes;
    public Arrayopreation(){
        x=new int[5];
        numofElementes=0;
    }
    public int addElemente(int e){
        if(numofElementes<x.length){
            x[numofElementes]=e;
            numofElementes++;
            return 0;
            
        }else
            return -1;
    }
  public int addSortedElement(int  e){
      if(numofElementes<x.length){
          int i=numofElementes;
          while(i>0 && e<x[i-1]){
              x[i]=x[i-1];
              i--;
          }
          x[i]=e;
          numofElementes++;
          return 0;
         
   
      }else
          return -1;
  }
  public int deletElement(int e){
      if (numofElementes>0) {
          x[numofElementes-1]=Integer.MIN_VALUE;
          numofElementes--;
          return 0;
          
      }else
          return -1;
  }
}
