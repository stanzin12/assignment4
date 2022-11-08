class Number {
    private double x = 10;

    boolean is_zero() {
        if (this.x == 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean is_positive() {
        if (this.x > 0) {
            return true;
        }
        return false;
    }

    boolean is_negitive() {
        if (this.x < 0) {
            return true;
        }
        return false;
    }

    boolean is_even() {
        if (this.x % 2 == 0) {
            return true;
        }
        return false;
    }

    boolean is_odd() {
        if (this.x % 2 == 1) {
            return true;
        }
        return false;
    }

    boolean is_prime() {
        int i = 2;
        if (x == 0 || x == 1 || x < 0) {
            return false;
        }
        while (i <= x / 2) {
            if (x % i == 0) {
                return false;
            }
            i = i + 1;
        }
        return true;
    }

    boolean is_armstrong() {
        String s = String.valueOf(this.x);
        int i = 0;
        int sum=0;
        while (i < s.length()) {
            char c = s.charAt(i);
            int l =Integer.parseInt(String.valueOf(c));
            l=l*l*l;
            sum=sum+l;
        }
        if (sum==this.x){
            return true;
        }
        return false;

    }

    double get_factorial(){
        double a=this.x;
        double i=1;
        double fract=1;
        while(i<=a){
            fract=fract*i;
            i=i+1;
        }
        return fract;
    }

    double get_squroot(){
        double a=Math.sqrt(this.x);
        return a;
    }
    double get_sqr(){
        double a=this.x;
        return a*a;
    }
    double sum_digit(){
        double a=this.x;
        String s=String.valueOf(a);
        int i=0;
        double sum=0;
        while (i < s.length()) {
            char c = s.charAt(i);
            int l =Integer.parseInt(String.valueOf(c));
            sum=sum+l;
        }
        return sum;
    }

    double get_reversed(){
        double a=this.x;
        String s=String.valueOf(a);
        int i=s.length()-1;
        String con="";
        while (i>=0){
            con=con+s.charAt(i);
            i=i-1;
        }
        double c=Integer.parseInt(con);
        return c;


    }

}
