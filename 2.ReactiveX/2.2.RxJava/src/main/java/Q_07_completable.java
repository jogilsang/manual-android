import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class Q_07_completable {

    public static void main(String[] args) {
        Completable completable = Completable.create(emitter -> {
                // 데이터를 발행하는 것이 아니라, 특정 작업을 수행한 후 완료를 통지한다
            int sum = 0;
            for (int i = 0; i < 100; i++) {
                sum += i;
            }
            System.out.println("합계");

            emitter.onComplete();
        });

        completable.subscribeOn(Schedulers.computation())
                .subscribe(
                        () -> System.out.println("on_complete"),
                        error -> System.out.println("on_error")
                );
    }
}
