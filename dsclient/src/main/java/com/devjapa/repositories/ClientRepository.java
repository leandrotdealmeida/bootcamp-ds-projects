package com.devjapa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devjapa.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}