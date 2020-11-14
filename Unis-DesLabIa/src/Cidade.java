
/**
 * Write a description of class Cidade here.
 *
 * @author (Rosemary)
 * @version (1)
 */
public class Cidade
{
    // atributos
    private int codigo;
    private String descricao;
    private String uf;
    private int qtdeEstudantes;

    /**
     * Constructor for objects of class Cidade
     */
    public Cidade(int c, String d, String u)
    {
        // initialise instance variables
        codigo = c;
        descricao = d;
        uf = u;
    }

    /**
     * Metodos Get
     */
    public int getCodigo()
    {
        return codigo;
    }
    
    public String getDescricao()
    {
        return descricao;
    }
    
    public String getUF()
    {
        return uf;
    }
    
    // Metodo adicionaNovoEstudante
    public void adicionaNovoEstudante()
    {
        qtdeEstudantes++;
    }
    
    //Metodo exibeDados
    public void exibeDados()
    {
        System.out.println("Código: " + codigo);
        System.out.println("Descrição: " + descricao);
        System.out.println("UF: " + uf);
        System.out.println("Qtde. Estudantes: " + qtdeEstudantes);
    }
}
