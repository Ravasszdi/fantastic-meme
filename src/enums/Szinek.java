package enums;

public enum Szinek {
  RESET,
  PIROS,
  ZOLD,
  KEK;

  public String getSzin() {
    switch (this) {
      default:
        return "\u001b[0m";
      case PIROS:
        return "\u001b[31m";
      case ZOLD:
        return "\u001b[32m";
      case KEK:
        return "\u001b[34m";
    }
  }
  
}
