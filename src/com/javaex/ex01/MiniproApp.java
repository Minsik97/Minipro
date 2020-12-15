package com.javaex.ex01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MiniproApp {

	public static void main(String[] args) throws IOException {

		List<Minipro> pList = new ArrayList<Minipro>();

		int num;
		String name;
		String hp;
		String company;

		try (Scanner sc = new Scanner(System.in)) {
			while (true) {
				System.out.println("*********************************************");
				System.out.println("*             전화번호 관리 프로그램             *");
				System.out.println("*********************************************");
				System.out.println("");
				System.out.println("1.리스트  2.등록  3.삭제  4.검색  5.종료");
				System.out.println("-------------------------------------");

				int cho = sc.nextInt();

				if (cho == 5) {
					System.out.println("*********************************************");
					System.out.println("*                      감사합니다                      *");
					System.out.println("*********************************************");
					break;
				}

				if (cho == 1) {
					System.out.println("<1.리스트>");
					Reader r = new FileReader("C:\\javaStudy\\PhoneDB.txt");
					BufferedReader br = new BufferedReader(r);

					while (true) {
						String str = br.readLine();
						if (str == null) {
							break;
						}
						String[] sr = str.split(",");
						Minipro sArray = new Minipro(sr[0], sr[1], sr[2]);
						pList.add(sArray);

					}

					for (int i = 0; i < pList.size(); i++) {
						System.out.println(pList.get(i).getName() + "    " + pList.get(i).getHp() + "    "
								+ pList.get(i).getCompany());
					}
					System.out.println("");
					br.close();

				} else if (cho == 2) {
					System.out.println("<2.등록>");

					System.out.print(">이름 : ");
					name = sc.next();

					System.out.print(">휴대전화 :  ");
					hp = sc.next();

					System.out.print(">회사전화 : ");
					company = sc.next();

					Minipro mini = new Minipro(name, hp, company);
					pList.add(mini);

					System.out.println("[등록되었습니다.]");
					System.out.println("");

				}
				
				if(cho == 3) {
					System.out.println("<3.삭제>");
					System.out.print("<번호 : " );
					int re = sc.nextInt();
					
				}
				
				

			}
		}

	}

}
