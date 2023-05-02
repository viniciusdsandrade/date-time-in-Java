package Testes.TesteHorario;
import Horario.Horario;

public class TesteHorarioClone {
    
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

        System.out.println("h1 = " + h1);
        System.out.println("h2 = " + h2);
        System.out.println("h3 = " + h3);
        System.out.println("h4 = " + h4);
        System.out.println("h5 = " + h5);
        System.out.println("h6 = " + h6);
        System.out.println();

        Horario cloneH1 = (Horario) h1.clone();
        Horario cloneH2 = (Horario) h2.clone();
        Horario cloneH3 = (Horario) h3.clone();
        Horario cloneH4 = (Horario) h4.clone();
        Horario cloneH5 = (Horario) h5.clone();
        Horario cloneH6 = (Horario) h6.clone();

        System.out.println("cloneH1 = " + cloneH1);
        System.out.println("cloneH2 = " + cloneH2);
        System.out.println("cloneH3 = " + cloneH3);
        System.out.println("cloneH4 = " + cloneH4);
        System.out.println("cloneH5 = " + cloneH5);
        System.out.println("cloneH6 = " + cloneH6);
        System.out.println();

        System.out.println("h1.hashCode()      = " + h1.hashCode());
        System.out.println("cloneH1.hashCode() = " + cloneH1.hashCode());
        System.out.println();

        System.out.println("h2.hashCode()      = " + h2.hashCode());
        System.out.println("cloneH2.hashCode() = " + cloneH2.hashCode());
        System.out.println();

        System.out.println("h3.hashCode()      = " + h3.hashCode());
        System.out.println("cloneH3.hashCode() = " + cloneH3.hashCode());
        System.out.println();

        System.out.println("h4.hashCode()      = " + h4.hashCode());
        System.out.println("cloneH4.hashCode() = " + cloneH4.hashCode());
        System.out.println();

        System.out.println("h5.hashCode()      = " + h5.hashCode());
        System.out.println("cloneH5.hashCode() = " + cloneH5.hashCode());
        System.out.println();

        System.out.println("h6.hashCode()      = " + h6.hashCode());
        System.out.println("cloneH6.hashCode() = " + cloneH6.hashCode());
        System.out.println();

        System.out.println("//////////////////////////////////////////////////////////////////////////////////");

        System.out.println("h1.equals(cloneH1) = " + h1.equals(cloneH1));
        System.out.println("h2.equals(cloneH2) = " + h2.equals(cloneH2));
        System.out.println("h3.equals(cloneH3) = " + h3.equals(cloneH3));
        System.out.println("h4.equals(cloneH4) = " + h4.equals(cloneH4));
        System.out.println("h5.equals(cloneH5) = " + h5.equals(cloneH5));
        System.out.println("h6.equals(cloneH6) = " + h6.equals(cloneH6));

        System.out.println("//////////////////////////////////////////////////////////////////////////////////");

        System.out.println(h1.getEndereco());
        System.out.println(cloneH1.getEndereco());
        System.out.println();
        
        System.out.println(h2.getEndereco());
        System.out.println(cloneH2.getEndereco());
        System.out.println();

        System.out.println(h3.getEndereco());
        System.out.println(cloneH3.getEndereco());
        System.out.println();

        System.out.println(h4.getEndereco());
        System.out.println(cloneH4.getEndereco());
        System.out.println();

        System.out.println(h5.getEndereco());
        System.out.println(cloneH5.getEndereco());
        System.out.println();

        System.out.println(h6.getEndereco());
        System.out.println(cloneH6.getEndereco());
        System.out.println();

    }
}
