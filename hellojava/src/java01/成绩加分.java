package java01;

public class �ɼ��ӷ� {
	public static void main(String[] args){
		int score = 53;
		int count = 0;
		System.out.println(score);
		for(int i=0;i<60;i++){
			score++;
			count++;
			if(score>60){
				break;
			}
		}
		System.out.println(score);
		System.out.println(count);
	}
}
