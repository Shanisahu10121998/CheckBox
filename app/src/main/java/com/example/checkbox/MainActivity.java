package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
CheckBox checkBox1,checkBox2,checkBox3,checkBox4,checkBox5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBox1=findViewById(R.id.checkBox1);
        checkBox2=findViewById(R.id.checkBox2);
        checkBox3=findViewById(R.id.checkBox3);
        checkBox4=findViewById(R.id.checkBox4);
        checkBox5=findViewById(R.id.checkBox5);
        checkBox1.setOnCheckedChangeListener(this);
        checkBox2.setOnCheckedChangeListener(this);
        checkBox3.setOnCheckedChangeListener(this);
        checkBox4.setOnCheckedChangeListener(this);
        checkBox5.setOnCheckedChangeListener(this);


      /*  checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
            onClick();
            }
        });*/
    }


    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        switch (compoundButton.getId())
        {
            case R.id.checkBox1:
                Toast.makeText(this, "1  "+checkBox1.getText(), Toast.LENGTH_SHORT).show();
                break;

            case R.id.checkBox2:
                Toast.makeText(this, "2    "+checkBox2.getText(), Toast.LENGTH_SHORT).show();
                break;
                case R.id.checkBox3:
               Toast.makeText(this, "3   "+checkBox3.getText(), Toast.LENGTH_SHORT).show();
                break;

            case R.id.checkBox4:
                Toast.makeText(this, "4   "+checkBox4.getText(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.checkBox5:
            Toast.makeText(this, "5   "+checkBox5.getText(), Toast.LENGTH_SHORT).show();
            break;

        }

    }


   /* public void onClick(){
        if (checkBox1.isChecked()){
            Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Unclicked", Toast.LENGTH_SHORT).show();
        }
    }*/
}
