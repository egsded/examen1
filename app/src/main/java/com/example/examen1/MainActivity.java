package com.example.examen1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    int con=1;
    Button btn;
    TextView suma, rando, ganar;
    int rand, sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clickear(View v){
        Random ran = new Random();
        switch (con){
            case 1:
                findViewById(R.id.btn1).setEnabled(false);
                rando = findViewById(R.id.txtran);
                rando.setText(String.valueOf(ran.nextInt(9)+1));
                suma = findViewById(R.id.txtsum);
                sum = Integer.parseInt(String.valueOf(suma.getText()));
                rand = Integer.parseInt(String.valueOf(rando.getText()));
                sum = sum +rand;
                suma.setText(String.valueOf(sum));
                break;
            case 2:
                findViewById(R.id.btn2).setEnabled(false);
                rando = findViewById(R.id.txtran);
                rando.setText(String.valueOf(ran.nextInt(9)+1));
                suma = findViewById(R.id.txtsum);
                sum = Integer.parseInt(String.valueOf(suma.getText()));
                rand = Integer.parseInt(String.valueOf(rando.getText()));
                sum = sum +rand;
                suma.setText(String.valueOf(sum));
                break;
            case 3:
                findViewById(R.id.btn3).setEnabled(false);
                rando = findViewById(R.id.txtran);
                rando.setText(String.valueOf(ran.nextInt(9)+1));
                suma = findViewById(R.id.txtsum);
                sum = Integer.parseInt(String.valueOf(suma.getText()));
                rand = Integer.parseInt(String.valueOf(rando.getText()));
                sum = sum +rand;
                suma.setText(String.valueOf(sum));
                ganar = findViewById(R.id.txtgan);
                if(sum==21){
                    ganar.setText("ya ganaste prro!!");
                    btn = findViewById(R.id.btn4);
                    btn.setEnabled(false);
                    btn = findViewById(R.id.btn5);
                    btn.setEnabled(false);
                }
                else if(sum>21){
                    ganar.setText("ya valio mdr >:v");
                    btn = findViewById(R.id.btn4);
                    btn.setEnabled(false);
                    btn = findViewById(R.id.btn5);
                    btn.setEnabled(false);
                }
                break;
            case 4:
                findViewById(R.id.btn4).setEnabled(false);
                rando = findViewById(R.id.txtran);
                rando.setText(String.valueOf(ran.nextInt(9)+1));
                suma = findViewById(R.id.txtsum);
                sum = Integer.parseInt(String.valueOf(suma.getText()));
                rand = Integer.parseInt(String.valueOf(rando.getText()));
                sum = sum +rand;
                suma.setText(String.valueOf(sum));
                ganar = findViewById(R.id.txtgan);
                if(sum==21){
                    ganar.setText("ya ganaste prro!!");
                    btn = findViewById(R.id.btn5);
                    btn.setEnabled(false);
                }
                else if(sum>21){
                    ganar.setText("ya valio mdr >:v");
                    btn = findViewById(R.id.btn5);
                    btn.setEnabled(false);
                }
                break;
            case 5:
                findViewById(R.id.btn5).setEnabled(false);
                rando = findViewById(R.id.txtran);
                rando.setText(String.valueOf(ran.nextInt(9)+1));
                suma = findViewById(R.id.txtsum);
                sum = Integer.parseInt(String.valueOf(suma.getText()));
                rand = Integer.parseInt(String.valueOf(rando.getText()));
                sum = sum +rand;
                suma.setText(String.valueOf(sum));
                ganar = findViewById(R.id.txtgan);
                if(sum<=21){
                    ganar.setText("ya ganaste prro!!");
                }
                else if(sum>21){
                    ganar.setText("ya valio mdr >:v");
                }
                break;
        }
        con++;
    }
    public void restart(View v){
        btn = findViewById(R.id.btn1);
        btn.setEnabled(true);
        btn = findViewById(R.id.btn2);
        btn.setEnabled(true);
        btn = findViewById(R.id.btn3);
        btn.setEnabled(true);
        btn = findViewById(R.id.btn4);
        btn.setEnabled(true);
        btn = findViewById(R.id.btn5);
        btn.setEnabled(true);
        suma = findViewById(R.id.txtsum);
        suma.setText("0");
        rando = findViewById(R.id.txtran);
        rando.setText("0");
        ganar = findViewById(R.id.txtgan);
        ganar.setText(" ");
        con=1;
    }
}
