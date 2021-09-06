public class condicionales {
    public static void main(String[] args) {
        // los condicionales y el scope funcionan igual que en Javascript
        //sacado de una prueba de hackerrank
        int d1 = 23;
        int m1 = 12;
        int y1 = 2022;
        //due
        int d2 = 31;
        int m2 = 12;
        int y2 = 2021;
        //fine
        int fine;

        if (y1 <= y2){
            if (m1 <= m2){
                if (d1 <= d2){
                    fine = 0;
                }else{
                    fine = 15 * (d1 + d2);
                }

            } else {
                fine = 500 * (m1 - m2);
            }
        }else{
            fine = 10000;
        }
        System.out.println(fine);
    }
}
