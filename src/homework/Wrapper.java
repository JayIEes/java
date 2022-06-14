package homework;
class Wrapper {
	public static void main(String[] args) {
	
	System.out.println("byte의 최소값 "+Byte.MIN_VALUE+", 최대값 "+Byte.MAX_VALUE);
	System.out.println("short의 최소값 "+Short.MIN_VALUE+", 최대값 "+Short.MAX_VALUE);
	System.out.println("int의 최소값 "+Integer.MIN_VALUE+", 최대값 "+Integer.MAX_VALUE);
	System.out.println("long의 최소값 "+Long.MIN_VALUE+", 최대값 "+Long.MAX_VALUE);
	System.out.println("float의 최소값 "+Float.MIN_VALUE+", 최대값 "+Float.MAX_VALUE);
	System.out.println("double의 최소값 "+Double.MIN_VALUE+", 최대값 "+Double.MAX_VALUE);
	System.out.println("char의 최소값 "+Character.MIN_VALUE+", 최대값 "+Character.MAX_VALUE);// ?
	//System.out.println("boolean의 값 "+Boolean.TRUE+" , "+Boolean.FALSE);
	//Boolean은 최소, 최대값이 없으므로 출력할 필요는 없어요.
	float f = 0.2f;
	System.out.println(f);
	System.out.println('A'+'B');

System.out.println("char의 최소값 "+(int)Character.MIN_VALUE+", 최대값 "+(int)Character.MAX_VALUE);
	}
}
