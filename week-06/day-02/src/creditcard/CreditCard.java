package creditcard;

public class CreditCard implements CreditCardy{
  private int sumCVV;
  private String name;
  private String code;

  public CreditCard(String name) {
    this.name = name;
    this.code = getCodeAccount();
    this.sumCVV = cumeSumCVV(this.code);
  }

  @Override
  public int getSumCVV() {
    return this.sumCVV;
  }

  @Override
  public String getNameCardholder() {
    return this.name;
  }

  @Override
  public String getCodeAccount() {
    code = "";
    for (int i = 0; i < 16; i++){
      code += Integer.toString((int)((Math.random() * 16)));
    }
    return code;
  }

  @Override
  public int cumeSumCVV(String codeAccount) {
    int sumCVV = 0;
    for (int i = 0; i < codeAccount.length(); i++){
      sumCVV += Character.getNumericValue(codeAccount.charAt(i));
    }
    return sumCVV;
  }

  @Override
  public String toString() {
    return String.format("Name=%s CC#=%s CVV=%d", this.name, this.code, this.sumCVV);
  }
}
