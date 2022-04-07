package com.zensar.studentmanagement.service;

import java.util.Map;
import java.util.Scanner;

import com.zensar.studentApp.repo.StudentCollectionRepo;
import com.zensar.studentApp.repo.StudentDbRepo;
import com.zensar.studentApp.repo.StudentRepo;
import com.zensar.studentApp.repo.StudentRepository;

import TestApp.NotFoundException;
import TestApp.StudentApp;

public class StudentServiceImpl implements StudentService {
	
	int cnt = 0;
	Scanner sc = new Scanner(System.in);
	StudentRepository studentRepository= new StudentDbRepo();
	

	@Override
	public int insert(int id, String name, int age) {
		StudentApp student=new StudentApp(id,name,age);
		studentRepository.insert(student);
		return id;
	}

	@Override
	public void display() {
		 studentRepository.display();
		
	}

	public int delete(int id) {
		
		return studentRepository.delete(id);
	}

	@Override
	public int findWithId(int id) {
		return studentRepository.findWithId(id);

	}

	public int update(int id) {
		
		return studentRepository.update(id);
	}

}
