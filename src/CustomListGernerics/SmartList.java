package CustomListGernerics;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class SmartList<T extends Comparable<T>> {
    private List<T> data;

    public SmartList() {
        this.data = new ArrayList<>();
    }
    public void add(T element){
        this.data.add(element);
    }
    public T remove( int index ){
        return this.data.remove(index);
    }
    public boolean contains (T element){
       return this.data.contains(element);
    }
    public void swap(int firstIndex, int secondIndex){
        T temp = this.data.get(firstIndex);
        this.data.set(firstIndex,this.data.get(secondIndex));
        this.data.set(secondIndex,temp);
    }
    public int greaterThan (T element){
        return this.data.stream().filter(e-> e.compareTo(element) > 0).toArray().length;
    }
    public T getMax(){
        return this.data.stream().max(T::compareTo).get();
    }
    public T getMin(){
        return this.data.stream().min(T::compareTo).get();
    }
    public void foreach(Consumer<T>consumer){
        for (int i = 0; i <this.data.size() ; i++) {
            consumer.accept(this.data.get(i));
            
        }
    }
    public int size(){
        return this.data.size();
    }
    public T get(int index){
        return this.data.get(index);
    }

}
