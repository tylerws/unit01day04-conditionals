public class Quadratic {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        double bsq = Math.pow(b, 2);
      
        double discrim = (bsq - (4 * a * c));
        double result1 =  (-b + Math.sqrt(bsq - discrim)) / (2 * a);
        double result2 =  (-b - Math.sqrt(bsq - discrim)) / (2 * a);
       
        if (a == 0) {
            double noa = -c / (double) b;
            System.out.println(noa);
        } else if (discrim < 0) {
            System.out.println("no solution");
        } else {
            System.out.println(result1 + "," + result2);
        }

        
    }
}
