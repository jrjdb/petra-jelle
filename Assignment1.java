import java.lang.*;
import java.util.*;


public class Assignment1 extends java.lang.Object {

	private  ArrayList<List<Integer>> lists;

	private  ArrayList<Queue<Integer>> queues;

	//Default constructor. Creates an empty instance of each of the data structures that are to be benchmarked
	public Assignment1(){
		lists = new ArrayList<List<Integer>>();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		Stack<Integer> stack = new Stack<Integer>();
		Vector<Integer> vector = new Vector<Integer>();
		lists.add(arrayList);
		lists.add(linkedList);
		lists.add(stack);
		lists.add(vector);

		queues = new ArrayList<Queue<Integer>>();
		LinkedList<Integer> linkedList2 = new LinkedList<Integer>();
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
		queues.add(linkedList2);
		queues.add(priorityQueue);
	}

	//Performs benchmark with random seed 0 to populate the data structures and with mutations as in CollectionTimer.DEFAULT_MUTATIONS. The result is printed to stdout
	public void benchmark(){
		System.out.println("List times:");
		for(List<Integer> l : lists){
			ListTimer listTimer = new ListTimer(l);
			System.out.println("  " + l.getClass().getSimpleName() + ": " + listTimer.time() + " ms");
		}

		System.out.println(" ");
		System.out.println("Queue times:");
		for(Queue<Integer> q : queues){
			QueueTimer queueTimer = new QueueTimer(q);
			System.out.println("  " + q.getClass().getSimpleName() + ": " + queueTimer.time() + " ms");
		}

	}

	//Performs benchmark using the given seed to populate the data structures and with mutations as in CollectionTimer.DEFAULT_MUTATIONS. The result is printed to stdout.
	public void benchmark(long elemGenSeed){
		System.out.println("List times:");
		for(List<Integer> l : lists){
			ListTimer listTimer = new ListTimer(l, elemGenSeed);
			System.out.println("  " + l.getClass().getSimpleName() + ": " + listTimer.time() + " ms");
		}

		System.out.println(" ");
		System.out.println("Queue times:");
		for(Queue<Integer> q : queues){
			QueueTimer queueTimer = new QueueTimer(q, elemGenSeed);
			System.out.println("  " + q.getClass().getSimpleName() + ": " + queueTimer.time() + " ms");
		}

	}

	//Performs benchmark by applying the specified mutations and using the given seed to populate the data structures. The result is printed to stdout.
	public void benchmark(long elemGenSeed, int[] mutations){

		System.out.println("List times:");
		for(List<Integer> l : lists){
			ListTimer listTimer = new ListTimer(l, elemGenSeed);
			System.out.println("  " + l.getClass().getSimpleName() + ": " + listTimer.time(mutations) + " ms");
		}

		System.out.println(" ");
		System.out.println("Queue times:");
		for(Queue<Integer> q : queues){
			QueueTimer queueTimer = new QueueTimer(q, elemGenSeed);
			System.out.println("  " + q.getClass().getSimpleName() + ": " + queueTimer.time(mutations) + " ms");
		}

	}

	//Main method of the program. Parses the command line options and initiates the benchmarking process according to the provided arguments.
	public static void main(String[] args){
		Assignment1 assignment = new Assignment1();
		int length = args.length;
		long seed = 0;
		int[] mutations;
		if(length == 0){
			assignment.benchmark();
		} else if(args[0].equals("-s") && length ==2){
			seed = Long.parseLong(args[1]);
			assignment.benchmark(seed);
		} else if(args[0].equals("-s") && length > 2){
			seed = Long.parseLong(args[1]);
			mutations = new int[length-2];
			for(int i=0; i<length-2; i++){
				mutations[i]=Integer.parseInt(args[i+2]);
			}
			assignment.benchmark(seed, mutations);
		} else {
			mutations = new int[length];
			for(int i=0; i<length; i++){				
				mutations[i]=Integer.parseInt(args[i]);
			}
			assignment.benchmark(seed, mutations);
		}
	}


	//Print a message to stderr and exit with value 1.
	private static void errorExit(String msg){

	}
}