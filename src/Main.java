
public class Main {
    public static void main(String[] args) {
        MyArrayList test = new MyArrayList();
        test.add("ab");
        test.print();
        test.add("cd");
        test.print();
        System.out.println(test.getSize());
        test.add("ab");
        test.print();
        test.add("cd");
        test.print();
        System.out.println(test.getSize());
        test.add("cd");
        test.print();
        System.out.println(test.getSize());
        test.remove();
        test.print();
        test.remove();
        test.print();
        test.remove();
        test.print();
        test.remove();
        test.print();
        test.remove();
        test.print();

    }
}
