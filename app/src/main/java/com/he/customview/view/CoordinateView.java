package com.he.customview.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by hayden
 * on 2018/6/29.
 */
public class CoordinateView extends View {
    public CoordinateView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.RED);
        paint.setStrokeWidth(2);
        paint.setStyle(Paint.Style.STROKE);
//􀘍􁆈􂧠􀵪
        canvas.save();
        for (int i = 0; i < 10; i++) {
            canvas.drawRect(0, 0, 150, 150, paint);
            canvas.translate(30, 30);
        }
//􁚒􀼽􂧠􀵪
        canvas.restore();
//􁒣􃀫􀶀􁸷􀋈􄇙􁧕􀐻􁶕􂲴􀴮􁖒􃔈􀡦􀵘􀐺􀐰􂅑􀴮􁖒􂲴􀐻􄶒
        canvas.translate(0, 500);
        canvas.save();
        for (int i = 0; i < 10; i++) {
            canvas.drawRect(0, 0, 400, 400, paint);
            canvas.scale(0.9f, 0.9f, 200, 200);
        }
        canvas.restore();
//􁒣􃀫􀶀􁸷􀋈􄇙􁧕􀐻􁶕􂲴􀴮􁖒􃔈􀡦􀵘􀐺􀐰􂅑􀴮􁖒􂲴􀐻􄶒
        canvas.translate(0, 500);
        canvas.save();
        canvas.drawCircle(200, 200, 200, paint);
        for (int i = 0; i < 12; i++) {
            canvas.drawLine(350, 200, 400, 200, paint);
            canvas.rotate(30, 200, 200);
        }
        canvas.restore();
    }
}
