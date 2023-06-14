package practice;

public class main2 {
public static void main(String[] args) {
	int n=121;
	int rev=0;
	int num=n;
	while(n!=0){
		int rem=n%10;
		rev=rev+(rem*rem*rem);
		n=n/10;
	}
	if(rev==n){
		System.out.println("armstring");
	}
	else{
		System.out.println("not armstrong");
	}
}
}
