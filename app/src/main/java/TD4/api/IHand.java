package TD4.api;



public interface IHand<T> extends Comparable<T>, Iterable<T>{
    
    public boolean isFull();

    public boolean contains(ICard c);

    public boolean esEmpty();

    public int size();
  

}
