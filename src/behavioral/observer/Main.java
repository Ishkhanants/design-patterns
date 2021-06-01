package behavioral.observer;

public class Main {
    public static void main(String[] args) {
        NewsAgency observable = new NewsAgency();
        NewsChannel observer = new NewsChannel();

        observable.addObserver(observer);

        observable.setNews("news");
        System.out.println(observer.getNews().equals("news"));

        PCLNewsAgency pclObservable = new PCLNewsAgency();
        PCLNewsChannel pclObserver = new PCLNewsChannel();

        pclObservable.addPropertyChangeListener(pclObserver);

        pclObservable.setNews("news");
        System.out.println(pclObserver.getNews().equals("news"));
    }
}
