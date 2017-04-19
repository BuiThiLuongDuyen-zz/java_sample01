package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i=0;
        while(i<100){
            if(i%3 == 0 && i%5 == 0)
                System.out.println("FizzBuzz");
            else if (i%5 == 0)
                System.out.println("Buzz");
            else if (i%3 == 0)
                System.out.println("Fizz");
            else System.out.println(i);
            i++;

        }
    }

    FB01 mad = new FB01();


}
