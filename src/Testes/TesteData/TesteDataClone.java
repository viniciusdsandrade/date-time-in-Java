package Testes.TesteData;

import Data.Data;

public class TesteDataClone {
    
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

        Data cloneData1 = (Data) data1.clone();
        Data cloneData2 = (Data) data2.clone();
        Data cloneData3 = (Data) data3.clone();

        System.out.println("toString() datas clonadas");
        System.out.println(cloneData1);
        System.out.println(cloneData2);
        System.out.println(cloneData3);
        System.out.println();
    }
}
