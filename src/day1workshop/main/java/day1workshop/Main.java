package day1workshop;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;


public final class Main {


        private static final String LIST= "list";
        private static final String ADD= "add";
        private static final String DELETE= "del";

    public static void main(String[] args) {
        Console cons = System.console();
        ArrayList<String> list = new ArrayList<>();
        String conInput = "";


        System.out.println("Welcome to your shopping cart");
              
        while(!conInput.equalsIgnoreCase("Q")){
            
            conInput = cons.readLine(">");
            String[] arr = conInput.split(" ");
            
            if (conInput.equalsIgnoreCase("Q")){
                    break;
                }
                // need to use arr as conInput 
            switch(arr[0]){    
            
                case LIST:
                    if (list.size() > 0){
                    showList(list);
                    } else {
                        System.out.println("Your cart is empty.");
                    }
                    break;
                case ADD:
                    System.out.printf("%s added to cart", conInput);
                    break;
                case DELETE:
                    System.out.println("I'm deleting an item");
                    if (arr.length > 1){
                    int idx = Integer.parseInt(arr[1]) - 1;
                    String removedItem = list.get(idx);
                    list.remove(idx);
                    System.out.printf("%s removed from cart\n", removedItem);}
                    break;

                default:
                if(!list.contains(conInput) && !conInput.contains("del")){
                    list.add(conInput);
                    break;
                }
        }
    }
}
    public static void showList(List<String> list){
        for(int i = 0; i < list.size() ; i++){
            System.out.printf("%d %s\n", (i+1), list.get(i));
        }  
    }
}
