public class Matematika implements MatematikaInterface{
    public int pertambahan (int a, int b){
        return a+b;
    }
    public int pengurangan (int a, int b){
        return a-b;
    }
    public int perkalian (int a, int b){
        return a*b;
    }
    public int pembagian (int a, int b){
        return a/b;
    }
    void perhitungan(){
        System.out.println("pertambahan : 20 + 10 ="+ pertambahan (20,10));
        System.out.println("pengurangan : 10 - 5 ="+ pengurangan(10, 5) );
        System.out.println("perkalian : 10*3 ="+ perkalian (10,3));
        System.out.println("pembagian : 21/2 ="+ pembagian (21,2));

    }
}