package practice;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestRunner {
    @Test
    public void fnWordCount(){
        System.out.println("Hello World!");
        String sMyString="Welcome to Hong Kong and Hong Kong Welcomes you";
        Set set=new HashSet();

        String[] myArray=sMyString.split(" ");

        for(int i=0;i<myArray.length;i++){
           set.add(myArray[i]);
        }
        Iterator iterator=set.iterator();
        while (iterator.hasNext()){
            String sMyString1= (String) iterator.next();
            int count=0;
            for(int i=0;i<myArray.length;i++){
                if(sMyString1.equalsIgnoreCase(myArray[i])){
                    count++;
                }
            }
            System.out.println("Word:-"+sMyString1+" occurred :-"+count+" times");
        }
    }
}
