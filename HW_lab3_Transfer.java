/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transfer;

import java.util.Stack;

/**
 *
 * @author User
 */
public class HW_lab3_Transfer {
    public static Stack<Integer> stackPush(Stack<Integer> stack){
        for (int i = 0; i < 5; i++) {
            Integer push=(Integer) stack.push(i);
            System.out.println(push);
            
            
        }return stack;
    }
    public static void pop(Stack<Integer> stack){
        for (int i = 0; i < 5; i++) {
            Integer pop=(Integer) stack.pop();
            System.out.println(pop);
            
        }
    }
public static void peek(Stack<Integer> stack){
    Integer peek=(Integer) stack.peek();
    System.out.println(peek);
    
}
  public static void search(Stack<Integer> stack,int element){
      System.out.println("Element search is:");
      Integer search=(Integer) stack.search(element);
      if(element==-1){
          System.out.println("stack is empty");
      }
      else{  
          System.out.println("element is" +search);
      }
  }
     public static Stack<Integer> transfer(Stack<Integer> stack1,Stack<Integer> stack2){
         stack2=stackPush(stack1);
         System.out.println("Stack transfered succesfully:"+stack2);
         return stack2;
     }
     
    public static void main(String[] args) {
        Stack<Integer> stack1=new Stack<>();
        Stack<Integer> stack2=new Stack<>();
        
        Stack<Integer> finalStack =transfer(stack1, stack2);
        // TODO code application logic here
    }
    
}
