package WorkShop;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        System.out.println(list.isEmpty());

        list.adFirst(5);
        System.out.println(list.getHead().value);
        System.out.println(list.getSize());
        System.out.println(list.isEmpty());

        list.adFirst(8);
        System.out.println(list.getHead().value);
        System.out.println(list.getSize());
        System.out.println(list.isEmpty());

        System.out.println("----------");

        System.out.println(list.getHead().value);
        System.out.println(list.getSize());
        System.out.println(list.isEmpty());

        System.out.println(list.getTail().value);

        list.adLast(3);
        System.out.println(list.getTail().value);
        System.out.println(list.getSize());
        System.out.println("----------");

        list.foreach(i->System.out.println(i));
        System.out.println("----------");

        System.out.println(list.removeFirst());
        System.out.println(list.getSize());
        System.out.println(list.getHead().value);

        System.out.println("----------");

        System.out.println(list.removeLast());
        System.out.println(list.getSize());
        System.out.println(list.getTail().value);

        System.out.println("----------");
        list.foreach(i->System.out.println(i));
        System.out.println("----------");

        list.adFirst(4);
        list.adLast(6);

        int [] arr = list.toArray();
        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);


    }
}
