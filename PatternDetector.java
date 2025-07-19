import java.util.Scanner;

public class PatternDetector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); 

        char[][] arr = new char[5][n];

        for (int i = 0; i < 5; i++) {
            String line = sc.nextLine();
            arr[i] = line.toCharArray();
        }

        int j = 0;
        while (j <= n - 3) {
            boolean isU =
                arr[0][j] == '*' && arr[0][j+1] == ' ' && arr[0][j+2] == '*' &&
                arr[1][j] == '*' && arr[1][j+1] == ' ' && arr[1][j+2] == '*' &&
                arr[2][j] == '*' && arr[2][j+1] == ' ' && arr[2][j+2] == '*' &&
                arr[3][j] == '*' && arr[3][j+1] == ' ' && arr[3][j+2] == '*' &&
                arr[4][j] == '*' && arr[4][j+1] == '*' && arr[4][j+2] == '*';

            if (isU) {
                System.out.print("U");
                j += 3;
                continue;
            }

            boolean isO =
                arr[0][j] == '*' && arr[0][j+1] == '*' && arr[0][j+2] == '*' &&
                arr[1][j] == '*' && arr[1][j+1] == ' ' && arr[1][j+2] == '*' &&
                arr[2][j] == '*' && arr[2][j+1] == ' ' && arr[2][j+2] == '*' &&
                arr[3][j] == '*' && arr[3][j+1] == ' ' && arr[3][j+2] == '*' &&
                arr[4][j] == '*' && arr[4][j+1] == '*' && arr[4][j+2] == '*';

            if (isO) {
                System.out.print("O");
                j += 3;
                continue;
            }

        
            boolean isI =
                arr[0][j] == '*' && arr[0][j+1] == '*' && arr[0][j+2] == '*' &&
                arr[1][j] == ' ' && arr[1][j+1] == '*' && arr[1][j+2] == ' ' &&
                arr[2][j] == ' ' && arr[2][j+1] == '*' && arr[2][j+2] == ' ' &&
                arr[3][j] == ' ' && arr[3][j+1] == '*' && arr[3][j+2] == ' ' &&
                arr[4][j] == '*' && arr[4][j+1] == '*' && arr[4][j+2] == '*';

            if (isI) {
                System.out.print("I");
                j += 3;
                continue;
            }
            j++; 
        }
        sc.close();
    }
}

/*  */