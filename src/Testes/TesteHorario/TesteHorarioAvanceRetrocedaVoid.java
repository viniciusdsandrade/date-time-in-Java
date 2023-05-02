package Testes.TesteHorario;

import Horario.Horario;

public class TesteHorarioAvanceRetrocedaVoid {
    public static void main(String[] args) throws Exception {

        Horario horario1 = new Horario((byte) 00, (byte) 00, (byte) 00);
        Horario horario2 = new Horario((byte) 00, (byte) 00, (byte) 59);
        Horario horario3 = new Horario((byte) 00, (byte) 59, (byte) 59);
        Horario horario4 = new Horario((byte) 23, (byte) 59, (byte) 59);

        System.out.println(horario1);
        System.out.println(horario2);
        System.out.println(horario3);
        System.out.println(horario4);
        System.out.println();

        System.out.println("//////////////////////////////");
        horario1.avanceUmSeg();
        System.out.println(horario1.avancaUmSegundo());
        System.out.println(horario1);
        System.out.println("//////////////////////////////");


        horario2.retrocedaAlgunsSeg(3);
        System.out.println(horario2);
        horario2.avanceAlgunsSegs(3);
        System.out.println(horario2);
        System.out.println();

        horario3.retrocedaAlgunsSeg(3);
        System.out.println(horario3);
        horario3.avanceAlgunsSegs(3);
        System.out.println(horario3);
        System.out.println();

        horario4.retrocedaAlgunsSeg(3);
        System.out.println(horario4);
        horario4.avanceAlgunsSegs(3);
        System.out.println(horario4);
        System.out.println();
    }
}
