package com.cybersociety.elibraryucoz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);
        getSupportActionBar().hide();
        Thread thread=new Thread(){
            public void run(){
                try {
                    sleep(2000);

                }catch (Exception e){
                    e.printStackTrace();
                }
                finally {
                    Intent intent=new Intent(splashscreen.this, Books_Selecter.class);
                    startActivity(intent);
                    finish();
                }
            }
        };thread.start();

    }
}

















//        setContentView(R.layout.activity_main);
////        setContentView(R.layout.activity_main);
////        TextView txt=findViewById(R.id.txtlnk);
////      //  TextView txt2=findViewById(R.id.txtlnk2);
////      //  txt2.setMovementMethod(LinkMovementMethod.getInstance());
////       txt.setMovementMethod(LinkMovementMethod.getInstance());