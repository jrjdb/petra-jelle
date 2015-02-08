import java.util.*;
import java.lang.*;

public class QueueTimer extends CollectionTimer {

  //The queue that will be benchmarked.
  private  Queue<Integer> queue;

  //Constructor that creates a QueueTimer instance for the given queue.
  public QueueTimer(Queue<Integer> queue){
    super();
    this.queue = queue;

  }

  //Constructor that creates a QueueTimer instance for the given queue that will populate it with data generated using the specified seed.
  public QueueTimer(Queue<Integer> queue, long elemGenSeed){
    super(elemGenSeed);
    this.queue = queue;
  }

  //Constructor that creates a QueueTimer instance for the given queue that will populate it with data generated using the specified seed.
  public QueueTimer(Queue<Integer> queue, Long elemGenSeed){
    super(elemGenSeed);
    this.queue = queue;
  }



  // Adds an Integer object to the queue.
  public void addElement(Integer elem){
    queue.add(elem);

  }

  // Removes an object from the queue.
  public void removeElement(){
    queue.remove();
  }

  // Returns the size of the queue.
  public int getSize(){
    return queue.size();
  }

  // Tells whether the queue is empty.
  public boolean isEmpty(){
    return queue.isEmpty();
  }


}
