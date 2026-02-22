package Queue;
class QueueA{
    int f=-1;
    int r=-1;
    int size=0;
    int[] arr = new int[100];

    void add(int val){
        if(r==arr.length-1){
            System.out.println("Queue is full");
        }

        if(f==-1){
            f=r=0;
            arr[r]=val;
        }
        else{
            arr[++r]=val;
        }
        size++;
    }

    int remove(){
        if(size==0){
            System.out.println("Queue is Empty");
            return -1;
        }
        f++;
        size--;
        return arr[f-1];
    }
    int peek(){
        if(size==0){
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[f];
    }
    void display(){
        for(int i=f;i<=r;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    boolean isEmpty(){
        if(size==0) return true;
        else return false;
    }
}

public class ArrayQueueImple {
    public static void main(String[] args) {
        QueueA q1 = new QueueA();
        System.out.println(q1.isEmpty());
        System.out.println(q1.size);
        q1.add(1);
        q1.add(2);
        q1.display();
        System.out.println(q1.size);
        q1.add(3);
        System.out.println(q1.remove());
        q1.display();
        q1.add(4);
        System.out.println(q1.peek());
        q1.add(5);
        q1.display();
        System.out.println(q1.size);
        q1.remove();
        q1.display();
        System.out.println(q1.size);
        
    }
    
}
