package com.javaex.thread;

class AlphabetThread implements Runnable {

	@Override
	public void run() {
		// 쓰레드 실행 로직
			


			
			for (char ch = 'A' ; ch <= 'Z' ; ch++) {
				System.out.println("[MainThread]: " + ch);
				
				// 잠시 대기
				try {
				Thread.sleep(300);	// 0.3초 지연
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}


	}

}

