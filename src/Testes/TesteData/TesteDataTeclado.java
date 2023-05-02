package Testes.TesteData;

import Data.Data;
import Teclado.Teclado;


public class TesteDataTeclado {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
   
        while (true) {
            try {
                System.out.println("Digite uma data no formato dd/mm/aaaa");
                String digitacao = Teclado.getUmString();
                String[] quebrador = digitacao.split("/");
               
                if (quebrador.length != 3) {
                    System.out.println("Data inválida! Deve conter 3 elementos");
                    continue;
                }
   
                byte dia    = Byte.parseByte    (quebrador[0]);
                byte mes    = Byte.parseByte    (quebrador[1]);
                short ano   = Short.parseShort  (quebrador[2]);
   
                Data data = new Data(dia, mes, ano);
                String dataValida = data.toString();
                System.out.println("Data válida --> " + dataValida + "\n");
   
            } catch (Exception e) {
                System.err.println("Data inválida!\n");
            }
        }
    }
}
