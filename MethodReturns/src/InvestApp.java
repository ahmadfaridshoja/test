
public class InvestApp{
    public static void main(String[] args) {
        InvestApp app=new InvestApp();
        int savingBal = 10000;
        int indexFundBal = 15000;
        int depositAmount = 20000;
        String output=app.funds(savingBal, indexFundBal, depositAmount);
        System.out.println(output);
    }

    public String funds(int savingBal, int indexFundBal, int depositAmount) {
        if (savingBal > 50000) {
            indexFundBal = indexFundBal + depositAmount;
            return "index fund balance account updated. new Balance is " + indexFundBal;
        }
        else {
            savingBal = savingBal + depositAmount;
            return "Saving account updated. new Balance is " + savingBal;
        }
    }
}
