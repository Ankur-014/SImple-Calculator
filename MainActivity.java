package hello.ankur.com.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    EditText e1,e2;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText)findViewById(R.id.editText1);
        e2 = (EditText)findViewById(R.id.editText2);
        t1 = (TextView)findViewById(R.id.textView3);


    }

    public void calculator(View view){
        int num1,num2,result;
        if(view.getId()==R.id.button) {
            num1 = Integer.parseInt(e1.getText().toString());
            num2 = Integer.parseInt(e2.getText().toString());
            result = num1 + num2;
            t1.setText(Integer.toString(result));
        }
        if(view.getId()==R.id.button2){
            num1 = Integer.parseInt(e1.getText().toString());
            num2 = Integer.parseInt(e2.getText().toString());
            result = num1-num2;
            t1.setText(Integer.toString(result));
        }
        if(view.getId()==R.id.button3){
            num1 = Integer.parseInt(e1.getText().toString());
            num2 = Integer.parseInt(e2.getText().toString());
            result = num1*num2;
            t1.setText(Integer.toString(result));
        }
        if(view.getId()==R.id.button4){
            num1 = Integer.parseInt(e1.getText().toString());
            num2 = Integer.parseInt(e2.getText().toString());
            result = num1/num2;
            t1.setText(Integer.toString(result));
        }
    }
}
