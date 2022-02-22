package com.example.myapplication;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;
import com.google.firebase.storage.FirebaseStorage;

public class FirebaseServices {
        private static FirebaseServices instance;
        private FirebaseAuth auth;
        private FirebaseFirestore firestore;
        private FirebaseStorage storage;

        public FirebaseServices getAuth() {
            return instance;
        }

        public FirebaseFirestore getFirestore() {
            return firestore;
        }

        public FirebaseStorage getStorage() {
            return storage;
        }

        public FirebaseServices() {
            auth = FirebaseAuth.getInstance();
            firestore = FirebaseFirestore.getInstance();
            storage = FirebaseStorage.getInstance();
        }

        public static FirebaseServices getInstance() {
            if (instance == null)
            {
                instance = new FirebaseServices();
            }

            return instance;
        }

        public AddProduct collection(String products) {
            return null;
        }
    }




