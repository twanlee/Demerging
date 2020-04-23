import java.util.Arrays;

public class QueueList {
    private int head = 0;
    private int tail = -1;
    private Staff[] array;
    private int size ;
    public QueueList (int size){
        this.size = size;
        array = new Staff[this.size];
    }
    private void ensureSize(){
        int newSize = size*2;
        if( tail == size -1)
            array = Arrays.copyOf(array,newSize);
    }
    private boolean isEmpty(){
        return tail == -1;
    }
    public void enqueue(Staff employee){
        ensureSize();
        tail++;
        array[tail] = employee;
    }
    public void dequeue(QueueList output){
        int j = 0;
        Staff[] temp = new Staff[array.length];
        if(isEmpty())
            System.out.println("This queue is empty");
        else {
            output.enqueue(array[head]);
            for (int i = 1; i < array.length ; i++) {
                temp[j] = array[i];
                j++;
            }
            tail--;
            array = temp;
        }
    }

    public int getTail(){
        return  tail;
    }
    public Staff[] getArray(){
        return array;
    }
}
