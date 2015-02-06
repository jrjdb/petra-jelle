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

	}

	//Performs benchmark using the given seed to populate the data structures and with mutations as in CollectionTimer.DEFAULT_MUTATIONS. The result is printed to stdout.
	public void benchmark(long elemGenSeed){

	}

	//Performs benchmark by applying the specified mutations and using the given seed to populate the data structures. The result is printed to stdout.
	public void benchmark(long elemGenSeed, int[] mutations){

		//lists[0].time();
	}

	//Main method of the program. Parses the command line options and initiates the benchmarking process according to the provided arguments.
	public static void main(String[] args){
		int length = args.length;
		if(length == 0){
			benchmark();
		} else {
			ArrayList<Integer> mutationList = new ArrayList<Integer>();
			long seed;
			if(args[0].equals("-s")){
				seed = Long.parseLong(args[1]);
				if(length == 2){
					benchmark(seed);
				} else {
					for(int i=2; i<length; i++){
						mutationList.add(Integer.parseInt(args[i]));
					}
				} 
			} else {
				for(int i=0; i<length; i++){
					mutationList.add(Integer.parseInt(args[i]));
				}
				seed = 0;
			}
			int[] mutations = new int[mutationList.size()];
			mutations = mutationList.toarray(mutations);
			benchmark(seed, mutations);
		}

	}

	//Print a message to stderr and exit with value 1.
	private static void errorExit(java.lang.String msg){

	}
}