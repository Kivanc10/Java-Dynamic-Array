# Java-Dynamic-Array
- A java program that creating dynamic array for all variable types. Also program has sorted them.
- I used <Item> to make possible using for all variable types
- Also, I used to Comparable interface class to sorting elements

```Java
public class CreateArray<Item extends Comparable<Item>> implements Iterable<Item>{ 
...

/*
you can compare all data types thanks to this method
*/
 public boolean less (Item i,Item j) {
        return i.compareTo(j)<0;
    }

...
}
```
- This dynamic array has some common method like array , pop,push,size etc.
- But this program allows us to change size of related array acccording to pop and push operations
```Java
// resizing the array
 public void resize(int max) {
        Item [] temp = (Item []) new Comparable[max];
        for (int i=0;i<N;i++){
            temp[i] = arr[i];
        }
        arr = temp;
    }

// make larger dynamic array when it is full
 public void push(Item item) {
        if (N == arr.length)
            resize(2*arr.length);
        
        arr[N++] = item;                            
    }
  
  
  public Item pop() {
        Item item = arr[--N]; 
        arr[N] = null; // destroy the reference of removed element        
        if (N > 0 && N == arr.length/4) //  shrink the size of array if provide the conditions
            resize(arr.length/2);
        
        return item;
    } 
 

```

- I used selection sort algorithm to sort element with help of the `less` method
```Java
 public void sortArr() {
        for (int i=0;i<arr.length;i++) {
            int min = i;
            for(int j=i+1;j<N;j++) {
                if (less(arr[j],arr[min])) // less method allows us to compare all dtypes each other
                    min = j;
            ...

```

## Sample output

![Ekran Görüntüsü (830)](https://user-images.githubusercontent.com/51750773/107850659-1162fa80-6e15-11eb-8b3a-f2e296c7c969.png)
