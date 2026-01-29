import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Gibberish {
    static void main() {

// Q2.
//        int var = 9;
//        if(var++ < 10){
//            System.out.println("Hello World");
//        }else {
//            System.out.println("Hello Universe");
//        }

//Q3.
//        String date = LocalDate
//                .parse("2014-05-04")
//                .format(DateTimeFormatter.ISO_DATE_TIME);
//
//        System.out.println(date);


//Q6.
//        StringBuilder sb = new StringBuilder();
//        String s = "";
//
//        if(sb.equals(s)) {
//            System.out.println("Match 1");
//        }else if(sb.toString().equals(s.toString())) {
//            System.out.println("Match 2");
//        }else  {
//            System.out.println("No Match");
//        }

//Q7.
//        interface Readable{
//            public void readBook();
//            public void setBookMark();
//        }

//Q8.
//        String ta = "A ";
//        ta = ta.concat("B ");
//        String tb = "C ";
//        ta = ta.concat(tb);
//        ta.replace('C', 'D');
//        ta = ta.concat(tb);
//        System.out.println(ta);

//        for(int x = 0; x < 2; ) {
//            System.out.println("huh");
//            x++;
//        }

//Q10.
//        int a[] = {1, 2, 3, 4, 5};
//        for(int e = 0; e<5; e+=2){
//            System.out.println(a[e]);
//        }

//Q16.
//    int x = 5;
//    while(isAvailable(x)){
//        System.out.println(--x);
//    }


//Q22
//        List<String> names = new ArrayList<>();
//        names.add("Robb");
//        names.add("Bran");
//        names.add("Rick");
//        names.add("Bran");
//
//        if(names.remove("Bran")){
//            names.remove("Jon");
//        }
//        System.out.println(names);
//    }

//Q16
//    public static boolean isAvailable(int x){
//        return x-- > 0?true:false;
//    }

//Q26
//        String[] arr = {"A", "B", "C", "D"};
//        for(int i =0; i< arr.length; i++){
//            System.out.println(arr[i] + " ");
//            if(arr[i].equals("C")){
//                continue;
//            }
//            System.out.println("Work done");
//            break;
//        }

//Q35
//        if("Hello".equals("Hello")? false : true ) {
//            System.out.println("Sucess");
//        }else System.out.println("Failure");

//Q45
//        ArrayList myList = new ArrayList();
//        try{
//            while(true){
//                myList.add("anything");
//            }
//        }catch(RuntimeException e){
//            System.out.println("Caught a Runtime Exception");
//        }catch(Exception e){
//            System.out.println("Caught an Exception");
//        }
//        System.out.println("Ready to use");

//Q46
//        String str1 = "Java";
//        String str2 = new String("java");
//        String str3 = str2;
//        if(str1.equalsIgnoreCase(str2)) {
//            System.out.println("Equal");
//        }else{
//            System.out.println("Not Equal");
//        }

//        System.out.println(new StringBuilder("Java SE"));

//        Integer x = new Integer("1");
//        System.out.println(x);




    }   //TODO: Main method
}   //TODO: Class bracket


//Q7
//abstract class Book implements Readable {
//    public void readBook() {};
//}
//
//class EBook extends Book {
//    public void readBook() {};
//
//}

//Q15
//
//class Test{
//    void readCard(int cardNo) throws Exception{
//        System.out.println("Reading card ");
//    }
//
//    void checkCard(int cardNo) throws RuntimeException{
//        System.out.println("Checking card ");
//    }
//    public static void main(String[] args)
//    // main method should throw the exception from readCard
//    {
//        Test ex = new Test();
//        int cardNo = 12344;
//        ex.checkCard(cardNo);
//        ex.readCard(cardNo);
//    }
//}

//Q29
//class Alpha {
//    int ns;
//    static int s;
//    Alpha(int ns) {
//        if(s<ns){
//            s = ns;
//            this.ns = ns;
//        }
//    }
//    void doPrint(){
//        System.out.println("ns = " + ns + ", s = " + s);
//    }
//}
//
//class TestA{
//    static void main(String[] args) {
//        Alpha a = new Alpha(50);
//        Alpha b = new Alpha(125);
//        Alpha c = new Alpha(100);
//        a.doPrint();
//        b.doPrint();
//        c.doPrint();
//    }
//}

//Q23
//class A{
//    public A(){
//        System.out.println("A");
//    }
//}
//
//class B extends A{
//    public B(){
//        System.out.println("B");
//    }
//}
//
//class C extends B{
//    public C(){
//        System.out.println("C");
//    }
//
//    static void main(String[] args) {
//        C c = new C();
//    }
//}

//class X{
//    static int i;
//    int j;
//
//    static void main(String[] args) {
//        X x1 = new X();
//        X x2 = new X();
//        x1.i = 3;
//        x1.j = 4;
//        x2.i = 5;
//        x2.j = 6;
//        System.out.println(x1.i + " " + x1.j
//        + " " + x2.i + " " + x2.j);
//    }
//
//}


//Q40.

//class Base{
//    public void test(){
//        System.out.println("Base ");
//    }
//}
//
//class DerivedA extends Base{
//    public void test(){
//        System.out.println("DerivedA  ");
//    }
//}
//
//class DerivedB extends DerivedA{
//    public void test(){
//        System.out.println("DerivedB  ");
//    }
//
//    static void main(String[] args) {
//        Base b1  = new DerivedB();
//        Base b2  = new DerivedA();
//        Base b3  = new DerivedB();
//        b1 = (Base) b3;
//        Base b4 = (DerivedA) b3;
//        b1.test();
//        b4.test();
//
//    }
//}

//Q47
//class SumTest{
//    public static void doSum(Integer x, Integer y) {
//        System.out.println("Integer");
//    }
//    public static void doSum(double x, double y) {
//        System.out.println("double");
//    }
//    public static void doSum(float x, float y) {
//        System.out.println("float");
//    }
//    public static void doSum(int x, int y) {
//        System.out.println("int");
//    }
//
//    static void main(String[] args) {
//        doSum(10,20);
//        doSum(10.0, 20.0);
//    }
//
//}

//Q52.
//class MainTest{
//    static void main(int[] args) {
//        System.out.println("int main " + args[0]);
//    }
//
//    static void main(Object[] args) {
//        System.out.println("Object main " + args[0]);
//    }
//
//    static void main(String[] args) {
//        System.out.println("String main " + args[0]);
//    }
//}

//Q65
//class App{
//    static void main(String[] args) {
//        Boolean[] bool = new Boolean[2];
//        bool[0] = new Boolean(Boolean.parseBoolean("true"));
//        bool[1] = new Boolean(null);
//
//        System.out.println(bool[0] + " " + bool[1]);
//    }
//}