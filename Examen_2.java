
import java.util.Scanner;


public class Examen_2 {

   public int[][] Transformada06MiltonQ(int dim, int n){
       System.out.println("Ejercicio N° 06");
      int[][] matriz = new int[dim][dim];
      int conta = 0;
       for (int i = 0; i < matriz.length; i++) {
           for (int j = 0; j < matriz.length; j++) {
               if(conta<=i){
                   matriz[i][j] = n;
                   n++;
                   conta++;
               }else{
                   matriz[i][j]=-1;
               }
               
           }conta= 0;
           
       }
       
       return matriz;
   }
   public int[][] Transformada26MiltonQ(int dim,int n){
       System.out.println("Ejercicio N° 26");
       int[][] matriz =new int[dim][dim];
       int conta=0;
       for (int i = 0; i < matriz.length; i++) {
           if(conta%2==0){
               
            for (int j = matriz.length-1; j>=0;j--) {
               matriz[i][j]=n;
               n++;
           }
           }else{
                   for (int j = 0; j < matriz.length; j++) {
                       matriz[i][j]=n;
                     n++;


                   }
          
           }
       conta++;
       }
       
       return matriz;
   }
   
   public int[][] Transformada12MiltonQ(int dimen,int numInit){
       System.out.println("Ejercicio N° 12");
       int[][]matriz =new int[dimen][dimen];
       for (int i = 0; i < matriz.length; i++) {
           for (int j =matriz[0].length-1;j>=0;j--) {
               if (j>=i){
                   matriz[i][j]=numInit;
                   numInit++;
               }else{
                   matriz[i][j]=-1;
               }
           }
           
       }
       return matriz;
   }
   
   public int[][] Transformada30MiltonQ(int dimen,int numInit){
       System.out.println("Ejercicio N° 30");
       int[][] matriz = new int[dimen][dimen];
       for (int i = 0; i < dimen/2; i++) {
           for (int j = i; j < dimen-i-1; j++) {
               matriz[j][dimen-i-1]=numInit;
               numInit++;
           }
           for (int k =dimen-i-1;k>i;k--) {
               matriz[dimen-i-1][k]=numInit;
               numInit++;
               
           }   
            for (int t =dimen-i-1;t>i; t--) {
                matriz[t][i]=numInit;
                numInit++;
               
           }
           for (int h = i; h < dimen-i-1; h++) {
               matriz[i][h]=numInit;
               numInit++;
               
           }
          if(dimen%2!=0){
              matriz[dimen/2][dimen/2]=numInit;
          }
           
           
       }
       return matriz;
   }
   public int [][] Transformada09MiltonQ(int dimen,int numInit){
      int[][] matriz = new int[dimen][dimen];
       for (int i = 0; i < matriz.length; i++) {
           for (int j = 0; j < matriz.length; j++) {
               if(j>=dimen-(i+1)){
                   matriz[i][j]= numInit;
                   numInit++;
               }else{
                   matriz[i][j]=-1;
               }
               
           }
           
       }
       
       return matriz;
   }
    public void imprimir( int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+"\t");
                
            }
        
            System.out.println("");
        }
    }
    
    
    public static void main(String[] args) {
        Examen_2 on= new Examen_2();
        System.out.println("Ingresar la opcion del algoritmo desea probar");
        Scanner leer = new Scanner(System.in);
        int opcion = leer.nextInt();
        System.out.println("Ingrese la dimrncion de la matriz: ");
        int dimen=leer.nextInt();
        System.out.println("Ingrese el numero de inicio: ");
        int  n = leer.nextInt();
        while (opcion!=0){
            switch(opcion){
                case 1: on.imprimir(on.Transformada06MiltonQ(dimen, n));break;
                case 2: on.imprimir(on.Transformada26MiltonQ(dimen, n));break;
                case 3: on.imprimir(on.Transformada12MiltonQ(dimen, n));break;
                case 4: on.imprimir(on.Transformada30MiltonQ(dimen, n));break;
                case 5: on.imprimir(on.Transformada09MiltonQ(dimen, n));break;
                
                default: System.out.println("Opcion invalida:");break;
            }  
            System.out.println("Ingrese la opcion del algoritmo desea probar");
            opcion =leer.nextInt();
             System.out.println("Ingrese la dimencion de la matriz:");
             dimen=leer.nextInt();
             System.out.println("Ingrese el numero de inicio:");
             n=leer.nextInt();
            }
        }
    }
    

