package Testes.TesteData;

import Data.Data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TesteDataAvanceRetroceda {
    
    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        LocalDate hoje = LocalDate.now();
        LocalTime horarioHoje = LocalTime.now();

        System.out.println(hoje);
        System.out.println(horarioHoje);
        System.out.println();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String hojeFormatado = hoje.format(formatter);

        System.out.println(hojeFormatado);
        System.out.println();

        Data dataDoPapa = new Data((byte) 4, (byte) 10, (short) 1582);
        Data fimDeAno = new Data((byte) 31, (byte) 12, (short) 2022);
        Data fevereiro = new Data((byte) 28, (byte) 02, (short) 2023);
        Data Aniversario = new Data((byte) 06, (byte) 12, (short) 2001);
        Data nascimentoVinicius = new Data((byte) 06, (byte) 12, (short) 2001);

        System.out.println("Testando meu avance e retroceda: ");
        System.out.println(nascimentoVinicius.avance(10));
        System.out.println(nascimentoVinicius.getDiaSeguinte());
        System.out.println(nascimentoVinicius);
        System.out.println(nascimentoVinicius.getDiaAnterior());
        System.out.println(nascimentoVinicius.retrocedaData(10));
        System.out.println();

        System.out.println("Testando método do Maligno: ");
        Aniversario.retrocedaUmDia();
        Aniversario.retrocedaUmDia();
        Aniversario.retrocedaUmDia();
        Aniversario.retrocedaVoid(3);
        System.out.println("retornei um dia do meu aniversário: " + Aniversario);
        System.out.println("retrocedaVoid: " + Aniversario);

        System.out.println(dataDoPapa.avance(10));
        System.out.println(dataDoPapa.getDiaSeguinte());
        System.out.println(dataDoPapa);
        System.out.println(dataDoPapa.getDiaAnterior());
        System.out.println(dataDoPapa.retrocedaData(10));
        System.out.println();

        System.out.println(fimDeAno.avance(10));
        System.out.println(fimDeAno.getDiaSeguinte());
        System.out.println(fimDeAno);
        System.out.println(fimDeAno.getDiaAnterior());
        System.out.println(fimDeAno.retrocedaData(10));
        System.out.println();

        System.out.println(fevereiro.avance(10));
        System.out.println(fevereiro.getDiaSeguinte());
        System.out.println(fevereiro);
        System.out.println(fevereiro.getDiaAnterior());
        System.out.println(fevereiro.retrocedaData(10));
        System.out.println();
    }
}
