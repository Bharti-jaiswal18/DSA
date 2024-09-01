package java_gfg;

public class Array_avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(delAlternate("hello"));
		

	}
//	public String avg(int arr[]) {
//		double result=0.0;
//		for(int i=0;i<arr.length;i++) {
//			 result+=arr[i];
//		}
//		double s=result/arr.length;
//		//return "Average of aaray: ";
//		String avg=String.format("%.2f",s);
//		
//	}
//     static void dataTypes(int a, float b, double c, long l, byte d){
//        
//        double p = c/b;
//        double q = b/a;
//        double r = c/a;
//        double m = r+l;
//        int s = a/d;
//        
//        //Printing all the results 
//        System.out.println(p + " " + q + " " + r + " " + m + " " + s);
//        
//    }
//     String isVowel(char c) {
//    	 char ch[]={'a','e','i','o','u'};
//    	 for(int i=0;i<ch.length;i++) {
//    		
//    		 while(ch[i]==c || Character.toUpperCase(ch[i])==c) {
//        		 //System.out.println();
//        		 return "Yes";
//        	 }
//        	
//    	 }
//    	 return "No";
//    	 
//     }
     static String delAlternate(String S) {
         // code here 
    	 String S1="hello", S2="khushi";
    	 StringBuilder sb=new StringBuilder();
    	 for(int i=0;i<S.length();i++) {
    		 if(i%2==0) {
    	          sb.append(S.charAt(i));
    	          String s=S1.concat(S2);
    	          sb.append(s).reverse();
    	        //  sb.reverse();
    		 }
    	 }
    	 return sb.toString();
         
     }

//hello
}
