import java.lang.Object.*;

public class Assignment1{

	private  java.util.ArrayList<java.util.List<java.lang.Integer>> lists;

	private  java.util.ArrayList<java.util.Queue<java.lang.Integer>> queues;

	//Default constructor. Creates an empty instance of each of the data structures that are to be benchmarked
	public Assignment1(){

	}

	//Performs benchmark with random seed 0 to populate the data structures and with mutations as in CollectionTimer.DEFAULT_MUTATIONS. The result is printed to stdout
	public void benchmark(){

	}

	//Performs benchmark using the given seed to populate the data structures and with mutations as in CollectionTimer.DEFAULT_MUTATIONS. The result is printed to stdout.
	public void benchmark(long elemGenSeed){

	}

	//Performs benchmark by applying the specified mutations and using the given seed to populate the data structures. The result is printed to stdout.
	public void benchmark(long elemGenSeed, int[] mutations){

	}

	//Main method of the program. Parses the command line options and initiates the benchmarking process according to the provided arguments. See the class description for an overview of the accepted paramers.
	public static void main(java.lang.String[] args){

	}

	//Print a message to stderr and exit with value 1.
	private static void errorExit(java.lang.String msg){

	}
}