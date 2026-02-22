package Queue;
class QueueArr{
    int f=-1;
    int r=-1;
    int size=0;
    int[] arr=new int[5];
    void add(int val){
        if(size==arr.length){
            System.out.println("Queue is full");
            return;
        }
        if(f==-1){
            f=r=0;
            arr[0]=val;
        }
        else if(r<arr.length-1){
            arr[++r]=val;
        }
        else if(r==arr.length-1){
            r=0;
            arr[0]=val;

        }
        size++;
    }
    int remove(){
        if(size==0){
            System.out.println("Queue is empty");
            return -1;
        }
        int val =arr[f];
        if(f==arr.length-1) f=0;
        else f++;
        size--;
        return val;

    }
    int peek(){
        if(size==0){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[f];
    }
    boolean isEmpty(){
        if(size==0) return true;
        else return false;
    }
    void display(){
        if(f<r){
            for(int i =f;i<=r;i++){
                System.out.print(arr[i]+" ");
            }
        }
        else{
            for(int i=f;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            for(int i=0;i<=r;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
}

public class CircularQueueA {
    public static void main(String[] args) {
        QueueArr q1 = new QueueArr();
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
