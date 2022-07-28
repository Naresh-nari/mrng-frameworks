package com.morningclass.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name = "DEPT")
public class Department {
	@Id
	@GenericGenerator(name = "myGenerator", strategy = "increment")
	@GeneratedValue(strategy=GenerationType.AUTO, generator="myGenerator")
	@Column(name = "DNO")
	private int dno;
	@Column(name = "NAME")
	private String name;
	@Column(name = "LOC")
	private String location;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "S_DNO", referencedColumnName = "DNO")
	private Set<Student> studentSet;
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Set<Student> getStudentSet() {
		return studentSet;
	}
	public void setStudentSet(Set<Student> studentSet) {
		this.studentSet = studentSet;
	}
	@Override
	public String toString() {
		return "Department [dno=" + dno + ", name=" + name + ", location=" + location + ", studentSet=" + studentSet
				+ "]";
	}


}