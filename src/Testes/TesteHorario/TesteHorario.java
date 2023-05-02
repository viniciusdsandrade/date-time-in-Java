package Testes.TesteHorario;

import Horario.Horario;

public class TesteHorario {
    public static void main(String[] args) throws Exception {

        Horario horario1 = new Horario((byte) 00, (byte) 00, (byte) 00);
        Horario horario2 = new Horario((byte) 00, (byte) 00, (byte) 59);
        Horario horario3 = new Horario((byte) 00, (byte) 59, (byte) 59);
        Horario horario4 = new Horario((byte) 23, (byte) 59, (byte) 59);

        System.out.println("horario1 = " + horario1);
        System.out.println("horario2 = " + horario2);
        System.out.println("horario3 = " + horario3);
        System.out.println("horario4 = " + horario4);
        System.out.println();

        System.out.println("horario1.retrocedaUmSegundo() = " + horario1.retrocedaUmSegundo());
        System.out.println("horario2.retrocedaUmSegundo() = " + horario2.retrocedaUmSegundo());
        System.out.println("horario3.retrocedaUmSegundo() = " + horario3.retrocedaUmSegundo());
        System.out.println("horario4.retrocedaUmSegundo() = " + horario4.retrocedaUmSegundo());
        System.out.println();

        System.out.println("horario1.avancaUmSegundo() = " + horario1.avancaUmSegundo());
        System.out.println("horario2.avancaUmSegundo() = " + horario2.avancaUmSegundo());
        System.out.println("horario3.avancaUmSegundo() = " + horario3.avancaUmSegundo());
        System.out.println("horario4.avancaUmSegundo() = " + horario4.avancaUmSegundo());
        System.out.println();
    }
}
