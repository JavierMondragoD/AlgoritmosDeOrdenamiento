/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JOSE JAVIER
 */
public class CaminosMinimos {
public String algoritmoFloyd(long [][]mAdy){
        int vertices=mAdy.length;
        long matrizAdyacencia [] []=Mady;
        String caminos[][]new String [Vertices] [vertices];
        String caminosAuxiliares[][]new String [Vertices] [vertices];
         String caminoRecorrido="",cadena="",caminitos="";
         int i,j,k;
         float temporall,temporal12,temporal13,temporal14,minimo;
         //inicializando las matrices caminos y caminosAuxiliares
         for(i=0;i<vertices;i++){
             for(j=0;j<vertices;j++){
                 caminos[i][j]="";
                 caminosAuxiliares[i][j]=""; 
             }
         }
         
         for (k=0;k < vertices; k++) {
             for (i=0;k < vertices; i++) {
                 for (j=0;k < vertices; j++) {
                     temporal1 = matrizAdyacencia [i] [j];
                     temporal2 = matrizAdyacencia [i] [k];
                     temporal3 = matrizAdyacencia [k] [j];
                     temporal4 = temporal2 + temporal3;
                     //encontrando el minimo
                     minimo=Match.min(temporal1, temporal4);
                     if (temporal1 !=temporal4){
                        if (minimo ==temporal4){ 
                            caminoRecorrido = "";
                            CaminosAuxiliares[i][j] = k + "";
                            caminos [i][j]=caminosR(i,k,caminosAuxiliares,caminoRecorrido) + (k+1);
                            
                        }
                     }
                     matrizAdyacencia [i][j]=(long) minimo;
                     
             }
         }
        
    }
         //Agregando el camino minimo a cadena
         for(i=0;i<vertices;i++){
             for(j=0;j<vertices;j++){
                 cadena=cadena+"["+matrizAdyacencia[i][j]+"]";
                 
              }
             cadena=cadena+"\n";
         }
         ///////////////
         for (i = 0; i < vertices; i++) {
             for (j = 0; j < vertices; j++){
                 if(matrizAdyacencia[i][j !=100000000){
                     if (i != j) {
                         if (caminos[i][j.equals("")){
                             caminitos +="De ("+(i+1)+"--->"+(j+1)+")Irse por...("+(i+1)+", "+(j+1)+")\n";
                         }else{
                      
                         caminitos +="De ("+(i+1)+"--->"+(j+1)+")Irse por...("+(i+1)+", "+caminos[i][j]+","+(j+1)+")\n";
                         
                         }
                     }
                 }
             }
         }
         return "la matriz de caminos mas cortos entre los diferentes vertices es:\n"+cadena+
                 "\nLos diferentes caminos mas cortos entre vertices son:\n"+caminitos;
                 
          
    }         
    public String caminosR(int i,int k,String[][])caminosAuxiliares,String caminoRecorrido){
        if(caminosAuxiliares[i][k].equals("")){
            return "";
        }else{
            //Recursividad al millon 
            caminoRecorrido +=caminosR(i,integer.parseInt,caminosAuxiliares[i][k).toString()),
            caminosAuxiliares,
            caminoRecorrido)(Integer.parseInt(caminosAuxiliares[i][k].toString())+1)+",";
            return caminoRecorrido;
        }
        
    }
}