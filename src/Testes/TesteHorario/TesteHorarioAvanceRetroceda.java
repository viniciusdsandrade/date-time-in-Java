package Testes.TesteHorario;

import Horario.Horario;

public class TesteHorarioAvanceRetroceda {

        /**
         * @param args
         * @throws Exception
         */
        public static void main(String[] args) throws Exception {

                Horario horario1 = new Horario((byte) 00, (byte) 00, (byte) 00);
                Horario horario2 = new Horario((byte) 00, (byte) 00, (byte) 59);
                Horario horario3 = new Horario((byte) 00, (byte) 59, (byte) 59);
                Horario horario4 = new Horario((byte) 23, (byte) 59, (byte) 59);

                System.out.println(horario1.toString());
                System.out.println(horario2.toString());
                System.out.println(horario3.toString());
                System.out.println(horario4.toString());
                System.out.println();

                System.out.println("/////////////////////////////////////////////////////////////////////////////");
                System.out.println(horario1.toString());
                System.out.println(
                                "horario1.avanca((byte) 1, (byte) 1, (byte) 1)    = "
                                                + horario1.avanca((byte) 1, (byte) 1, (byte) 1));
                System.out.println(
                                "horario1.retroceda((byte) 1, (byte) 1, (byte) 1) = "
                                                + horario1.retroceda((byte) 1, (byte) 1, (byte) 1));
                System.out.println(horario2.toString());
                System.out.println(
                                "horario2.avanca((byte) 1, (byte) 1, (byte) 1)    = "
                                                + horario2.avanca((byte) 1, (byte) 1, (byte) 1));
                System.out.println(
                                "horario2.retroceda((byte) 1, (byte) 1, (byte) 1) = "
                                                + horario2.retroceda((byte) 1, (byte) 1, (byte) 1));
                System.out.println(horario3.toString());
                System.out.println(
                                "horario3.avanca((byte) 1, (byte) 1, (byte) 1)    = "
                                                + horario3.avanca((byte) 1, (byte) 1, (byte) 1));
                System.out.println(
                                "horario3.retroceda((byte) 1, (byte) 1, (byte) 1) = "
                                                + horario3.retroceda((byte) 1, (byte) 1, (byte) 1));
                System.out.println(horario4.toString());
                System.out.println(
                                "horario4.avanca((byte) 1, (byte) 1, (byte) 1)    = "
                                                + horario4.avanca((byte) 1, (byte) 1, (byte) 1));
                System.out.println(
                                "horario4.retroceda((byte) 1, (byte) 1, (byte) 1) = "
                                                + horario4.retroceda((byte) 1, (byte) 1, (byte) 1));

                System.out.println("/////////////////////////////////////////////////////////////////////////////");
                System.out.println("retrocedaUmSegundo()");
                System.out.println("horario1.retrocedaUmSegundo() = " + horario1.retrocedaUmSegundo());
                System.out.println("horario2.retrocedaUmSegundo() = " + horario2.retrocedaUmSegundo());
                System.out.println("horario3.retrocedaUmSegundo() = " + horario3.retrocedaUmSegundo());
                System.out.println("horario4.retrocedaUmSegundo() = " + horario4.retrocedaUmSegundo());
                System.out.println();

                System.out.println("retrocedaUmMinuto()");
                System.out.println("horario1.retrocedaUmMinuto() = " + horario1.retrocedaUmMinuto());
                System.out.println("horario2.retrocedaUmMinuto() = " + horario2.retrocedaUmMinuto());
                System.out.println("horario3.retrocedaUmMinuto() = " + horario3.retrocedaUmMinuto());
                System.out.println("horario4.retrocedaUmMinuto() = " + horario4.retrocedaUmMinuto());
                System.out.println();

                System.out.println("retrocedaUmaHora()");
                System.out.println("horario1.retrocedaUmaHora() = " + horario1.retrocedaUmaHora());
                System.out.println("horario2.retrocedaUmaHora() = " + horario2.retrocedaUmaHora());
                System.out.println("horario3.retrocedaUmaHora() = " + horario3.retrocedaUmaHora());
                System.out.println("horario4.retrocedaUmaHora() = " + horario4.retrocedaUmaHora());
                System.out.println();
                System.out.println("/////////////////////////////////////////////////////////////////////////////");

                System.out.println("avancaUmSegundo()");
                System.out.println("horario1.avancaUmSegundo() = " + horario1.avancaUmSegundo());
                System.out.println("horario2.avancaUmSegundo() = " + horario2.avancaUmSegundo());
                System.out.println("horario3.avancaUmSegundo() = " + horario3.avancaUmSegundo());
                System.out.println("horario4.avancaUmSegundo() = " + horario4.avancaUmSegundo());
                System.out.println();

                System.out.println("avancaUmMinuto()");
                System.out.println("horario1.avancaUmMinuto(2) = " + horario1.avancaUmMinuto());
                System.out.println("horario2.avancaUmMinuto(2) = " + horario2.avancaUmMinuto());
                System.out.println("horario3.avancaUmMinuto(2) = " + horario3.avancaUmMinuto());
                System.out.println("horario4.avancaUmMinuto(2) = " + horario4.avancaUmMinuto());
                System.out.println();

                System.out.println("avancaUmaHora");
                System.out.println("horario4.avancaUmaHora() = " + horario1.avancaUmaHora());
                System.out.println("horario4.avancaUmaHora() = " + horario2.avancaUmaHora());
                System.out.println("horario4.avancaUmaHora() = " + horario3.avancaUmaHora());
                System.out.println("horario4.avancaUmaHora() = " + horario4.avancaUmaHora());
                System.out.println();

                System.out.println(
                                "////////////////////////////////////////////////////////////////////////////////////");
                System.out.println("avancaNhoras(long h)");
                System.out.println("horario1.avancaNhoras(13) = " + horario1.avancaNHoras(13));
                System.out.println("horario2.avancaNhoras(13) = " + horario2.avancaNHoras(13));
                System.out.println("horario3.avancaNhoras(13) = " + horario3.avancaNHoras(13));
                System.out.println("horario4.avancaNhoras(13) = " + horario4.avancaNHoras(13));
                System.out.println();

                System.out.println("avancaNMinutos(long m)");
                System.out.println("horario1.avancaNMinutos(13) = " + horario1.avancaNMinutos(13));
                System.out.println("horario2.avancaNMinutos(13) = " + horario2.avancaNMinutos(13));
                System.out.println("horario3.avancaNMinutos(13) = " + horario3.avancaNMinutos(13));
                System.out.println("horario4.avancaNMinutos(13) = " + horario4.avancaNMinutos(13));
                System.out.println();

                System.out.println("avancaNSegundos(long s)");
                System.out.println("horario1.avancaNSegundos(13) = " + horario1.avancaNSegundos(13));
                System.out.println("horario2.avancaNSegundos(13) = " + horario2.avancaNSegundos(13));
                System.out.println("horario3.avancaNSegundos(13) = " + horario3.avancaNSegundos(13));
                System.out.println("horario4.avancaNSegundos(13) = " + horario4.avancaNSegundos(13));
                System.out.println();

                System.out.println(
                                "////////////////////////////////////////////////////////////////////////////////////");
                System.out.println("avancaNhoras(long h)");
                System.out.println("horario1.retrocedaNHoras(13) = " + horario1.retrocedaNHoras(13));
                System.out.println("horario2.retrocedaNHoras(13) = " + horario2.retrocedaNHoras(13));
                System.out.println("horario3.retrocedaNHoras(13) = " + horario3.retrocedaNHoras(13));
                System.out.println("horario4.retrocedaNHoras(13) = " + horario4.retrocedaNHoras(13));
                System.out.println();

                System.out.println("avancaNMinutos(long m)");
                System.out.println("horario1.retrocedaNMinutos(13) = " + horario1.retrocedaNMinutos(13));
                System.out.println("horario2.retrocedaNMinutos(13) = " + horario2.retrocedaNMinutos(13));
                System.out.println("horario3.retrocedaNMinutos(13) = " + horario3.retrocedaNMinutos(13));
                System.out.println("horario4.retrocedaNMinutos(13) = " + horario4.retrocedaNMinutos(13));
                System.out.println();

                System.out.println("avancaNSegundos(long s)");
                System.out.println("horario1.retrocedaNSegundos(13) = " + horario1.retrocedaNSegundos(13));
                System.out.println("horario2.retrocedaNSegundos(13) = " + horario2.retrocedaNSegundos(13));
                System.out.println("horario3.retrocedaNSegundos(13) = " + horario3.retrocedaNSegundos(13));
                System.out.println("horario4.retrocedaNSegundos(13) = " + horario4.retrocedaNSegundos(13));
                System.out.println();

        }
}
