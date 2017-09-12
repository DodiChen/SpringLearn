package com.dodi.springlearn.chapter2_4;

import java.util.List;

public class BlankDiscListProperty implements CompactDisc {
	private String title;
	private String artist;
	private List<String> tracks;

	public void setTitle(String title) {
		this.title = title;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public void setTracks(List<String> tracks) {
		this.tracks = tracks;
	}


	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing " + title + " by " + artist);
		for(String track : tracks){
			System.out.println("-Track:" + track);
		}
	}

}
