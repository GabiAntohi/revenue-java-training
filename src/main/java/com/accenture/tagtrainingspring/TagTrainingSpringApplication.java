package com.accenture.tagtrainingspring;

import com.accenture.tagtrainingspring.patient.Gender;
import com.accenture.tagtrainingspring.patient.Patient;
import com.accenture.tagtrainingspring.screening.Screening;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@SpringBootApplication
public class TagTrainingSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TagTrainingSpringApplication.class, args);

		Patient patient = new Patient("John",11, LocalDate.of(2016, 1, 8), Gender.MALE);
		Screening screening = new Screening(12, 11, LocalDate.of(2020, 1, 8), true);

		patient.setName("Andrew");

		if (patient.getId() == screening.getPatientId()){
			printResults(patient.getName(), screening.isMalignancy(), patient.getDob(), screening.getDateOfScreening());
		}
	}

	public static void printResults(String name, boolean malignancy, LocalDate dob, LocalDate dateOfScreening){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMM yyyy");
		System.out.println(name + " was born on " + dob.format(formatter) + " and " + dateOfScreening.format(formatter) +  " is the date of screening.");
		System.out.println(name + " has a malignancy diagnosis of " + malignancy + ".");
	};


}
