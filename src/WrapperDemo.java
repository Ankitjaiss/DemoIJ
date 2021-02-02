public class WrapperDemo {
    public static void main(String[] args) {
        Integer a=2;
        System.out.println(a);
        char ch='a';
        Character ch1=ch;
        System.out.println(ch1);
        char value=ch1;
        System.out.println(value);

        String str="123";
        Integer c_int=Integer.parseInt(str);
        System.out.println(c_int);
        Double d1=Double.parseDouble("123.45");
        System.out.println(d1);

        Integer int1=967030;
        //String st1=String.valueOf(int1);
        Long l1=int1.longValue();
        System.out.println(l1);

        Character ch2='A';
        Character ch3='5';

        boolean b1=Character.isDigit(ch3);
        System.out.println(b1);
        boolean b2=Character.isUpperCase(ch2);
        System.out.println(b2);
        String st3=Character.toString(ch2);
        System.out.println(st3);
        char ch4=ch2.charValue();
        System.out.println(ch4);
        char ch5=Character.toLowerCase(ch2);
        System.out.println(ch5);

        String st2=Integer.toBinaryString(5);
        System.out.println("Binary Value: "+st2);

        int res1=Character.compare('A','a');
        System.out.println(res1);

        int res2=ch2.compareTo(ch3);
        System.out.println(res2);

        byte by1=127;
        Byte by2=by1;
        int output=by2.compareTo((byte) 127);
        System.out.println(by2);

        Integer c=100;
        Integer d=100;
        System.out.println(c==d);
        c=128;
        d=128;
        System.out.println(c==d);


    }
}
