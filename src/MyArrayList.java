public class MyArrayList {

    private int size = 0;
    private String[] myArray = new String[4];
    private int capacity = 4;

    public MyArrayList(){

    }


    public int getSize() {
        return size;
    }

    public void add(String s){
        if(size == capacity)
        {
            resize(2*capacity);
        }
        myArray[size] = s;
        size++;
    }

    public void add(String s, int index){
        if(size == capacity)
        {
            resize(2*capacity);
        }
        if(index<size+1) {
            for (int i = 1; i < size - index; i++) {
                myArray[size + i] = myArray[size - i - 1];
            }
            myArray[index] = s;
            size++;
        }
    }

    public void remove(){
        if(4*size == capacity && capacity > 4){
            resize(capacity/2);
        }
        myArray[size-1] = null;
        size--;
    }

    public void remove(String key){
        if(4*size == capacity && capacity > 4){
            resize(capacity/2);
        }
        String temp = myArray[0];
        for(int i = 0; i < size; i++) {
            if (temp.equals(key)) {
                myArray[i] = null;
                size--;
                return;
            }
            temp = myArray[i + 1];
        }
    }

    public boolean search(String key){
        String temp = myArray[0];
        for(int i = 0; i < size; i++)
        {
            if(temp.equals(key)) return true;
            temp = myArray[i+1];
        }
        return false;
    }
    public void print(){
        System.out.print("| ");
        for(int i = 0; i < capacity; i++){
            System.out.print(myArray[i] + " | ");
        }
        System.out.println();
    }

    void resize(int capacity) {
        String[] newArray = new String[capacity];
        for(int i = 0; i < size; i++){
            newArray[i] = myArray[i];
        }
        myArray = newArray;
        this.capacity = capacity;
    }

    public String getElement(int index){
        return myArray[index];
    }

}

