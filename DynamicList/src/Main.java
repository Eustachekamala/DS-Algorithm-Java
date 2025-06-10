//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        DynamicArray dynamicArray = new DynamicArray(5);

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");

        dynamicArray.insert(4, "E");
        dynamicArray.add("F");
        dynamicArray.delete("D");
//        System.out.println( dynamicArray.search("A"));

        System.out.println(dynamicArray);
        System.out.println("size :" + dynamicArray.size);
        System.out.println("capacity : " + dynamicArray.capacity);
        System.out.println("empty : " + dynamicArray.isEmpty());

    }
}