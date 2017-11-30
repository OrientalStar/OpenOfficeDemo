package com.demo.openofficedemo.utils;

import android.content.Intent;
import android.net.Uri;

import java.io.File;

/**
 * @Author: ponos
 * Time: 2017/11/30  10:47
 * Description:打开Office文件的intent
 */

public class FileUtils {

    /**
     * 获取一个用于打开PDF文件的intent
     *
     * @param Path
     * @return
     */
    public static Intent getPdfFileIntent(String Path) {
        File file = new File(Path);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        Uri uri = Uri.fromFile(file);
        intent.setDataAndType(uri, "application/pdf");
        return intent;
    }

    /**
     * 获取一个用于打开Word文件的intent
     *
     * @param Path
     * @return
     */
    public static Intent getWordFileIntent(String Path) {
        File file = new File(Path);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        Uri uri = Uri.fromFile(file);
        intent.setDataAndType(uri, "application/msword");
        return intent;
    }

    /**
     * 获取一个用于打开Excel文件的intent
     *
     * @param Path
     * @return
     */
    public static Intent getExcelFileIntent(String Path) {
        File file = new File(Path);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        Uri uri = Uri.fromFile(file);
        intent.setDataAndType(uri, "application/vnd.ms-excel");
        return intent;
    }

    /**
     * 获取一个用于打开PPT文件的intent
     *
     * @param Path
     * @return
     */
    public static Intent getPPTFileIntent(String Path) {
        File file = new File(Path);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        Uri uri = Uri.fromFile(file);
        intent.setDataAndType(uri, "application/vnd.ms-powerpoint");
        return intent;
    }


}
