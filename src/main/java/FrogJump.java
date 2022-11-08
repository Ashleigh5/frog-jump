public class FrogJump {

    // Creating a method
    public int solution(int startPosition, int endPosition, int stepSize) {
        int count = 0;
        for (int i = startPosition; i < endPosition; i = i + stepSize) {
            count = count + 1;
        }
        return count;
    }
}
