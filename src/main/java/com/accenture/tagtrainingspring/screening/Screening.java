package com.accenture.tagtrainingspring.screening;

import java.time.LocalDate;

public class Screening {
   private long screening;
   private int patientId;
   private LocalDate dateOfScreening;
   private boolean malignancy;

    public Screening(long screening, int patientId, LocalDate dateOfScreening, boolean malignancy) {
        this.screening = screening;
        this.patientId = patientId;
        this.dateOfScreening = dateOfScreening;
        this.malignancy = malignancy;
    }

    public long getScreening() {
        return screening;
    }

    public int getPatientId() {
        return patientId;
    }

    public LocalDate getDateOfScreening() {
        return dateOfScreening;
    }

    public boolean isMalignancy() {
        return malignancy;
    }

    public void setScreening(long screening) {
        this.screening = screening;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public void setDateOfScreening(LocalDate  dateOfScreening) {
        this.dateOfScreening = dateOfScreening;
    }

    public void setMalignancy(boolean malignancy) {
        this.malignancy = malignancy;
    }
}
