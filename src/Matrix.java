import java.io.*;
public class Matrix {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        
        int[]baris;
        System.out.print("Jumlah Baris: ");
        int b=Integer.parseInt(br.readLine());
        baris=new int[b];
                
        int[]kolom;
        System.out.print("Jumlah Kolom: ");
        int k=Integer.parseInt(br.readLine());
        kolom=new int[k];
        
        System.out.println("==================");
        int [][]tabel=new int[b][k];
        for (int i = 0; i < baris.length; i++) {
             for (int j = 0; j < kolom.length; j++) {
                 System.out.print("Data Baris "+(i+1)+" Kolom "+(j+1)+" : ");
                 tabel[i][j]=Integer.parseInt(br.readLine());
             }
            }
        System.out.println("==================");
        System.out.println("");
        System.out.println("Output: ");
        for (int m = 0; m < baris.length ; m++) {
            
            for (int n = 0; n < kolom.length; n++) {
               
                System.out.print(tabel[m][n]+"\t");
                
            }
            System.out.println(" ");
            
        }
        
        System.out.println("");
        for (int d = 0; d < baris.length; d++) {
            int hasil=0;
            for (int e = 0; e < kolom.length; e++) {
                hasil=hasil+tabel[d][e];
                
            }
            System.out.println("hasil jumlah baris ke "+(d+1)+" = "+hasil);
            
        }
        
        int max=tabel[0][0];
        for (int t = 0; t < baris.length; t++) {
            for (int v = 0; v < kolom.length; v++) {
                if (tabel[t][v]>=max) {
                max=tabel[t][v];
                }
            }
        }
        System.out.println("");
        System.out.println("max = "+max);
 
        int min=tabel[0][0];
        for (int t = 0; t < baris.length; t++) {
            for (int v = 0; v < kolom.length; v++) {
                if (tabel[t][v]<=min) {
                min=tabel[t][v];
                }
            }
        }
        System.out.println("min = "+min);
    }
}
