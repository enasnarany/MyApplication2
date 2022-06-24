package com.example.myapplication;


import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.solver.ArrayLinkedVariables;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.lang.reflect.Array;
import java.util.List;

public class AdapterProduct extends RecyclerView.Adapter<AdapterProduct.ViewHolder> {

    private List<Product> mData;
    private LayoutInflater mInflater;
    private Context context;
    private FirebaseServices fbs;


    private final AdapterProduct.ItemClickListener mClickListener = new ItemClickListener() {
        @Override
        public void onItemClick(View view, int position) {
            Product product = mData.get(position);
            Intent i = new Intent(context, ProductDetailsActivity.class);
            i.putExtra("product", product);
            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(i);
        }

    };

    // data is passed into the constructor
   public AdapterProduct(Context context, List<Product> data) {
        this.mInflater = LayoutInflater.from(context);
        this.mData = data;
        this.context = context;
       this.fbs = FirebaseServices.getInstance();
    }

    // inflates the row layout from xml when needed
    @Override
    public AdapterProduct.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.row, parent, false);
        return new AdapterProduct.ViewHolder(view);
    }

    // binds the data to the TextView in each row
    @Override
    public void onBindViewHolder(AdapterProduct.ViewHolder holder, int position) {
        Product rest = mData.get(position);
        holder.tvName.setText(rest.getName());
        //holder.ivPhoto.setImageDrawable(product.getPhoto());
        //Picasso.get().load(rest.getPhoto()).into(holder.ivPhoto);
    }


    // total number of rows
    @Override
    public int getItemCount() {
        return mData.size();
    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tvName;
        ImageView ivPhoto;

        ViewHolder(View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvNameProductRow);
            ivPhoto = itemView.findViewById(R.id.ivPhotoProductRow);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }
    }

    // parent activity will implement this method to respond to click events
    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }

}

