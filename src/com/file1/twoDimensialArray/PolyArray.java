package com.file1.twoDimensialArray;

import com.file1.oneDimensialArray.Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import static java.lang.Math.abs;

public class PolyArray {

    public void sum(){
        int [][]arr = new int [8][8];
        Random random = new Random();
        for(int i=0; i<8;i++){
            for(int j=0;j<8;j++) {
                arr[i][j] = random.nextInt(99)+1;
            }
        }
        System.out.println("sum: ");
        for(int i=0;i<8;i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        int sum=0;
        long multi=1;
        for(int i=0; i<8;i++) {
            for (int j = 0; j < 8; j++) {
                if(((i==j)||(i==(7-j)))&&(j!=7-j)) {
                    sum += arr[i][j];
                    multi *= arr[i][j];
                }
            }
        }
        System.out.println("sum:" +sum+" multi: "+multi);
    }

    public void max(){
        int [][]arr = new int [8][5];
        Random random = new Random();
        for(int i=0; i<8;i++){
            for(int j=0;j<5;j++) {
                arr[i][j] = random.nextInt(199)-99;
            }
        }
        System.out.println("max: ");
        for(int i=0;i<8;i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        int max=arr[0][0];
        for(int i=0; i<8;i++){
            for(int j=0;j<5;j++) {
                if(max<arr[i][j]) max=arr[i][j];
            }
        }
        System.out.println("max: "+max);
        for(int i=0; i<8;i++){
            for(int j=0;j<5;j++) {
                if(arr[i][j]==max) System.out.println("("+i+","+j+")");
            }
        }

    }

    public void maxLine() {
        int[][] arr = new int[8][5];
        Random random = new Random();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = random.nextInt(21) - 10;
            }
        }
        System.out.println("max line: ");
        for(int i=0;i<8;i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        int [] multi = new int[] {1,1,1,1,1,1,1,1};
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
                multi[i]*=abs(arr[i][j]);
            }
        }
        int maxMulti = multi[0];
        int maxidx=0;
        for(int i=0;i<8;i++){
            if(maxMulti<multi[i]){
                maxMulti=multi[i];
                maxidx=i;
            }
        }
        System.out.println("maxidx: "+maxidx);
    }

    public void lineSort() {
        int[][] arr = new int[10][7];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 7; j++) {
                arr[i][j] = random.nextInt(101);
            }
        }
        System.out.println("line sort: ");
        for(int i=0;i<10;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        for(int i=0;i<10;i++){
            sort(arr[i]);
        }
        System.out.println("\n");
        for(int i=0;i<10;i++){
            System.out.println(Arrays.toString(arr[i]));
        }

    }


    private void sort(int arr[]){
        Arrays.sort(arr);
        int tmp;
        for(int i=0;i<5;i++){
            tmp = arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=tmp;
        }
    }


    }
