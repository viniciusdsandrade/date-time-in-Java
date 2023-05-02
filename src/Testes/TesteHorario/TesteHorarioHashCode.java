package Testes.TesteHorario;

import Horario.Horario;

public class TesteHorarioHashCode {
    
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

        System.out.println("toString");
        System.out.println("h1 : " + h1);
        System.out.println("h7 : " + h7);
        System.out.println("h2 : " + h2);
        System.out.println("h3 : " + h3);
        System.out.println("h4 : " + h4);
        System.out.println("h5 : " + h5);
        System.out.println("h6 : " + h6);
        System.out.println();

        System.out.println("hashCode");
        System.out.println("h1.hashCode() = " + h1.hashCode());
        System.out.println("h1.hashCode() = " + h7.hashCode());
        System.out.println("h2.hashCode() = " + h2.hashCode());
        System.out.println("h3.hashCode() = " + h3.hashCode());
        System.out.println("h4.hashCode() = " + h4.hashCode());
        System.out.println("h5.hashCode() = " + h5.hashCode());
        System.out.println("h6.hashCode() = " + h6.hashCode());
        System.out.println();

        System.out.println("getEndereco");
        System.out.println("h1.getEndereco() = " + h1.getEndereco());
        System.out.println("h7.getEndereco() = " + h7.getEndereco());
        System.out.println("h2.getEndereco() = " + h2.getEndereco());
        System.out.println("h3.getEndereco() = " + h3.getEndereco());
        System.out.println("h4.getEndereco() = " + h4.getEndereco());
        System.out.println("h5.getEndereco() = " + h5.getEndereco());
        System.out.println("h5.getEndereco() = " + h6.getEndereco());
        System.out.println();
    }
}
