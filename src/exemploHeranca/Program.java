package exemploHeranca;

public class Program {
    public static void main(String[] args) {

        BusinessAccount account = new BusinessAccount();


        Account acc = new Account(1001,"Alex",0.0);
        BusinessAccount bacc = new BusinessAccount(1002,"Maria", 0.0,500.0);

        // UPCASTING

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003,"Bob",0.0,200.0);
        Account acc3 = new SavingsAccount(1004,"Ana",0.0,0.1);
        // Pq isso dá certo? pq é uma relacao "é-um", uma bacc é uma acc! Entao podemos atribuir um obj
        // do tipo conta empresarial para do tipo conta

        //DOWNCASTING - Converter um objeto da Superclasse para a subclasse
        //BusinessAccount acc4 = new acc2; ->
        // isso daria erro! Nao podemos converter um tipo account Para Business Account
        // Para isso, precisamos fazer um casting manual:
        // acc2.loan(100.0); nesse momento nao vai funcionar
        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(100.0); // apos o downcasting, isso é possivel.

        //BusinessAccount acc5 = (BusinessAccount) acc3;
        // Esse comando vai dar erro na hra de rodar(em runtime), pois acc3 foi instanciada como uma
        // Savings account!!!
        // Para evitar esse erro usaremos o instanceof da seguinte forma:
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            System.out.println("Loan!");
        }
        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }



    }
}
