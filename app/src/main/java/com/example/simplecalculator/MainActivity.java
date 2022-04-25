package com.example.simplecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText e1, e2;
    TextView t1;
    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean getNumbers()
    {
        e1 = findViewById(R.id.num1);
        e2 = findViewById(R.id.num2);

        t1 = findViewById(R.id.result);

        String s1 = e1.getText().toString();
        String s2 = e2.getText().toString();

        if(s1.equals("") || s2.equals(""))
        {
            String result = "You have not entered a value !";
            t1.setText(result);
            return false;
        }

        else
        {
            num1 = Integer.parseInt(s1);
            num2 = Integer.parseInt(s2);
        }
        return true;
    }

    public void Sum(View view)
    {
        if(getNumbers())
        {
            int sum = num1 + num2;
            t1.setText(Integer.toString(sum));
        }
    }

    public void Sub(View view)
    {
        if(getNumbers())
        {
            int sub = num1 - num2;
            t1.setText(Integer.toString(sub));
        }
    }

    public void Div(View view)
    {
        if(getNumbers())
        {
            double div = num1/num2;
            t1.setText(Double.toString(div));
        }
    }

    public void Mul(View view)
    {
        if(getNumbers())
        {
            int mul = num1*num2;
            t1.setText(Integer.toString(mul));
        }
    }

    public void Mod(View view)
    {
        if(getNumbers())
        {
            int mod = num1 % num2;
            t1.setText(Integer.toString(mod));
        }
    }
    public void Pow(View view)
    {
        if(getNumbers())
        {
            double pow = Math.pow(num1,num2);
            t1.setText(Double.toString(pow));
        }
    }
}
