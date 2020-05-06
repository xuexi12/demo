import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String str=sc.nextLine();
		char c[]=str.toCharArray();
		
		int sum=0;//移动的次数
		int t=0;//判断有几个只有一个的字符，超过一个不符合题意
		int key=-1;//记录只有一个字符的位置
		
		int l=0,r=n-1;
		while(l<r) {
			
			int temp=r;
			while(l<temp&&c[temp]!=c[l])
				temp--;
			
			if(temp==l) {
				t++;
				key=l;
				if(t>1) {//超过一个不符合题意
					System.out.println("Impossible");
					return;
				}
			}
			else {//找到对应的字符
				while(temp<r) {//得到移动需要的位置
					c[temp]=c[temp+1];
					temp++;
					sum++;
				}
				r--;
			}
			l++;
			
		}
		if(key>0) {
			sum+=n/2-key;//下标的最大值一定是偶数
		}
		
		System.out.println(sum);
	}
}
