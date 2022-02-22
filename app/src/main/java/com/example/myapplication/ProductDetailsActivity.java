package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProductDetailsActivity extends AppCompatActivity {
    private TextView tvName, tvDescription, tvAddress, tvCategory, tvPhone;
    private ImageView ivPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_product);
    }


    /*
        private String address;
    private RestCat category;
    private String photo;
    private String phone;
    * */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_product);

        connectComponents();
        Intent i = this.getIntent();
        Product = (Product) i.getSerializableExtra("rest");

        tvName.setText(Product.getName());
        tvDescription.setText(Product.getDescription());
        tvAddress.setText(Product.getAddress());
        tvCategory.setText(Product.getCategory().toString());
        tvPhone.setText(Product.getPhone());
        Picasso.get().load(Product.getPhoto()).into(ivPhoto);
    }

    private void connectComponents() {
        tvName = findViewById(R.id.tvNameRestDetails);
        tvDescription = findViewById(R.id.tvDescriptionRestDetails);
        tvAddress = findViewById(R.id.tvAddressRestDetails);
        tvCategory = findViewById(R.id.tvCategoryRestDetails);
        tvPhone = findViewById(R.id.tvPhoneRestDetails);
        ivPhoto = findViewById(R.id.ivPhotoProductRow);
    }
}
