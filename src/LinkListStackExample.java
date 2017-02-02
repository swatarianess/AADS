
/**
 *  Stack implementation on a custom Linklist
 *
 * Created by Stephen Adu on 31/01/2017.
 */
public class LinkListStackExample {

    public static void main(String[] args){
        LinkListStack lls = new LinkListStack();
        lls.push(10,20,30,40,50);
        lls.displayStack();

        lls.pop();
        lls.displayStack();

        lls.pop();
        lls.displayStack();

    }


    /**
     *  Node Class
     */
    static class Node{
        private int value;
        private Node next = null;

        Node(int value){
            this.value = value;
        }

        void setNext(Node next){
            this.next = next;
        }

        Node getNext(){
            return this.next;
        }

        @SuppressWarnings("unused")
        public void setValue(int value){
            this.value = value;
        }

        int getValue(){
            return this.value;
        }

        void displayNode(){
            if(getNext() != null) {
                System.out.print("[" + value + "],");
            } else{
                System.out.print("[" + value + "] \n");
            }
        }

        @Override
        public String toString() {
            return String.valueOf(getValue());
        }
    }

    static class LinkListCustom{
        private Node first = null; // Reference to the top of the stack
        private Node last = null; // Reference to the bottom of the stack
        private int size = 0; // Current size of the stack


        /**
         * @param value Integer to assign to Node's content
         */
        void add(int value){
            if(first == null){
                last = new Node(value); // Set bottom of stack to first node adding to linkList
            }

            Node temp = new Node(value);
            temp.setNext(first);
            first = temp;
            incrementLength();
        }

        /**
         *  Removes top Node and returns value of Node removed
         *
         * @return Returns value of Node removed from the top of the stack
         */
        Node removeFirst() {
            Node temp = first;
            first = first.getNext();
            decrementLength();
            return temp;
        }

        void displayList(){
            Node current = first;
            while(current!= null){
                current.displayNode();
                current = current.getNext();
            }
        }

        boolean isEmpty(){
            return first==null || size ==0;
        }

        private void incrementLength(){
            size++;}

        private void decrementLength(){
            size--;}

        @SuppressWarnings("unused")
        public Node getFirst(){return first;}

        @SuppressWarnings("unused")
        public Node getLast(){return last;}

        @SuppressWarnings("unused")
        public int getSize(){return size;}



    }

    static class LinkListStack{

        private LinkListCustom listCustom = new LinkListCustom();

        @SuppressWarnings("unused")
        public void push(int value){
            getListCustom().add(value);
        }

        void push(int... value){
            for (int aValue : value) {
                getListCustom().add(aValue);
            }
        }

        void pop(){
            if(!getListCustom().isEmpty()){
                getListCustom().removeFirst();
            }else{
                throw new StackOverflowError("Nothing inside");
            }
        }

        void displayStack(){
            System.out.println("");
            getListCustom().displayList();
        }


        LinkListCustom getListCustom() {
            return listCustom;
        }

        @SuppressWarnings("unused")
        public void setListCustom(LinkListCustom listCustom) {
            this.listCustom = listCustom;
        }
    }

}
