package com.javaex.oop.summary;

public class KungfuPanda extends Panda implements Kungfu {

	public KungfuPanda(String name) {
		super(name);
	}
	
	@Override
	public void kungfu() {
		System.out.println(name + ": 아뵤~");

	}

}
