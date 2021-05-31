import com.sun.javafx.logging.PulseLogger;
import io.reactivex.rxjava3.processors.PublishProcessor;
import org.reactivestreams.Processor;

public class Q_04_hot_pulisher {

    public static void main(String[] args) {
        PublishProcessor<Integer> publishProcessor = PublishProcessor.create();

        publishProcessor.subscribe(data -> System.out.println("Subscriber 1 : " + data));
        publishProcessor.onNext(1);
        publishProcessor.onNext(2);

        publishProcessor.subscribe(data -> System.out.println("Subscriber 2 : " + data));
        publishProcessor.onNext(3);
        publishProcessor.onNext(4);

        // Result
        // Subscriber 1 : 1
        // Subscriber 1 : 2
        // Subscriber 1 : 3
        // Subscriber 2 : 3
        // Subscriber 1 : 4
        // Subscriber 2 : 4
    }
}
