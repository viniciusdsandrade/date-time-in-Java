package Testes.TesteTeclado;

import Teclado.Teclado;

public class TesteTeclado {
    /**
     * @param args
     */
    public static void main(String[] args) {

        char opcao;
        do {

            try {
                System.out.println();
                System.out.println("(a) Digitar um String");
                System.out.println("(b) Digitar um byte");
                System.out.println("(c) Digitar um short");
                System.out.println("(d) Digitar um int");
                System.out.println("(e) Digitar um long");
                System.out.println("(f) Digitar um float");
                System.out.println("(g) Digitar um double");
                System.out.println("(h) Digitar um char");
                System.out.println("(i) Digitar um boolean");
                System.out.println("Sua opção?");
                opcao = Character.toLowerCase(Teclado.getUmChar());
            }

            catch (Exception erro) {

                opcao = 'z';

            }
            try {
                switch (opcao) {
                    case 'a':
                        System.out.println("Digite o valor para um string: ");
                        String str = Teclado.getUmString();
                        System.out.println("Foi digitado: " + str);
                        break;

                    case 'b':
                        System.out.println("Digite o valor para um byte: ");
                        byte b = Teclado.getUmByte();
                        System.out.println("Foi digitado: " + b);
                        break;

                    case 'c':
                        System.out.println("Digite o valor para um short: ");
                        short s = Teclado.getUmShort();
                        System.out.println("Foi digitado: " + s);
                        break;

                    case 'd':
                        System.out.println("Digite o valor para um int: ");
                        int i = Teclado.getUmInt();
                        System.out.println("Foi digitado: " + i);
                        break;

                    case 'e':
                        System.out.println("Digite o valor par aum long: ");
                        long l = Teclado.getUmLong();
                        System.out.println("Foi digitado: " + l);
                        break;

                    case 'f':
                        System.out.println("Digite o valor para um float: ");
                        float f = Teclado.getUmFloat();
                        System.out.println("Foi digitado: " + f);
                        break;

                    case 'g':
                        System.out.println("Digite o valor de um double: ");
                        double d = Teclado.getUmDouble();
                        System.out.println("Foi digitado: " + d);
                        break;

                    case 'h':
                        System.out.println("Digite o valor para um char:");
                        char c = Teclado.getUmChar();
                        System.out.println("Foi digitado: " + c);

                    case 'i':
                        System.out.println("Digite o valor para um boolean");
                        boolean boo = Teclado.getUmBoolean();
                        System.out.println("Foi digitado: " + boo);
                        break;

                    case 'j':
                        break;

                    default:
                        System.err.println("Opcao inválida! Tente novamente...\n");
                }

            } catch (Exception erro) {
                System.err.println(erro.getMessage());
            }

        } while (opcao != 'z');
    }
}
