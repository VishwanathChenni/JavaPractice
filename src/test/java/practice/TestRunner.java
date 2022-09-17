package practice;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@SuppressWarnings("unchecked")
class TestRunner {
    @Test
    void fnWordCount(){
        System.out.println("Hello World!");
        String sMyString="Welcome to Hong Kong and Hong Kong Welcomes you";
        Set set=new HashSet();

        String[] myArray=sMyString.split(" ");

        Collections.addAll(set, myArray);
        for (Object o : set) {
            String sMyString1 = (String) o;
            int count = 0;
            for (String s : myArray) {
                if (sMyString1.equalsIgnoreCase(s)) {
                    count++;
                }
            }
            System.out.println("Word:-" + sMyString1 + " occurred :-" + count + " times");
        }
    }
}
