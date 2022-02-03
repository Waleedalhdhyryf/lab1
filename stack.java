/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSlab3;

/**
 *
 * @author User
 */
public interface stack<E> {
    boolean isEmpty();
    int size();
    E top();
    void push(E element);
    E pop();
    
}
