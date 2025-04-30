
package phasetwo;
import java.io.*;
import java.util.*;

public class MemberLinkedList implements Serializable{
     private static class Node implements Serializable {
	        Member data;
	        Node next;

	        Node(Member data) {
	            this.data = data;
	        }
	    }

	    private Node head;

	    public void add(Member member) {
	        Node newNode = new Node(member);
	        newNode.next = head;
	        head = newNode;
	    }

	    public Member searchById(int id) {
	        Node curr = head;
	        while (curr != null) {
	            if (curr.data.getmemberID() == id) {
	                return curr.data;
	            }
	            curr = curr.next;
	        }
	        System.out.println("❌ Member with ID " + id + " not found.");
	        return null;
	    }

	    public List<Member> toList() {
	        List<Member> list = new ArrayList<>();
	        Node curr = head;
	        while (curr != null) {
	            list.add(curr.data);
	            curr = curr.next;
	        }
	        return list;
	    }

	    public void loadFromList(List<Member> list) {
	        head = null;
	        for (int i = list.size() - 1; i >= 0; i--) {
	            add(list.get(i));
	        }
	    }
}
