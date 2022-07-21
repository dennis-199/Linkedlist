public class LinkedlistTest {
    public static void main(String[] args)
    {
        Linkedlist List = new Linkedlist();
       // List.addToHead("300");

        List.add("41");
        List.add("50");
        List.add("67");
        List.add("47");
        List.add("58");
        List.add("69");

        List.remove(1);
//        List.remove(2);
        List.remove(3);

        System.out.println("Traversing the list");
        List.traverse();


    }
}
