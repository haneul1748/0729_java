package com.kh.practice.list.music.view;

import java.util.List;
import java.util.Scanner;

import com.kh.practice.list.music.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

public class MusicView {
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();

	public void maninView() {
		while (true) {
			System.out.println("******** 메인메뉴 ********");
			System.out.println("1. 마지막 위치에 곡 추가");
			System.out.println("2. 첫 위치에 곡 추가");
			System.out.println("3. 전체 곡 목록 출력");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 삭제");
			System.out.println("6. 특정 곡 정보 수정");
			System.out.println("7. 곡명 오름차순 정렬");
			System.out.println("8. 가수명 내림차순 정렬");
			System.out.println("9. 종료");
			int menuNo = sc.nextInt();
			sc.nextLine();

			switch (menuNo) {
			case 1:
				addList();
				break;
			case 2:
				addAtZero();
				break;
			case 3:
				printAll();
				break;
			case 4:
				searchMusic();
				break;
			case 5:
				removeMusic();
				break;
			case 6:
				setMusic();
				break;
			case 7:
				ascTitle();
				break;
			case 8:
				descSinger();
				break;
			case 9:
				System.out.println("종료");
				return;
			}

		}

	}

	public void addList() {
		System.out.println();
		System.out.println("****** 마지막 위치에 곡 추가 ******");
		System.out.println("곡명 : ");
		String title = sc.nextLine();

		System.out.println("가수 명 : ");
		String singer = sc.nextLine();

		Music music = new Music(title, singer);
		int no = mc.addList(music);

		if (no != 1) {
			System.out.println("추가 실패");

		} else {
			System.out.println("추가 성공");
		}

	}

	public void addAtZero() {
		System.out.println();
		System.out.println("****** 처음 위치에 곡 추가 ******");
		System.out.println("곡명 : ");
		String title = sc.nextLine();

		System.out.println("가수 명 : ");
		String singer = sc.nextLine();

		Music music = new Music(title, singer);
		int no = mc.addAtZero(music);

		if (no != 1) {
			System.out.println("추가 실패");

		} else {
			System.out.println("추가 성공");
		}

	}

	public void printAll() {
		System.out.println("****** 전체 곡 목록 출력 ******");
		List<Music> music = mc.printAll();

		if (music.isEmpty()) {
			System.out.println("존재하는 노래가 없습니다.");
		} else {
			for (Music m : music) {
				System.out.println("[" + m.getSinger() + " - " + m.getTitle() + "]");
			}

		}
	}

	public void searchMusic() {

	}

	public void removeMusic() {

	}

	public void setMusic() {

	}

	public void ascTitle() {

	}

	public void descSinger() {

	}

}
