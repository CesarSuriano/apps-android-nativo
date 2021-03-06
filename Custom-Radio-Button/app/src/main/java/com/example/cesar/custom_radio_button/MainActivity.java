package com.example.cesar.custom_radio_button;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup1 = (RadioGroup) findViewById(R.id.radioGroup1);

        // Checked change Listener for RadioGroup 1
        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                switch (checkedId)
                {
                    case R.id.radioAndroid:
                        Toast.makeText(getApplicationContext(), "Android RadioButton checked", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioiPhone:
                        Toast.makeText(getApplicationContext(), "iPhone RadioButton checked", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioWindows:
                        Toast.makeText(getApplicationContext(), "windows RadioButton checked", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
            }
        });
    }
}
