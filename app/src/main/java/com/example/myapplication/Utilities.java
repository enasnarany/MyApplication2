package com.example.myapplication;

import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

enum ErrorCodes
{
    IncorrectAuth, FieldsEmpty, True, False
}
enum ProductCat
{oriental,fast,Sushi,Thai,Chinese,}


public class Utilities {
    private static Utilities instance;
    private int id;
    private String name;

    public Utilities() {
    }

    public Utilities getInstance() {
        if (instance == null) {
            instance = new Utilities();
        }

        return instance;
    }
}

