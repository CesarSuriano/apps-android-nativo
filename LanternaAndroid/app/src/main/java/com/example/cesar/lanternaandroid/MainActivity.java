package com.example.cesar.lanternaandroid;

import android.graphics.Color;
import android.hardware.Camera;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.noob.lumberjack.LogLevel;
import com.noob.noobcameraflash.managers.NoobCameraManager;

public class MainActivity extends AppCompatActivity {

    private int validador = 0;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);

        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final RelativeLayout activityMain = (RelativeLayout)findViewById(R.id.activity_main);
        //ThemeUtils.onActivityCreateSetTheme(this)



        final Window window = this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

        final Camera cam = Camera.open();
        final Camera.Parameters p = cam.getParameters();
        p.setFlashMode(Camera.Parameters.FLASH_MODE_TORCH);

        //
//
//

        final Button botao = (Button)findViewById(R.id.botao);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //if(cam.getParameters() == null){
                if (validador == 0){
                    toolbar.setBackgroundColor(getResources().getColor(R.color.colorPrimaryLight));
                    activityMain.setBackgroundColor(Color.parseColor("#d5d5d5"));
                    window.setStatusBarColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryDarkLight));
                    botao.setBackground(getResources().getDrawable(R.drawable.circle_light));
                    botao.setText("Desligar");
                    cam.setParameters(p);
                    cam.startPreview();
                    validador = 1;
                }else{
                    toolbar.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                    activityMain.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDarkDark));
                    window.setStatusBarColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryDarkDark));
                    botao.setBackground(getResources().getDrawable(R.drawable.circle_dark));
                    botao.setText("Ligar");
                    cam.stopPreview();
                    validador = 0;
                }


//                }else{
//                    cam.stopPreview();
//                    toolbar.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
//                    window.setStatusBarColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryDarkDark));
//                }

            }
        });

    }
}
