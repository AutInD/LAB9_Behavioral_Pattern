package authapol;

import java.util.concurrent.Flow;

public class AlphabetSubscriber extends StringSubscriber{

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        subscription.request(1);
    }

    @Override
    public void onNext(Object item) {
        System.out.println("Alphabet " + item);
    }
}
