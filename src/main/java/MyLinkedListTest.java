public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addElement("A");
        list.addElement("B");
        list.addElement("C");
        list.printAll();
        list.insertElement(3, "D");
        list.printAll();
        list.removeElement(0);
        list.printAll();
        list.removeElement(1);
        list.printAll();
    }
}
