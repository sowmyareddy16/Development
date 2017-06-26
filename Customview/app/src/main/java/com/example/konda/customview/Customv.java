package com.example.konda.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

/**
 * Created by konda on 5/17/2017.
 */

public class Customv extends View implements View.OnClickListener {
    Rect rect;
    Paint paint;
    int squarecolor;
    Bitmap bits;
    Bitmap mCirlce;
    int sqauresize;
    public Customv(Context context) {

        super(context);
        init(null);
        setOnClickListener(this);
    }

    public Customv(Context context, AttributeSet attrs) {
        super(context, attrs);
        setOnClickListener(this);
        init(attrs);
    }

    public Customv(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setOnClickListener(this);
        init(attrs);

    }


    @Override
    protected void onDraw(Canvas canvas) {
        rect.left=100;
        rect.top=100;
        rect.bottom=bits.getHeight()+170;
        rect.right=bits.getWidth()+100;
        canvas.drawRect(rect,paint);
        canvas.drawBitmap(bits,100,0,null);


    }
    private void init(@Nullable AttributeSet set){
        rect=new Rect();
        paint=new Paint(Paint.ANTI_ALIAS_FLAG);
        mCirlce= BitmapFactory.decodeResource(getResources(),R.drawable.img);

        invalidate();
        if(set==null)
            return;

        TypedArray a=getContext().obtainStyledAttributes(set,R.styleable.Customv);
        squarecolor=a.getColor(R.styleable.Customv_square_color,Color.BLUE);
        sqauresize= (int) a.getDimension(R.styleable.Customv_sqaure_size,100);


    }




    @Override
    public void onClick(View v) {
        Toast.makeText(getContext(), "hello", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int width=100;
        int height=100;
        bits=Bitmap.createScaledBitmap(mCirlce,width,height,false);
    }
}
