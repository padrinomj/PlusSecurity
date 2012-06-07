package com.prueba;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;

public class MyBringBack extends View {

	Bitmap gBall;
	
	public MyBringBack(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		gBall = BitmapFactory.decodeResource(getResources(), R.drawable.greenball);
		
	}

}
