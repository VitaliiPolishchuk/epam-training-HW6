import java.util.List;

public class MyCollection<T> {
    List<T> list;

    public MyCollection(List<T> list){
        this.list = list;
    }

    public void add(T item){
        list.add(item);
    }
}
