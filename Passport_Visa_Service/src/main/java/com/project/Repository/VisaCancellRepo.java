package com.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.project.Model.VisaCancell;

@Repository
public interface VisaCancellRepo extends JpaRepository<VisaCancell, Integer>         {
}
