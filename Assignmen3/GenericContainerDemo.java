import java.util.*;
class Container<T> {
    private List<T> items;
    public Container() {
        items = new ArrayList<>();
    }
    public void addItem(T item) {
        items.add(item);
    }
    public List<T> getItems() {
        return items;
    }
    public void displayItems() {
        Iterator<T> iterator = items.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
public class GenericContainerDemo {
    public static void main(String[] args) {
        Container<Integer> intContainer = new Container<>();
        intContainer.addItem(10);
        intContainer.addItem(20);
        intContainer.addItem(30);
        System.out.println("Integer Container Elements:");
        intContainer.displayItems();
        System.out.println("---------------------------");
        Container<String> stringContainer = new Container<>();
        stringContainer.addItem("Hello");
        stringContainer.addItem("World");
        stringContainer.addItem("Java Generics");
        System.out.println("String Container Elements:");
        stringContainer.displayItems();
    }
}
