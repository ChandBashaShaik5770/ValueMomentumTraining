package com.vm.session.testjune1st;

import java.util.Scanner;

public class StringProgram 
{
	public static void main(String[] args) {
        String str;
        Scanner scanner=new Scanner(System.in);
        //System.out.println("Enter String : ");
        str="Hello welcome to india";
 
        int count = 1;
 
       // System.out.println(str.length());
        for (int i=0;i<str.length()-1;i++)
        {
            if ((str.charAt(i)==' ') && (str.charAt(i + 1)!=' '))
            {
                count++;
            }
        }
        System.out.println("Number of words in a string : "+count);
        int c=0;
        for(int i=0;i<str.length();i++) {    
            if(str.charAt(i)!=' ')    
                c++;    
        }    
            
          
        System.out.println("Total number of characters in a string: "+c);    
    }    
    

}
