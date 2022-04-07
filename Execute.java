package TestApp;

import java.util.*;

import com.zensar.studentmanagement.service.StudentService;
import com.zensar.studentmanagement.service.StudentServiceImpl;

import TestApp.StudentApp;

public class Execute {

	public static void main(String[] args) {

		StudentService service = new StudentServiceImpl();
		int n, cnt = 0;
		Scanner sc = new Scanner(System.in);

		String value = null;
		do {
			System.out.println("Please select below option: ");
			System.out.println("1.Inserting the element: ");
			System.out.println("2.Displaying the elements: ");
			System.out.println("3.Deleting the element: ");
			System.out.println("4.Finding the element: ");
			System.out.println("5.Updating the element: ");

			n = sc.nextInt();

			int id = 0;
			int age = 0;
			String name = null;

			switch (n) {
			case 1:
				System.out.println("Enter id,name,age");

				id = sc.nextInt();
			
				name = sc.next();
				age = sc.nextInt();

				 service.insert(id,name,age);
				System.out.println("Student Registration successful with id!!");
				break;

			case 2:

				service.display();
				break;

			case 3:
				System.out.println("Id you Want to delete: ");
				int newId = sc.nextInt();
				service.delete(newId);
				System.out.println("Student id is successfully deleted");
				break;
			case 4:
				System.out.println("Id want to find: ");
				int newID = sc.nextInt();

				service.findWithId(newID);
				System.out.println("Student id found!");
				
				break;

			case 5:
				System.out.println("Enter the id want to update: ");
				int val = sc.nextInt();
			 service.update(val);
				break;

			}
			System.out.println("Want to continue yes/no");
			value = sc.next();
		} while (value.equalsIgnoreCase("yes"));
	}

}
