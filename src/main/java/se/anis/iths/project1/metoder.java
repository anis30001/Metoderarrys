package se.anis.iths.project1;

public class metoder {
        // Hitta max i en int-array
        public static int hittaMax(int[] tal) {
            int max = tal[0];
            for (int i = 1; i < tal.length; i++) {
                if (tal[i] > max) {
                    max = tal[i];
                }
            }
            return max;
        }

        // Returnera största double
        public static double storstDouble(double a, double b) {
            if (a > b) {
                return a;
            } else {
                return b;
            }

}

        // Skriv ut namn
        public static void skrivNamn(String firstName, String lastName) {
            System.out.println(firstName + " " + lastName);
        }
    }


