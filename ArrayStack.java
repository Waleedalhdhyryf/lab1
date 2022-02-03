/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSlab3;

import static java.lang.System.in;
import java.util.Stack;

/**
 *
 * @author User
 * @param <E>
 */
public class ArrayStack<E> implements stack<E>{
public static final int CAPACITY=100;
    private static boolean toString;
E []data;
int t=-1;
public ArrayStack(){
    this(CAPACITY);
}
public ArrayStack(int capacity){
        data=(E[]) new Object[capacity];
}

    /**
     *
     * @return
     */
    @Override
    public boolean isEmpty() {
        return t==-1;
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        return t+1;
    }

    @Override
    public E top() {
        if(!isEmpty())
            return data[t];
        return null;
    }

    @Override
    public void push(E element) {
        if(size()==data.length)
            throw new IllegalStateException("stack is full");
        data[++t]=element;
    }

    @Override
    public E pop() {
        if(isEmpty()) return null;
        E deleted=data[t];
        data[t]=null;
        t--;
        return deleted;
    }
    Stack reversed(Stack stack){
        Stack stack1=new  Stack();
    }

}
