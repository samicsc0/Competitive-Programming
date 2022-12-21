package data.structure.and.algorith;
import java.util.Scanner;
public class DominoPiling {
    int dp(){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        return (num1 * num2) / 2;
    }
}
