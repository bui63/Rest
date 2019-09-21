package com.daily30minutes.rest.webservices.restfulwebservices.extra;

public class ArrayOperation {
    public static int additionArray(int[] array){
        int sum;
        sum = 0;
        for(int i:array){
            sum=sum+i;
        }
        return sum;
    }
}
