import java.util.*;

public abstract class CollectionTimer extends java.lang.Object {
	
	//Default sequence of inserts and deletions that is used to time the data structure: 10000 insertions followed by their removal.
	public static final int[] DEFAULT_MUTATIONS = {10000, -10000};

	//Generator of objects that are inserted into the data structure.
	private Random elemGen = new Random();


	//Default constructor. Creates a CollectionTimer instance in which the random object generator is instantiated with seed 0
	public CollectionTimer(){
		this(0);
	}

	//Constructor that creates a CollectionTimer instance with a random object generator with the specified seed.
	public CollectionTimer(long elemGenSeed){
		elemGen.setSeed(elemGenSeed);
	}

	//Adds the given object to the data structure.
	public abstract void addElement(Integer elem);


	//Removes some object from the data structure.
	public abstract void removeElement();



	//Determines the size of the data structure that is being timed.
	public abstract int getSize();


	//Tests wheter the data structure that is being timed is empty.
	public abstract boolean isEmpty();


	//Inserts a specified number of Integer objects into the data structure
	public void insert(int amount){
		for(int i=0; i<amount; i++){
			addElement(elemGen.nextInt());
		}

	}

	//Removes a specified number of objects from the data structure.
	public boolean extract(int amount){
		for(int i=0; i<amount; i++){
			if(!isEmpty()){
				removeElement();
			} else {
				return false;			
			}
		}
		return true;
	}

	public long time(){
		long start = System.currentTimeMillis();
		for(int mutations : DEFAULT_MUTATIONS) {
			if(mutations > 0){
				insert(mutations);
			} else {
				extract(mutations*-1);
			}
		}
		long stop = System.currentTimeMillis();
		long difference = stop - start;
		return difference;

	}

	public long time(int[] mutations){
		long start = System.currentTimeMillis();
		for(int i=0; i<mutations.length; i ++) {
			int mutation = mutations[i];
			if(mutation > 0){
				insert(mutation);
			} else {
				extract(mutation*-1);
			}
		}
		long stop = System.currentTimeMillis();
		long difference = stop - start;
		return difference;		
	}


}