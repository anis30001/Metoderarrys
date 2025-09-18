package se.anis.iths.project1;

public class metoder {
        public static int hittaMax(int[] tal) {
            int max = tal[0];
            for (int i = 1; i < tal.length; i++) {
                if (tal[i] > max) {
                    max = tal[i];
                }
            }
            return max;
        }

        public static double storstDouble(double a, double b) {
            if (a > b) {
                return a;
            } else {
                return b;
            }

}

        public static void skrivNamn(String firstName, String lastName) {
            System.out.println(firstName + " " + lastName);
        }
    }


