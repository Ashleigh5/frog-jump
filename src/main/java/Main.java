public class Main {
    public static void main(String[] args) {

        //start at 0, get to position 10, each step is 2. Count how many steps to get to 10
        int count = 0;
        for (int i = 0; i < 10; i = i + 2) {
            count = count + 1;
        }
        System.out.println(count);

        // Refactored Code
        int start = 0;
        int end = 10;
        int stepSize = 2;
        int distanceRemaining = end - start;
        int countTwo = 0;
        for (int i = distanceRemaining; i > 0; i = i - stepSize) {
            countTwo = countTwo + 1;
        }
        System.out.println(countTwo);

        // Refactored code Again
        int countThree = 0;
        while (distanceRemaining > 0) {
            distanceRemaining = distanceRemaining - stepSize;
            countThree = countThree + 1;
        }
        System.out.println(countThree);

        // Calling method
        FrogJump object = new FrogJump();
        System.out.println(object.solution(1, 2, 3));
        System.out.println(object.solution(0, 10, 2));
        System.out.println(object.solution(4, 14, 1));
    }
}


