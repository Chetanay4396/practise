package practise;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		String s=scn.nextLine();
		String[] test=s.trim().split(" ");
		String s1="";
		for(String l:test){
		
		 s1=l.concat(" " +s1);
		}
		System.out.println(s1);
	}

}
