import java.util.*;
class trial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Input Distance in Meters : ");
        int a = sc.nextInt();
        System.out.println(" Input Hours : ");
        int b = sc.nextInt();
        System.out.println(" Input Minutes : ");
        int c = sc.nextInt();
        System.out.println(" Input Seconds : ");
        int d = sc.nextInt();
       
        double x = b + (c/60)+ (d/3600);
        double y= (b*3600)+(c*60)+d;

        double km_hr = (a/1000)/x;
        double m_s = (a/y);
        double mil_hr =(a*0.621/1000)/x;

        System.out.println("km/hr : "+ km_hr);
        System.out.println(" m/s : " + m_s);
        System.out.println(" mile/hr : " + mil_hr);
    }
}
