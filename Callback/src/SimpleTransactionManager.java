public class SimpleTransactionManager implements TransactionTask{
    public void execute(TransactionTask transactionTask) {
        System.out.println("Log : Starting the transaction ");
        transactionTask.run();
        System.out.println("Log : Commiting transaction. ");
    }
}
