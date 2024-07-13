public class MyLinkedList {
    private MyLinkNode head;
    int count;

    public MyLinkedList(){
        head = null;
        count = 0;
    }

    public MyLinkNode addElement(String data){

        MyLinkNode newNode;

        if(head == null){
            newNode = new MyLinkNode(data);
            head = newNode;
        }
        else{
            newNode = new MyLinkNode(data);
            MyLinkNode temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
            count++;
        }
        return newNode;
    }

    public MyLinkNode insertElement(int position, String data){
        MyLinkNode newNode = new MyLinkNode(data);
        MyLinkNode tempNode = head;

        if(position < 0 || position > count){
            System.out.println("position error");
            return null;
        }

        if(position == 0){
            newNode.next = tempNode;
            head = newNode;
        }
        else{
            MyLinkNode preNode = null;

            for(int i = 0; i < position; i++){
                preNode = tempNode;
                tempNode = tempNode.next;
            }

            newNode.next = preNode.next;
            preNode.next = newNode;
        }

        count++;
        return newNode;
    }

    public MyLinkNode removeElement(int position){
        MyLinkNode tempNode = head;

        if(position < 0 || position >= count){
            System.out.println("position error");
            return null;
        }

        if(position == 0){
            head = tempNode.next;
        }
        else{
            MyLinkNode preNode = null;

            for(int i = 0; i < position; i++){
                preNode = tempNode;
                tempNode = tempNode.next;
            }

            preNode.next = tempNode.next;
        }
        count--;
        System.out.println(position + "번째 항목 삭제");
        return tempNode;
    }

    public String getElement(int position){
        MyLinkNode tempNode = head;
        if(position >= count){
            System.out.println("position error");
            return null;
        }

        if (position == 0) {
            return tempNode.getData();
        }
        else{

            for(int i = 0; i < position; i++){
                tempNode = tempNode.next;
            }
            return tempNode.getData();
        }
    }

    public MyLinkNode getNode(int position){
        MyLinkNode tempNode = head;

        if (position >= count) {
            System.out.println("position error");
            return null;
        }

        if (position == 0) {
            return head;
        }

        for(int i = 0; i < position; i++){
            tempNode = tempNode.next;
        }

        return tempNode;
    }

    public void printAll(){
        MyLinkNode tempNode = head;
        if(count == 0){
            System.out.println("count is zero");
            return;
        }
        while(tempNode != null){
            System.out.println(tempNode.getData());
            tempNode = tempNode.next;

            if(tempNode.next != null){
                System.out.println("->");
            }
        }
        System.out.println("");
    }

    public void removeAll(){
        MyLinkNode tempNode = head;

        head = null;
        count = 0;
    }

    public int getSize(){
        return count;
    }

    public boolean isEmpty(){
        if(head == null) return true;
        else return false;
    }
}
