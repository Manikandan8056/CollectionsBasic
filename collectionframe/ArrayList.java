package collectionframe;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class ArrayList {

	public static void main(String[] args) {
		
		LinkedList<String> name=new LinkedList<String>();
		name.add("Mani");
		name.add("Mahesh");
		name.add("Jeeva");
		name.add("Dinesh");
		name.add("Abi");
		
		//without using Generic- you will get it as object
		/*name.add(123);
		name.add(123.47f);
		
		for (Object obj : name) {
			String list=(String) obj;
			System.out.println(list);
		}*/
		
		System.out.println(name);
		
		name.add(3, "Yash");
		System.out.println(name);

		name.set(1, "Ram");
		System.out.println(name);

		System.out.println(name.get(2));
		
		for (String string : name) {
			System.out.println(string);
		}
		System.out.println("-------------------------");
		
		PriorityQueue<String> queue=new PriorityQueue<String>();
		queue.add("Mani");
		queue.add("Mahesh");
		queue.add("Jeeva");
		queue.add("Dinesh");
		queue.add("Abi");
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);

		System.out.println(queue.peek());
		System.out.println(queue);

		System.out.println(queue.element());
		System.out.println(queue);

		System.out.println(queue.remove());
		System.out.println(queue);

		for (String string : queue) {
			System.out.println(string);
		}
	}

}
