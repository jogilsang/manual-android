import io.reactivex.rxjava3.core.Single;

import java.util.Date;
import java.util.logging.Logger;

public class Q_05_single {

    public static void main(String[] args) {

        Single<String> single = Single.create(emitter -> emitter.onSuccess("2021-06-02"));

        single.subscribe(
                data -> System.out.println("success_1"),
                error -> System.out.println("error")
        );

        single.subscribe(
                data -> System.out.println("success_2")
        );

    }
}
