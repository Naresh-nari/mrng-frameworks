package com.morningclass.entity;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	import org.hibernate.annotations.GenericGenerator;

	@Entity
	@Table(name = "STUDENTUSERELATIOn")
	public class Student {
		@Id
		@GenericGenerator(name = "myGenerator", strategy = "increment")
		@GeneratedValue(strategy=GenerationType.AUTO, generator="myGenerator")
		@Column(name = "SRO")
		private int sro;
		@Column(name = "NAME")
		private String name;
		@Column(name = "ADDRESS")
		private String address;
		public int getSro() {
			return sro;
		}
		public void setSro(int sro) {
			this.sro = sro;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		@Override
		public String toString() {
			return "Student [sro=" + sro + ", name=" + name + ", address=" + address + "]";
		}


	     
		}



