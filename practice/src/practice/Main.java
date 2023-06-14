package practice;

public class Main {
public static void main(String[] args) {
	String str="mahesh";
	String rev="";
	int l=str.length();
	for(int i=l-1; i>=0;i--){
		rev=rev+str.charAt(i);
	}
	System.out.println(rev);
	
}
}
