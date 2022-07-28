package com.morningclass.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.mapping.Set;

import com.morningclass.entity.Department;
import com.morningclass.entity.Student;
import com.morningclass.sessionutil.SessionUtil;

public class UpdateDAO {

	public static void main(String[] args) {
		Session session = SessionUtil.getSession();
		session.getTransaction().begin();

		Department department = (Department) session.get(Department.class, 1);
		department.setName("BSC");
		Set stdSet = (Set) department.getStudentSet();
		Iterator<Student> iterator = ((java.util.Set<Student>) stdSet).iterator();
		while (iterator.hasNext()) {
			Student student = iterator.next();
			if (student.getAddress() == "MPL") {
				student.setAddress(student.getAddress() + "517325");
			}
		}

		session.getTransaction().commit();
		SessionUtil.closeSession(session);
	}

}
