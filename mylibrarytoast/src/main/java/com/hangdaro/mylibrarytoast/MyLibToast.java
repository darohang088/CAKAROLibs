package com.hangdaro.mylibrarytoast;

import android.content.Context;
import android.widget.Toast;

public class MyLibToast {
    public  static void libToast(Context contxet,String value){
        Toast.makeText(contxet, value, Toast.LENGTH_SHORT).show();
    }
}
