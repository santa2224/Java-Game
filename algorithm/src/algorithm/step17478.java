package algorithm;

import java.util.Scanner;

public class step17478 {
	
	static void factorialRecur(int n) {
		if(1<=n && n<=50){
			for(int i=0;i<n;i++) {
				String non = "____";
				non = non.repeat(i); 
				System.out.println(non+"\"재귀함수가 뭔가요?\"\n"
						+non+"\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n"
						+non+ "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n"
						+non+ "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");
				if(i==n-1) {
					String non2 = "____";
					non = non2.repeat(i+1);
					System.out.println(non+"\"재귀함수가 뭔가요?\"\n"+non+"\"재귀함수는 자기 자신을 호출하는 함수라네\"");
					if((i+1)==n) {
						for(int j=n;j>=0;j--) {
							String non3 = "____";
							non = non3.repeat(j);
							System.out.println(non+"라고 답변하였지.");
						}					
					}
				}	
			}
			return;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
		factorialRecur(n);
	}
}