
package com.vm.session.bean;

public class Passenger implements Comparable<Passenger>
{
		
		private String name;
		 private int age ;
		 private char gender;
		 
		 
		 public Passenger() {
				super();
			}
		 
		 
		 public Passenger(String name, int age, char gender) {
				super();
				this.name = name;
				this.age = age;
				this.gender = gender;
			}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public int getAge() {
			return age;
		}


		public void setAge(int age) {
			this.age = age;
		}


		public char getGender() {
			return gender;
		}


		public void setGender(char gender) {
			this.gender = gender;
		}


		@Override
		public String toString() {
			return "Passenger [name=" + name + ", age=" + age + ", gender=" + gender + "]";
		}


		@Override
		public int compareTo(Passenger o) {
			// TODO Auto-generated method stub
			if(this.getAge()>o.getAge())
			{
				return 1;
			}
			else {
				return -1;
			}
		}
}