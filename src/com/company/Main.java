package com.company;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        pr2_1();
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

    public static ArrayList<Human> doHumans(int size){
        Random random = new Random();
        ArrayList<Human> humans = new ArrayList<>();
        for(int i=0;i<size;i++){
            humans.add(new Human(random.nextInt(), getAlphaNumericString(10), getAlphaNumericString(10), LocalDate.now(), random.nextInt()));
        }
        return humans;
    }

    static String getAlphaNumericString(int n) {


        // выбрал символ случайный из этой строки

        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

                + "0123456789"

                + "abcdefghijklmnopqrstuvxyz";



        // создаем StringBuffer размером AlphaNumericString

        StringBuilder sb = new StringBuilder(n);



        for (int i = 0; i < n; i++) {



            // генерируем случайное число между

            // 0 переменной длины AlphaNumericString

            int index

                    = (int)(AlphaNumericString.length()

                    * Math.random());



            // добавляем символ один за другим в конец sb

            sb.append(AlphaNumericString

                    .charAt(index));

        }
        return sb.toString();

    }

    public static void pr2_1(){
        ArrayList input = doHumans(5);
        Stream<Human> stream = input.stream();
        stream.sorted(Comparator.comparing(Human::getFirstName)).forEach(System.out::println);//.filter(human->human.getBirthDate().compareTo(LocalDate.of(2000, Month.JUNE, 24))).forEach(System.out::println).sorted(Comparator.comparing(Human::getLasName)).forEach(System.out::println);
        stream = input.stream();
        stream.filter(human -> human.getBirthDate().compareTo(LocalDate.of(2000, 1,24))<0).forEach(System.out::println);
    }
}
