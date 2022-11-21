import java.util.Arrays;

public class Pair<S, I> {

    private S string;
    private I integer;

    public Pair() {
    }

    public S getString() {
        return string;
    }

    public Pair<S, I> setString(S string) {
        this.string = string;
        return this;
    }

    public I getInteger() {
        return integer;
    }

    public Pair<S, I> setInteger(I integer) {
        this.integer = integer;
        return this;
    }

    public static void nullPointerException(String string) {
        if (string == null) throw new NullPointerException("string can't be null");
    }

    public static void arrayIndexOutOfBoundsException() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length+1; i++) {
            System.out.println(arr[i]);
            if (arr[i] > arr.length) throw new ArrayIndexOutOfBoundsException("array overflow " + i);
        }
    }

    public static void classCastException() {
    try {
        Object o = new Object();
        String s = (String)o;
    }catch( Exception e) {
        throw new ClassCastException("is not object " + e);
    }
    }



}
