package com.javacode.testwithci;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Charm charm = new Charm();
		
		///1
		System.out.print("face : ");
		int face = in.nextInt();
		boolean bool = charm.isCondition(face);
		while (!bool) {
			System.out.println("กรอกค่า  0 - 10 ");
			System.out.print("face : ");
			face = in.nextInt();
			bool = charm.isCondition(face);
		}
		
		// 2
		System.out.print("rich : ");
		int rich = in.nextInt();
		bool = charm.isCondition(rich);
		while (!bool) {
			System.out.println("กรอกค่า  0 - 10 ");
			System.out.print("rich : ");
			rich = in.nextInt();
			bool = charm.isCondition(rich);
		}
		
		// 3
		System.out.print("nature : ");
		int nature = in.nextInt();
		bool = charm.isCondition(nature);
		while (!bool) {
			System.out.println("กรอกค่า  0 - 10 ");
			System.out.print("nature : ");
			nature = in.nextInt();
			bool = charm.isCondition(nature);
		}
		
		// 4
		System.out.print("smile : ");
		int smile = in.nextInt();
		bool = charm.isCondition(smile);
		while (!bool) {
			System.out.println("กรอกค่า  0 - 10 ");
			System.out.print("smile : ");
			smile = in.nextInt();
			bool = charm.isCondition(smile);
		}
		
		// 5
		System.out.print("speech : ");
		int speech = in.nextInt();
		bool = charm.isCondition(speech);
		while (!bool) {
			System.out.println("กรอกค่า  0 - 10 ");
			System.out.print("speech : ");
			speech = in.nextInt();
			bool = charm.isCondition(speech);
		}
		
		charm.setFace(face);
		charm.setNature(nature);
		charm.setRich(rich);
		charm.setSmile(smile);
		charm.setSpeech(speech);
		
		double result = charm.process();
		System.out.println("ความมีเสน่ห์ของคุณคือ : "+result);
	}

}
