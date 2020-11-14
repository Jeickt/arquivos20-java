public class Cidade {

    private String cidade;
    private String uf;
    
    public Cidade(String cidade, String uf) {
        this.cidade = cidade;
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }
    
    public String getUf() {
        return uf;
    }
    
    public void exibeDados() {
        System.out.println("Cidade: " + cidade);
        System.out.println("UF: " + uf);
    }
}