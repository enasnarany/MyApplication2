package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.core.View;

public class MainActivity extends AppCompatActivity {

    private EditText etUsername , etPassword;
    private FirebaseServices fbs;
    private Utilities utils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        connectComponents();

    }
private void connectComponents(){
        etUsername = findViewById(R.id.etUsernameMain);
        etPassword = findViewById(R.id.etPasswordMain);
        //utils = Utilities.getInstance();
        fbs = FirebaseServices.getInstance();
}

public void login (View view) {
    String username = etUsername.getText().toString();
    String password = etPassword.getText().toString();

        /*
        if (username.trim().isEmpty() || password.trim().isEmpty())
        {
            Toast.makeText(this,"Some fields are empty!",Toast.LENGTH_SHORT).show();
            return;
        }
        if (!utils.validateEmail(username)|| !utils.validatePassword(password))

         Toast.makeText(context:this,"Incorrect username or password!",Toast.LENGTH_SHORT).show();

          return;*/

    fbs.getAuth().signInWithEmailAndPassword(username, password)
            .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        Intent i = new Intent(MainActivity.this, AllProductActivity.class);
                        startActivity(i);

                    } else {
                        Toast.makeText(MainActivity.this, R.string.err_incorrect_username_password, Toast.LENGTH_SHORT).show();
                    }
                }
            });
    }

    public void gotoSignup (View view){
        Intent i = new Intent(this, SignupActivity2.class);
        startActivity(i);
    }

    public void gotoAddProducts (View view){
        Intent i = new Intent(this, AddProduct2.class);
        startActivity(i);
    }

    public void gotoAllProducts (View view){
        Intent i = new Intent(this, AllProductActivity.class);
        startActivity(i);
    }
}

