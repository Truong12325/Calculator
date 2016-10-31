package com.example.tuanan.lab11;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {

    Button btnNhap,btnThoat;
    EditText edtNhap;
    TextView txtKetQua;
    String inputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNhap = (Button)findViewById(R.id.btnNhap);
        btnThoat = (Button)findViewById(R.id.btnThoat);
        edtNhap = (EditText)findViewById(R.id.edtNhap);
        txtKetQua =(TextView)findViewById(R.id.txtKetQua);

        btnNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText = edtNhap.getText().toString();
                StringTokenizer strToken = new StringTokenizer(inputText, " ,\t,\r");
                int Max, i = 1, lengthStr;
                Max = strToken.nextToken().length();
                int viTriMax = i;
                while (strToken.hasMoreTokens()) {
                    lengthStr = strToken.nextToken().length();
                    i++;
                    if (Max < lengthStr) {
                        Max = lengthStr;
                        viTriMax = i;
                    }
                }
                txtKetQua.setText("Dộ dài chuỗi lớn nhất là: " + Max + " ở vị trí "
                        + viTriMax);
            }
        });
        btnThoat.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });


    }

}
