package ch5_control_flow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 1. for -> standard loop with index
 * 2. enhanced for -> no index needed
 * 3. while -> runs while condition is true
 * 4. do while -> runs at least once before checking
 * 5. forEach with lambda -> on arrays and lists
 * 6. Iterator -> allows safe removal while iterating
 */
public class Loops{
    public static void main(String [] args){
        Integer[] arr = {99, 89, 79, 69, 59, 49, 39, 29, 19, 9, 0};

        // 1. for
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // 2. enhanced for
        for(int num: arr){
            System.out.print(num + " ");
        }
        System.out.println();

        // 3. while
        int i = 0;
        while(i< arr.length){
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();

        // 4. do while: do while and while difference is that do while run at least once
        int x = 0;
        do{
            System.out.print(arr[x] + " " );
            x++;
        } while(x < arr.length);
        System.out.println();

        // 5. forEach with Lambda
        // On Arrays
        Arrays.stream(arr).forEach(num -> System.out.print(num + " "));
        System.out.println();

        // on list
        List<Integer> list = new ArrayList<>(List.of(arr));
        list.forEach(num -> System.out.print(num + " "));
        System.out.println();

        // 6. Iterator
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
    }
}