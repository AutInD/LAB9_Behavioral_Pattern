package authapol;

import java.util.concurrent.Flow;

public class StringSubscription implements Flow.Subscription {
    private long count;
    public Flow.Subscriber subscriber;
    public StringSubscription(Flow.Subscriber subscriber) {
        this.subscriber = subscriber;
    }

    public void request(long n){
        this.count += n;
    }
    public void cancel(){
        this.count = 0;
    }
    public void post(String string){
        subscriber.onNext(string);
    }


}
