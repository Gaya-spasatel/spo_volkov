package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        pr1_1();
    }

    public static void pr1_1(){
        Function<int[], String> minValue = (array) -> {
            ArrayList array1 = new ArrayList();
            for(int i=0;i<array.length;i++){
                if(!array1.contains(array[i])) array1.add(array[i]);
            }
            array1.sort((Comparator<Integer>) (integer, t1) -> {
                if(integer==1 && t1==0) return -1;
                else if(integer==0 && t1==1) return 1;
                return integer-t1;
            });
            StringBuffer stringBuffer = new StringBuffer("");
            for(int i=0;i<array1.size();i++){
                stringBuffer.append(array1.get(i));
            }
            return stringBuffer.toString();
        };
        String s = minValue.apply(new int[]{1, 3, 1, 7, 0});
        System.out.println(s);
        //System.out.println((minValue ({1, 3, 1})));
    }
}
