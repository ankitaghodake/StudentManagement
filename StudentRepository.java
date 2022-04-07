package com.zensar.studentApp.repo;

import java.util.Map;

import TestApp.StudentApp;

public interface StudentRepository {
	int insert(StudentApp arr);

	void display();

	int delete(int id);

	int findWithId(int id);

	int update(int id);

	

	
}
