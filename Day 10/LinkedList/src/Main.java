import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

//       LinkedList<String> placeToVisit = new LinkedList<>();
       var placesToVisit = new LinkedList<String>();

        placesToVisit.add("Dhaka");
        placesToVisit.add(0,"Gazipur");
        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);

        removeElements(placesToVisit);
        System.out.println(placesToVisit);
    }
    private static void addMoreElements(LinkedList<String>list){
        list.addFirst("Tangail");
        list.addLast("Mymensingh");

        list.offer("Sylhet");
    list.offerFirst("Sunamganj");
    list.offerLast("Kishoreganj");
    list.push("Netrokona");

    }

    public static void removeElements(LinkedList<String>list){
        list.remove(4);
        list.remove("Barishal");

        System.out.println(list);
        String s1 = list.remove();
        System.out.println(s1 + "Was removed");

        String s2 = list.remove();
        System.out.println(s2 + "Was removed");

        String s3 = list.remove();
        System.out.println(s3 + "Was removed");

        String p1 = list.poll();
        System.out.println(p1+ " was removed");
        String p2 = list.pollFirst();
        System.out.println("was removeed");

        String p3 = list.pollLast();
        System.out.println(p3+ "was removed");

        list.push("Dhaka");
        iit.push("Gazipur");
    }

}