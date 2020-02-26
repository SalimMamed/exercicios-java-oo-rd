package exercicio02;

public abstract class Funcionario {

    private String nome;
    private int salarioMensal;

    public void salarioAnual();{
        System.out.println(salarioMensal * 13);

    }

}
