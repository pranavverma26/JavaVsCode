class MaxHeap{
    int[] arr;
    int size;
    MaxHeap(int capacity){
        arr=new int[capacity];
        size=0;
    }
    void add(int num){
        arr[size++]=num;
        upheapify(size-1);
    }
    void upheapify(int idx){
        if(idx==0) return;
        int parent = (idx-1)/2;
        if(arr[idx]>arr[parent]){
            swap(idx,parent);
            upheapify(parent);
        }
    }
    void swap(int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    int size(){
        return size;
    }
    int peek(){
        if(size==0){
            System.out.println("Heap is empty");
            return -1;
        }
        return arr[0];
    }
    void print(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }
    int remove(){
        if(size==0) System.out.println("Heap is empty");
        int peek = arr[0];
        swap(0,size-1);
        size--;
        DownHeapify(0);
        return peek;
    }
    void DownHeapify(int idx){
        if(idx>size) return;
        int lc=2*idx+1;
        int rc=2*idx+2;
        int minIdx=idx;
        if(lc<size && arr[lc]>arr[minIdx]) minIdx=lc;
        if(rc<size && arr[rc]>arr[minIdx]) minIdx=rc;
        if(idx==minIdx) return;
        swap(idx,minIdx);
        DownHeapify(minIdx);

    }
    
}
public class MaxHeapImplement {
    public static void main(String[] args) {
        MaxHeap arr = new MaxHeap(10);
        arr.add(10);
        arr.print();
        arr.add(21);
        arr.print();
        arr.add(2);
        arr.print();
        arr.add(0);
        arr.remove();
        arr.print();
        arr.add(7);
        arr.print();
        arr.add(100);
        arr.print();
        arr.add(11);
        arr.print();
        arr.remove();
        System.out.println(arr.peek());
    }
    
    
}
