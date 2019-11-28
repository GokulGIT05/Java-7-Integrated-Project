package com.gk17.enumconcepts;

public class Gk3EnumExample1 {

	public static void main(String[] args) {
		
		int chknPrice = Biryani.Chicken.getPrice();
		System.out.println("The Price of Chicken Biryani: "+chknPrice);

	}

}

enum Biryani {

	Chicken(80), Mutton(120);

	int price;

	Biryani(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
}