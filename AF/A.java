import java.util.Calendar;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		Calendar ca=Calendar.getInstance();
		
		for(int i=0;i<12;i++) {//Calendar�·ݵ��±��0��ʼ
			ca.set(n,i,13);
			if(ca.get(Calendar.DAY_OF_WEEK)==6) {//Calendar����������ģ�7:1,1:2...6:7
				sum++;
			}
		}
		
		System.out.println(sum);
	}
}
