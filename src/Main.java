import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int [] d = new int [n+1];
        for(int i = 0; i <= n; i++){
            d[i] = i;
        }
        int m = reader.nextInt();
        int [][] t = new int[2][m];
        for(int i = 0; i < m; i++){
            t[0][i] = reader.nextInt();
            t[1][i] = reader.nextInt();
        }

        for(int i = 0; i < m; i++){
            for(int j = 1; j < n+1; j++){
                if(d[j] == t[0][i]){
                    if(t[1][i] > 0){
                        int l = j;
                        for(int k = 0; k < t[1][i]; k++){
                            d[l] = d[l+1];
                            l++;
                        }

                        d[l] = t[0][i];
                        break;
                    }
                    if(t[1][i] < 0){
                        int l = j;
                        t[1][i] *= -1;
                        for(int k = 0; k < t[1][i]; k++){
                            d[l] = d[l - 1];
                            l--;
                        }

                        d[l] = t[0][i];
                    }
                }
            }

        }
        for(int i = 1; i <= n; i++){
            System.out.print(d[i] + " ");
        }
    }
}
