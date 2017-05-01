package com.example.inaldojunior.cfinance.config;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Inaldo Junior on 25/04/2017.
 */

public final class ConfiguracaoFirebase {

    private static DatabaseReference referenciaFirebase;
    private static FirebaseAuth autenticacao;

    public static DatabaseReference getFirebase(){
        referenciaFirebase = FirebaseDatabase.getInstance().getReference();

        if (referenciaFirebase == null ){

        }

        return referenciaFirebase;

    }
    public static FirebaseAuth getFirebaseAutenticacao(){

        if (autenticacao == null){
            autenticacao = FirebaseAuth.getInstance();

        }
        return autenticacao;
    }
}
