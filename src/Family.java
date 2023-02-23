import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.function.Consumer;

public class Family<T> implements Serializable,Iterable<T> {

    private ArrayList<T> list = new ArrayList<>();

    public Family() {
        list = new ArrayList<>();
    }

    public void addHuman(T hm){
        list.add(hm);
    }

    public void printFamily(){
        System.out.println(list);
    }

    @Override
    public String toString() {
        return "Family{" +
                "list=" + list +
                '}';
    }


    @Override
    public Iterator<T> iterator() {
        return new HumanIterator(list);
    }

//    public void sort(){
//        Collections.sort(list);
//    }



}
