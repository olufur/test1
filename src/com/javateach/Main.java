package com.javateach;

public class Main {

    public static void main(String[] args){
    int sum = 0;
   for(int i = 0; i < 1000; i++) {
        if (i%3 == 0 || i%5 == 0) sum += i;
        System.out.println("i=" + i + "; i/3=" + i/3 + "; i/5=" + i/5 + "; sum=" + sum);
    }
System.out.println(sum);

}

}




