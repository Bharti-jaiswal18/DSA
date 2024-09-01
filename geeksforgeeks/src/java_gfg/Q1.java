package java_gfg;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float a=20.134f;
		float b=8.15f;
		float result=a/b;
		System.out.println(result);
		System.out.format("%.3f",result);
		//String s=sc.next();
		
		int a1=sc.nextInt();
        
        
        float b1=sc.nextFloat();
       
        
        long c=sc.nextLong();
        
        
        byte d=sc.nextByte();
        
       // System.out.println( );
        sc.nextLine();
        
        String s=sc.nextLine();
        
//        System.out.println(a1);
//        System.out.println(b1);
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(s);
        
        String w="Hello";
        //System.out.println(w.trim());
        StringBuilder sb=new StringBuilder(w);
        System.out.println(sb.reverse().toString());
        

	}

}
