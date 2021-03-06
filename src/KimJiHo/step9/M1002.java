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
 * 메모리 : 13268kb
 * 시간 : 80ms
 * 
 * 
 * */ 
	public static void main(String[] args) throws Exception {
		
		/*조규현/백승환의 좌표는 원의 중점
		 * 조규현/잭승환과 류재명간의 거리는 각각의 원의 반지름
		 * 백승환이 있을 수 있는 위치 => 두 원의 교점
		 * 두 원이 일치하면(두 명의 위치가 같고, 반지름도같으면) 류재명 무한대.. = -1
		 * 
		 * ☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
		 * ☆★☆★☆★☆★☆★☆★☆아래의 9가지 경우의 수가 존재할 수 있다!☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆☆★☆★☆★☆★☆
		 * ☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
		 * 1. 규현이랑 승환이가 좌표가 같을때,
		 * 	1-1. 반지름도 같으면 두 원 일치(교점무한대 -1)---------------------------------1)
		 * 	1-2. 반지름이 다르면 교점 없음(0)-------------------------------------------2)
		 * 
		 * 2. 규현이랑 승환이가 좌표가 같지 않을때,
		 * 	2-1. r1,r2중 큰거보다 규현,승환사이의 거리가 
		 * 		2-1-1. 작으면 (큰원안에 작은원의 중심이 들어있을때,,)
		 * 			2-1-1-1. |r1-r2|보다 규현승환 거리가
		 * 				2-1-1-1-1. 작으면 교점 0개 (작은원이 큰원 안에 완전히 포함)-----------3)
		 * 				2-1-1-1-2. 같으면 교점 1개 (큰원 안에 들어간 상태로 맞닿음)-----------4)
		 * 				2-1-1-1-3. 크면 교점2개------------------------------------5) 
		 * 		
		 * 		2-1-2. 같으면 교점2개 (작은원의 중심이 큰원을 이루는 점 중 하나임)----------------6)
		 * 		
		 * 		2-1-3. 크면 (큰원 밖에 작은원의 중심이 있을 때..)
		 * 			2-1-3-1. 규현승환거리가 r1+r2보다
		 * 				2-1-3-1-1. 작으면 교점 2개 ----------------------------------7)
		 * 				2-1-3-1-2. 같으면 1개 -------------------------------------8)
		 * 				2-1-3-1-3. 크면 0개---------------------------------------9)
		 * ☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆
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
			
			double distance = maesureDistance(x1, y1, x2, y2);//규현 <-> 승환 거리
			
			if(x1==x2 && y1==y2) {//규현이랑 승환이가 같이있는데
				if(r1 == r2) {//반지름도 같으면-------------------------------------------1)
					System.out.println("-1");
				}else {//중점이 같고 반지름이 다르면 교점 0-------------------------------------2)
					System.out.println("0");
				}
			}else {//서로 다른 좌표
				int bigger = r1>=r2 ? r1:r2; //둘 중 큰 원의 반지름
				if(bigger > distance) {//한 원의 중심이 다른 한 원 안에 있을 때
					if(Math.abs(r1 - r2) > distance) {//큰원안에 완전포함-----------------3)
						System.out.println("0");
					}else if(Math.abs(r1 - r2) == distance) {//포함돼서맞닿음 ------------4)
						System.out.println("1");
					}else {//------------------------------------------------------5)
						//System.out.println("여기?");
						System.out.println("2");
						
					}
				}else if(bigger == distance) {//큰원의반지름이 둘사이의거리면 원이루는점..-------6)
					System.out.println("2");
				}else {//중심이 서로 포함되지 않을 때
					if(r1+r2 > distance) {//원밖에서 겹침 ------------------------------7)
						System.out.println("2");
						
					}else if(r1+r2 == distance) { //원 밖에서 맞닿음 ---------------------8)
						System.out.println("1");
						
					}else { // 두 원 반지름 합보다 서로 거리가 멀면 접하지 않은 독립된 원--------------9)
						System.out.println("0");
					}
				}
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
