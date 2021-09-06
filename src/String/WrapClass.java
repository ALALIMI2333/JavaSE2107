package String;

public class WrapClass {
    public static void main(String[] args) {

        int n=5;
        Integer x =8;
        //Double d = 3.5;

        Integer y = Integer.valueOf(8);
        System.out.println(y);

        Double d = 3.5;
        Double dx = Double.valueOf(3.5);
        System.out.println(dx);

        int a = x;
        a = x.intValue();
        double b = d;
        b = d.doubleValue();
        System.out.println(a);
        System.out.println(b);

        long t1 = System.currentTimeMillis();
        int sum = 0;
        for (int i=0;i<500000;i++){
            sum += i;

        }

        long t2 = System.currentTimeMillis();
        Integer sumI = 0;
        for (int i =0;i<500000;i++){
            sumI +=i;
        }
        long t3 =System.currentTimeMillis();
        System.out.println(t2-t1);
        System.out.println(t3-t2);


        Integer i1= -20;
        Integer i2= -20;
        System.out.println(i1 == i2);//true
        i1 = 128;
        i2 = 128;
        System.out.println(i1 == i2);//false

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        long lmax = Long.MAX_VALUE;
        long lmin = Long.MIN_VALUE;
        System.out.println(max);
        System.out.println(min);
        System.out.println(lmax);
        System.out.println(lmin);

        String str = "1234.9";
        //int num = Integer.parseInt(str);
        double nnn = Double.parseDouble(str);
        System.out.println(nnn);
        str = "123.56";
        double dnum = Double.parseDouble(str);
        //System.out.println(num+num);
        System.out.println(dnum+dnum);




    }
}
