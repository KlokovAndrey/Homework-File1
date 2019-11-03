package com.file1.factorial;


import java.util.Scanner;

public class Factorial {
    private int num;
    private long time;  //work time

    Factorial(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input: ");
        this.num = in.nextInt();
        time = 0;
    }

    public boolean check(){    //check for correct input
        return num>0;
    }

    public int cycleFact(){       //cycle factorial
        long timeBegin = System.nanoTime();
        if(num==0) return 1;
        int fact=1;
        for(int i=1; i<=num;i++){
            fact*=i;
        }
        long timeEnd = System.nanoTime();
        System.out.println("Work time: " + (timeEnd-timeBegin));
        return fact;
    }

    public int recursionFact(int n){        //recursion factorial
        long timeBegin = System.nanoTime();
        int fact;
        if (n == 1|| n==0)
            return 1;
        fact = recursionFact(n - 1) * n;
        long timeEnd = System.nanoTime();
        time = timeEnd-timeBegin;
        return fact;
    }

    public int get(){
        return num;
    }

    public long get_time(){
        return time;
    }


}

