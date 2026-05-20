import java.util.*;

class ehPrimo {
  
  public Boolean getPrimo(int num) {
    if (num == 2) return true;
    if (num <= 1 || num % 2 == 0) return false;
  
    
    for (int i = 3; i * i <= num; i += 2) {
      if (num % i == 0) return false;
    }
    
    return true;
  }
  
}


public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ehPrimo ehPrimo = new ehPrimo();
    
    int count = scanner.nextInt();
    
    while (count > 0) {
      
      int num = scanner.nextInt();
      
      if (ehPrimo.getPrimo(num)) {
        System.out.println(num + " eh primo");
      }else {
        System.out.println(num + " nao eh primo");
      }
      count--;
    }
    scanner.close();
  }
}