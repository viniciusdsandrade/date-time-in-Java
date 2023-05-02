package Testes.TesteData;

import Data.Data;

public class TesteDataMetodosObrigatorios {
    
    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        Data dataDoPapa = new Data((byte) 04, (byte) 10, (short) 1582);
        Data fimDeAno = new Data((byte) 31, (byte) 12, (short) 2022);
        Data fevereiro = new Data((byte) 28, (byte) 02, (short) 2023);
        Data dataDoPapaDenovo = new Data((byte) 04, (byte) 10, (short) 1582);

        System.out.println("---------------------Construtor de cópia e  Clone--------------------------");
        System.out.println(dataDoPapa);
        System.out.println(fimDeAno);
        System.out.println(fevereiro);
        System.out.println(dataDoPapaDenovo);
        System.out.println();

        System.out.println("dataDoPapa.hashCode()       " + dataDoPapa.hashCode());
        System.out.println("fimDeAno.hashCode()         " + fimDeAno.hashCode());
        System.out.println("fevereiro.hashCode()        " + fevereiro.hashCode());
        System.out.println("dataDoPapaDenovo.hashCode() " + dataDoPapaDenovo.hashCode());
        System.out.println();

        Data cloneDataDoPapa = (Data) dataDoPapa.clone();
        Data cloneFimDeAno = (Data) fimDeAno.clone();
        Data cloneFevereiro = (Data) fevereiro.clone();
        Data cloneDataDoPapaDenovo = (Data) dataDoPapaDenovo.clone();

        Data copiaDataDoPapa = new Data(dataDoPapa);
        Data copiaFimDeAno = new Data(fimDeAno);
        Data copiaFevereiro = new Data(fevereiro);
        Data copiaDataDoPapaDenovo = new Data(dataDoPapaDenovo);

        System.out.println("dataDoPapa      " + dataDoPapa);
        System.out.println("cloneDataDoPapa " + cloneDataDoPapa);
        System.out.println("copiaDataDoPapa " + copiaDataDoPapa);
        System.out.println();

        System.out.println("fimDeAno        " + fimDeAno);
        System.out.println("cloneFimDeAno   " + cloneFimDeAno);
        System.out.println("copiaFimDeAno   " + copiaFimDeAno);
        System.out.println();

        System.out.println("fevereiro       " + fevereiro);
        System.out.println("cloneFevereiro  " + cloneFevereiro);
        System.out.println("copiaFevereiro  " + copiaFevereiro);
        System.out.println();

        System.out.println("dataDoPapaDenovo       " + dataDoPapaDenovo);
        System.out.println("cloneDataDoPapaDenovo  " + cloneDataDoPapaDenovo);
        System.out.println("copiaDataDoPapaDenovo  " + copiaDataDoPapaDenovo);
        System.out.println();

        System.out.println("---------------------Equals--------------------------");
        System.out.println("dataDoPapa.equals(copiaDataDoPapa)      " + dataDoPapa.equals(copiaDataDoPapa));
        System.out.println("dataDoPapa.equals(cloneDataDoPapa)      " + dataDoPapa.equals(cloneDataDoPapa));
        System.out.println("copiaDataDoPapa.equals(cloneDataDoPapa) " + copiaDataDoPapa.equals(cloneDataDoPapa));
        System.out.println();

        System.out.println("fimDeAno.equals(copiaFimDeAno)          " + fimDeAno.equals(copiaFimDeAno));
        System.out.println("fimDeAno.equals(cloneFimDeAno)          " + fimDeAno.equals(cloneFimDeAno));
        System.out.println("copiaFimDeAno.equals(cloneFimDeAno)     " + copiaFimDeAno.equals(cloneFimDeAno));
        System.out.println();

        System.out.println("fevereiro.equals(copiaFevereiro)        " + fevereiro.equals(copiaFevereiro));
        System.out.println("fevereiro.equals(cloneFevereiro)        " + fevereiro.equals(cloneFevereiro));
        System.out.println("copiaFevereiro.equals(cloneFevereiro)   " + copiaFevereiro.equals(cloneFevereiro));
        System.out.println();

        System.out.println("fevereiro.equals(copiaFevereiro)        " + dataDoPapaDenovo.equals(copiaDataDoPapaDenovo));
        System.out.println("fevereiro.equals(cloneFevereiro)        " + dataDoPapaDenovo.equals(cloneDataDoPapaDenovo));
        System.out.println(
                "copiaFevereiro.equals(cloneFevereiro)   " + copiaDataDoPapaDenovo.equals(cloneDataDoPapaDenovo));
        System.out.println();
    }
}
