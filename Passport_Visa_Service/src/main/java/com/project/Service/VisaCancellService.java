package com.project.Service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.project.Model.VisaCancell;
import com.project.Repository.VisaCancellRepo;

@Service
public class VisaCancellService {
	@Autowired
	VisaCancellRepo repo;
	
	public VisaCancell addVisaCancell(VisaCancell v1) {
		return repo.save(v1);
	}

}
