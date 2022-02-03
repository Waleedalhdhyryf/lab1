/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSlab3;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class DSlab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayStack<Integer>myStack = new ArrayStack<>(5);
        Scanner input=new Scanner(System.in);
        for (int i = 0; i <5; i++) {
            myStack.push(input.nextInt());
            System.out.println("top="+myStack.top());
            System.out.println("siz of stack="+myStack.size());
        }
        System.out.println("after calling pop");
        for (int i = 0; i < 6; i++) {
            myStack.pop();
            System.out.println("top ="+myStack.top());
            System.out.println("size of stack="+myStack.size());
        }
        // TODO code application logic here
    }
    
}
