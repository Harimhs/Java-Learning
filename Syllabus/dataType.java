package Syllabus;

class dataType{
	public static void main(String[] args) {
		byte b = 127;
        short s = 32767;
        int i = 2147483646;
        long l = 2147483649L;

        float f = 3.14f;
        double d = 3.14;

        char c = 'A';
        
        boolean bl= b>0;

        System.out.println("byte: "+ b);
        System.out.println("short: "+ s);
        System.out.println("int: "+ i);
        System.out.println("long: "+ l);
        System.out.println("float: "+ f);
        System.out.println("double: "+ d);
        System.out.println("char: "+ c);
        System.out.println("boolean: "+ bl);
	}
}