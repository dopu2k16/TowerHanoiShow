package com.hanoi;

/**
*
* @author Mitodru
*/

import java.io.*;
import java.util.*;

public class HanoiShow{
	static BufferedReader inf;		
	static Stack<Integer> s1,s2,s3;
	static int tn=0,n=0;
	
	static public void displey(){
		int i,j,k;
		Integer m;
		for(i=n;i>0;i--){
			try{
				m=(Integer)s1.elementAt(i-1);
				k=m.intValue();
			
			}
			catch(ArrayIndexOutOfBoundsException e){
				k=0;
			}
			if(k==-1)k=0;
			for(j=0;j<n-k;j++)System.out.print(" ");
			for(j=0;j<2*k;j++)System.out.print(""+(char)219);
			for(j=0;j<n-k;j++)System.out.print(" ");
			System.out.print("   ");
			
			
		
			try{
				m=(Integer)s2.elementAt(i-1);
				k=m.intValue();
			}
			catch(ArrayIndexOutOfBoundsException e){
				k=0;
			}
			if(k==-1)k=0;
			for(j=0;j<n-k;j++)System.out.print(" ");
			for(j=0;j<2*k;j++)System.out.print(""+(char)219);
			for(j=0;j<n-k;j++)System.out.print(" ");
			System.out.print("   ");
			
		
			try{
				m=(Integer)s3.elementAt(i-1);
				k=m.intValue();
			}
			catch(ArrayIndexOutOfBoundsException e){
				k=0;
			}
			if(k==-1)k=0;
			for(j=0;j<n-k;j++)System.out.print(" ");
			for(j=0;j<2*k;j++)System.out.print(""+(char)219);
			for(j=0;j<n-k;j++)System.out.print(" ");
			System.out.print("   ");
			System.out.println("");
		}
					//try{inf.readLine();}catch(IOException e){System.exit(1);}
					try{Thread.sleep(500);}catch(InterruptedException e){System.exit(1);}
					System.out.println("\n");

	}
	
	
	static public void shift(int from, int to, int using, int no){
		if(no==1){
			Integer i=new Integer(0);
			switch (from){
				case 1:i=(Integer)s1.pop();break;
				case 2:i=(Integer)s2.pop();break;
				case 3:i=(Integer)s3.pop();break;
			}
			switch (to){
				case 1:s1.push(i);break;
				case 2:s2.push(i);break;
				case 3:s3.push(i);break;
			}
			displey();
	
			return;
		}
		shift(from, using, to, no-1);
				
			Integer i=new Integer(0);
			switch (from){
				case 1:i=(Integer)s1.pop();break;
				case 2:i=(Integer)s2.pop();break;
				case 3:i=(Integer)s3.pop();break;
			}
			switch (to){
				case 1:s1.push(i);break;
				case 2:s2.push(i);break;
				case 3:s3.push(i);break;
			}
			displey();
	
		shift(using, to, from, no-1);
	}

	
	public static void main(String args[]){
		inf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the number of disks to transfer");				
		int j,i=0;
		String in="";
		while(true){
			
			try{
				in=inf.readLine();
				i=Integer.parseInt(in);
			}
			catch (NumberFormatException e){
				System.out.println("Arrey yaar kuch theek se bhi kar liya karo!");
				continue;
			}
			catch(IOException e){
				System.out.println("Sorry ! problemm.");
			}
			break;
		}
		s1=new Stack<Integer>();
		s2=new Stack<Integer>();
		s3=new Stack<Integer>();
		for(j=i;j>0;j--){
			s1.push(new Integer(j));
		}
		n=i;
		shift(1,3,2,i);
		try{inf.readLine();}catch(IOException e){};
	}
}