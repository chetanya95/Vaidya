package com.example.ranu.vaidya;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class AddPrescriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_prescription);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        PatientAndPrescriptionNameFragment patientAndPrescriptionNameFragment = new PatientAndPrescriptionNameFragment();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.prescription_adder_fragment_container, patientAndPrescriptionNameFragment);
        fragmentTransaction.commit();


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
