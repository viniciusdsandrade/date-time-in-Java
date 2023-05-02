package Testes.TesteData;

import Data.Data;

public class TesteDataHashCode {
    
    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        Data data1 = new Data((byte) 4, (byte) 10, (short) 1582);
        Data data2 = new Data((byte) 06, (byte) 12, (short) 2001);
        Data data3 = new Data((byte) 06, (byte) 12, (short) 2001);

        System.out.println("toString das datas instanciadas: ");
        System.out.println("data1: " + data1.toString());
        System.out.println("data2: " + data2.toString());
        System.out.println("data3: " + data3.toString());
        System.out.println();

        int hashData1 = data1.hashCode();
        int hashData2 = data2.hashCode();
        int hashData3 = data3.hashCode();

        System.out.println("HashCode das datas: ");
        System.out.println("data1.hashCode(): " + hashData1);
        System.out.println("data2.hashCode(): " + hashData2);
        System.out.println("data3.hashCode(): " + hashData3);
        System.out.println();

        System.out.println("Verificação do Equals das datas: ");
        System.out.println("data1.equals(data2) = " + data1.equals(data2));
        System.out.println("data1.equals(data3) = " + data1.equals(data3));
        System.out.println("data2.equals(data3) = " + data2.equals(data3));
        System.out.println();

        if (hashData2 == hashData3 && hashData1 != hashData2 && hashData1 != hashData3) {
            System.out.print("Teste OK\n");
            System.out.print("hashCode Funcional\n");
        } else {
            System.out.print("hashCode Não Funcional\n");
        }
    }
}
