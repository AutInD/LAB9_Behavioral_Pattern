package authapol;

import java.util.concurrent.Flow;

public abstract class StringSubscriber implements Flow.Subscriber {
    public abstract void onSubscribe(Flow.Subscription subscription);
    public abstract void onNext(Object item);
    public void onError(Throwable throwable){

    }
    public void onComplete(){

    }
}
