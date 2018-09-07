package com.example.quizuno.textbox;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatDialogFragment;

import java.util.Observable;
import java.util.Observer;


public class DialogoColor extends AppCompatDialogFragment{

    //observable
    //2. crear objeto como variable global
    MiListener listener;

    //1. crear interface
    interface MiListener{
        void onChangeColor(String color);
    }


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("cambiar color");
        builder.setMessage("seleccionar color");
        builder.setPositiveButton("Blanco", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                listener.onChangeColor("Blanco");

            }
        });
        builder.setNeutralButton("Azul", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                listener.onChangeColor("Azul");

            }
        });
        builder.setNegativeButton("Negro", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                listener.onChangeColor("Negro");

            }
        });
        return builder.create();
    }

    //3. metodo de set para el listener
    public void setListener(MiListener listener){
        this.listener = listener;
    }


}
