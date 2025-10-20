package Stack;
import java.util.*;

public class Carfleet853 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int target = s.nextInt();
        s.nextLine(); // consume newline after target

        // input positions
        String[] parts = s.nextLine().trim().split("\\s+");
        int[] positions = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            positions[i] = Integer.parseInt(parts[i]);
        }

        // input speeds
        parts = s.nextLine().trim().split("\\s+");
        int[] speed = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            speed[i] = Integer.parseInt(parts[i]);
        }

        System.out.println(carfleet(target, positions, speed));
    }

    public static int carfleet(int target, int[] positions, int[] speed) {
        int n = positions.length;
        double[][] cars = new double[n][2];

        // store position and time
        for (int i = 0; i < n; i++) {
            cars[i][0] = positions[i];
            cars[i][1] = (double)(target - positions[i]) / speed[i];
        }

        // sort cars by position descending
        Arrays.sort(cars, (a, b) -> Double.compare(b[0], a[0]));

        Stack<Double> stack = new Stack<>();

        // count fleets
        for (int i = 0; i < n; i++) {
            double time = cars[i][1];
            if (stack.isEmpty() || time > stack.peek()) {
                stack.push(time);
            }
        }

        return stack.size();
    }
}
