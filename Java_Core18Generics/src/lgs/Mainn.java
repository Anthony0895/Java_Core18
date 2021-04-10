package lgs;

import java.util.ArrayList;
import java.util.List;

public class Mainn {

    public static void addToList(List list) {list.add(67);list.add("String");}
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(76);
        //list.add("String"); Не можливо
    
        addToList(list);
        /* Під час виконання параметри універсального типу стираються, 
         * так що List <Integer> стає List, 
         * і можна додати до нього будь-який контрольний тип.
         */
        
        System.out.println(list);
    }  
}