package com.acme.csci3130;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Reference: https://developer.android.com/reference/android/widget/Button.html
        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                EditText edit = (EditText) findViewById(R.id.inputText);
                TextView view = (TextView) findViewById(R.id.inputView);

                view.setText(edit.getText().toString());
            }
        });
    }
}
