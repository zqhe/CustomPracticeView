package com.he.customview.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by hayden
 * on 2018/7/3.
 */
public class Rect1View extends View {
    private int preX, preY;

    private Paint mPaint;
    private Path mPath;
    private Bitmap mBitmapBuffer;
    private Canvas mBitmapCanvas;

    public Rect1View(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setColor(Color.RED);
        mPaint.setStrokeWidth(4);

        mPath = new Path();
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        if (mBitmapBuffer == null) {
            int width = getMeasuredWidth();
            int height = getMeasuredHeight();
            mBitmapBuffer = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            mBitmapCanvas = new Canvas(mBitmapBuffer);
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(mBitmapBuffer, 0, 0, mPaint);
        canvas.drawPath(mPath, mPaint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int x = (int) event.getX();
        int y = (int) event.getY();
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                mPath.reset();
                preX = x;
                preY = y;
                break;
            case MotionEvent.ACTION_MOVE:
                mPath.reset();
                int left = preX;
                int top = preY;
                int rigth = x;
                int bottom = y;
                if (x > preX && y > preY) {
                    left = preX;
                    top = preY;
                    rigth = x;
                    bottom = y;
                } else if (x > preX && y <= preY) {
                    left = preX;
                    top = y;
                    rigth = x;
                    bottom = preY;
                } else if (x <= preX && y > preY) {
                    left = x;
                    top = preY;
                    rigth = preX;
                    bottom = y;
                } else if (x <= preX && y <= preY) {
                    left = x;
                    top = y;
                    rigth = preX;
                    bottom = preY;
                }
                mPath.addRect(left, top, rigth, bottom, Path.Direction.CCW);
                invalidate();
                break;
            case MotionEvent.ACTION_UP:
                mBitmapCanvas.drawPath(mPath, mPaint);
                invalidate();
                break;
            default:
                break;
        }
        return true;
    }
}
