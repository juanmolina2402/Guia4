package com.restaurant_bd.guia4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.restaurant_bd.guia4.models.EmployeeModel;
import com.restaurant_bd.guia4.utils.Utils;

import java.util.ArrayList;

public class AddEmployeeActivity extends AppCompatActivity {

    private Button btnAdd;
    private EditText edtName, edtLastName;
    public static ArrayList<EmployeeModel> employee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_employee);
        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        btnAdd = (Button) findViewById(R.id.btnAdd);
        edtName = (EditText) findViewById(R.id.edtName);
        edtLastName = (EditText) findViewById(R.id.edtLastName);
    }

    protected void onStart() {
        super.onStart();
        if(employee == null){
            employee = new ArrayList<>();
        }

        btnAdd.setOnClickListener(v -> {
            if(Utils.verifyEditText(edtName) && Utils.verifyEditText(edtLastName)){
                employee.add(new EmployeeModel(R.drawable.android_kotlin, edtName.getText().toString(), edtLastName.getText().toString()));
                edtName.setText("");
                edtLastName.setText("");
                Toast.makeText(AddEmployeeActivity.this, "Agregado", Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
        edtName.setText("");
        edtLastName.setText("");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        finish();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }
        return true;
    }
}