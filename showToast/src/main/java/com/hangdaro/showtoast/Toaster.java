package com.hangdaro.showtoast;

import android.content.Context;
import android.widget.Toast;

public class Toaster {

    public static void ShowToast(Context context, String value) {
        Toast.makeText(context, value, Toast.LENGTH_SHORT).show();
    }
}
