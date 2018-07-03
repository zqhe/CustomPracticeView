package com.he.customview.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by hayden
 * on 2018/6/29.
 */
public class RulerView extends View {
    private Paint mPaint;
    private final static int STROKE_WIDTH = 2;
    private final static int INTERVAL = STROKE_WIDTH * 4;
    private final static int PANNDING = 16;
    private final static int MIDDLE = 5;
    private final static int LONG = 8;

    public RulerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setColor(Color.DKGRAY);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(STROKE_WIDTH);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float left = 32;
        float top = left;
        float right = getMeasuredWidth() - left;
        float bottom = right / 3;
        RectF rectF = new RectF(left, top, right, bottom);
        canvas.drawRoundRect(rectF, 8, 8, mPaint);

        canvas.save();

        float y = (bottom - 2 * STROKE_WIDTH) / 4;
        float long_count = (right - left - 2 * STROKE_WIDTH - 2 * PANNDING) / (INTERVAL + STROKE_WIDTH) / LONG;
        float count = (right - left - 2 * STROKE_WIDTH - 2 * PANNDING) / (INTERVAL + STROKE_WIDTH);
        for (int i = 0; i < count; i++) {
            if (i % LONG == 0) {
                canvas.drawLine(left + STROKE_WIDTH + PANNDING, bottom - STROKE_WIDTH, left + STROKE_WIDTH + PANNDING, bottom - 2f * y, mPaint);
            } else if (i % LONG % MIDDLE == 0) {
                canvas.drawLine(left + STROKE_WIDTH + PANNDING, bottom - STROKE_WIDTH, left + STROKE_WIDTH + PANNDING, bottom - 1.5f * y, mPaint);
            } else {
                canvas.drawLine(left + STROKE_WIDTH + PANNDING, bottom - STROKE_WIDTH, left + STROKE_WIDTH + PANNDING, bottom - y, mPaint);
            }
            canvas.translate(INTERVAL + STROKE_WIDTH, 0);
        }
        canvas.restore();

        String text = "0 cm";
        mPaint.setStrokeWidth(1);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setTextSize(24);
        for (int i = 0; i < long_count; i++) {
            if (i != 0) {
                text = i + "";
            }
            canvas.drawText(text, 0, text.length(), left + PANNDING, bottom - 2f * y - INTERVAL, mPaint);
            canvas.translate((INTERVAL + STROKE_WIDTH) * LONG, 0);
        }
        canvas.restore();
    }
}
