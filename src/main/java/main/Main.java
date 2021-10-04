package main;

public class Main {
    public static void main(String[] args) {
        Sala s1 = new Sala(1,40,true);
        Sala s2 = new Sala(2,45, false);
        Sala s3 = new Sala(3,35, true);

        Cinema c1 = new Cinema (1,"CineUni",true);
         c1.getSalas().add(s1);
         c1.getSalas().add(s2);

        Cinema c2 = new Cinema (2,"CineCataratas",true);
         c2.getSalas().add(s3);

        System.out.println(c1);
        System.out.println(c2);
    }
}

