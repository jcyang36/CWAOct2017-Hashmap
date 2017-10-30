package com.jcyang;

import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<Integer, String>();
       map.put(1, "one");
    map.put(2, "two");
    map.put(3, "three");
    map.put(4, "four");
    map.put(5, "five");



    for (Integer key:map.keySet()){
        System.out.print("Number: ");
        System.out.print(key);
        System.out.println("");
        System.out.print(" String: ");
        System.out.print(map.get(key));
        System.out.println("");
    }



        System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        if(!map.containsKey(n)) {
            System.out.println("Number is not in the list.  Enter the string: ");
            String s = scanner.nextLine();
            map.put(n, s);
            for (Integer key:map.keySet()){
                System.out.print("Number: ");
                System.out.print(key);
                System.out.println("");
                System.out.print(" String: ");
                System.out.print(map.get(key));
                System.out.println("");
            }
        }
        else{
            System.out.print("String is: ");
            String numstring = map.get(n);
            System.out.println(numstring);
            for (Integer key:map.keySet()){
                System.out.print("Number: ");
                System.out.print(key);
                System.out.println("");
                System.out.print(" String: ");
                System.out.print(map.get(key));
                System.out.println("");
            }
        }






    }
}
