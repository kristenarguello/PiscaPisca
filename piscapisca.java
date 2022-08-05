public class piscapisca {
    public static void printamatriz (int[][] matriz) {
        for (int x=0;x<matriz.length;x++) {
            for (int y=0;y<matriz[0].length;y++) {
                System.out.print(" " + matriz[x][y]);
            }
            System.out.println("");
        }
        System.out.print ("\n");
    }
    public static void main (String [] args) {
        int[][] matriz = new int[10][10];
        int l = 0, letra = 0, contador=0;
        String conteudo = "5483143223274585471152645561736141336146635738547841675246452176841721688288113448468485545283751526";
        //transformar em matriz
        for (int x=0;x<matriz.length;x++) {
            for (int y=0;y<matriz[0].length;y++) {
                matriz[x][y] = Character.getNumericValue(conteudo.charAt(letra));
                letra++;
            }
        }
        System.out.println (contador);
        printamatriz(matriz);
        
        for (int v=0;v<100;v++) {
            contador++;
            System.out.println (contador);
            for (int x=0;x<matriz.length;x++) {
                for (int y=0;y<matriz[0].length;y++){
                    matriz[x][y] += 1;
                }
            }
            int luzes;
            do {
                luzes = 0;
                for (int x=0;x<matriz.length;x++) {
                    for (int y=0;y<matriz[0].length;y++){
                        if (matriz[x][y]>9) {
                            if (x-1>=0 && y-1>=0) matriz[x-1][y-1] += 1;
                            if (y-1>=0) matriz[x][y-1] += 1;
                            if (x+1<10 && y-1>=0) matriz[x+1][y-1] += 1;
                            if (x-1>=0) matriz[x-1][y] += 1;
                            if (x+1<10) matriz[x+1][y] += 1;
                            if (x-1>=0 && y+1<10) matriz[x-1][y+1] += 1;
                            if (y+1<10) matriz[x][y+1] += 1;
                            if (x+1<10 && y+1<10) matriz[x+1][y+1] += 1;
                            matriz[x][y] = -1000;
                            luzes++;
                        }
                    }
                }
            } while (luzes!=0);
            printamatriz(matriz);
            for (int x=0;x<matriz.length;x++) {
                for (int y=0;y<matriz[0].length;y++) {
                    if (matriz[x][y]<0) {
                        l++;
                        matriz[x][y] = 0;
                    }
                }
            }
        }
        System.out.println ("luzes piscaram: " + l);
    }
}
