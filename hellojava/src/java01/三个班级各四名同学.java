package java01;
import java.util.Scanner;
public class 三个班级各四名同学 {
	public static void main(String[] args) {
		int classNum = 3;
		int stuNum = 4;
		double sum = 0;
		double sum1 = 0;
		double avg =0;//平均分
		double avg1 = 0;
		Scanner input = new Scanner(System.in);
		for(int i=1;i<=classNum;i++){
			sum = 0;
			System.out.println("-----请输入第"+i+"个班级的学员成绩----");
			for(int j=1;j<=stuNum;j++){
				System.out.print("请输入第"+j+"个学员成绩");
				int score = input.nextInt();
				sum += score;
				sum1+=score;
			}
			avg = sum/stuNum;
			
			System.out.println("第"+i+"个班级的平均分是"+avg);
		}
		avg1 = sum1/(classNum*stuNum);
		System.out.println("四个班的平均分为"+avg1);
	}
}
