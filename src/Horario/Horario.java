package Horario;

import java.util.Objects;

public class Horario implements Comparable<Horario>, Cloneable {

    private byte segundo, minuto, hora;

    /**
     * @param hora
     * @param minuto
     * @param segundo
     * @return boolean
     */

    // getters for the seconds, minutes and hours
    public long getSegundo() {
        return this.segundo;
    }

    public long getMinuto() {
        return this.minuto;
    }

    public long getHora() {
        return this.hora;
    }

    // setters for the seconds, minutes and hours, throwing an exception if the
    // value is not valid
    public void setSegundo(byte segundo) throws Exception {
        if (segundo > 59 || segundo < 0) {
            throw new Exception("Segundo invalido");
        }
        this.segundo = segundo;
    }

    public void setMinuto(byte minuto) throws Exception {
        if (minuto > 59 || minuto < 0) {
            throw new Exception("Minuto invalido");
        }
        this.minuto = minuto;
    }

    public void setHora(byte hora) throws Exception {
        if (hora > 23 || hora < 0) {
            throw new Exception("Hora inválida");
        }
        this.hora = hora;
    }

    // Constructor for a time object
    public Horario(byte hora, byte minuto, byte segundo) throws Exception {

        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    // Copy constructor
    public Horario(Horario outroHorario) throws Exception {

        if (outroHorario == null) {
            throw new NullPointerException();
        }
        this.segundo = outroHorario.segundo;
        this.minuto = outroHorario.minuto;
        this.hora = outroHorario.hora;
    }

    @Override
    public Object clone() {

        Horario ret = null;

        try {
            ret = new Horario(this);
        } catch (Exception ignore) {
        }

        return ret;
    }

    @Override
    public int hashCode() {

        int prime = 17;
        int hash = 13;

        hash *= prime + Objects.hashCode(this.segundo);
        hash *= prime + Objects.hashCode(this.minuto);
        hash *= prime + Objects.hashCode(this.hora);

        if (hash < 0) {
            hash = -hash;
        }

        return hash;
    }

    // Method to check if two time objects are equal based on their seconds, minutes
    // and hours values
    @Override
    public boolean equals(Object obj) {

        // mesmo endereço de memória
        if (this == obj)
            return true;

        // Instancia nula
        if (obj == null)
            return false;

        // Mesmo tipo
        if (this.getClass() != obj.getClass())
            return false;

        Horario horario = (Horario) obj;

        // DeepEquals
        return Objects.deepEquals(this.segundo, horario.segundo) &&
                Objects.deepEquals(this.minuto, horario.minuto) &&
                Objects.deepEquals(this.hora, horario.hora);
    }

    @Override
    public String toString() {

        return (this.hora < 10 ? "0" : "") + this.hora + ":" +
                (this.minuto < 10 ? "0" : "") + this.minuto + ":" +
                (this.segundo < 10 ? "0" : "") + this.segundo;
    }

    // Comparação entre dois horários distintos
    @Override
    public int compareTo(Horario h) {
        if (this.hora != h.hora) {
            return Integer.compare(this.hora, h.hora);
        } else if (this.minuto != h.minuto) {
            return Integer.compare(this.minuto, h.minuto);
        } else {
            return Integer.compare(this.segundo, h.segundo);
        }
    }

    // Endereço de memória
    public String getEndereco() {
        return super.toString();
    }

    // método que modifica o this, avancando uma quantidade de segundos passada como
    // parâmetro

    // método para avançar 1s alterando o this da classe
    public void avanceUmSeg() throws Exception {
        this.segundo++;
        if (this.segundo == 60) {
            this.segundo = 0;
            this.minuto++;
            if (this.minuto == 60) {
                this.minuto = 0;
                if (this.hora < 23) {
                    this.hora++;
                } else {
                    this.hora = 0;
                }
            }
        }
    }

    public void avanceUmMin() throws Exception {
        this.minuto++;
        if (this.minuto == 60) {
            this.minuto = 0;
            if (this.hora < 23) {
                this.hora++;
            } else {
                this.hora = 0;
            }
        }
    }

    public void avanceUmaH() throws Exception {
        this.hora++;
        if (this.hora < 23) {
            this.hora++;
        } else {
            this.hora = 0;
        }
    }

    public void avanceAlgunsSegs(int seg) throws Exception {

        while (seg > 0) {
            this.avanceUmSeg();
            seg--;
        }
    }

    public void avanceAlgunsMins(int min) throws Exception {

        while (min > 0) {
            this.avanceUmMin();
            min--;
        }
    }

    public void avanceAlgunsHrs(int hrs) throws Exception {

        while (hrs > 0) {
            this.avanceUmaH();
            hrs--;
        }
    }

    public Horario getHorarioDaquiA(int seg) throws Exception {
        Horario horario = new Horario(this);
        while (seg > 0) {
            horario = horario.avancaUmSegundo();
            seg--;
        }
        return horario;
    }

    // método que modifica o this, retornando uma quantidae de segundos passada como
    // parâmetro
    public void retrocedaAlgunsSeg(int seg) throws Exception {
        while (seg > 0) {
            this.retrocedaUmSeg();
            seg--;
        }
    }

    public void retrocedaAlgunsMin(int min) throws Exception {
        while (min > 0) {
            this.retrocedaUmSeg();
            min--;
        }
    }

    public void retrocedaAlgumasHrs(int hrs) throws Exception {
        while (hrs > 0) {
            this.retrocedaUmSeg();
            hrs--;
        }
    }

    public void retrocedaUmSeg() throws Exception {
        this.segundo--;
        if (this.segundo == -1) {
            this.segundo = 59;
            this.minuto--;
            if (this.minuto == -1) {
                this.minuto = 59;
                if (this.hora > 0) {
                    this.hora--;
                } else {
                    this.hora = 23;
                }
            }
        }
    }

    public void retrocedaUmMin() throws Exception {
        this.minuto--;
        if (this.minuto == -1) {
            this.minuto = 59;
            if (this.hora > 0) {
                this.hora--;
            } else {
                this.hora = 23;
            }
        }
    }

    public void retrocedaUmaH() throws Exception {
        this.hora--;
        if (this.hora == -1) {
            this.hora = 23;
        }
    }

    public Horario getHorarioHa(int seg) throws Exception {
        Horario horario = new Horario(this);
        while (seg > 0) {
            horario = horario.retrocedaUmSegundo();
            seg--;
        }
        return horario;
    }

    public Horario avanca(long horas, long minutos, long segundos) throws Exception {
        Horario horario = (Horario) this.clone();

        // avança horas
        while (horas > 0) {
            horario = horario.avancaUmaHora();
            horas--;
        }

        // avança minutos
        while (minutos > 0) {
            horario = horario.avancaUmMinuto();
            minutos--;
        }

        // avança segundos
        while (segundos > 0) {
            horario = horario.avancaUmSegundo();
            segundos--;
        }

        return horario;
    }

    public Horario retroceda(long horas, long minutos, long segundos) throws Exception {
        Horario horario = new Horario(this);

        // retrocede horas
        while (horas > 0) {
            horario = horario.retrocedaUmaHora();
            horas--;
        }

        // retrocede minutos
        while (minutos > 0) {
            horario = horario.retrocedaUmMinuto();
            minutos--;
        }

        // retrocede segundos
        while (segundos > 0) {
            horario = horario.retrocedaUmSegundo();
            segundos--;
        }

        return horario;
    }

    // métodos para avançar 1 unidade de tempo
    public Horario retrocedaUmSegundo() {

        Horario ret = null;

        try {
            ret = new Horario(this.hora, this.minuto, (byte) (this.segundo - 1));
        } catch (Exception erro1) {
            try {
                ret = new Horario(this.hora, (byte) (this.minuto - 1), (byte) 59);
            } catch (Exception erro2) {
                try {
                    ret = new Horario((byte) (this.hora - 1), (byte) 59, (byte) 59);
                } catch (Exception erro3) {
                    try {
                        ret = new Horario((byte) 23, (byte) 59, (byte) 59);
                    } catch (Exception erro4) {
                        System.err.println(erro4.getMessage());
                    }
                }

            }
        }

        return ret;

    }

    public Horario retrocedaUmMinuto() {
        Horario ret = null;

        try {
            ret = new Horario(this.hora, (byte) (this.minuto - 1), this.segundo);
        } catch (Exception erro1) {
            try {
                ret = new Horario((byte) (this.hora - 1), (byte) 59, this.segundo);
            } catch (Exception erro2) {
                try {
                    ret = new Horario((byte) 23, (byte) 59, this.segundo);
                } catch (Exception ignore) {
                }
            }
        }

        return ret;
    }

    public Horario retrocedaUmaHora() {
        Horario ret = null;

        try {
            ret = new Horario((byte) (this.hora - 1), this.minuto, this.segundo);
        } catch (Exception erro1) {
            try {
                ret = new Horario((byte) 23, this.minuto, this.segundo);
            } catch (Exception ignore) {
            }
        }
        return ret;
    }

    // método para avançar 1s criando um novo objeto Horario
    public Horario avancaUmSegundo() {
        Horario ret = null;
        try {
            ret = new Horario(this.hora, this.minuto, (byte) (this.segundo + 1));
        } catch (Exception erro1) {
            try {
                ret = new Horario(this.hora, (byte) (this.minuto + 1), (byte) 0);
            } catch (Exception erro2) {
                try {
                    ret = new Horario((byte) (this.hora + 1), (byte) 0, (byte) 0);
                } catch (Exception erro3) {
                    try {
                        ret = new Horario((byte) 0, (byte) 0, (byte) 0);
                    } catch (Exception erro4) {
                        System.err.println(erro4.getMessage());
                    }
                }
            }
        }

        return ret;
    }

    public Horario avancaUmMinuto() {
        Horario ret = null;

        try {
            ret = new Horario(this.hora, (byte) (this.minuto + 1), this.segundo);
        } catch (Exception erro1) {
            try {
                ret = new Horario((byte) (this.hora + 1), (byte) 0, this.segundo);
            } catch (Exception erro2) {
                try {
                    ret = new Horario((byte) 0, (byte) 0, this.segundo);
                } catch (Exception ignore) {
                }
            }
        }

        return ret;
    }

    public Horario avancaUmaHora() {
        Horario ret = null;

        try {
            ret = new Horario((byte) (this.hora + 1), this.minuto, this.segundo);
        } catch (Exception erro1) {
            try {
                ret = new Horario((byte) 0, this.minuto, this.segundo);
            } catch (Exception ignore) {
            }
        }

        return ret;
    }

    // Método para avançar Uma quantidade n de tempo estabelecida pelo usuário
    public Horario avancaNSegundos(long seg) throws Exception {
        Horario horario = new Horario(this);
        while (seg > 0) {
            horario = horario.avancaUmSegundo();
            seg--;
        }
        return horario;
    }

    public Horario avancaNMinutos(long min) throws Exception {
        Horario horario = new Horario(this);
        while (min > 0) {
            horario = horario.avancaUmMinuto();
            min--;
        }
        return horario;
    }

    public Horario avancaNHoras(long hora) throws Exception {
        Horario horario = new Horario(this);
        while (hora > 0) {
            horario = horario.avancaUmaHora();
            hora--;
        }
        return horario;
    }

    // Método para retrocer Uma quantidade n de tempo estabelecida pelo usuário
    public Horario retrocedaNSegundos(long seg) throws Exception {
        Horario horario = new Horario(this);
        while (seg > 0) {
            horario = horario.retrocedaUmSegundo();
            seg--;
        }
        return horario;
    }

    public Horario retrocedaNMinutos(long min) throws Exception {
        Horario horario = new Horario(this);
        while (min > 0) {
            horario = horario.retrocedaUmMinuto();
            min--;
        }
        return horario;
    }

    public Horario retrocedaNHoras(long hora) throws Exception {
        Horario horario = new Horario(this);
        while (hora > 0) {
            horario = horario.retrocedaUmaHora();
            hora--;
        }
        return horario;
    }
}
