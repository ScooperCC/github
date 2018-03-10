package com.example.hp.calculator;

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
    TextView TextView1;
    TextView TextView2;
    TextView TextView3;
    TextView editTxt1;
    TextView editTxt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.btn);
        editTxt1=(EditText)findViewById(R.id.editTxt1);
        editTxt2=(EditText)findViewById(R.id.editTxt2);
        TextView1=(TextView)findViewById(R.id.TextView1);
        TextView2=(TextView)findViewById(R.id.TextView2);
        TextView3=(TextView)findViewById(R.id.TextView3);
        btn.setOnClickListener(new mClick());
    }
    class mClick implements View.OnClickListener{
        public void onClick(View v){
            String a;
            String b;
            Double c;
            //此处是通过a.b收集两个文本框所输入的内容
            a = editTxt1.getText().toString();
            b = editTxt2.getText().toString();
            //因为要用到数字计算而简单的string相加只能将两个数字通过前后排列在一起所以要将string改为double
            Double value1 = Double.parseDouble(a);
            Double value2 = Double.parseDouble(b);
            c = value1 + value2;
            //此处又将double改为string因为在文本框中显示的内容要为string格式
            String str = String.valueOf(c);
            TextView3.setText(str);
        }
    }
}
