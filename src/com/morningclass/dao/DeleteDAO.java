package com.morningclass.dao;

import org.hibernate.Session;

import com.morningclass.entity.Department;
import com.morningclass.sessionutil.SessionUtil;

public class DeleteDAO {

	public static void main(String[] args) {
		Session session = SessionUtil.getSession();
		session.getTransaction().begin();

		Department department = (Department) session.get(Department.class, 1);
		session.delete(department);

		session.getTransaction().commit();
		SessionUtil.closeSession(session);
	}

}
