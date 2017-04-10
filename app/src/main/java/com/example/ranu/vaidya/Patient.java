package com.example.ranu.vaidya;

/**
 * Created by Ranu on 09-04-2017.
 */

public class Patient {

    private String patientName;
    private String patientPrescription;

    public Patient(String name, String prescription){
        patientName = name;
        patientPrescription = prescription;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientPrescription() {
        return patientPrescription;
    }

    public void setPatientPrescription(String patientPrescription) {
        this.patientPrescription = patientPrescription;
    }
}
