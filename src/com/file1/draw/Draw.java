package com.file1.draw;

public class Draw {

    public void draw(int width, int height){
        for(int i=0; i<height; i++){
            for(int j=0;j<width;j++)
                System.out.print("# ");
            System.out.print("\n");
        }
        System.out.println("\n\n");

    }

    public void drawD(int width){
        int size = width;
        for(int i=0; i<width;i++){
            size--;
            for(int j=0; j<width; j++) {
                if(j<size)
                    System.out.print("  ");
                else
                    System.out.print("# ");
            }
            System.out.print("\n");
        }
        System.out.println("\n\n");
    }

    public void drawE(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if((i==0)||(i==height-1)||(j==0)||(j==width-1))
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }
            System.out.print("\n");
        }
        System.out.println("\n\n");
    }


    public void drawH(int width) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++) {
                if((i==0)||(i==width-1)||(i==j)||(i == width-1-j))
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }
            System.out.print("\n");
        }
        System.out.println("\n\n");
    }



}
