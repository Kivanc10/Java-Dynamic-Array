/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaDynamicArray;
import java.util.*;
/**
 *
 * @author Kivanc
 */


public class CreateArray<Item extends Comparable<Item>> implements Iterable<Item>{    
    Item [] arr = (Item [])new Comparable[1]; // elements of arr
    protected int N=0; // number of elements
    
    
    public boolean isEmpty() {
        return N == 0;
    }
    
    public void resize(int max) {
        Item [] temp = (Item []) new Comparable[max];
        for (int i=0;i<N;i++){
            temp[i] = arr[i];
        }
        arr = temp;
    }
    
    public void push(Item item) {
        if (N == arr.length)
            resize(2*arr.length);
        
        arr[N++] = item;                            
    }
    
    public Item pop() {
        Item item = arr[--N]; // 1 2 3 "4"
        arr[N] = null; // destroy the reference of removed element
        if (N > 0 && N == arr.length/4) // shrink the size of array
            resize(arr.length/2);
        
        return item;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ReverseArray(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    class ReverseArray implements Iterator<Item> {
        
        private int i = N;
        
        @Override
        public Item next() {
            return arr[--i]; //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean hasNext() {
            return i > 0; //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void remove() {
           
        }        
        
    }
    
    public void showArrayWithIterator (CreateArray<Item> a) {
       Iterator<Item> i = a.iterator();
       while(i.hasNext()) {
           Item t = i.next();
           System.out.println(t);
       }
    }
    
    public int getSize() {
        return N;
    }
    
    public Item getElement(int index) {
        return arr[index];
    }
    

    public boolean less (Item i,Item j) {
        return i.compareTo(j)<0;
    }
    
    public void swap(int i,int j) {
        Item temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public void sortArr() {
        for (int i=0;i<arr.length;i++) {
            int min = i;
            for(int j=i+1;j<N;j++) {
                if (less(arr[j],arr[min]))
                    min = j;
            }
            swap(i, min);
        }
       
    }
}
