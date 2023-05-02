package Testes.TesteHorario;

import Horario.Horario;
import Teclado.Teclado;

public class TesteHorarioTeclado {
    
    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        while (true) {
            try {
                System.out.println("Digite um horário no formato hh:mm:ss");
                String digitacao = Teclado.getUmString();
                String[] quebrador = digitacao.split(":");

                if (quebrador.length != 3) {
                    System.out.println("Horário inválida! Deve conter 3 elementos");
                    continue;
                }

                byte hora = Byte.parseByte(quebrador[0]);
                byte minuto = Byte.parseByte(quebrador[1]);
                byte segundo = Byte.parseByte(quebrador[2]);

                Horario horario = new Horario(hora, minuto, segundo);
                String horarioValido = horario.toString();
                System.out.println("Horário válido --> " + horarioValido + "\n");

            } catch (Exception e) {
                System.err.println("Horário inválida!\n");
            }
        }

    }
}
