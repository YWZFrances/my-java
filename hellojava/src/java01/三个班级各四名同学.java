package java01;
import java.util.Scanner;
public class �����༶������ͬѧ {
	public static void main(String[] args) {
		int classNum = 3;
		int stuNum = 4;
		double sum = 0;
		double sum1 = 0;
		double avg =0;//ƽ����
		double avg1 = 0;
		Scanner input = new Scanner(System.in);
		for(int i=1;i<=classNum;i++){
			sum = 0;
			System.out.println("-----�������"+i+"���༶��ѧԱ�ɼ�----");
			for(int j=1;j<=stuNum;j++){
				System.out.print("�������"+j+"��ѧԱ�ɼ�");
				int score = input.nextInt();
				sum += score;
				sum1+=score;
			}
			avg = sum/stuNum;
			
			System.out.println("��"+i+"���༶��ƽ������"+avg);
		}
		avg1 = sum1/(classNum*stuNum);
		System.out.println("�ĸ����ƽ����Ϊ"+avg1);
	}
}
