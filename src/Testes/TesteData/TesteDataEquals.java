package Testes.TesteData;
import Data.Data;

public class TesteDataEquals {
    
    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        System.out.println();
        System.out.println("Verificação da usabilidade do método Equals");
        System.out.println("Foram instaciados 5 data objetos do tipo Data");
        System.out.println("Sendo data2 , data3 e data4 iguais entre si");
        System.out.println("data1 diferente de data2(consequentemente data3, data4)");
        System.out.println("E data5 énula");

        Data data1 = new Data((byte) 04, (byte) 10, (short) 1582);
        Data data2 = new Data((byte) 17, (byte) 03, (short) 2023);
        Data data3 = new Data((byte) 17, (byte) 03, (short) 2023);
        Data data4 = new Data((byte) 17, (byte) 03, (short) 2023);
        Data data5 = null;

        
        System.out.println();
        System.out.println("toString das datas instanciadas: ");
        System.out.println("data1: " + data1.getEndereco());
        System.out.println("data2: " + data2.toString());
        System.out.println("data3: " + data3.toString());
        System.out.println("data4: " + data4.toString());
        System.out.println();
        System.out.println(
                "//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("TESTE 1 = Reflexibilidade ");
        System.out.println("Reflexivo: para qualquer valor de referência não nulo x, x.equals(x) deve retornar true\n");
        System.out.println("data1.equals(data1) = " + data1.equals(data1));
        System.out.println("data2.equals(data2) = " + data2.equals(data2));
        System.out.println("data3.equals(data3) = " + data3.equals(data3));
        System.out.println("data4.equals(data4) = " + data4.equals(data4));
        if (data1.equals(data1) == true && data2.equals(data2) && data3.equals(data3) && data4.equals(data4)) {
            System.out.println("------------------------------");
            System.out.println("Teste de reflexão: Passou!");
            System.out.println("------------------------------");
        } else {
            System.out.println("------------------------------");
            System.out.println("Teste de reflexão: Reprovou!");
            System.out.println("------------------------------");
        }

        System.out.println(
                "//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("TESTE 2 = Simetria ");
        System.out.println(
                "Simétricos: para quaisquer valor de referência não nulo x e y , x.equals(y) deve retornar true, se e somente se y.equals(x) retornar true!");
        System.out.println("data1.equals(data2) = " + data1.equals(data2));
        System.out.println("data2.equals(data1) = " + data2.equals(data1));
        System.out.println();

        System.out.println("data3.equals(data1) = " + data3.equals(data1));
        System.out.println("data1.equals(data3) = " + data1.equals(data3));
        System.out.println();

        System.out.println("data2.equals(data3) = " + data2.equals(data3));
        System.out.println("data3.equals(data2) = " + data3.equals(data2));
        System.out.println();

        if (data1.equals(data2) == data2.equals(data1) && data3.equals(data1) == data1.equals(data3)
                && data2.equals(data3) == data3.equals(data2)) {
            System.out.println("--------------------------");
            System.out.println("Teste da simetria: Passou!");
            System.out.println("--------------------------");
        } else {
            System.out.println("----------------------------");
            System.out.println("Teste de simetria: Reprovou!");
            System.out.println("----------------------------");
        }

        System.out.println(
                "//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("TESTE 3 = Transitividade ");
        System.out.println(
                "Transitiva: para quaisquer valores de referência não nulo x e y se x.equals(y) e y.equals(z), então necessariamente x.equals(z) e consequentemente z.equals(x) serão true também!");
        System.out.println("Se");
        System.out.println("data2.equals(data3) = " + data2.equals(data3));
        System.out.println("E");
        System.out.println("data3.equals(data4) = " + data3.equals(data4));
        System.out.println("Consequentemente ");
        System.out.println("data2.equals(data4) = " + data2.equals(data4));
        System.out.println("data4.equals(data2) = " + data4.equals(data2));
        System.out.println();

        if (data2.equals(data3) && data3.equals(data4)) {
            if (data2.equals(data4) == data4.equals(data2)) {
                System.out.println("------------------------------------");
                System.out.println("Teste de transitividade (1): Passou!");
                System.out.println("------------------------------------");
            } else {
                System.out.println("--------------------------------------");
                System.out.println("Teste de transitividade (1): Reprovou!");
                System.out.println("--------------------------------------");
            }
        }

        System.out.println("Por outro lado: ");
        System.out.println();

        System.out.println("Se");
        System.out.println("data1.equals(data2) = " + data1.equals(data2));
        System.out.println("E");
        System.out.println("data2.equals(data3) = " + data2.equals(data3));
        System.out.println("Consequentemente: ");
        System.out.println("data1.equals(data3) = " + data1.equals(data3));
        System.out.println("data3.equals(data1) = " + data3.equals(data1));
        System.out.println();

        // Como sabemos que data1 != data2 e data2 == data3 , necessariamente data1 !=
        // data3
        if (!data1.equals(data2) && data2.equals(data3)) {
            if (data1.equals(data3) == data3.equals(data1)) {
                System.out.println("------------------------------------");
                System.out.println("Teste de transitividade (2): Passou!");
                System.out.println("------------------------------------");
            } else {
                System.out.println("--------------------------------------");
                System.out.println("Teste de transitividade (2): Reprovou!");
                System.out.println("--------------------------------------");
            }
        }
        System.out.println(
                "//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("TESTE 4 = Não nulidade ");

        System.out.println(
                "Não nulidade: Para qualquer valor de referência não nulox, x.equals(null) deve retornar false");
        System.out.println("");

        System.out.println("data5 is null");
        System.out.println("data1.equals(data5) = " + data1.equals(data5));
        System.out.println("data2.equals(data5) = " + data2.equals(data5));
        System.out.println("data3.equals(data5) = " + data3.equals(data5));
        System.out.println("data4.equals(data5) = " + data4.equals(data5));

        if (data1.equals(data5) == data2.equals(data5) == data3.equals(data5) == data4.equals(data5)) {
            System.out.println("------------------------------");
            System.out.println("Teste da Não-Nulidade: Passou!");
            System.out.println("------------------------------");
        } else {
            System.out.println("--------------------------------");
            System.out.println("Teste de Não-Nulidade: Reprovou!");
            System.out.println("--------------------------------");
        }

    }
}
