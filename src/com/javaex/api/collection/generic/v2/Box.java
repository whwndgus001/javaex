package com.javaex.api.collection.generic.v2;

// Generic 이용
// 설계는 Type을 지정하지 않고
// 실제 객체화 될 떄 외부에서 내부 데이트 타입을 결정해주는 방법

// 타입 피라미터(관례상)
// T : Type
// K : Key
// R : Return Type
// V : Value
public class Box<T> {
	T content;

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}
	

}
