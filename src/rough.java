/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Umang
 */
import java.io.*;
import java.util.*;

import java.util.regex.*;
//class MapEQ {
//
//    public static void main(String[] args) {
//        Map m = new HashMap();
//        ToDos t1 = new ToDos("Monday");
//        ToDos t2 = new ToDos("Monday");
//        ToDos t3 = new ToDos("Tuesday");
//        m.put(t1, "doLaundry");
//        m.put(t2, "payBills");
//        m.put(t3, "cleanAttic");
//        System.out.println(m.size());
//    }
//}
//
//class ToDos {
//
//    String day;
//
//    ToDos(String d) {
//        day = d;
//    }
//
//    public boolean equals(Object o) {
//        return ((ToDos) o).day == this.day;
//    }
//// public int hashCode() { return 9; }
//}
// class Programmer {
// Programmer debug() { return this; }
// }
// class SCJP extends Programmer {
// insert code here
//Programmer debug() { return this}
//SCJP debug() { return this}
//Object debug() { return this }
//int debug(int x) { return 1}
//Object debug(int x) { return this
// }
// class Comp2 {
// public static void main(String[] args) {
// float f1 = 2.3f;
// float[][] f2 = {{42.0f}, {1.7f, 2.3f}, {2.6f, 2.7f}};
// float[] f3 = {2.7f};
// Long x = 42L;
// // insert code here
//// if(f1 == f2){
////     
//// }
// if(f1 == f2[2][1]){
//     
// System.out.println("true");
// }
// if(x == f2[0][0]){
//     
// System.out.println("trwue");
// }
//// if(f1 == f2[1,1]){
////     
//// }
// if(f3 == f2[2]){
//     
// }
// System.out.println("true");
// }
// }
//class Foozit {
//
//    public static void main(String[] args) {
//        Integer x = 0;
//        Integer y = 0;
//        for (Short z = 0; z < 5; z++) {
//            if ((++x > 2) || (++y > 2)) {
//                x++;
//            }
//        }
//        System.out.println(x + " " + y);
//    }
//}
//class Fizz {
//
//    int x = 5;
//
//    public static void main(String[] args) {
//        final Fizz f1 = new Fizz();
//        Fizz f2 = new Fizz();
//        Fizz f3 = FizzSwitch(f1, f2);
//        System.out.println((f1 == f3) + " " + (f1.x == f3.x));
//    }
//
//    static Fizz FizzSwitch(Fizz x, Fizz y) {
//        final Fizz z = x;
//        z.x = 6;
//        return z;
//    }
//}
import java.util.*;

class Test {

    public static void main(String[] args) {
// insert code here
        Queue<String> x = new PriorityQueue<String>();
        x.add("one");
        x.add("two");
        x.add("TWO");
        System.out.println(x.poll());
    }
}

class Loopy {

    public static void main(String[] args) {
        int[] x = {7, 6, 5, 4, 3, 2, 1};
        // insert code here
//        System.out.print(y + " ");
    }
}

class Polish {

    public static void main(String[] args) {
        int x = 4;
        StringBuffer sb = new StringBuffer("..fedcba");
        sb.delete(3, 6);
        sb.insert(3, "az");
        if (sb.length() > 6) {
            x = sb.indexOf("b");
        }
        sb.delete((x - 3), (x - 2));
        System.out.println(sb);
    }
}

class Brain {

    public static void main(String[] args) {
        // insert code block here
        //Scanner sc = new Scanner("123 A 3b c,45, x5x,76 82 L"); while(sc.hasNextInt()) System.out.print(sc.nextInt() + " ");
// Scanner sc1 = new Scanner("123 A 3b c,45, x5x,76 82 L"). useDelimiter(" "); while(sc1.hasNextInt()) System.out.println(sc1.nextInt() + " ");
//Scanner sc2 = new Scanner("123 A 3b c,45, x5x,76 82 L"); while(sc2.hasNext()) { if(sc2.hasNextInt()) System.out.println(sc2.nextInt() + " "); else sc2.next(); }
        Scanner sc3 = new Scanner("123 A 3b c,45, x5x,76 82 L").useDelimiter(" ");
        while (sc3.hasNext()) {
            if (sc3.hasNextInt()) {
                System.out.print(sc3.nextInt() + " ");
            } else {
                sc3.next();
            }
        }
//Scanner sc4 = new Scanner("123 A 3b c,45, x5x,76 82 L"); do { if(sc4.hasNextInt()) System.out.println(sc4.nextInt() + " "); } while ( sc4.hasNext() );

    }
}

abstract interface Frobnicate {

    public void twiddle(String s);
}

class TestDays {

    public enum Days {
        MON, TUE, WED
    };

    public static void main(String[] args) {
        for (Days d : Days.values())
 ;
        Days[] d2 = Days.values();
        System.out.println(d2[2]);
    }
}
//class Scoop {
//static int thrower() throws Exception { return 42; }
//public static void main(String [] args) {
//try {
//int x = thrower();
//} catch (Exception e) {
//x++;
//} finally {
//System.out.println("x = " + ++x);
//} } }

class Mixer {

    Mixer() {
    }

    Mixer(Mixer m) {
        m1 = m;
    }
    Mixer m1;

    public static void main(String[] args) {
        Mixer m2 = new Mixer();
        Mixer m3 = new Mixer(m2);
        m3.go();
        Mixer m4 = m3.m1;
        m4.go();
        Mixer m5 = m2.m1;
        m5.go();
    }

    void go() {
        System.out.print("hi ");
    }
}
//class Alien {
//String invade(short ships) { return "a few"; }
//String invade(short... ships) { return "many"; }
//}
//class Defender {
//public static void main(String [] args) {
//System.out.println(new Alien().invade(7));
//} }

class Master {

    String doFileStuff() throws FileNotFoundException {
        return "a";
    }
}

class Slave extends Master {

    public static void main(String[] args) {
        String s = null;
        try {
            s = new Slave().doFileStuff();
        } catch (Exception x) {
            s = "b";
        }
        System.out.println(s);
    }
// insert code here
//String doFileStuff() throws IOException { return "b"; }
//String doFileStuff() { return "b"; }
//String doFileStuff() throws NumberFormatException, FileNotFoundException { return "b"; }
//String doFileStuff() throws FileNotFoundException { return "b"; }
//String doFileStuff() throws NumberFormatException { return "b"; }

}
//class Regex2 {
//public static void main(String[] args) {
//Pattern p = Pattern.compile("\d*");
//Matcher m = p.matcher("ab34ef");
//boolean b = false;
//while(b = m.find()) {
//System.out.print(m.start() + m.group());
//}}}
//class Voop {
// public static void main(String[] args) {
// doStuff(1);
// doStuff(1,2);
// }
// // insert code here
//// static void doStuff(int... doArgs) { }
////static void doStuff(int[] doArgs) { } 
////static void doStuff(int x, int... doArgs) { }
////static void doStuff(int doArgs...) { }
//}

class Hexy {

    public static void main(String[] args) {
        Integer i = 42;
        String s = (i < 40) ? "life" : (i > 50) ? "universe" : "everything";
        
        System.out.println(s);
    }
}

class Titanic {

    public static void main(String[] args) {
        Boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        if ((b1 & b2) | (b2 & b3) & b3) {
            System.out.print("alpha ");
        }
        if ((b1 = false) | (b1 & b3) | (b1 | b2)) {
            System.out.print("beta ");
        }
    }
}

class Mineral {
}

class Gem extends Mineral {
}

class Miner {

    static int x = 7;
    static String s = null;

    public static void getWeight(Mineral m) {
        int y = 0 / x;
        System.out.print(s + " ");
    }

    public static void main(String[] args) {
        Mineral[] ma = {new Mineral(), new Gem()};
        for (Object o : ma) {
            getWeight((Mineral) o);
        }
    }
}

class Sixties {

    public static void main(String[] args) {
        int x = 5;
        int y = 7;
        System.out.print(((y * 2) % x));
        System.out.print(" " + (y % x));
    }
}

class Group extends HashSet {

    public static void main(String[] args) {
        Group g = new Group();
        g.add(new Person("Hans"));
        g.add(new Person("Lotte"));
        g.add(new Person("Jane"));
        g.add(new Person("Hans"));
        g.add(new Person("Jane"));
        System.out.println("Total: " + g.size());
    }

    public boolean add(Object o) {
        System.out.println("Adding: " + o);
        return super.add(o);
    }
}

class Person {

    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

class Plane {

    static String s = "-";

    public static void main(String[] args) {
        new Plane().s1();
        System.out.println(s);
    }

    void s1() {
        try {
            s2();
        } catch (Exception e) {
            s += "c";
        }
    }

    void s2() throws Exception {
        s3();
        s += "2";
        s3();
        s += "2b";
    }

    void s3() throws Exception {
        throw new Exception();
    }
}
class Programmer {
 Programmer debug() { return this; }
 }
 class SCJP extends Programmer {
 // insert code here
     Programmer debug() { return this;}
//SCJP debug() { return this;}
//Object debug() { return this ;}
//int debug(int x) { return 1;}
//Object debug(int x) { return this;}

 }
public class rough {

//    public static void before() {
//        Set set = new TreeSet();
//        set.add("2");
//        set.add(3);
//        set.add("1");
//        Iterator it = set.iterator();
//        while (it.hasNext()) {
//            System.out.print(it.next() + " ");
//        }
//    }
    public static void main(String[] args) {
        //before();
//        System.out.format("%b", 123);
////System.out.format("%c", "x");
////System.out.printf("%d", 123);
////System.out.printf("%f", 123.45);
//        System.out.format("%s", new Long("123"));
        Integer i = 245;
        System.out.println(i.toString(i,8));
        System.out.println(i.toString(i,2));
        System.out.println(i.toString(i,16));
        System.out.println(i.toHexString(i));
        System.out.println(i.toOctalString(i));
        System.out.println(i.toBinaryString(i));

    }
}
