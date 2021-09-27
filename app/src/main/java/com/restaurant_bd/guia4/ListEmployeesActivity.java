package com.restaurant_bd.guia4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.restaurant_bd.guia4.adapters.EmployeeAdapter;
import com.restaurant_bd.guia4.models.EmployeeModel;

import java.util.ArrayList;
import java.util.List;

public class ListEmployeesActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    EmployeeAdapter employeesAdapter;

    public List<EmployeeModel> lstEmployees;
    LinearLayoutManager linearLayoutManager;
    ArrayList<EmployeeModel> lst = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_employee);

        if(AddEmployeeActivity.employee != null){
            for (EmployeeModel item: AddEmployeeActivity.employee){
                EmployeeModel emplo = new EmployeeModel(R.drawable.android_kotlin, item.getName(), item.getLastName());
                lst.add(emplo);
            }
        }
        setRecyclerView(lst);
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        recyclerView.clearOnScrollListeners();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
    private void setRecyclerView(ArrayList<EmployeeModel> lstEmployees) {
        recyclerView = findViewById(R.id.rvEmployees);
        linearLayoutManager = new LinearLayoutManager(ListEmployeesActivity.this, RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        employeesAdapter = new EmployeeAdapter(lstEmployees);
        recyclerView.setAdapter(employeesAdapter);
    }
}