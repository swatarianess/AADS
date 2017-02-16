package W1;

/**
 *  Stack implementation on a custom Linklist
 *
 * Created by Stephen Adu on 31/01/2017.
 */
public class LinkListStackExample {

    public static void main(String[] args){
        LinkListStack<Integer> lls = new LinkListStack<>();
        lls.push(10,20,30,40,50);
        System.out.println("Size: " + lls.getListCustom().getSize());
        lls.displayStack();
        System.out.println();

        lls.pop();
        System.out.println("Size: " + lls.getListCustom().getSize());
        lls.displayStack();
        System.out.println();

        lls.pop();
        System.out.println("Size: " + lls.getListCustom().getSize());
        lls.displayStack();

    }


    /**
     *  Node Class
     */
    static class Node<T>{
        private T value;
        private Node next = null;

        Node(T value){
            this.value = value;
        }

        void setNext(Node next){
            this.next = next;
        }

        Node getNext(){
            return this.next;
        }

        @SuppressWarnings("unused")
        public void setValue(T value){
            this.value = value;
        }

        T getValue(){
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

    /**
     *  LinkList Class
     */
    static class LinkListCustom<T>{
        private Node first = null; // Reference to the top of the stack
        private Node<T> last = null; // Reference to the bottom of the stack
        private int size = 0; // Current size of the stack


        /**
         * @param value Integer to assign to Node's content
         */
        void add(T value){
            if(first == null){
                last = new Node<>(value); // Set bottom of stack to first node adding to linkList
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
        public Node<T> getLast(){return last;}

        @SuppressWarnings("unused")
        public int getSize(){return size;}



    }

    /**
     *  LinkList Stack class
     */
    static class LinkListStack<T>{

        private LinkListCustom<T> listCustom = new LinkListCustom<>();

        @SuppressWarnings("unused")
        public void push(T value){
            getListCustom().add(value);
        }

        @SuppressWarnings("unchecked")
        void push(T... value){
            for (T aValue : value) {
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
            getListCustom().displayList();
        }

        LinkListCustom<T> getListCustom() {
            return listCustom;
        }

        @SuppressWarnings("unused")
        public void setListCustom(LinkListCustom<T> listCustom) {
            this.listCustom = listCustom;
        }
    }

}
