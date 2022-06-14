package homework;
class Homework3{
	public static void main(String[] args) {
		int i=65;
		char c = (char)i;

//		char i2=97; // i만으로 소문자 a 출력은 어떻게 하나요?ㅠㅠ
		char i2= (char)(i+32); //A(65)와 a(97)은 32가 차이 난답니다.
	//System.out.println(i);
	System.out.println("대문자는 "+c+"이고 소문자는 "+i2+"이다");
	}
}
