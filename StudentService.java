package com.zensar.studentmanagement.service;

import java.util.Map;

import TestApp.StudentApp;

public interface StudentService {

	int insert(int id, String name,int age);

	void display();

	int delete(int id);

	int findWithId(int id);

	int update(int id);

	
}
