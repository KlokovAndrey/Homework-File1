package com.file1.dimensial.array.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class Array {

    public void Odd(){   //odd numbers from 1 to 99
        int [] arr = new int[50];
        int j=0;
        for(int i=1; i<100;i++){       //increase
            if(i%2!=0) {
                arr[j] = i;
                j++;
            }
        }

        int [] arrInverted = new int[50];  //decrease
        for(int i=0, k=49; i<50; i++, k--)
            arrInverted[k]=arr[i];


        System.out.println("Odd: ");
        print(arr);
        print(arrInverted);
    }


    public void numberOfOddAndEven(){
        int [] arr = new int[20];
        for(int i=0; i<20;i++){
            arr[i]=(int)(Math.random()*10);
        }
        System.out.println("numberOfOddAndEven: ");
        print(arr);
        int odd=0;
        int even=0;
        for(int i=0; i<20;i++){
            if(arr[i]%2==0) even++;
            else odd++;
        }
        System.out.println("Even: "+even+"\nOdd: "+odd);
    }

    public void replaceWithNull(){
        int [] arr = new int[10];
        Random random = new Random();
        for(int i=0; i<10;i++){
            arr[i]=random.nextInt(99)+1;
        }
        System.out.println("replaceWithNull: ");
        print(arr);
        for(int i=0;i<10;i++){
            if(i%2!=0) arr[i]=0;
        }
        print(arr);
    }

    public void minAndMax(){
        int [] arr = new int[15];
        Random random = new Random();
        for(int i=0; i<15;i++){
            arr[i]=random.nextInt(100)-50;
        }
        System.out.println("minAndMax: ");
        print(arr);
        int max = arr[0];
        int maxidx = 0;
        int min = arr[0];
        int minidx = 0;
        for(int i=0; i<15;i++){
            if(arr[i]<min){
                min=arr[i];
                minidx=i;
            }
            if(arr[i]>=max){
                max=arr[i];
                maxidx=i;
            }
        }
        System.out.println("max = "+max+" maxidx = "+maxidx);
        System.out.println("min = "+min+" minidx = "+minidx);
    }

    public void comparison(){
        int [] arr1 = new int[10];
        int [] arr2 = new int[10];
        Random random = new Random();
        for(int i=0; i<10;i++){
            arr1[i]=random.nextInt(10);
            arr2[i]=random.nextInt(10);
        }
        System.out.println("comparison: ");
        print(arr1);
        print(arr2);
        int count1=0;
        int count2=0;
        for(int i=0; i<10;i++) {
            count1+=arr1[i];
            count2+=arr2[i];
        }
        double avg1 = (double)count1/10;
        double avg2 = (double)count2/10;
        System.out.println(avg1+" : " +avg2);
        System.out.println((avg1 > avg2) ? "Average for first array is bigger" : (avg1 < avg2) ? "Average for second array is bigger" :
                "The arrays are equals");
    }

    public void numberOfEntries(){
        Integer [] arr = new Integer[20];
        Random random = new Random();
        for(int i=0; i<20;i++){
            arr[i]=random.nextInt(3)-1;
        }
        System.out.println("numberOfEntries: ");
        System.out.println(Arrays.toString(arr));
        HashSet<Integer> tmp = new HashSet<Integer>(Arrays.asList(arr));
        Integer[] noRepeats = new Integer[tmp.size()];
        noRepeats = (Integer[]) tmp.toArray(noRepeats);
        int [] countRepeats = new int[noRepeats.length];
        for(int i = 0;i<noRepeats.length; i++){
            for(int j=0; j<20; j++)
            {
                if(noRepeats[i] == arr[j]) countRepeats[i]++;
            }
        }
        int max = countRepeats[0];
        for(int i=0; i<countRepeats.length;i++){
            if(countRepeats[i]>=max) {
                max = countRepeats[i];
            }
        }
        for(int i=0;i<countRepeats.length;i++){
            if(countRepeats[i]==max)
                System.out.println("max amount: "+noRepeats[i]);
        }
    }

    private void print(int []arr){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
