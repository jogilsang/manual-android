import io.reactivex.rxjava3.core.Flowable;

public class Q_03_cold_publisher {

    public static void main(String[] args) {

        Flowable<Integer> flowable = Flowable.just(10,20,30,40);

        flowable.subscribe(data -> System.out.println("Subscriber 1 : " + data));
        flowable.subscribe(data -> System.out.println("Subscriber 2 : " + data));

        // Result
        // Subscriber 1 : 10
        // Subscriber 1 : 20
        // Subscriber 1 : 30
        // Subscriber 1 : 40
        // Subscriber 2 : 10
        // Subscriber 2 : 20
        // Subscriber 2 : 30
        // Subscriber 2 : 40

    }
}
