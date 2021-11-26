package com.jcrawley.circlesdemo;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

public class CircleItem implements DrawableItem{

    private int radius;
    private final int color;
    private int alpha;
    private int x,y;


    public CircleItem(int color){
        this.color = color;
        radius = 1;
    }

    @Override
    public Bitmap getBitmap() {
        return null;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    public void update(){
        radius++;
        alpha++;
    }

    public int getRadius(){
        return radius;
    }

    @Override
    public boolean isVisible() {
        return false;
    }

    @Override
    public void draw(Canvas canvas, Paint paint) {
        paint.setAlpha(alpha);
        canvas.drawCircle(x,y, radius, paint);
    }
}
