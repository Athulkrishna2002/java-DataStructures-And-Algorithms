package javacodes.Cookie;

class Main{
	public static void main(String args[]){
	 Cookie cookieOne = new Cookie("red");
	 Cookie cookieTwo = new Cookie("green");

	 cookieOne.setColor("black"); // replaces red to black

	 System.out.println(cookieOne.getColor());
	 System.out.println(cookieTwo.getColor());
	}	
}