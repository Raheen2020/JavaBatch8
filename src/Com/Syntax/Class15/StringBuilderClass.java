package Com.Syntax.Class15;

public class StringBuilderClass {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(" world");
        String string = "Hello";
        String string2="Hello";
        string.concat("World");
        System.out.println(string);
        System.out.println(stringBuilder);

    }
}
