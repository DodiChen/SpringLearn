package com.dodi.springlearn.chapter2_5;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dodi.springlearn.chapter2_5.CompactDisc;

@Component
public class CDPlayer implements MeidaPlayer {
	private CompactDisc cd;

	@Autowired
	public CDPlayer(CompactDisc cd) {
		this.cd = cd;
	}

	public void play() {
		// TODO Auto-generated method stub
		cd.play();
	}
}
