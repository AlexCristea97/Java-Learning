public class Main {
    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList((null));
        list.traverse(list.getRoot());
        String stringData = "5 7 2 9 1 3";

//        String stringData = "Darwin Brisbane Perth Melbourne Canaberra Adelaide Sydney Canaberra";

        String[] data = stringData.split(" ");
        for(String s : data){
            list.addItem(new Node(s));
        }

        System.out.println("Hello world!");
    }
}