package com.vm.session.testjune1st;

public class NullPointerException1 extends Exception
{
	String fullname;
		
		public NullPointerException1(String fullname) {
			super();
			this.fullname = fullname;
			
		}

		@Override
		public String toString() {
			return "NullPonterException1 " + fullname + "]";
		}
		
		
		
}
	


