package com.file1.draw;

public class DrawTest {
    public DrawTest(){
        Draw draw = new Draw();
        int height = 8;
        int weigth = 7;
        draw.draw(weigth, height);
        draw.drawD(weigth);
        draw.drawE(weigth, height);
        draw.drawH(weigth);
    }
}
