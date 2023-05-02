package Testes.TesteHorario;

import java.util.Vector;
import Horario.Horario;

public class TesteHorarioEquals {
    
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

        Horario horario1 = new Horario((byte) 23, (byte) 13, (byte) 7);
        Horario horario2 = new Horario((byte) 4, (byte) 20, (byte) 0);
        Horario horario3 = new Horario((byte) 4, (byte) 20, (byte) 0);
        Horario horario4 = new Horario((byte) 4, (byte) 20, (byte) 0);
        Horario horario5 = null;
        System.out.println();
        
        Vector<Horario> vec = new Vector<Horario>();
        vec.add(horario3);

        if (vec.contains(horario2)) {
            System.out.println("Equals funcional para objetos chamantes da classe Object");
        } else {
            System.out.println("Equals não funcional para classes distintas da classe comparada");
        }

        if (vec.contains(horario4)) {
            System.out.println("Equals funcional para objetos chamantes da classe Object");
        } else {
            System.out.println("Equals não funcional para classes distintas da classe comparada");
        }

        System.out.println();
        System.out.println("toString das datas instanciadas: ");
        System.out.println("horario1: " + horario1.toString());
        System.out.println("horario2: " + horario2.toString());
        System.out.println("horario3: " + horario3.toString());
        System.out.println("horario4: " + horario4.toString());
        System.out.println();
        System.out.println(
                "//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("TESTE 1 = Reflexibilidade ");
        System.out.println("Reflexivo: para qualquer valor de referência não nulo x, x.equals(x) deve retornar true\n");
        System.out.println("horario1.equals(horario1) = " + horario1.equals(horario1));
        System.out.println("horario2.equals(horario2) = " + horario2.equals(horario2));
        System.out.println("horario3.equals(horario3) = " + horario3.equals(horario3));
        System.out.println("horario4.equals(horario4) = " + horario4.equals(horario4));
        if (horario1.equals(horario1) == true && horario2.equals(horario2) && horario3.equals(horario3)
                && horario4.equals(horario4)) {
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
        System.out.println("horario1.equals(horario2) = " + horario1.equals(horario2));
        System.out.println("horario2.equals(horario1) = " + horario2.equals(horario1));
        System.out.println();

        System.out.println("horario3.equals(horario1) = " + horario3.equals(horario1));
        System.out.println("horario1.equals(horario3) = " + horario1.equals(horario3));
        System.out.println();

        System.out.println("horario2.equals(horario3) = " + horario2.equals(horario3));
        System.out.println("horario3.equals(horario2) = " + horario3.equals(horario2));
        System.out.println();

        if (horario1.equals(horario2) == horario2.equals(horario1)
                && horario3.equals(horario1) == horario1.equals(horario3)
                && horario2.equals(horario3) == horario3.equals(horario2)) {
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
        System.out.println("horario2.equals(horario3) = " + horario2.equals(horario3));
        System.out.println("E");
        System.out.println("horario3.equals(horario4) = " + horario3.equals(horario4));
        System.out.println("Consequentemente ");
        System.out.println("horario2.equals(horario4) = " + horario2.equals(horario4));
        System.out.println("horario4.equals(horario2) = " + horario4.equals(horario2));
        System.out.println();

        if (horario2.equals(horario3) && horario3.equals(horario4)) {
            if (horario2.equals(horario4) == horario4.equals(horario2)) {
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
        System.out.println("horario1.equals(horario2) = " + horario1.equals(horario2));
        System.out.println("E");
        System.out.println("horario2.equals(horario3) = " + horario2.equals(horario3));
        System.out.println("Consequentemente: ");
        System.out.println("horario1.equals(horario3) = " + horario1.equals(horario3));
        System.out.println("horario3.equals(horario1) = " + horario3.equals(horario1));
        System.out.println();

        // Como sabemos que data1 != data2 e data2 == data3 , necessariamente data1 !=
        // data3
        if (!horario1.equals(horario2) && horario2.equals(horario3)) {
            if (horario1.equals(horario3) == horario3.equals(horario1)) {
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

        System.out.println("horario5 is null");
        System.out.println("horario1.equals(horario5) = " + horario1.equals(horario5));
        System.out.println("horario2.equals(horario5) = " + horario2.equals(horario5));
        System.out.println("horario3.equals(horario5) = " + horario3.equals(horario5));
        System.out.println("horario4.equals(horario5) = " + horario4.equals(horario5));

        if (horario1.equals(horario5) == horario2.equals(horario5) == horario3.equals(horario5) == horario4
                .equals(horario5)) {
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
