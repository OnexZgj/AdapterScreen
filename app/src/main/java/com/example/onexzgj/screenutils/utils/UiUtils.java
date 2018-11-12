package com.example.onexzgj.screenutils.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;

import com.example.onexzgj.screenutils.base.App;

/**
 * Created by OnexZgj on 2018/11/12.
 * 获取屏幕有关信息的工具
 */

public class UiUtils {

    /**
     * 获取状态栏的高度
     *
     * @return
     */
    public static int getStateBarHeight() {
        int identifier = Resources.getSystem().getIdentifier("status_bar_height", "dimen", "android");
        return Resources.getSystem().getDimensionPixelSize(identifier);
    }

    /**
     * 获取计算的dpi
     *
     * @return
     */
    public static int getComputerDpi(float screen) {
        double v = Math.pow(getScreenWidth(), 2) + Math.pow(getScreenHeight(), 2);
        double sqrt = Math.sqrt(v);
        return (int) (sqrt / screen);
    }


    /**
     * 获取屏幕的宽度
     *
     * @return
     */
    public static int getScreenWidth() {
        WindowManager wm = (WindowManager) App.getAppContext().getSystemService(Context.WINDOW_SERVICE);
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            //noinspection ConstantConditions
            wm.getDefaultDisplay().getRealSize(point);
        } else {
            //noinspection ConstantConditions
            wm.getDefaultDisplay().getSize(point);
        }
        return point.x;
    }


    public static int getScreenHeight() {
        WindowManager wm = (WindowManager) App.getAppContext().getSystemService(Context.WINDOW_SERVICE);
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            //noinspection ConstantConditions
            wm.getDefaultDisplay().getRealSize(point);
        } else {
            //noinspection ConstantConditions
            wm.getDefaultDisplay().getSize(point);
        }
        return point.y;
    }

    /**
     * 获取系统的density
     *
     * @return
     */
    public static float getScreenDensity() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    /**
     * 获取系统的dpi
     *
     * @return
     */
    public static float getScreenDensityDpi() {
        return Resources.getSystem().getDisplayMetrics().densityDpi;
    }


}
