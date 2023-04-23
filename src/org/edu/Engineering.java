package org.edu;

public class Engineering extends Medicine {
	public void bE() {
		System.out.println("bE");
	}
	public void bTech() {
		System.out.println("btech");
	}
	public static void main(String[] args) {
		Engineering z=new Engineering();
		z.bE();
		z.bTech();
		z.physiyo();
		z.dental();
		z.mbbs();
	}

}
