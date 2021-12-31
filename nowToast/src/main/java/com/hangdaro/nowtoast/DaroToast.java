package com.hangdaro.nowtoast;

import android.content.Context;
import android.widget.Toast;

public class DaroToast {
    public  static  void UserToast(Context context,String value){
        Toast.makeText(context, value, Toast.LENGTH_SHORT).show();
    }
}
