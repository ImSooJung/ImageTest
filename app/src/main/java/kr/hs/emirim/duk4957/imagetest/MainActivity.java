package kr.hs.emirim.duk4957.imagetest;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyImage(getApplicationContext()));
    }
    class MyImage extends View {
        MyImage(Context context){
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);

            Bitmap picture= BitmapFactory.decodeResource(getResources(), R.drawable.ang);//이미지파일을 비트맵 객체로 변환해주세요
            float cx=getWidth()/2.0f;
            float cy=getWidth()/2.0f;
            float x=(getWidth()-picture.getWidth())/2.0f;
            float y=(getHeight()-picture.getHeight())/2.0f;
            //회전
            //canvas.rotate(45,x,y);
            //이동
            //canvas.translate(-150,200);
            //크기변경
            //비틀기
            canvas.skew(0.4f,0.4f);
            canvas.scale(1.5f,1.5f,cx,cy);
            canvas.drawBitmap(picture,x,y,null );
        }
    }
}
