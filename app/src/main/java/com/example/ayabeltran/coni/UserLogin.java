package com.example.ayabeltran.coni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UserLogin extends AppCompatActivity {

    Button btnLogin;
    EditText txtusername, txtpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);

        btnLogin = findViewById(R.id.btn_login);
        txtusername = findViewById(R.id.usernamelogin);
        txtpassword = findViewById(R.id.passwordlogin);

        //Calling Database Connection Class

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Reading User Input
                    //code here


                //Database Code
            }
        });


    }
}
