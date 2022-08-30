public class Main {

    public static <T extends Comparable<T>> T calculateMin(T num1, T num2){
        if(num1.compareTo(num2) < 0){
            return num1;
        }
        return num2;
    }

   
    public static void main(String[] args){

        GenericMethod method = new GenericMethod();
        // method.printItems("Matthew", "26");
        // System.out.println("Item is returned: " + method.showItem("Hello world!"));

        // Integer[] nums = {1,2,3,4,5};
        // method.showItems(nums);

        System.out.println(calculateMin(23, 54));
    }
}