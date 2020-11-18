package lesson6;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        int[] a = new int[]{1, 4, 4, 4, 1, 4};
        int[] b = new int[]{1, 4, 5};

        System.out.println(m.validateArrayByOneAndFour(a));
        System.out.println(m.validateArrayByOneAndFour(b));
    }

    public boolean validateArrayByOneAndFour(int[] array) {
        boolean containsOne = false;
        boolean containsFour = false;
        for (int i : array)
            if (i == 1)
                containsOne = true;
            else if (i == 4)
                containsFour = true;
            else
                return false;
        return containsOne && containsFour;
    }
}
