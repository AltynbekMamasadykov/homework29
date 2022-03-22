package com.company;

import java.util.Arrays;
import java.util.Optional;

import static java.lang.Integer.compare;

public class Main {

    public static void main(String[] args) {
	/*
	Integer массивден жуп сандарды терип алынызда алардын квадраттарынын эн чонун табыныз.
	 */

        Integer[] numbers = {5,31,2,4,11,-6,1,14,15,10};

        Optional<Integer> maxSquareInArray = Arrays.stream(numbers).filter(x->x%2==0).map(x->x*x).max((x, y)-> compare(x,y));     // birinchi versiya
        Optional<Integer> maxSquareInArray2 = Arrays.stream(numbers).filter(x->x%2==0).map(x->x*x).max(Integer::compare);         // ekinchi versiya
        Optional<Integer> maxSquareInArray3 = Arrays.stream(numbers).filter(x->x%2==0).map(x->x*x).max((x, y)->x.compareTo(y));   // ucunchu versiya

        //men tochno bilem chto ushul ele zadachani dagy bashka kop joldor menen chygarsa bolot

        System.out.println(maxSquareInArray);
        System.out.println(maxSquareInArray2);
        System.out.println(maxSquareInArray3);

    }
}
