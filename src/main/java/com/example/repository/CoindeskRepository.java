package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Coindesk;

public interface CoindeskRepository extends JpaRepository<Coindesk, Long> {

}
