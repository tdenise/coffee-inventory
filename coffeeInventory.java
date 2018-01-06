/*
 * Authors: Ryan DeMilt, Lei Pei, Denise Tran
 * CS 141-1
 */

/* coffee shipment inventory: This program calculates whether the company has lost stock 
 * or gained stock.
 */

import java.util.*;
import java.io.*;
public class coffeeInventory {
    public static void main(String[] args){
        
        ArrayList<Integer> incoming = new ArrayList<Integer>();
        ArrayList<Integer> outgoing = new ArrayList<Integer>();
        int n;
        
        /*Takes input in the form of a file named "shipments.txt" 
         *with random positive/negative values
        */
        File file = new File("shipments.txt");
        
        /*Sorts positive numbers into an array aka incoming
        * and sorts negative numbers into an array aka outgoing.
        */
        try {
            Scanner reader = new Scanner(file);
                    while(reader.hasNext()){
                    	n = reader.nextInt();
                        if(n < 0){
                            outgoing.add(n);
                        } else {
                            incoming.add(n);
                        }
                    }                                          
        } catch (Exception e){
            System.out.println("RIP");
        }
        
        //Displays incoming and outgoing arrays separately.             
        System.out.println("Incoming: ");
        for(int i = 0; i < incoming.size(); i++){
            System.out.println(incoming.get(i));
        }
        System.out.println("Outgoing: ");
        for(int i = 0; i < outgoing.size(); i++){
            System.out.println(outgoing.get(i));
        }  
        
        /*adds all the values from incoming into one value
         *aka incomingTotal and adds all the value from 
         *outgoing into one value aka outgoingTotal  
        */
        int incomingTotal = 0, outgoingTotal = 0, total;
        for(int i = 0; i < incoming.size();i++){
            incomingTotal += incoming.get(i);
        }
        for(int i = 0; i < outgoing.size();i++){
            outgoingTotal += outgoing.get(i);
        }
        
        //Adds the two sets of numbers(incoming, outgoing) together.
        total = incomingTotal + outgoingTotal;
        
        //Displays the combined values of incoming and outgoing.
        System.out.println("Total: " + total);
        
        //Tells user if the company gained or lost stock.
        if(total < 0){
            System.out.println("Today was a stock loss");
        }else{
            System.out.println("Today was a stock gain");
        }
    }
}
