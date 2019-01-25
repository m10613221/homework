package com.mailBox;

import java.util.TreeSet;

public abstract class MailBox {
    private float length = 0;
    private float width = 0;
    private int height = 0;

    //回傳(boolean)該箱子是否能容納傳入的長、寬、高的物體
    public boolean validate(float length, float width, int height) {
        boolean result = false;
        float[] mailBox = queue(this.length, this.width, this.height);
        float[] userBox = queue(length, width, height);

        for (int i = 0; i < mailBox.length; i++) {
            if (mailBox[i] >= userBox[i]) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
    //排序長、寬、高的數值，以(float)回傳
    private float[] queue(float length, float width, int height) {
        float[] queue = new float[3];
        TreeSet<Float> treeSet = new TreeSet<>();
        treeSet.add(length);
        treeSet.add(width);
        treeSet.add((float) height);
        int i = 0;
        for (float num : treeSet) {
            queue[i] = num;
            i++;
        }
        return queue;
    }

    void setLength(float length) {
        this.length = length;
    }

    void setWidth(float width) {
        this.width = width;
    }

    void setHeight(int height) {
        this.height = height;
    }

    /*float getMax(float length, float width, int height) {
        return Math.max(Math.max(length, width), height);
    }

    float getMin(float length, float width, int height) {
        return Math.min(Math.min(length, width), height);
    }*/
}
