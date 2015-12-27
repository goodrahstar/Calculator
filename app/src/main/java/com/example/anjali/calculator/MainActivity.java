package com.example.anjali.calculator;
// working with 22 sdk
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view){
        EditText t1 = (EditText)findViewById(R.id.editText);
        EditText t2 = (EditText) findViewById(R.id.editText2);

        TextView textView = (TextView) findViewById(R.id.result);

        Boolean flag = false;
        Double num1, num2, answer=0.0;
        num1 = Double.parseDouble(t1.getText().toString());
        num2 = Double.parseDouble(t2.getText().toString());


        switch (view.getId()) {
            case R.id.button:
                answer = num1 + num2;
                textView.setText(answer + "");
                break;
            case R.id.button2:
                    answer = num1 - num2;
                textView.setText(answer + "");
                break;
            case R.id.button4:
                    if (num1 != 0)
                        flag = true;
                answer = num1 * num2;
                textView.setText(answer + "");
                break;

            case R.id.button3:
                    if (num1 == 0)
                        flag = true;
                answer = num1 / num2;
                textView.setText(answer + "");
                break;
            default:
                break;
        }

    }
}
