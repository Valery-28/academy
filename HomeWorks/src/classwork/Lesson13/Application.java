package classwork.Lesson13;

import java.util.Comparator;

public class Application {
    public static void main(String[] args) {

    LinckedListTest<String > stringList=new LinckedListTest<>();
        stringList.add("A");
        stringList.add("G");
        stringList.add("Y");
        stringList.add("O");
        stringList.print();
        stringList.add(0,"new");


        System.out.println();

        stringList.print();
        System.out.println(stringList.get(1));

    }

}
