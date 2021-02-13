/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaDynamicArray;

/**
 *
 * @author Kivanc
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("\n ---------- Welcome to java program that creating a dynamic array\n-----");
        CreateArray<Integer> arr = new CreateArray<>();        
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Enter something");
        
        
        while(input.hasNextLine()) {
           System.out.println("Enter something");   
            try {
                int val = Integer.parseInt(input.nextLine());
                arr.push(val);
            } catch (Exception e) {
                System.out.println(e);
                break;
            }
            
            
        }
        
        System.out.println("\n ----- Content of the array down below -------- \n");
        System.out.println("Before sorting");        
        arr.showArrayWithIterator(arr);
        System.out.println("after sort");
        arr.sortArr();
         arr.showArrayWithIterator(arr);
        
    }
    
}
