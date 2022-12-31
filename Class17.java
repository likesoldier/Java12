public class Class17 {

	public static void main(String[] args) {
		String str = "262904713";
		short num;
		num = Short.parseShort(str);
		System.out.println(num + "*2 = " + num * 2);
	}
}
//Exception in thread "main" java.lang.NumberFormatException: Value out of range. Value:"262904713" Radix:10
//at java.base/java.lang.Short.parseShort(Short.java:139)
//at java.base/java.lang.Short.parseShort(Short.java:163)
//at Class17.main(Class17.java:6)
