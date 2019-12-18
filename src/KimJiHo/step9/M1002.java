package KimJiHo.step9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class M1002 {
//	문제
//	이석원은 조규현과 백승환에게 상대편 마린(류재명)의 위치를 계산하라는 명령을 내렸다. 조규현과 백승환은 각각 자신의 터렛 위치에서 현재 적까지의 거리를 계산했다.
//
//	조규현의 좌표 (x1, y1)와 백승환의 좌표 (x2, y2)가 주어지고, 조규현이 계산한 류재명과의 거리 r1과 백승환이 계산한 류재명과의 거리 r2가 주어졌을 때, 류재명이 있을 수 있는 좌표의 수를 출력하는 프로그램을 작성하시오.
//
//	입력
//	첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 다음과 같이 이루어져 있다.
//
//	한 줄에 x1, y1, r1, x2, y2, r2가 주어진다. x1, y1, x2, y2는 -10,000보다 크거나 같고, 10,000보다 작거나 같은 정수이고, r1, r2는 10,000보다 작거나 같은 자연수이다.
//
//	출력
//	각 테스트 케이스마다 류재명이 있을 수 있는 위치의 수를 출력한다. 만약 류재명이 있을 수 있는 위치의 개수가 무한대일 경우에는 -1을 출력한다.
/*
 * 메모리 :
 * 시간 : 
 * 
 * 
 * @@@@@@@@@@@틀렸다고 나오는데 반례를 못찾겠음 왜 틀렸는지..?@@@@@@@@@@@@@@@@@@@@@2
 * */
	public static void main(String[] args) throws Exception {
		
		/*조규현/백승환의 좌표는 원의 중점
		 * 조규현/잭승환과 류재명간의 거리는 각각의 원의 반지름
		 * 백승환이 있을 수 있는 위치 => 두 원의 교점
		 * 
		 * 두 원이 일치하면(두 명의 위치가 같으면) 류재명 무한대.. = -1
		 * 
		 * 
		 * 규현이랑 승환이가 좌표가 같지 않을때,(같으면-1)
		 * 규현이랑 승환이 사이의 거리가 규현<->재명 + 승환<->재명 보다 작으면 교점2개
		 * 같으면 1개
		 * 크면 0개
		 * 
		 * */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i =0 ;i< t;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			
			double distance = maesureDistance(x1, y1, x2, y2);
			
			/*
			 * System.out.println("distance = " + distance); System.out.println("반지름 더한거= "
			 * + (r1+r2));
			 */
			
			if(x1==x2 && y1==y2) {//규현이랑 승환이가 같이있는데
				if(r1 == r2) {//반지름도 같으면
					System.out.println("-1");
				}else {//중점이 같고 반지름이 다르면 교점 0
					System.out.println("0");
				}
			}else if(distance == (r1+r2)) { // 교점1개
				System.out.println("1");
			}else if(distance < (r1+r2)) {//2개
				System.out.println("2");
			}else {
				System.out.println("0");
			}
		}
	}
	
	static double maesureDistance(int x1, int y1, int x2, int y2) {
//		 두 점 사이의 거리 = 루트 (x1-x2)² + (y1-y2)²
		double distance= 0;
		
		distance = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
		
		return distance;
	}
}
