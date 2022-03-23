public class MyList<T> {
    T[] data;
    public static int size = 0;

    public MyList(int s)
    {
        data = (T[]) new Object[s];
    }

    public MyList(dimension) {
        return size;
    }

    public void add(T element) {
        if (size >= data.length) {
            System.out.println("Doubling capacity");
            T[] cpy = (T[]) new Object[size];
            for(int i = 0; i < size; i++) {
                cpy[i] = data[i];
            }
            data = (T[]) new Object[data.length * 2];
            for (int i = 0; i < size; i++) {
                data[i] = cpy[i];
            }
        }
        data[size++] = element;
        System.out.println("Added element " + element);
    }

    public void print(T[] arr) {
        for(T t: arr){
            System.out.print(t+" ");
        }
        System.out.println("");
    }


    public boolean lookup(T element){
            if (myList[size].equals(data))
            {
                return false;
            }
            else
                myList[size] = myList[size - 1];

            return true;
        }
    }
}
