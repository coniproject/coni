package com.example.ayabeltran.coni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class UserRegistration extends AppCompatActivity {

    Button btnregister;
    EditText txtlastname,
            txtfirstname,
            txtinitial,
            txtbday,
            txtage;
    RadioButton rdbMale, rdbFemale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_registration);

        txtlastname = findViewById(R.id.childlname);
        txtfirstname = findViewById(R.id.childfname);
        txtinitial = findViewById(R.id.childmi);
    }


}
