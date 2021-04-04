package com.example.myculture;

import android.view.GestureDetector;
import android.view.MotionEvent;

public class GestureListener extends GestureDetector.SimpleOnGestureListener {
    @Override
    public boolean onDown(MotionEvent e) {
        return true;
    }
    // event when double tap occurs
    @Override
    public boolean onDoubleTap(MotionEvent e) {
        // double tap fired.
        return true;
    }
}