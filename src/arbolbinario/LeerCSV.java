
package arbolbinario;
import java.io.*;
public class LeerCSV {

    public LeerCSV() {
       
    }
    public void archivo(){
         try{
            BufferedReader reader = new BufferedReader(new FileReader("ciudades_del_mundo.csv"));
            String line = null;
            while((line=reader.readLine()) != null){
                String [] parts = line.split(",");
                int totalParts = parts.length;
                for(int i=0; i<totalParts; i++){
                  System.out.print(parts[i] + "  ");
                  
                }
                System.out.println("\n");
            }
        }catch(IOException e){
             System.out.println("Archivo no encontrado");
        }
    }
    
}
