package Testes.TesteHorario;

import Horario.Horario;

public class TesteHorarioConstrutorDeCopia {
    
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

        Horario copiaH1 = new Horario(h1);
        Horario copiaH2 = new Horario(h2);
        Horario copiaH3 = new Horario(h3);
        Horario copiaH4 = new Horario(h4);
        Horario copiaH5 = new Horario(h5);
        Horario copiaH6 = new Horario(h6);

        System.out.println("h1 = " + h1);
        System.out.println("h2 = " + h2);
        System.out.println("h3 = " + h3);
        System.out.println("h4 = " + h4);
        System.out.println("h5 = " + h5);
        System.out.println("h6 = " + h6);
        System.out.println();

        System.out.println("copiaH1 = " + copiaH1);
        System.out.println("copiaH2 = " + copiaH2);
        System.out.println("copiaH3 = " + copiaH3);
        System.out.println("copiaH4 = " + copiaH4);
        System.out.println("copiaH5 = " + copiaH5);
        System.out.println("copiaH6 = " + copiaH6);
        System.out.println();

        System.out.println("h1.hashCode()      = " + h1.hashCode());
        System.out.println("cloneH1.hashCode() = " + copiaH1.hashCode());
        System.out.println();

        System.out.println("h2.hashCode()      = " + h2.hashCode());
        System.out.println("cloneH2.hashCode() = " + copiaH2.hashCode());
        System.out.println();

        System.out.println("h3.hashCode()      = " + h3.hashCode());
        System.out.println("cloneH3.hashCode() = " + copiaH3.hashCode());
        System.out.println();

        System.out.println("h4.hashCode()      = " + h4.hashCode());
        System.out.println("cloneH4.hashCode() = " + copiaH4.hashCode());
        System.out.println();

        System.out.println("h5.hashCode()      = " + h5.hashCode());
        System.out.println("cloneH5.hashCode() = " + copiaH5.hashCode());
        System.out.println();

        System.out.println("h6.hashCode()      = " + h6.hashCode());
        System.out.println("cloneH6.hashCode() = " + copiaH6.hashCode());
        System.out.println();

        System.out.println("//////////////////////////////////////////////////////////////////////////////////");

        System.out.println("h1.equals(copiaH1) = " + h1.equals(copiaH1));
        System.out.println("h2.equals(copiaH2) = " + h2.equals(copiaH2));
        System.out.println("h3.equals(copiaH3) = " + h3.equals(copiaH3));
        System.out.println("h4.equals(copiaH4) = " + h4.equals(copiaH4));
        System.out.println("h5.equals(copiaH5) = " + h5.equals(copiaH5));
        System.out.println("h6.equals(copiaH6) = " + h6.equals(copiaH6));

        System.out.println("//////////////////////////////////////////////////////////////////////////////////");

        System.out.println("h1.getEndereco()      = " + h1.getEndereco());
        System.out.println("copiaH1.getEndereco() = " + copiaH1.getEndereco());
        System.out.println();

        System.out.println("h2.getEndereco()      = " + h2.getEndereco());
        System.out.println("copiaH2.getEndereco() = " + copiaH2.getEndereco());
        System.out.println();

        System.out.println("h3.getEndereco()      = " + h3.getEndereco());
        System.out.println("copiaH3.getEndereco() = " + copiaH3.getEndereco());
        System.out.println();

        System.out.println("h4.getEndereco()      = " + h4.getEndereco());
        System.out.println("copiaH4.getEndereco() = " + copiaH4.getEndereco());
        System.out.println();

        System.out.println("h5.getEndereco()      = " + h5.getEndereco());
        System.out.println("copiaH5.getEndereco() = " + copiaH5.getEndereco());
        System.out.println();

        System.out.println("h6.getEndereco()      = " + h6.getEndereco());
        System.out.println("copiaH6.getEndereco() = " + copiaH6.getEndereco());
        System.out.println();

    }
}
