package com.example.myapplication;

    public class FirebaseServices {
        private static FirebaseServices instance;
        private FirebaseServices auth;
        private FirebaseServices firestore;
        private FirebaseServices storage;

        public FirebaseServices getAuth() {
            return auth;
        }

        public FirebaseServices getFirestore() {
            return firestore;
        }

        public FirebaseServices getStorage() {
            return storage;
        }

        public FirebaseServices() {
            auth = FirebaseServices.getInstance();
            firestore = FirebaseServices.getInstance();
            storage = FirebaseServices.getInstance();
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


