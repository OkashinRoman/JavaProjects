/**
 * Created by okashinR on 10/04/14.
 */
public class Stack<T> {
    private LinkedList<T> list;

    public Stack(T arg){
     list = new LinkedList<T>(arg);

    }

    public Stack(){
        list = new LinkedList<T>();
    }

  public Stack(Stack stack){
      list = new LinkedList<T>(stack.list);



   }


    public void push(T obj){
        list.add(obj);
    }

    public T pop(){
       return list.remove();
      }

    public T peek(){
       return list.peek();
    }

    public int size(){
    return  list.size();

    }
}
