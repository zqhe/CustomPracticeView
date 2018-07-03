package com.he.customview;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv = (ImageView) findViewById(R.id.iv);
        /*Bitmap bmp = Bitmap.createBitmap(400, 400, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bmp);
//􃔈􀡦􁮷􁆇
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setTextAlign(Paint.Align.LEFT);
        int sp = 14;
        paint.setTextSize(sp);
        paint.setTextSkewX(-0.5f);
        paint.setUnderlineText(true);
        paint.setFakeBoldText(true);
        canvas.drawText("自定义V!", 10, 100, paint);
//􃔈􀡦􀴮􁖒
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.GREEN);
        paint.setStrokeWidth(20);
        paint.setStrokeJoin(Paint.Join.ROUND);//􄈧􀘞􁭩􁷊􀑮􀙬􁸕􂴻􁭸􁷌
//􃔈􀡦􀐰􀑚􂸙􁖒
        canvas.drawRect(new Rect(20, 200, 350, 350), paint);

        iv.setImageBitmap(bmp);*/

        /*Bitmap bmpBuffer = Bitmap.createBitmap(500, 800,
                Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bmpBuffer);
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);
//􀧏􀽗􁈿􃔈􀡦
        canvas.drawBitmap(bmp, 0, 0, null);
//􁈩􀴮􂡷􄘋􃹼􃕙􁭮
        int bmpWidth = bmp.getWidth();
        int bmpHeight = bmp.getHeight();
        Rect src = new Rect(32, 10, bmpWidth, bmpHeight);
        Rect dst = new Rect(0, bmpHeight, bmpWidth * 3, bmpHeight * 3 + bmpHeight);
        canvas.drawBitmap(bmp, src, dst, null);
        iv.setImageBitmap(bmpBuffer);*/

        /*Bitmap bmpBuffer = Bitmap.createBitmap(500, 800,
                Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bmpBuffer);
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStrokeWidth(4);
//􂭫􀐰􀑚􃓒􃢢􂲴􂛩
        canvas.drawPoint(120, 20, paint);

        paint.setColor(Color.BLUE);
//􀑔􀑚􁮠􀐰􃓴􂭫 4 􀑚􃬍􃢢􂲴􂛩
        float[] points1 = new float[]{10, 10, 50, 50, 50, 100, 50, 150};
        canvas.drawPoints(points1, paint);
        paint.setColor(Color.GREEN);
canvas.drawPoints(points1, 4, 4, paint);
        iv.setImageBitmap(bmpBuffer);

        paint.setColor(Color.RED);
        paint.setStrokeWidth(1);
        final int offsetDy = 50;
        for(int i = 0; i < 5; i ++){
            canvas.drawLine(10, offsetDy * i, 300, offsetDy * i, paint);
        }
        iv.setImageBitmap(bmpBuffer);

        canvas.drawRect(10f, 10f, 400f, 300f, paint);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawRoundRect(new RectF(10, 320, 400, 620), 30, 50, paint);
        iv.setImageBitmap(bmpBuffer);*/

        /*Bitmap bmpBuffer = Bitmap.createBitmap(500, 800,
                Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bmpBuffer);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        RectF rect = new RectF(10, 10, 400, 300);
        paint.setColor(Color.GRAY);
        canvas.drawOval(rect, paint);
        paint.setAntiAlias(true);
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(3);
        canvas.drawArc(rect, -30, -30, false, paint);
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(3);
        canvas.drawArc(rect, 30, -30, false, paint);
        paint.setColor(Color.GREEN);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(3);
        canvas.drawArc(rect, -30, 30, true, paint);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(3);
        canvas.drawArc(rect, -90, 30, true, paint);
        iv.setImageBitmap(bmpBuffer);*/

        /*Bitmap bmpBuffer = Bitmap.createBitmap(500, 800,
                Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bmpBuffer);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        Path path = new Path();
        path.moveTo(0, 150);
        path.rLineTo(300, 0);
        path.rLineTo(-300, 150);
        path.rLineTo(150, -300);
        path.rLineTo(150, 300);
        path.close();
        canvas.drawPath(path, paint);
        iv.setImageBitmap(bmpBuffer);*/

        /*Bitmap bmpBuffer = Bitmap.createBitmap(500, 800,
                Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bmpBuffer);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        Path path = new Path();
//􂸙􁖒
        path.addRect(new RectF(10, 10, 300, 100), Path.Direction.CCW);
//􀴶􄀂􂸙􁖒􀋈4 􀑚􄀂􂲴􁕗􁓖􄜭􀐽􀐰􁹧􀋈2 􀑚􁮠􂺞􁇊􀐰􀑚􁕗􁓖
        path.addRoundRect(new RectF(10, 120, 300, 220),
                new float[]{10, 20, 20, 10, 30, 40, 40, 30}, Path.Direction.CCW);
//􁽝􀴶
        path.addOval(new RectF(10, 240, 300, 340), Path.Direction.CCW);
//􀴶
        path.addCircle(60, 390, 50, Path.Direction.CCW);
//􁕗􃓯
        path.addArc(new RectF(10, 500, 300, 600), -30, -60);
        canvas.drawPath(path, paint);

        iv.setImageBitmap(bmpBuffer);*/

        /*Bitmap bmpBuffer = Bitmap.createBitmap(500, 800,
                Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bmpBuffer);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        Path path = new Path();
        path.moveTo(100, 100);
        path.quadTo(200, 10, 300, 300);
        canvas.drawPath(path, paint);
        paint.setStrokeWidth(4);
        paint.setColor(Color.RED);
        canvas.drawPoints(new float[]{100, 100, 200, 10, 300, 300}, paint);

        path.moveTo(100, 100);
        path.arcTo(new RectF(100, 150, 300, 300), -30, 60, false);
        canvas.drawPath(path, paint);
        iv.setImageBitmap(bmpBuffer);*/

       /* WindowManager wm = (WindowManager) this
                .getSystemService(Context.WINDOW_SERVICE);
        int width = wm.getDefaultDisplay().getWidth();
        int height = wm.getDefaultDisplay().getHeight();

        Bitmap bmpBuffer = Bitmap.createBitmap(width, height,
                Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bmpBuffer);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);

        //画满屏幕的圆
        int radius = 20;
        int xPoint = 20;
        int yPoint = 20;
        int[] colors = new int[]{Color.RED, Color.BLACK, Color.GREEN, Color.BLUE, Color.YELLOW, Color.CYAN, Color.MAGENTA};
        for (int y = 0; y < height / 40; y++) {
            for (int x = 0; x < width / 40; x++) {
                int num = (int) (Math.random() * colors.length);
            *//*String hex = Integer.toHexString(num);
            int color = Color.parseColor("#" + hex);*//*
                paint.setColor(colors[num]);
                canvas.drawCircle(xPoint, yPoint, radius, paint);
                xPoint += 2 * radius;
                if (x == width / 40 - 1) {
                    xPoint = 20;
                    break;
                }
            }
            yPoint += 2 * radius;
        }
        iv.setImageBitmap(bmpBuffer);*/

        changeNumber(iv);
        /*Bitmap bitmap = Bitmap.createBitmap(720, 256, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(4);
        paint.setColor(Color.BLACK);



        Rect rect = new Rect(left, top, right, bottom);
        canvas.drawRect(rect, paint);

        paint.setColor(Color.LTGRAY);
        paint.setStrokeWidth(2);
        for (int i = 0; i < 100; i++) {
            int startX = (int) (Math.random() * right);
            if (startX < left) {
                startX = left;
            }
            int startY = (int) (Math.random() * bottom);
            if (startY < top) {
                startY = top;
            }
            int stopX = (int) (Math.random() * right);
            if (stopX < left) {
                stopX = right;
            }
            int stopY = (int) (Math.random() * bottom);
            if (stopY < top) {
                stopY = bottom;
            }
            canvas.drawLine(startX, startY, stopX, stopY, paint);
        }


        paint.setColor(Color.MAGENTA);
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(64);
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        String text = "";
        for (int i = 0; i < 4; i++) {
            text = numbers[(int) (Math.random() * numbers.length)] + "";
            int startX = (int) (Math.random() * right);
            if (startX <= left) {
                startX = left * 2;
            }
            int startY = (int) (Math.random() * bottom);
            if (startY <= top) {
                startY = top * 2;
            }
            canvas.drawText(text, startX, startY, paint);
        }

        iv.setImageBitmap(bitmap);*/


        /*paint.setTextSize(14);
        String text = "我们结婚啦…… I love Android!";
        canvas.drawText(text, 10, 50, paint);
        canvas.drawText(text, 0, 4, 10, 100, paint);
        canvas.drawText(text.toCharArray(), 5, 10, 10, 150, paint);
        Path path = new Path();
        path.moveTo(10, 200);
        path.quadTo(100, 100, 300, 300);
        canvas.drawTextOnPath(text, path, 15, 15, paint);
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawPath(path, paint);
        iv.setImageBitmap(bmpBuffer);*/
    }

    int left = 16;
    int right = 512;
    int top = 16;
    int bottom = 256;

    public void changeNumber(View view) {
        Bitmap bitmap = Bitmap.createBitmap(720, 512, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(4);
        paint.setColor(Color.BLACK);


        Rect rect = new Rect(left, top, right, bottom);
        canvas.drawRect(rect, paint);

        paint.setColor(Color.LTGRAY);
        paint.setStrokeWidth(2);
        for (int i = 0; i < 100; i++) {
            int startX = (int) (Math.random() * right);
            if (startX < left) {
                startX = left;
            }
            int startY = (int) (Math.random() * bottom);
            if (startY < top) {
                startY = top;
            }
            int stopX = (int) (Math.random() * right);
            if (stopX < left) {
                stopX = right;
            }
            int stopY = (int) (Math.random() * bottom);
            if (stopY < top) {
                stopY = bottom;
            }
            canvas.drawLine(startX, startY, stopX, stopY, paint);
        }


        paint.setColor(Color.MAGENTA);
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(64);
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        String text = "";
        for (int i = 0; i < 4; i++) {
            text = numbers[(int) (Math.random() * numbers.length)] + "";
            int startX = (int) (Math.random() * right);
            if (startX <= left + 64) {
                startX = left * 2;
            }
            int startY = (int) (Math.random() * bottom);
            if (startY <= top + 64) {
                startY = top * 2;
            }
            canvas.drawText(text, startX, startY, paint);
        }

        iv.setImageBitmap(bitmap);

    }
}
