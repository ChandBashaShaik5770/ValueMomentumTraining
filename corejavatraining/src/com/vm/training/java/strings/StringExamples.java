package com.vm.training.java.strings;

public class StringExamples 
{
	public static void main(String[] args) {
	
		
		String s="We are comparing the content with a StringBuffer content";
        StringBuffer sb1 =
                new StringBuffer("We are comparing the content with a StringBuffer content");
        System.out.println(sb1.capacity());
        //System.out.println(sb1.append(s));
        
        if(s.contentEquals(sb1))
        {
        	System.out.println("Equal");
        }
        else
        {
        	System.out.println("Not Equal");
        }
        sb1=sb1.reverse();
        System.out.println(sb1);
        System.out.println(s.lastIndexOf('t'));
        System.out.println(s.startsWith("are"));
        System.out.println(s.startsWith("We"));
        String c[]=s.split(" ");
        for(String i:c)
        {
        	System.out.println(i);
        	
        }
        s=s.replace("are", "the");
        System.out.println(s);
        s=s.replaceAll("o", "a");
        
        System.out.println(s); 
        System.out.println("-------------------"); 
        s=s.replace("the", "are");
        System.out.println(s);
       
        
        System.out.println(s);
        s=s.repeat(2);
        System.out.println(s);
        sb1=sb1.reverse();
        System.out.println(sb1.append(sb1, 0, 16));
        System.out.println(sb1.length());
        System.out.println(sb1.delete(56, 72));
        System.out.println(sb1.capacity());
        System.out.println(sb1.insert(56, 10));
       // StringBuilder sbr=
	}

}
