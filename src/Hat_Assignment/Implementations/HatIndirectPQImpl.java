package Hat_Assignment.Implementations;

import java.util.HashMap;
import java.util.TreeSet;

/**
 * Created by Stephen Adu
 */
public class HatIndirectPQImpl{

    private TreeSet<Element> pq = new TreeSet<>();
    private HashMap<String, Element> st = new HashMap<>();

    private class Element implements Comparable<Element> {

        private String key;
        private int priority;

        public Element(String key, int priority) {
            this.key = key;
            this.priority = priority;
        }

        public int compareTo(Element that) {
            if (this.priority != that.priority) {
                return this.priority - that.priority;
            }
            return this.key.compareTo(that.key);
        }

        public boolean equals(Object other) {
            if (other == this) return true;
            if (other == null) return false;
            if (other.getClass() != this.getClass()) return false;
            Element that = (Element) other;
            return (this.priority == that.priority) && this.key.equals(that.key);
        }
    }

    public boolean isEmpty(){ return pq.isEmpty();}

    public int size()   {return pq.size();}

    public void put(String key, int priority){
        delete(key);
        Element element = new Element(key, priority);
        st.put(key,element);
        pq.add(element);
    }

    public boolean exists(String key){
        return st.get(key) != null;
    }

    void delete(String key){
        Element element = st.get(key);
        if (element != null){
            pq.remove(key);
            st.remove(key);
        }
    }

    int get(String key){
        Element element = st.get(key);
        return element.priority;
    }

    public int min(){
        Element min = pq.first();
        return min.priority;
    }

    public int max(){
        Element max = pq.last();
        return max.priority;
    }

    public String delMin(){
        Element min = pq.first();
        pq.remove(min);
        st.remove(min);
        return min.key;
    }

    public String delMax(){
        Element max = pq.last();
        pq.remove(max);
        st.remove(max);
        return max.key;
    }

    public static void main(String[] args){
        HatIndirectPQImpl pq = new HatIndirectPQImpl();
        pq.put("test", 31);
        pq.put("is", 55);
        pq.put("this", 25);
        pq.put("not", 65);
        pq.put("a", 36);
        pq.put("this", 61);
        pq.delete("not");

/*        while (!pq.isEmpty()){
            Stdout.println(pq.delMax());
        }*/
    }



}
