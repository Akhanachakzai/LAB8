package linkedlist;

public class list {
	public int num;
	public node mynode;
	public void Add(int num){
		if ( mynode == null){
			mynode = new node();
			mynode.val = num;
			mynode.next = null;
		}
		else{
			node temp;
			temp = mynode;
			mynode = new node();
			mynode.val = num;
			mynode.next= null;
			temp.next = mynode;
		}
		
	}
	public void showall(){
		node temp = mynode;
		while (temp.next != null){
			System.out.println(""+temp.val);
			temp = mynode.next;
		}
	}

}
