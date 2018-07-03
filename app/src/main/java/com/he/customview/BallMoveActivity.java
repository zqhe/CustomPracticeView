package com.he.customview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.he.customview.view.BallMoveView;

public class BallMoveActivity extends AppCompatActivity {
    private BallMoveView ballview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ball_move);
        ballview = (BallMoveView) findViewById(R.id.ballview);
/*
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                ballview.postInvalidate();
            }
        }, 200, 50);
*/
    }
}
