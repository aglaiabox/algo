import java.util.Arrays;
import java.util.LinkedList;

public class ReverseNodesInKGroup {
    public static void main(String[] args) {
        LinkedList<Integer> head = new LinkedList<>(Arrays.asList(1,2,3,4,5,6));
        int k = 3;

        System.out.println(reverseKGroup(head, k));
    }

    public static LinkedList reverseKGroup(LinkedList head, int k) {
        int indexStart = 0, indexEnd = indexStart+k-1;
        while (indexEnd< head.size()){
            head = reverseIt(head, indexStart, indexEnd);
            indexStart = indexEnd+1;
            indexEnd = indexStart+k-1;
        }
        return head;
    }

     static LinkedList reverseIt (LinkedList head, int indexStart, int indexEnd){
        int mediana = indexEnd - ((indexEnd-indexStart)/2);
        int start = indexStart;
        int end = indexEnd;
        while (start<mediana){
            Object a = head.get(start);
            Object b = head.get(end);
            head.add(end, a);
            head.remove(end+1);
            head.add(start, b);
            head.remove(start+1);
            start++;
            end--;
        }
        return head;
     }
}
