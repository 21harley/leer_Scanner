/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leerscanner2;
import java.io.*;
import java.util.*;
public class LeerScanner2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException{
        // TODO code application logic here
       //crear archivo con linea en medio
        String nom="inicio.txt";int cot=0;
       FileWriter a=new FileWriter(nom);
       BufferedWriter b=new BufferedWriter(a);
       PrintWriter arc=new PrintWriter(b);
       do{
       arc.print("22"+cot);
       arc.println();cot++;   
       }while(cot<5);
       
       arc.close();
       System.out.println("EL archivo de salida ha sido"
                + " creado: "+nom);
       //leer archivo con scanner
       String []datos=new String[cot];
       int indiceVector=0;
       Scanner entrada;
       try{
           entrada=new Scanner(new File("inicio.txt"));
           while(entrada.hasNextLine()){
               datos[indiceVector++]=entrada.nextLine();
           }
            entrada.close();
       }catch(FileNotFoundException e){
       e.printStackTrace();
       }
       for(int i=0;i<cot;i++){
           System.out.println(datos[i]);
       }
    }
    
}
