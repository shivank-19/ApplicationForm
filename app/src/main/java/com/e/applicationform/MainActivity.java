package com.e.applicationform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    EditText name,fname,mname,add,mob,dob,mail, marks;
    Spinner spinner;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        fname = findViewById(R.id.fname);
        mname = findViewById(R.id.mname);
        add = findViewById(R.id.add);
        mob = findViewById(R.id.mob);
        dob = findViewById(R.id.dob);
        mail = findViewById(R.id.mail);
        marks = findViewById(R.id.marks);
        spinner = findViewById(R.id.spinner);
        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String sName = name.getText().toString();
                String father = name.getText().toString();
                String mother = name.getText().toString();
                String address = name.getText().toString();
                String mobile = name.getText().toString();
                String date = name.getText().toString();
                String email = name.getText().toString();
                String mark = name.getText().toString();
                String spin = name.getText().toString();
                if (sName.equals("")||father.equals("")||mother.equals("")||address.equals("")||mobile.equals("")||date.equals("")||email.equals("")||mark.equals("")||spin.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Please Fill All Fields", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Your Data Saved Successfully", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
