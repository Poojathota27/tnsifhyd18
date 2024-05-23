package org.sri.indu;

public class Ipl {
	String batsman="virat kohli";
	static String bowler="mohmad shami";
	void display() {
		System.out.println("good players");
	}
    static String display1() {
    	return "they play for country";
    }
    public static void main (String[] args) {
    Ipl i1=new Ipl();
    System.out.println(i1.batsman);
    i1.display();
    System.out.println(Ipl.bowler);
    Ipl.display1();
}
}