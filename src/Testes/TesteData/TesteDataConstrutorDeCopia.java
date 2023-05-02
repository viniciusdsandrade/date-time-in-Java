package Testes.TesteData;

import Data.Data;

public class TesteDataConstrutorDeCopia {
    
    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        Data data1 = new Data((byte) 15, (byte) 10, (short) 1582);
        Data data2 = new Data((byte) 06, (byte) 12, (short) 2001);
        Data data3 = new Data((byte) 06, (byte) 12, (short) 2001);

        System.out.println();
        System.out.println("toString() datas originais");
        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);
        System.out.println();

        Data copiaData1 = new Data(data1);
        Data copiaData2 = new Data(data2);
        Data copiaData3 = new Data(data3);

        System.out.println("toString() datas copiadas");
        System.out.println(copiaData1);
        System.out.println(copiaData2);
        System.out.println(copiaData3);
        System.out.println();
    }
}
