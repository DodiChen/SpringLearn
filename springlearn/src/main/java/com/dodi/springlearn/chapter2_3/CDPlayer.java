package com.dodi.springlearn.chapter2_3;

import org.springframework.beans.factory.annotation.Autowired;

public class CDPlayer implements MediaPlayer {
	
	private CompactDisc cd;
	
	@Autowired
	public CDPlayer(CompactDisc cd){
		this.cd = cd;
	}
	
	public void play() {
		// TODO Auto-generated method stub
		cd.play();
	}

}
