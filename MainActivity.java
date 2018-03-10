package com.example.hp.thirdtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
           Button btn;
           TextView txt1;
           TextView txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button)findViewById(R.id.btn);
        txt1 = (EditText)findViewById(R.id.txt1);
        txt2=(TextView)findViewById(R.id.txt2);
        btn.setOnClickListener(new mClick());
    }
    class mClick implements View.OnClickListener{
        public void onClick(View v){
            String passwd;
            passwd=txt1.getText().toString();
            txt2.setText(passwd);
        }

    }
}
