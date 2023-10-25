import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    private final int min;
    private final int max;
    private final Random random;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
        this.random = new Random();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RandomsIterator();
    }

    private class RandomsIterator implements Iterator<Integer> {
        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            if (min >= max) {
                throw new NoSuchElementException("Достигнут конец диапазона чисел");
            }
            return random.nextInt(max - min + 1) + min;
        }
    }
}