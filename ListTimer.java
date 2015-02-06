import java.util.*;
import java.lang.*;

public class ListTimer extends CollectionTimer {

	//The list that will be benchmarked.
	private List<Integer> list;

	//Constructor that creates a ListTimer instance for the given list.
	public ListTimer(List<Integer> list){
		super();
		this.list = list;
	}

	//Constructor that creates a ListTimer instance for the given list that will populate it with data generated using the specified seed.
	public ListTimer(List<Integer> list, long elemGenSeed){
		super(elemGenSeed);
		this.list = list;

	}

	//Adds an Integer object to the list
	public void addElement(Integer elem){
		list.add(elem);
	}

	//Returns the size of the list.
	public int getSize(){
		int size = list.size();
		return size;

	}

	//Tells whether the list is empty.
	public boolean isEmpty(){
		if(list.isEmpty()){
			return true;
		} else {
			return false;
		}
	}


	//Removes an object from the list.
	public void removeElement() throws IndexOutOfBoundException, UnsupportedOperationException {
			list.remove();
		} 
	}
	
}