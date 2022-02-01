/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwork4;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Hwork4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student[] team= new  Student[3];
        Scanner n= new Scanner(System.in);
                for (int i = 0; i < team.length; i++) {
                    Student s=new Student(n.nextInt(),n.next());
                    team[i]=s;
                    
            
        }
                for (int i = 0; i < team.length; i++) {
                    System.err.println(team[i].toString());
            
        }
        
        // TODO code application logic here
    }
    
}
