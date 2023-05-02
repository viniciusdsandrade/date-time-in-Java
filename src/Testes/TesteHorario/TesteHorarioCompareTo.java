package Testes.TesteHorario;

import Horario.Horario;

public class TesteHorarioCompareTo {

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        Horario h1 = new Horario((byte) 0, (byte) 0, (byte) 0);
        Horario h2 = new Horario((byte) 0, (byte) 0, (byte) 59);
        Horario h3 = new Horario((byte) 0, (byte) 59, (byte) 59);
        Horario h4 = new Horario((byte) 23, (byte) 0, (byte) 0);
        Horario h5 = new Horario((byte) 23, (byte) 59, (byte) 0);
        Horario h6 = new Horario((byte) 23, (byte) 59, (byte) 59);
        Horario h7 = h1;

        System.out.println("h1 = " + h1);
        System.out.println("h2 = " + h2);
        System.out.println("h3 = " + h3);
        System.out.println("h4 = " + h4);
        System.out.println("h5 = " + h5);
        System.out.println("h6 = " + h6);
        System.out.println();

        System.out.println("h1.compareTo(h2) = " + h1.compareTo(h2));
        System.out.println("h2.compareTo(h1) = " + h2.compareTo(h1));
        System.out.println("h1.equals(h2)    = " + h1.equals(h2));
        System.out.println("h2.equals(h1)    = " + h2.equals(h1));
        System.out.println();

        System.out.println("h2.compareTo(h3) = " + h2.compareTo(h3));
        System.out.println("h3.compareTo(h2) = " + h3.compareTo(h2));
        System.out.println("h2.equals(h3)    = " + h2.equals(h3));
        System.out.println("h3.equals(h2)    = " + h3.equals(h2));
        System.out.println();

        System.out.println("h3.compareTo(h4) = " + h3.compareTo(h4));
        System.out.println("h4.compareTo(h3) = " + h4.compareTo(h3));
        System.out.println("h3.equals(h4)    = " + h3.equals(h4));
        System.out.println("h4.equals(h3)    = " + h4.equals(h3));
        System.out.println();

        System.out.println("h5.compareTo(h5) = " + h4.compareTo(h5));
        System.out.println("h5.compareTo(h4) = " + h5.compareTo(h4));
        System.out.println("h3.equals(h4)    = " + h4.equals(h5));
        System.out.println("h4.equals(h3)    = " + h5.equals(h4));
        System.out.println();

        System.out.println("h5.compareTo(h6) = " + h5.compareTo(h6));
        System.out.println("h6.compareTo(h5) = " + h6.compareTo(h5));
        System.out.println("h5.equals(h6)    = " + h5.equals(h6));
        System.out.println("h6.equals(h5)    = " + h6.equals(h5));
        System.out.println();

        System.out.println("h1.compareTo(h7) = " + h1.compareTo(h7));
        System.out.println("h7.compareTo(h1) = " + h7.compareTo(h1));
        System.out.println("h1.equals(h7)    = " + h1.equals(h7));
        System.out.println("h7.equals(h1)    = " + h7.equals(h1));
        System.out.println();

    }
}
