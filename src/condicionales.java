public class condicionales {
    public static void main(String[] args) {
        // los condicionales y el scope funcionan igual que en Javascript
        //sacado de una prueba de hackerrank
        int d1 = 2;
        int m1 = 7;
        int y1 = 1014;
        //due
        int d2 = 1;
        int m2 = 1;
        int y2 = 1015;
        //fine
        int fine;

        //same year
        if (y1 == y2){
            //same month
            if (m1 == m2){
                if (d1 <= d2){
                    fine = 0;
                }else{
                    fine = 15 * (d1 - d2);
                }
                //monts before
            } else if (m1<m2){
                fine = 0;
                //past months
            }else {
                fine = 500 * (m1 - m2);
            }
            //a year(s) before
        }else if (y1 < y2){
            fine = 0;
            //past a year
        }else{
            fine = 10000;
        }
        System.out.println(fine);
    }
}
