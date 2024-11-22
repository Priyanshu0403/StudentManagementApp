package com.student.manage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {

	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("Press 1 to ADD Student");
			System.out.println("Press 2 to DELETE student");
			System.out.println("Press 3 to DISPLAY student");
			System.out.println("Press 4 to Exit");
			int c = Integer.parseInt(br.readLine());
			
			if(c==1) {
				System.out.println("Enter User Name :");
				String name = br.readLine();
				
				System.out.println("Enter User Phone :");
				String phone = br.readLine();
				
				System.out.println("Enter User city :");
				String city = br.readLine();
				
				Student st1 = new Student( name, phone , city);
				System.out.println(st1);

			}else if(c==2){
				
			}else if(c==3) {
				
			}else if(c==4) {
				break;
			}else {
				
			}
		}
		System.out.println("Thanks for using out application ");

	}

}
