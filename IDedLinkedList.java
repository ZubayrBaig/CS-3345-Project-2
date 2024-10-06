
public class IDedLinkedList <AnyType extends IDedObject> {
	
	private class ListNode{
		
		AnyType data;
		ListNode next;
		
		public ListNode(AnyType data) {       //constructor
			this.data = data;
			this.next = null;
		}
	}
	
	private ListNode head;  //instantiate the head variable
	
	
	public void makeEmpty() {
		head = null;   //simply point the head to null
	}
	
	public AnyType findID(int ID) {
		ListNode x = head;
		while (x != null) {
			if (x.data.getID() == ID) { // go through the list until you find the ID, then return the data of 
				return x.data;
			}
			x = x.next;
		}
		return null;  // otherwise, if it isn't there, return null
	}
	
	public boolean insertAtFront(AnyType x) {
		if (findID(x.getID()) != null) {
			return false;                     // if the ID already exists, then we return false
		}
		ListNode newHead = new ListNode(x);  // make a new head node and replace it with the old head and make the old head the newhead.next
		newHead.next = head;
		head = newHead;
		return true;
	}
	
	public AnyType deleteFromFront(){
		if (head == null) {         // make sure it is not empty
			return null;
		}
		AnyType deleted = head.data; //make a deleted variable
		head = head.next;          // set the head to the next node and return the deleted variable
		return deleted;
	}

	public AnyType delete(int ID){
		if (head == null) {
			return null;    // in case the list is empty.
		}
		if (head.data.getID() == ID) {
			return deleteFromFront();  // in case the first ID is the ID we are trying to delete
		}
		ListNode x = head;
		while (x.next != null && x.next.data.getID() != ID) {
			x = x.next;  // find the ID in the list
		}
		if (x.next == null) { 
			return null;    // in case the ID doesn't exist
		}
		AnyType deleted = x.next.data;  // set it to a deleted variable
		x.next = x.next.next;   // replace it
		return deleted;
	}
	
	public int printTotal() {
		if (head == null) {
			return -1;  // returns -1 if list is empty
		}
		
		int sum = 0;
		ListNode x = head;
		while (x != null) {     // while loop to keep going through and adding to the sum until we get to the end of the list
	           sum += x.data.getID();
	           x = x.next;
	        }
	        return sum;
	}
	
	public IDedLinkedList() {
		head = null;  // creates an empty linked list
	}
	
	
	
}
