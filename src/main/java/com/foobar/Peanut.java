package com.foobar;


public class Peanut
{

	public static void main (String [] args) {

		Peanut p = new Peanut();
		Butter butter = new Butter();

		p.makePeanutButter(butter);
	}


	public void makePeanutButter(Butter b) {

		System.out.println("Yummy!");
	}
}