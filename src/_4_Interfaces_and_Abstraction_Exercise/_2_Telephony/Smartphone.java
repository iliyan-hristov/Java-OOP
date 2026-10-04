package _4_Interfaces_and_Abstraction_Exercise._2_Telephony;


import java.util.LinkedList;
import java.util.List;

public class Smartphone implements Browsable, Callable {

    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = new LinkedList<>(numbers);
        this.urls = new LinkedList<>(urls);
    }


    @Override
    public String browse() {
        return String.valueOf(this.urls);
    }

    @Override
    public String call() {
        return String.valueOf(this.numbers);
    }

    public List<String> getNumbers() {
        return numbers;
    }

    public List<String> getUrls() {
        return urls;
    }
}
