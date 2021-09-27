package com.restaurant_bd.guia4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnAddEmployee, btnLstEmployees;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAddEmployee = findViewById(R.id.btnAddEmployee);
        btnLstEmployees = findViewById(R.id.btnLstEmployees);
    }

    protected void onStart(){
        super.onStart();
        btnAddEmployee.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, AddEmployeeActivity.class));
        });

        btnLstEmployees.setOnClickListener(v -> {
            if(AddEmployeeActivity.employee==null){
                Toast.makeText(this, "Lista Vacía", Toast.LENGTH_LONG).show();
            }else {
                startActivity(new Intent(MainActivity.this, ListEmployeesActivity.class));
            }
        });
    }


    //Ver datos
    public void mostrarDatos(View view){
        startActivity(new Intent(MainActivity.this, MostrarActivity.class));

    }
}