package com.covid.vaccination.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.covid.vaccination.models.Vaccination;
import org.springframework.stereotype.Repository;


@Repository
public interface VaccinationRepository extends JpaRepository<Vaccination, Integer> {

}