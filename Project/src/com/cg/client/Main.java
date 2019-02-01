package com.cg.client;

import java.util.Scanner;

import com.cg.bean.appointment;
import com.cg.service.HmsService;
import com.cg.service.HmsServiceImp;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.booking");
		System.out.println("2.view");
		int choice = 0;
		try {
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("name");
				scanner.nextLine();
				String name = scanner.nextLine();
				System.out.println("phone");
				long phone = scanner.nextLong();
				scanner.nextLine();
				System.out.println("email");
				String email = scanner.nextLine();
				System.out.println("age");
				int age = scanner.nextInt();
				scanner.nextLine();
				System.out.println("gender");
				String gender = scanner.nextLine();
				System.out.println("problem");
				String problem = scanner.nextLine();

				appointment appoint = new appointment();
				appoint.setName(name);
				appoint.setPhone(phone);
				appoint.setEmail(email);
				appoint.setAge(age);
				appoint.setGender(gender);
				appoint.setProblem(problem);

				HmsService service = new HmsServiceImp();

				boolean flag = service.validate(appoint);
				if (flag) {
					int id =service.insert(appoint);
					System.out.println(id);
				}
				else{
					
				}
				

				break;
			case 2:

				break;

			default:
				break;
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
