// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        Test s  = new Test();
        int arr []= {2, 1, 8, 9, 7, 4, 6};

        s.mergeSort(arr);
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();

        int ray [] = {8, 9, 4, 3, 2, 1, 0, 7};

        Test q = new Test();
        q.quickSort(ray, 0, ray.length-1);

        for(int num : ray){
            System.out.print(num + " ");
        }

        Stack awesome = new Stack();

        awesome.push(17);
        awesome.push(9);
        awesome.push(12);
        awesome.push(6);
        awesome.push(3);

        System.out.println();
        System.out.println(awesome.peek());
        awesome.pop();
        System.out.println(awesome.peek());
        awesome.pop();
        System.out.println(awesome.peek());

        System.out.println();

        LinkedList m = new LinkedList();
        m.insertAtFront(1);
        m.insertAtFront(2);
        m.insertAtFront(3);
        m.insertAtFront(4);
        m.insertAtFront(5);
        m.insertAtFront(6);
        m.insertAtFront(7);
        m.insertAtFront(8);
        m.insertAtFront(9);
        m.insertAtFront(10);

        m.printList();
        }
    }
