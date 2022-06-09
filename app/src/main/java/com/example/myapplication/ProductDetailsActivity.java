package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProductDetailsActivity extends AppCompatActivity {
    private TextView tvcolordetails, tvDescription, tvprice, tvSize, tvtype;
    private ImageView ivPhoto;

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
        Product product = (Product) i.getSerializableExtra("product");

        tvtype.setText(product.getType());
        tvDescription.setText(product.getDescription());
        tvcolordetails.setText(product.getColor());
        tvSize.setText(product.getSize());
        tvprice.setText(product.getprice());
        //Picasso.get().load(product.getPhoto()).into(ivPhoto);

    }

    private void connectComponents() {
        tvcolordetails = findViewById(R.id.tvcolordetails);
        tvDescription = findViewById(R.id.tvDescriptiondetails);
        tvtype = findViewById(R.id.tvtypeditails);
        tvprice = findViewById(R.id.tvpricedetails);
        tvSize = findViewById(R.id.tvSizeoroductDetails);
        ivPhoto = findViewById(R.id.ivPhotoProductRow);
    }
}
