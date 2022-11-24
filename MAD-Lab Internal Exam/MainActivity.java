package com.example.argentinafans;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText e1,e2,e3;
    private CheckBox c1,c2;
    private RadioButton rb1,rb2,rb3,rb4;
    private RadioGroup rgp;
    private Button b;
    String name,place,player,fany,fann;
    int num;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=(EditText) findViewById(R.id.nme);
        e2=(EditText) findViewById(R.id.plc);
        e3=(EditText) findViewById(R.id.plyr);
        c1=(CheckBox) findViewById(R.id.cb1);
        c2=(CheckBox) findViewById(R.id.cb2);
        rgp=(RadioGroup) findViewById(R.id.rg);
        b=(Button) findViewById(R.id.btn);




        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                name=e1.getText().toString().trim();
                place=e2.getText().toString().trim();
                player=e3.getText().toString().trim();
                fany=c1.getText().toString().trim();
                fann=c2.getText().toString().trim();
                num=rgp.getCheckedRadioButtonId();
                if(name.equals("")){
                    Toast.makeText(MainActivity.this,"Enter Name",Toast.LENGTH_SHORT).show();
                }
                else if(place.equals("")){
                  Toast.makeText(MainActivity.this,"Enter Place",Toast.LENGTH_SHORT).show();
                } else if(player.equals("")){
                    Toast.makeText(MainActivity.this,"Enter Player",Toast.LENGTH_SHORT).show();
               }
                else if(fany.equals("") || fann.equals("")){
                    Toast.makeText(MainActivity.this,"Enter Yes or No",Toast.LENGTH_SHORT).show();
                }
                else if(num==-1)
                {
                    Toast.makeText(MainActivity.this,"Enter Jersey Number",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Success",Toast.LENGTH_SHORT).show();

                    Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                    startActivity(intent);
                }

            }
        });









    }
}
