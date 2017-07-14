package com.example.konda.widgets;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;

 class NewAppWidget extends AppWidgetProvider {



    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        // There may be multiple widgets active, so update all of them
       for(int i=0;i<appWidgetIds.length;i++){
           RemoteViews views=new RemoteViews(context.getPackageName(),R.layout.new_app_widget);

           Intent intent=new Intent(context,MainActivity.class);
           PendingIntent pIntent=PendingIntent.getActivity(context,0,intent,0);
           views.setOnClickPendingIntent(R.id.button,pIntent);

           appWidgetManager.updateAppWidget(appWidgetIds[i],views);
       }
    }


}

