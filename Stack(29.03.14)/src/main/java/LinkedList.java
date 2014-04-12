import java.util.LinkedHashMap;

/**
 * Created by okashinR on 09/04/14.
 */
public class LinkedList <T> implements List {

   private class Refer<T>{

       T data;
       Refer next;
       public Refer(){
           next = null;
       }
       public Refer(T arg, Refer next){
       data = arg;
       this.next = next;
         }
   }
    private Refer first;
    private Refer last;


    @Override
    public void add(Object arg) {
        if(first != null){
        last.next = new Refer(arg,null);
        last=last.next;}
        else{
        first = new Refer(arg,null);
        last = first;}
    }



    LinkedList(){
       first = null;
       last = null;
    }

    LinkedList(T arg){

       first = new Refer(arg,null);
        last = first;

    }

    LinkedList(LinkedList list){
        Refer temp;
        temp = list.first;
        while(temp != null){
            this.add(temp.data);
        }


    }

    int size(){
       Refer count = first;
        int size = 0;
        while(count != null ){
            size++;
            count = count.next;
        }
        return size;
    }



    @Override
    public T peek() {
        return (T)last.data;
    }

    @Override
    public T remove() {
        Refer temp = first;
        while (temp.next != last)
            temp = temp.next;
        T data = (T) temp.next.data;
        last = temp;
        last.next = null;

        return data;
    }



}