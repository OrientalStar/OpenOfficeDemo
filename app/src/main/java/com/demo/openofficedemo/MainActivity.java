package com.demo.openofficedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.demo.openofficedemo.utils.FileUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.pdf)
    Button pdf;
    @BindView(R.id.word)
    Button word;
    @BindView(R.id.excel)
    Button excel;
    @BindView(R.id.ppt)
    Button ppt;
    @BindView(R.id.text)
    Button text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

    }

    @OnClick({R.id.pdf, R.id.word, R.id.excel, R.id.ppt, R.id.text})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.pdf:
                try {
                    //  sdcard/TestSave/test.pdf为本地Pdf文件的路径
                    Intent intent = FileUtils.getPdfFileIntent("sdcard/TestSave/test.pdf");
                    startActivity(intent);
                } catch (Exception e) {
                    //没有安装第三方的软件会提示
                    Toast toast = Toast.makeText(MainActivity.this, "没有找到打开该文件的应用程序", Toast.LENGTH_SHORT);
                    toast.show();
                }
                break;
            case R.id.word:
                try {
                    //  sdcard/TestSave/test.docx为本地Word文件的路径
                    Intent intent = FileUtils.getWordFileIntent("sdcard/TestSave/test.docx");
                    startActivity(intent);
                } catch (Exception e) {
                    //没有安装第三方的软件会提示
                    Toast toast = Toast.makeText(MainActivity.this, "没有找到打开该文件的应用程序", Toast.LENGTH_SHORT);
                    toast.show();
                }
                break;
            case R.id.excel:
                try {
                    //  sdcard/TestSave/test.xlsx为本地Excel文件的路径
                    Intent intent = FileUtils.getExcelFileIntent("sdcard/TestSave/test.xlsx");
                    startActivity(intent);
                } catch (Exception e) {
                    //没有安装第三方的软件会提示
                    Toast toast = Toast.makeText(MainActivity.this, "没有找到打开该文件的应用程序", Toast.LENGTH_SHORT);
                    toast.show();
                }
                break;
            case R.id.ppt:
                try {
                    //   sdcard/TestSave/test.pptx为本地Ppt文件的路径
                    Intent intent = FileUtils.getPPTFileIntent("sdcard/TestSave/test.pptx");
                    startActivity(intent);
                } catch (Exception e) {
                    //没有安装第三方的软件会提示
                    Toast toast = Toast.makeText(MainActivity.this, "没有找到打开该文件的应用程序", Toast.LENGTH_SHORT);
                    toast.show();
                }
                break;


        }
    }
}
