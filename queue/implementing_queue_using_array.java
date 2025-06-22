package queue;

class Queue{
    int queue[] = new int[5];
    int size ;
    int front;
    int rear;
    public void enqueue(int data){
        queue[rear] = data;
        rear = rear+1;
        size = size+1;
    }
    public void dequeue(){

    }
    public void show(){
        for(int i=0;i<size;i++){
            System.out.println("Elements:")
        }
    }
}
public class implementing_queue_using_array {
    
}
