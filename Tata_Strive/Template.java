public class Template {
    public static void main(String[] args) {
        System.out.println(avg(new int[] {1,5,5,4,1,4,5,14,5,5,45,54,54,544,5,45,45,45,4,45,45,15,51}));
        
        System.out.println(avg(new double[] {1.65,5.7,5.52,4.15,1.6,4.55,5.64,14.5,5.5,5.6,45.6,54.15,54.6,54.4,5.6,45.41,45.54,45.5,4.64,45.48,45.14,15.6,51.3}));
        System.out.println(avg2f(new double[] {1.65,5.7,5.52,4.15,1.6,4.55,5.64,14.5,5.5,5.6,45.6,54.15,54.6,54.4,5.6,45.41,45.54,45.5,4.64,45.48,45.14,15.6,51.3}));
    }

    public static double avg(int ...var){
        int sum = 0;
        for(int i=0; i<var.length; i++)
            sum += var[i];
        
        return sum/var.length;
    }

    public static double avg(double ...var){
        double sum = 0;
        for(int i=0; i<var.length; i++)
            sum += var[i];
        
        return sum/var.length;
    }

    public static double avg2f(double... var) {
        double sum = 0;
        for (int i = 0; i < var.length; i++) {
            sum += var[i];
        }
        return Math.round((sum / var.length) * 100.0) / 100.0;
    }
}
