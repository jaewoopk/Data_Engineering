package kr.ac.sejong.kmook.Data_Engineering;

public class Email {
    int to;
    int from;

    public Email (int to, int from) {
        this.to = to;
        this.from = from;
    }

    @Override
    public String toString() {
        return this.to + " -> " + this.from;
    }
}
