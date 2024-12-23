class LargestofThem {
    public static double InputNumbers(double x, double y, double z) {
        // Check if x is the largest
        if (x > y && x > z) {
            return x;
        }
        // Check if y is the largest
        if (y > x && y > z) {
            return y;
        }
        // Check if z is the largest
        if (z > x && z > y) {
            return z;
        }
        // If all numbers are equal, return any (x, y, or z) as they are the same
        return x; // Or return y or z, it doesn't matter since they are equal
    }

    public static void main(String[] args) {
        double output = InputNumbers(27.34, 89.34, 98.23);
        System.out.println(output); // This will print the largest number
    }
}
