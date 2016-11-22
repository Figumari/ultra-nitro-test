import java.lang.reflect.Array;

/**
 * Test, PACKAGE_NAME
 * Mario Winiker
 * 31/03/2016
 */
public class Pocket<T> {
    //****attributes**********************************
    private T value;

    //****constructors********************************
    Pocket(){;
    }
    Pocket(T value){
        this.value = value;
    }

    //****methods************************************
    public T getValue(){
        return value;
    }

    public void setValue(T value){
        this.value = value;
    }
}
