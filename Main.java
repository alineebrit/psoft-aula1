public class Main {
    public static void main(String[]args){
        Produto  produto1 = new Produto("bolacha",  "Nestlé",  4.99);
        Lote lote1 = new Lote(45, "15/04/2025", produto1);
    }
}
