import java.util.*;

public class ListTester {

    private static List<String> testList;

    public static void main(String args[]) {

        testList = new aList();
        testList.add("3");
        testList.add(1, "this");
        testList.add("buy");
        testList.isEmpty();
        testList.remove(1);
        testList.add("90");
        testList.add("batteries");
        testList.remove("90");
        testList.size();

        for (int i = 0; i < testList.size(); i++)
            System.out.println(testList.get(i));

    }
} // end of class