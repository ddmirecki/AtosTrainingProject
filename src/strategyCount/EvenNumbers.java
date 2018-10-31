package strategyCount;

public class EvenNumbers implements Calculate {
    @Override
    public int evaluate(int[] inputNumbers) {
        int counter = 0;
        for (int i = 0; i < inputNumbers.length; i++) {
            if (inputNumbers[i] % 2 == 0){
                counter++;
            }
        }
        return counter;
    }
}
