package com.example.sample.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sample.Table.employee;

public interface repository extends JpaRepository<employee,Integer>{

}
