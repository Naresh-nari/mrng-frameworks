package com.morningclass.dao;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import com.morningclass.entity.Department;
import com.morningclass.entity.Student;
import com.morningclass.sessionutil.SessionUtil;

public class CreateDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = SessionUtil.getSession();
		session.getTransaction().begin();
		
		Student student1 =new Student();
		student1.setName("Naresh");
		student1.setAddress("MPL");
		
		Student student2 =new Student();
		student2.setName("Haripriya");
		student2.setAddress("AGL");
		
		Student student3 =new Student();
		student3.setName("Raja");
		student3.setAddress("TPT");
		
		
		Set<Student> stdSet = new HashSet<Student>();
		stdSet.add(student1);
		stdSet.add(student2);
		stdSet.add(student3);
		
		Department department = new Department();
		department.setName("BTECH");
		department.setLocation("MADANAPALLI");
		department.setStudentSet(stdSet);
		session.save(department);
		session.getTransaction().commit();
		SessionUtil.closeSession(session);




	}

}
