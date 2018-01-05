import java.util.*;
import java.io.*;
public class coffeeInventory {
    public static void main(String[] args){
        
                ArrayList<Integer> incoming = new ArrayList<Integer>();
        ArrayList<Integer> outgoing = new ArrayList<Integer>();
        int n;
        
                    File file = new File("shipments.txt");
        try {

            Scanner reader = new Scanner(file);
                    while(reader.hasNext()){
            n = reader.nextInt();
            if(n < 0){
                outgoing.add(n);
            } else {
                incoming.add(n);
            }
        } catch (Exception e){
            System.out.println("RIP");
        }
        


        }
        System.out.println("Incoming: ");
        for(int i = 0; i < incoming.size(); i++){
            System.out.println(incoming.get(i));
        }
        System.out.println("Outgoing: ");
        for(int i = 0; i < outgoing.size(); i++){
            System.out.println(outgoing.get(i));
        }
        int incomingTotal = 0, outgoingTotal = 0, total;
        for(int i = 0; i < incoming.size();i++){
            incomingTotal += incoming.get(i);
        }
        for(int i = 0; i < outgoing.size();i++){
            outgoingTotal += outgoing.get(i);
        }
        total = incomingTotal + outgoingTotal;
        System.out.println("Total: " + total);
        if(total < 0){
            System.out.println("Today was a stock loss");
        }else{
            System.out.println("Today was a stock gain");
        }
    }
}

