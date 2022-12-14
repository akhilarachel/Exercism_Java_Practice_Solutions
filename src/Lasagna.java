public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public static int expectedMinutesInOven() {
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public static int remainingMinutesInOven(int actualTime) {
        return expectedMinutesInOven() - actualTime;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public static int preparationTimeInMinutes(int numberOfLayers) {
        return numberOfLayers * 2;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public static int totalTimeInMinutes(int noOfLayers, int elapsedTime) {
        return preparationTimeInMinutes(noOfLayers) + elapsedTime;
    }

    public static void main (String[] args) {
        System.out.println(expectedMinutesInOven());
        System.out.println(remainingMinutesInOven(10));
        System.out.println(preparationTimeInMinutes(4));
        System.out.println(totalTimeInMinutes(4, 10));
    }
}
