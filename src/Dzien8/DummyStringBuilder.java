package Dzien8;

public class DummyStringBuilder {
    public static void main(String[] args) {

        String str = "ala";
        str.concat("kot");
        System.out.println(str);
        str = str.concat("kot");
        System.out.println(str);

        StringBuilder sb = new StringBuilder("ala");
        sb.append("kota");
        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder();
        sb1.append("ala");
        sb1.append("kota");
        System.out.println(sb1);

    }
}
