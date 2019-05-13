package com.example.david.functionsolver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private double a_value;
    private double b_value;
    private double c_value;
    EditText editTextA;
    EditText editTextB;
    EditText editTextC;
    TextView x1TextView;
    TextView x2TextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        x1TextView = findViewById(R.id.x1_value_textView);
        x2TextView = findViewById(R.id.x2_value_textView);
        editTextA = findViewById(R.id.a_ValueEditText);
        editTextA.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }
            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.length() != 0)
                    a_value = Double.parseDouble(editable.toString());
                else {
                    a_value = 0;
                }
                setNewValues();
            }
        });
        editTextB = findViewById(R.id.b_ValueEditText);
        editTextB.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.length() != 0)
                    b_value = Double.parseDouble(editable.toString());
                else {
                    b_value = 0;
                }
                setNewValues();

            }
        });
        editTextC = findViewById(R.id.c_ValueEditText);
        editTextC.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.length() != 0)
                    c_value = Double.parseDouble(editable.toString());
                else {
                    c_value = 0;
                }
                setNewValues();

            }
        });
    }
    private void setNewValues() {
        double determinant = Math.pow(b_value,2) - 4*a_value*c_value;
        String x1 , x2;
        if(determinant > 0){
            double temp1 = -b_value/(2*a_value);
            double temp2 = Math.sqrt(determinant)/(2*a_value);
            x1 = String.valueOf((temp1+temp2));
            x2 = String.valueOf(temp1-temp2);
        }else if (determinant == 0){
            x1 = String.valueOf(-b_value/(2*a_value));
            x2 = x1;

        }
        else{
            double temp1 =  -b_value/(2*a_value);
            double temp2 =  Math.sqrt(-determinant)/(2*a_value);
            x1 =  String.valueOf(temp1) + "+i" +
                    String.valueOf(temp2);

            x2 =  String.valueOf(temp1) + "-i" +
                    String.valueOf(temp2);
        }

        x1TextView.setText(x1);
        x2TextView.setText(x2);

    }




}
