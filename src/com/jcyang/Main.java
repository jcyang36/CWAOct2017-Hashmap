package com.jcyang;

import java.io.*;
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
    String filename = (System.getProperty("user.dir")+File.separatorChar+"myfile.txt");

    PrintWriter writer = null;
    /** Make new print writer **/
    try{
        writer = new PrintWriter(new File(filename));

    }catch(FileNotFoundException e){
            System.out.println("File does not exist!");
        }
        for (Integer key:map.keySet()){
           writer.print(key);
            writer.print(" ");
           writer.print(map.get(key));
           writer.println(" ");
        }



        BufferedReader reader = null;
       /** Without try-catch, reader may throw exception**/
        try{
            reader = new BufferedReader(new FileReader(filename));
            String line = reader.readLine();
            while (line!= null){
                String [] key_value_pair = line.split(" ");
                System.out.println("KV Pair: "+key_value_pair[0]+" "+key_value_pair[1]);
                line=reader.readLine();

        }
        reader.close();
        }catch(IOException e){
            System.out.println("File does not exist!");
        }finally{

        }



    String repeatSwitch = "";
        while (!repeatSwitch.equalsIgnoreCase("n")) {
            System.out.println("Enter a number: ");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            scanner.nextLine();

            if (!map.containsKey(n)) {
                System.out.println("Number is not in the list.  Enter the string: ");
                String s = scanner.nextLine();
                map.put(n, s);
                writer.print(n);
                writer.print(" ");
                writer.print(s);
                }





             else {
                System.out.print("String is: ");
                String numstring = map.get(n);
                System.out.println(numstring);

                }
            System.out.println("Would you like to enter a new number? Enter any key to continue or 'n' to exit");
            repeatSwitch=scanner.nextLine();
            }
        for (Integer key : map.keySet()) {
            System.out.print("Number: ");
            System.out.print(key);
            System.out.println("");
            System.out.print(" String: ");
            System.out.print(map.get(key));
            System.out.println("");
        }



        writer.close();
    }
}
