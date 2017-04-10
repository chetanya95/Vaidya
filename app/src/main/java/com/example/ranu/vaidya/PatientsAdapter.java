package com.example.ranu.vaidya;

import android.media.Image;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Ranu on 10-04-2017.
 */

public class PatientsAdapter extends RecyclerView.Adapter<PatientsAdapter.MyViewHolder>{


    private List<Patient> patientsList;

    public PatientsAdapter(List<Patient> patientList){
        this.patientsList = patientList;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView nameView, prescriptionView;
        public ImageView imageView;

        public MyViewHolder(final View view){
            super(view);
            nameView = (TextView) view.findViewById(R.id.patient_name);
            prescriptionView = (TextView) view.findViewById(R.id.patient_perscription);
            imageView = (ImageView) view.findViewById(R.id.patient_image);

            view.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v) {
                    Patient currentPatient = patientsList.get(getAdapterPosition()); //getAdapterPosition is a final method of this MyViewHolder class
                    Snackbar snackbar = Snackbar.make(view, currentPatient.getPatientName() + " clicked", Snackbar.LENGTH_LONG);
                    snackbar.show();
                }
            });

        }

    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.patient_list_row, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Patient patient = patientsList.get(position);
        holder.imageView.setImageResource(R.drawable.mr_bean);
        holder.nameView.setText(patient.getPatientName());
        holder.prescriptionView.setText(patient.getPatientPrescription());


    }

    @Override
    public int getItemCount() {
        return patientsList.size();
    }

}
