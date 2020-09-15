package com.javaex.oop.goods.v2;

public class GoodsApp {

	public static void main(String[] args) {
		// 사용(참조)
		Goods notebook = new Goods();
		// 필드에 접근(우회접근)
		notebook.setName("LG Gram");
		notebook.setPrice(1600000);

		
		Goods smartphone = new Goods();
		smartphone.setName("iPhone SE");
		smartphone.setPrice (600000);
		
		// 출력
//		System.out.printf("%s, %d원%n" ,
//				notebook.getName(), notebook.getPrice());
//		System.out.printf("%s, %d원%n" ,
//				smartphone.getName(), smartphone.getPrice());
		notebook.showinfo();
		smartphone.showinfo();

	}

}
