package projetolivro;
public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Felipe", 25, "M");
        p[1]  = new Pessoa("Maria", 24,"F");
        
        l[0] = new Livro("Apredendo Java", "José da Silva", 300, p[0]);
        l[1] = new Livro("POO para iniciantes", "Felipe Silva", 400, p[1]);
        l[2] = new Livro("Java Avançado", "Jonas Araujo", 500, p[0]);
        
        l[0].abrir();
        l[0].folhear(100);
        l[0].avancarPag();
        
        System.out.println(l[0].detalhes());
    }
    
    
}
