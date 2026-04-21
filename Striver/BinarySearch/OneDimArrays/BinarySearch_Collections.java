package BinarySearch.OneDimArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch_Collections {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(12);
        list.add(19);
        list.add(34);

        int x = 19;
        int res = Collections.binarySearch(list, x);

        System.out.println("Element to be searched: " + x);
        if(res >= 0)
            System.out.println(x + " found at index " + res);
        else
            System.out.println(x + " Not found");

        x = 15;
        res = Collections.binarySearch(list, x);

        System.out.println("Element to be searched: " + x);
        if(res >= 0)
            System.out.println(x + " found at index " + res);
        else
            System.out.println(x + " Not found");
    }
}
