package java01;
import java.util.Scanner;

public class 用户自己输入scanner {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入考试成绩信息:");
		int score = input.nextInt();
		int count = 0;
		System.out.println(score);
		while(score<=60){//只要小于60，就执行
			score++;
			count++;
		}
		System.out.println(score);
		System.out.println(count);
	}
}
