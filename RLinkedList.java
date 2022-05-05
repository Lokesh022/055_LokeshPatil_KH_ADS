import java.util.Scanner;
public class RLinkedList{
	static Node head;


 static class Node{
	int value;
	Node next;
	
	Node(int value){
		this.value=value;
		next=null;
	}
}

	Node reverse(Node node){
		Node previous = null;
		Node current = node;
		Node next = null;
		
		while (current!=null){
			next=current.next;
			current.next=previous;
			previous = current;
			current=next;
		}
		node=previous;
		return node;
	}
	
	void printList(Node node2){
		while(node2!=null){
			System.out.print(node2.value+" ");
			node2=node2.next;
		}
	}
	
	public static void main(String args[]){
		RLinkedList rll = new RLinkedList();
		Scanner sc = new Scanner(System.in);
		int testNo = sc.nextInt();
		int arraySize=sc.nextInt();
		int element1 =sc.nextInt();
		int element2 =sc.nextInt();
		int element3 =sc.nextInt();
		int element4 =sc.nextInt();
		int element5 =sc.nextInt();
		
		
		rll.head=new Node(element1);
		rll.head.next = new Node(element2);
		rll.head.next.next = new Node(element3);
		rll.head.next.next.next = new Node(element4);
		rll.head.next.next.next.next = new Node(element5);
		
		//rll.printList(head);
		head = rll.reverse(head);
		System.out.println();
		rll.printList(head);
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	