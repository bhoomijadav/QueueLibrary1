package com.milople.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class Demo {

    public static void toasty(Context ctx, String str)
    {
       Toast.makeText(ctx, str, Toast.LENGTH_SHORT).show();
    }

}
