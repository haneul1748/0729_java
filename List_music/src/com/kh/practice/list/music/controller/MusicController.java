package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.list.music.model.vo.Music;

public class MusicController {
	List<Music> musiclist = new ArrayList();
	
	public int addList(Music music) {
		musiclist.add(music);
		return 1;
	}
	
	public int addAtZero(Music music) {
		musiclist.add(0, music);
		return 1;
	}
	
	public List<Music> printAll() {
		return musiclist;
	}
	
	public Music searchMusic(String title) {
		
	}
	
	public Music removeMusic(String title) {
		
	}
	
	public Music setMusic(String title, Music music) {
		
	}
	
	public int descSinger() {
		
	}
}
