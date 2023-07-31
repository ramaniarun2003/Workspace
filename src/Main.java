// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Sorting s = new Sorting();
        int[] arr = {2, 1, 3, 4, 8, 5,7};

       s.insertionSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }

        Stack obj = new Stack();
        // insert Stack value
        obj.push(11);
        obj.push(22);
        obj.push(33);
        obj.push(44);



        // print Top element of Stack
        System.out.printf("\nTop element is %d\n",
                obj.peek());

        // Delete top element of Stack
        obj.pop();
        obj.pop();



        // print Top element of Stack
        System.out.printf("\nTop element is %d\n",
                obj.peek());
    }
}