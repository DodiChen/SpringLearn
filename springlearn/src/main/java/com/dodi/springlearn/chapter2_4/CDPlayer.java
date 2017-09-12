package com.dodi.springlearn.chapter2_4;

import org.springframework.beans.factory.annotation.Autowired;

public class CDPlayer implements CompactDisc{
	
	private CompactDisc cd;
	
	public CDPlayer(){}
	
	public CDPlayer(CompactDisc cd){
		this.cd = cd;
	}

	public void setCd(CompactDisc cd) {
		this.cd = cd;
	}

	public void play() {
		// TODO Auto-generated method stub
		cd.play();
	}
}
