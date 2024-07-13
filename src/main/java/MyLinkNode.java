public class MyLinkNode {

    private String data;
    private MyLinkNode next;

    public MyLinkNode(){
        data = null;
        next = null;
    }

    public MyLinkNode(String data){
        this.data = data;
        this.next = null;
    }

    public MyLinkNode(String data, MyLinkNode next){
        this.data = data;
        this.next = next;
    }

    public String getData(){
        return data;
    }
}
