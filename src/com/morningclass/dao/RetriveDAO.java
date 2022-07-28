package com.morningclass.dao;

import java.util.Set;

import org.hibernate.Session;

import com.morningclass.entity.Department;
import com.morningclass.entity.Student;
import com.morningclass.sessionutil.SessionUtil;

public class RetriveDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = SessionUtil.getSession();
		session.getTransaction().begin();

		Department department = (Department) session.get(Department.class, 1);
		Set<Student> stdSet = department.getStudentSet();
		System.out.println("Department details are...");
		System.out.println("Dno : " + department.getDno());
		System.out.println("Name : " + department.getName());
		System.out.println("Location : " + department.getLocation());

		System.out.println("\nStudent details are... ");
		for (Student student : stdSet) {
			System.out.println("\nsro : " + student.getSro());
			System.out.println("Name : " + student.getName());
			System.out.println("Address : " + student.getAddress());
		}

		session.getTransaction().commit();
		SessionUtil.closeSession(session);
	}

	public static void sop(Object object) {
		System.out.println(object);
	}
}

