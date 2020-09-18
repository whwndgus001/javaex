package com.javaex.thread.synchronize;

// 여러 쓰레드가 공통으로 사용할 객체
public class SharedMemory {
	// 필드
	private int memory;
	
	// Getter / Setter
	public int getMemory() {
		return memory;
	}
	
	// synchronized 키워드를 메서드 사용하면 객체가 Lock
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(1000);	// 1초 대기
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + ":" + this.memory);

	}
	
	
	
}
