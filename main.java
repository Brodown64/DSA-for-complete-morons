// update:
// add application with GUI

// arrays (int[]): a list of variables that can be sorted or done whatever with
// linked list: arrays but connected head to toe, like a map (ex: searching a list until you find the number)
// stacks: like a stack of plates, you use the first plate on top (FIFO)
// queue: like a nightclub, first in at the door is let in by the bouncer
// dictionary: like a locker room, it maps the locker key (code) to the locker (value)
// hash table: like a locker room, converts the code into a locker number
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;
import java.util.Hashtable;

public class main 
{
	static void linkedLists() {
		System.out.println("Link"); // last
		LinkedList<String> games = new LinkedList<String>();
		games.add("Mario");
        games.add("Sonic");
        games.add("Link");
        games.addFirst("Sora");
        
        games.removeLast();
        System.out.println(games);
	}
	static void stacksQueues() {
		// stack
		Stack<Integer> s = new Stack<>();
        Queue<String> q = new LinkedList<>();

		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);

		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
	    // queue (start here)
        q.add("Seymour");
        q.add("Tyler");
        q.add("Joy");

        System.out.println("Queue: " + q);

        String front = q.remove();
        System.out.println("Removed element: " + front);

        // print the updated queue
        System.out.println("Queue after removal: " + q);
	}
	static void hashTable() {
		Hashtable<String, Integer> num
		  = new Hashtable<String, Integer>();
		num.put("one", 1);
		num.put("two", 2);
		num.put("three", 3);

		Integer n = num.get("two");
		if (n != null) {
			System.out.println("two = " + n);
		}
	}
	public static void main(String[] args)
	{
		System.out.println("Hello World");

		// Integer vars = [4, 2, 8, 6];
		int[] vars = {4, 2, 8, 6};
		int[] vars2 = {4, 2, 8, 6};

		System.out.println(Arrays.toString(vars));
        
        // sort
		Arrays.sort(vars);
        
		System.out.print(""); 
		for (int n : vars) {
			System.out.print(n + " ");
		}

		Arrays.sort(vars, 1, 2);
		for (int i : vars) {
			System.out.println(i);
		}

        // compare

        System.out.println(Arrays.compare(vars, vars2)); 

        // equals

        System.out.println(Arrays.equals(vars, vars2));

        // fill

        Arrays.fill(vars, 6);
        for (int i : vars) {
        	System.out.println(i);
        }

        // length
        System.out.println(vars.length);

        linkedLists();
        stacksQueues();
        hashTable();
	}
}