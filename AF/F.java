import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String str=sc.nextLine();
		char c[]=str.toCharArray();
		
		int sum=0;//�ƶ��Ĵ���
		int t=0;//�ж��м���ֻ��һ�����ַ�������һ������������
		int key=-1;//��¼ֻ��һ���ַ���λ��
		
		int l=0,r=n-1;
		while(l<r) {
			
			int temp=r;
			while(l<temp&&c[temp]!=c[l])
				temp--;
			
			if(temp==l) {
				t++;
				key=l;
				if(t>1) {//����һ������������
					System.out.println("Impossible");
					return;
				}
			}
			else {//�ҵ���Ӧ���ַ�
				while(temp<r) {//�õ��ƶ���Ҫ��λ��
					c[temp]=c[temp+1];
					temp++;
					sum++;
				}
				r--;
			}
			l++;
			
		}
		if(key>0) {
			sum+=n/2-key;//�±�����ֵһ����ż��
		}
		
		System.out.println(sum);
	}
}
