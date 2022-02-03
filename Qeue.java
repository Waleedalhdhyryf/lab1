/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_lab4;

/**
 *
 * @author User
 */
public interface Qeue<E> {
    boolean isEmpty();
    int size();
    void enqeue(E element);
    E deqeue();
    E frist();
    
}
