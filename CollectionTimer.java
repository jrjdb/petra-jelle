public class CollectionTimer{
	
	//Default sequence of inserts and deletions that is used to time the data structure: 10000 insertions followed by their removal.
	public static final int[] DEFAULT_MUTATIONS;

	//Generator of objects that are inserted into the data structure.
	private java.util.Random elemGen;

	//adds the given object to the data structure
	abstract void addElements(java.lang.Integer elem){

	}

	//removes a specified number of objects that is being timed
	boolean extract(int amount){

	}

	//Default constructor. Creates a CollectionTimer instance in which the random object generator is instantiated with seed 0
	public CollectionTimer(){

	}

	//Constructor that creates a CollectionTimer instance with a random object generator with the specified seed.
	public CollectionTimer(long elemGenSeed){

	}

	//Adds the given object to the data structure.
	public abstract void addElement(java.lang.Integer elem){

	}

	//Removes some object from the data structure.
	public abstract void removeElement(){

	}

	//Determines the size of the data structure that is being timed.
	public abstract int getSize(){

	}

	//Tests wheter the data structure that is being timed is empty.
	public abstract boolean isEmpty(){

	}

	//Inserts a specified number of Integer objects into the data structure
	public void insert(int amount){

	}

	//Removes a specified number of objects from the data structure.
	public boolean extract(int amount){

	}

	public long time(){

	}

	public long time(int[] mutations){
		
	}


}