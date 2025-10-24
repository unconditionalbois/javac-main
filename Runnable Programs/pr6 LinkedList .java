import java.util.LinkedList;

public class pr6 {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();
        
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        
        System.out.println("After insertion, updated LinkedList: " + animals);
        
        String str = animals.remove(0);
        System.out.println("Removed element: " + str);
        System.out.println("After deletion, updated LinkedList: " + animals);
    }
}
