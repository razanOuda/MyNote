package com.example.mynote;

import android.content.Context;
import android.widget.Toast;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.FirebaseAuth;

import java.text.SimpleDateFormat;

public class Utility {
    static void showToast(Context context, String massage){
        Toast.makeText(context, massage, Toast.LENGTH_SHORT).show();
    }
    static CollectionReference getCollectionReferenceForNote(){
        FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
        return  FirebaseFirestore.getInstance().collection("notes").document(currentUser.getUid()).collection("my_notes");
    }
    static String timestampToString(Timestamp timestamp){
        return new SimpleDateFormat("MM/dd/yyy").format(timestamp.toDate());
    }
}
