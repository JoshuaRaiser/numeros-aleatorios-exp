package br.univali.mixnumber;

public class MixNumber {

    public static void main(String[] args) {
              
//        quadradoDoMeio(seed, rep);
//        congruenteLinear(seed, a, m, b, 200);
        
        int seed1 = 128, seed2 = 509, rep = 200;
        
        atrasoFibonacci(seed1, seed2, rep);
        
    }
    
    // gerador de atraso de Fibonacci
    public static void atrasoFibonacci(int seed1, int seed2, int rep){
        int res, pos1, pos2;
        System.out.println("x(0): "+seed1);
        System.out.println("x(1): "+seed2);
        for (int i = 2; i < rep; i++) {
            res = seed1 % seed2;
            seed1 = seed2;
            seed2 = res;
            System.out.println(res);
        }
    }
    
    // quadrado do meio
    public static void quadradoDoMeio(int seed, int rep){
        System.out.println("Congruente Linear"
                + "\nSeed:\t"+seed
                + "\nRep.:\t"+rep
                + "\n___________");
        for(int i = 0; i < rep; i++){
        
            System.out.println("xn("+i+"): "+seed);
            
            seed = seed*seed;
            seed = (seed%10000)/10;
            
        }
        System.out.println("***********************************");
    }
    
    // congruente linear
    public static void congruenteLinear(int seed, int a, int m, int b, int rep){
        System.out.println("Congruente Linear"
                + "\nSeed:\t"+seed
                + "\na:\t"+a
                + "\nm:\t"+m
                + "\nb:\t"+b
                + "\nRep.:\t"+rep
                + "\n___________");
        for (int i = 0; i < rep; i++) {
            System.out.println("xn("+i+"): "+seed);
            seed = (a*seed+b)%m;
        }
        System.out.println("***********************************");
    }
    
}
