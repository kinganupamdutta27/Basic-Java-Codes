package StringBuilder;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder Str = new StringBuilder("I am Anupam Dutta");
        System.out.println(Str.charAt(0));
        System.out.println(Str.charAt(5));
        Str.setCharAt(5, 'R');
        System.out.println(Str);

        Str.delete(0, 4);
        System.out.println(Str);

        Str.append(" Love Krishna");
        System.out.println(Str);

        Str.insert(0, "I am");
        System.out.println(Str);

        Str.setCharAt(5, 'A');
        System.out.println(Str);

        Str.append(" & Love Mahadev");
        System.out.println(Str);

        Str.delete(0, 4);
        System.out.println(Str);
        }
}
