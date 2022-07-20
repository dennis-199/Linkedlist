public class LinkedlistTest {
    public static void main(String[] args)
    {
        Linkedlist List = new Linkedlist();
        List.addToHead("300");

        List.add("41");
        List.add("50");
        List.add("67");

        System.out.println("Traversing the list");
        List.traverse();


    }
}
