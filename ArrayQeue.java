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
public class ArrayQeue<E> implements Qeue<E>{
 static final int CAPACITY=100;
    int SZ=0;
    int f=0;
    E data[];
    

    public ArrayQeue(int c) {
        data=(E[]) new Object[c];
        
        
    }
    public ArrayQeue(){
        this(CAPACITY);
    }


    @Override
    public boolean isEmpty() {
        return SZ==0;
    }

    @Override
    public int size() {
        return SZ;
    }

    @Override
    public void enqeue(E element) { 
        if(size()==data.length)
            throw  new IllegalStateException("Qeue is full");
        int i=(f+SZ)% data.length;
        data[i]= element;
        SZ++;
        
    }

    @Override
    public E deqeue() {
        if(isEmpty()) return null;
        E 
    }

    @Override
    public E frist() {
        if(isEmpty()) return null;
        E det= data[f];
        data[f]=null;
        SZ--;
        f=(f+1) % data.length;
        return det;
    }
    
}
