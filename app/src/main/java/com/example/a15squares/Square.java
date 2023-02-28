package com.example.a15squares;

/**
 @Abhi Akkal
 */

import android.graphics.Paint;
import android.graphics.Rect;

public class Square {
    private int top;
    private int left;

    private int bottom;
    private int right;


    private int num;

    public Square(int t, int l, int b, int r, int n){
        top = t;
        left = l;
        bottom = b;
        right = r;
        num = n;

    }

    public int getTop(){
        return top;
    }

    public int getBottom() {
        return bottom;
    }

    public int getLeft() {
        return left;
    }

    public int getRight() {
        return right;
    }


    public int getNum(){
        return num;
    }

    public void setNum(int n){
        num = n;
    }
}
