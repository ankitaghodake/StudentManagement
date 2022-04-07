package com.zensar.studentApp.repo;

import TestApp.NotFoundException;
import TestApp.StudentApp;

public class StudentRepo implements StudentRepository {
	StudentApp[] arr = new StudentApp[2];
	int cnt = 0;

	public int insert(StudentApp arr) {

		this.arr[cnt++] = arr;
		return arr.getId();
	}

	@Override
	public void display() {
		
	
	}

	@Override
	public int delete(int id) {
		for (int i = 0; i < arr.length; i++) {
			if (id == arr[i].id) {
				for (int j = i; j < arr.length - 1; j++) {
					arr[j] = null;
				}
				break;
			} else {
				try {
					throw new NotFoundException();
				} catch (NotFoundException e) {
					// TODO Auto-generated catch block
					System.out.println("Id not found");
				}
			}
		}
		return id;
	}

	@Override
	public int findWithId(int id) {
		for (int i = 0; i < arr.length; i++) {

			if (id == arr[i].id) {
				System.out.println("ID found");
				break;
			}else{
				System.out.println("Id not found");
			}
		}
		
		return id;
	}

	@Override
	public int update(int id) {
		for (int i = 0; i < arr.length; i++) {

			if (id == arr[i].id) {
				arr[i].id = 100;
				arr[i].name = "Pearl";
				arr[i].age = 27;
			
			}
		}
		return id;
	}

	
}
