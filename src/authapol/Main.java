package authapol;

public class Main {

    public static void main(String[] args) {
        StringPublisher publisher = new StringPublisher("abcd-*///-*@@#$");
        AlphabetSubscriber alphabetSubscriber = new AlphabetSubscriber();
        publisher.subscribe(alphabetSubscriber);

        NumberSubscriber numberSubscriber = new NumberSubscriber();
        publisher.subscribe(numberSubscriber);

        SymbolSubscriber symbolSubscriber = new SymbolSubscriber();
        publisher.subscribe(symbolSubscriber);
        publisher.postString();
    }
}
