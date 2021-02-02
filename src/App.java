import  java.lang.String;
import java.util.stream.Stream;

public class App {
    public static void main(String args[])
    {
    String fname = " Ankit-Jais-wal ";
    String lname=new String("Ankit");
    String fname1="Ankit";
    // System.out.println(fname.concat(lname));
    // System.out.println(fname.equals(fname1));
    // System.out.println(fname.equalsIgnoreCase(fname1));
    // System.out.println(fname.equals(fname1));
    // System.out.println(fname==fname1);
    // System.out.println(fname.compareTo(fname1));
    // System.out.println(fname.startsWith("Ankit"));
    // System.out.println(fname.endsWith("kit"));
    // System.out.println(fname.replace("An", "RA"));
    // System.out.println(fname.toLowerCase());
    // System.out.println(fname.isEmpty());
    // System.out.println(fname.substring(1, 3));
    // System.out.println(fname.indexOf("A"));
    // String[] asd=fname.split("-");
    // for(String s:asd){
        // System.out.println(s);
    // }
        System.out.println(fname.repeat(2));
        System.out.println(fname.isBlank());
        System.out.println(fname.stripTrailing());

        String str1="A\nB\tC\nD";
       Stream<String> st=str1.lines();
       st.forEach(System.out::println);
}
}
