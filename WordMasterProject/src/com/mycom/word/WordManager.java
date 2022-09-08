package com.mycom.word;

import java.util.Scanner;

public class WordManager {
	Scanner s = new Scanner(System.in);
	WordCRUD wordCRUD;
	
	public WordManager() {
		wordCRUD = new WordCRUD(s);
	}
	
	public int selectMenu() {
		System.out.print("*** ���ܾ� ������ ***\n"
				+ "*****************\n"
				+ "1. ��� �ܾ� ����\n"
				+ "2. ���غ� �ܾ� ����\n"
				+ "3. �ܾ� �˻�\n"
				+ "4. �ܾ� �߰�\n"
				+ "5. �ܾ� ����\n"
				+ "6. �ܾ� ����\n"
				+ "7. ���� ����\n"
				+ "0. ������\n"
				+ "*****************\n"
				+ "=> ���ϴ� �޴���? ");
		return s.nextInt();
	}
	
	public void start() {
		wordCRUD.loadFile();
		while(true) {
			int menu = selectMenu();
			if(menu == 0) {
				System.out.println("���α׷��� ����˴ϴ�");
				break;
			}
			if(menu == 4) {
				wordCRUD.addItem();
			}
			else if(menu == 1) {
				wordCRUD.listAll();
			}
			
			else if(menu == 5) {
				wordCRUD.updateItem();
			}
			
			else if(menu == 6) {
				wordCRUD.deleteItem();
			}
		}
	}
}
