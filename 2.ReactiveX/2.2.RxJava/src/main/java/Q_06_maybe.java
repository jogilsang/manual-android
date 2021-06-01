import io.reactivex.rxjava3.core.Maybe;

public class Q_06_maybe {

    public static void main(String[] args) {


        Maybe<String> maybe = Maybe.create(emitter -> {
            emitter.onSuccess("2021-06-02");
            emitter.onComplete();
        });

        // Maybe.just
        // Maybe.empty
        // Maybe.fromSingle

        maybe.subscribe(
                data -> System.out.println("onSuccess is null"),
                error -> System.out.println("onError is null"),
                () -> System.out.println("onComplete is null")
        );
    }
}
