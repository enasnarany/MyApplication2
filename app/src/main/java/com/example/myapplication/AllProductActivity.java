package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;

class AllProductActivity extends AppCompatActivity {

    private RecyclerView rvAllProduct;
    AdapterProduct adapter;
    FirebaseServices fbs;
    ArrayList<Product> products;
    MyCallback myCallback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_product);

        fbs = FirebaseServices.getInstance();
        products = new ArrayList<Product>();
        readData();
        myCallback = new MyCallback() {
            @Override
            public void onCallback(List<Product> attractionsList) {
                // set up the RecyclerView
                RecyclerView recyclerView = findViewById(R.id.tvNameProductRow);
                recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                adapter = new AdapterProduct(getApplicationContext(), products);
                recyclerView.setAdapter(adapter);
            }
        };


        ActionBar actionBar = getSupportActionBar();

        actionBar.setTitle("productActivity");
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            //case R.id.miSearch:
            // User chose the "Settings" item, show the app settings UI...
            //return true;

            case R.id.profile:
                // User chose the "Favorite" action, mark the current item
                // as a favorite...
                return true;

            case R.id.misitting:

                return true;

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);

        }
    }

    private void readData() {
        fbs.getFirestore().collection("products")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {
                                products.add(document.toObject(Product.class));
                            }

                            myCallback.onCallback(products);
                        } else {
                            Log.e("AllActivity: readData()", "Error getting documents.", task.getException());
                        }

                    }
                });

    }


    }



