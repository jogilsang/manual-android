import io.reactivex.rxjava3.core.Observable;

public class Q_02_observable {

    public static void main(String[] args) {
        Observable<Integer> observable = Observable.just(10,20,30,40);

        observable.subscribe(item -> System.out.println(item));
    }

}
