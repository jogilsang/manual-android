import io.reactivex.rxjava3.core.Flowable;

public class Q_01_hello_world {

    public static void main(String... args) {
        Flowable.fromArray(args).subscribe(s -> System.out.println("Hello " + s + "!"));
    }
}
