import java.util.ArrayList;
import java.time.LocalDate;

public class DespesaTeste {
    public static void main(String[] args) {
    //ArrayList<String> carros = new ArrayList<String>();
    //ArrayList<Despesa> despesas = new ArrayList<Despesa>();
    
    DespesaPessoal despesaPessoal = new DespesaPessoal("125.987.651-89");
    despesaPessoal.despesas.add(new Despesa(LocalDate.of(2020,1,1),"Mercado",10.89));
    despesaPessoal.despesas.add(new Despesa(LocalDate.of(2020,2,1),"asas",5.89));
    despesaPessoal.despesas.add(new Despesa(LocalDate.of(2020,1,1),"Mafas",10.89));
    despesaPessoal.imprime();
    

    /*
    despesas.add(new Despesa(LocalDate.of(2020,1,1),"Mercado",10.89));
    despesas.add(new Despesa(LocalDate.of(2020,2,27),"Luz",50.77));
    despesas.add(new Despesa(LocalDate.of(2020,1,1),"Farmarcia",22.77));
    despesas.add(new Despesa(LocalDate.of(2020,1,1),"Feira",15.50));
    despesas.add(new Despesa(LocalDate.of(2020,1,2),"Gas",30.55));
    despesas.add(new Despesa(LocalDate.of(2020,1,4),"Luz",80.33));
    despesas.add(new Despesa(LocalDate.of(2020,1,5),"Internet",74.12));
    despesas.add(new Despesa(LocalDate.of(2020,2,1),"Mercado",100.22));
    despesas.add(new Despesa(LocalDate.of(2020,2,1),"Farmarcia",42.21));
    despesas.add(new Despesa(LocalDate.of(2020,2,1),"Feira",30.15));
    despesas.add(new Despesa(LocalDate.of(2020,2,2),"Gas",20.17));
    despesas.add(new Despesa(LocalDate.of(2020,2,4),"Luz",67.31));
    despesas.add(new Despesa(LocalDate.of(2020,2,5),"Internet",55.43));

    for (Despesa desp: despesas) {
        System.out.println(desp);
        }
    }*/

    }
}