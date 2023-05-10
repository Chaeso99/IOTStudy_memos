package ch04;

public class ClassTest03 {

	public static void main(String[] args) {
		ClassTest02 character = new ClassTest02();
		character.hand ="크다";
		character.leg = "길다";
		character.head ="크다";
		character.eyes="크다";
		character.runSpeed="빠르다";
		character.hasWeapon="권총";
		character.height="크다";
		
		System.out.println("손은 "+character.hand+"\n"+
				   "다리는 "+character.leg+"\n"+
				   "머리는 "+character.head+"\n"+	
				   "눈은 "+character.eyes+"\n"+	
				   "달리기는 "+character.runSpeed+"\n"+	
				   "무기는 "+character.hasWeapon+"\n"+	
				   "키는 "+character.height+"\n"	);
	}
}