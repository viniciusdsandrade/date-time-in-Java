package Data;

public class Data implements Comparable<Data>, Cloneable {

    private byte dia, mes;
    private short ano;

    /**
     * @param ano
     * @return boolean
     */
    private static boolean isBissexto(short ano) {
        // vigencia do Calendario Juliano
        if (ano < 1583)
            if (ano % 4 == 0)
                return true;
            else
                return false;

        // vigencia do Calendario Gregoriano
        if (ano % 400 == 0)
            return true;

        if (ano % 4 == 0 && ano % 100 != 0)
            return true;

        return false;
    }

    // Verificador de datas válidas
    private static boolean isValida(byte dia, byte mes, short ano) {
        if (dia < 1 || dia > 31)
            return false;

        if (mes < 1 || mes > 12)
            return false;

        if (ano == 0)
            return false;

        // Bula Papal Inter Gravissimas, do Papa Gregório XIII
        if (ano == 1582 && mes == 10 && dia >= 5 && dia <= 14)
            return false;

        if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30)
            return false;

        if (mes == 2 && dia > 29)
            return false;

        // Método estático
        if (mes == 2 && dia > 28 && !Data.isBissexto(ano))
            return false;

        return true;
    }

    public byte getDia() {
        return this.dia;
    }

    public byte getMes() {
        return this.mes;
    }

    public short getAno() {
        return this.ano;
    }

    public void setDia(byte dia) throws Exception {
        if (!isValida(dia, this.mes, this.ano))
            throw new Exception("Dia inválido!");

        this.dia = dia;
    }

    public void setMes(byte mes) throws Exception {
        if (!isValida(this.dia, mes, this.ano))
            throw new Exception("Mês inválido!");

        this.mes = mes;
    }

    public void setAno(short ano) throws Exception {
        if (!isValida(this.dia, this.mes, ano))
            throw new Exception("Ano inválido!");

        this.ano = ano;
    }

    public Data(byte dia, byte mes, short ano) throws Exception {
        if (!isValida(dia, mes, ano))
            throw new IllegalArgumentException("Data invalida!");

        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    // Construtor de cópia
    public Data(Data outraData) throws Exception {

        if (outraData == null) {
            throw new NullPointerException();
        }

        this.dia = outraData.dia;
        this.mes = outraData.mes;
        this.ano = outraData.ano;
    }

    @Override
    public Object clone() {

        Data ret = null;

        try {
            ret = new Data(this);
        } catch (Exception ignore) {
        }

        return ret;
    }

    @Override
    public String toString() {

        String ret = "";

        if (this.dia < 10) {
            ret += "0" + this.dia + "/";
        } else {
            ret += this.dia + "/";
        }

        if (this.mes < 10) {
            ret += "0" + this.mes + "/";
        } else {
            ret += this.mes + "/";
        }

        if (this.ano < 0) {
            ret += -this.ano + " a.c";
        } else {
            ret += this.ano;
        }

        return ret;

        /*
         * (this.dia < 10 ? "0" : "") + this.dia + "/" +
         * (this.mes < 10 ? "0" : "") + this.mes + "/" +
         * this.ano;
         */
        // return String.format("%02d/%02d/%04d", dia, mes, ano);
    }

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

        if (Data.class != obj.getClass())
            return false;

        // Revela para o compilador o tipo de obj
        Data outraData = (Data) obj;

        if (this.dia != outraData.dia)
            return false;
        if (this.mes != outraData.mes)
            return false;
        if (this.ano != outraData.ano)
            return false;

        return true;

    }

    public String getEndereco() {
        return super.toString();
    }

    @Override
    public int hashCode() {

        int hash = 666; // Qualquer número inteiro positivo
        int prime = 31; // Qualque primo positivo

        hash *= prime + Integer.valueOf(this.dia).hashCode();
        hash *= prime + Integer.valueOf(this.mes).hashCode();
        hash *= prime + Integer.valueOf(this.ano).hashCode();

        if (hash < 0)
            hash = -hash;

        return hash;
    }

    @Override
    public int compareTo(Data outraData) {
        if (this.ano != outraData.ano)
            return Integer.compare(this.ano, outraData.ano);

        else if (this.mes != outraData.mes)
            return Integer.compare(this.mes, outraData.mes);

        else
            return Integer.compare(this.dia, outraData.dia);
    }

    private void avanceUmDia() {
        if (this.dia == 4 && this.mes == 10 && this.ano == 1582)
            this.dia = (byte) 15;
        else if (isValida((byte) (this.dia + 1), this.mes, this.ano))
            this.dia++;
        else if (isValida((byte) 1, (byte) (this.mes + 1), this.ano)) {
            this.dia = (byte) 1;
            this.mes++;
        } else {
            this.dia = (byte) 1;
            this.mes = (byte) 1;
            this.ano++;
            if (this.ano == 0)
                this.ano++;
        }
    }

    public void avanceVoid(int qtdDias) throws Exception {
        if (qtdDias <= 0)
            throw new Exception("Quantidade invalida");

        for (int i = 0; i < qtdDias; i++)
            this.avanceUmDia();
    }

    public Data getDataDaquiA(int qtdDias) throws Exception {
        Data nova = new Data(this.dia, this.mes, this.ano);

        nova.avanceVoid(qtdDias);

        return nova;
    }

    public void retrocedaUmDia() throws Exception {
        if (this.dia == 15 && this.mes == 10 && this.ano == 1582)
            this.dia = (byte) 4;
        else if (isValida((byte) (this.dia - 1), this.mes, this.ano))
            this.dia--;
        else if (isValida((byte) 31, (byte) (this.mes - 1), this.ano)) {
            this.dia = (byte) 31;
            this.mes--;
        } else if (isValida((byte) 30, (byte) (this.mes - 1), this.ano)) {
            this.dia = (byte) 30;
            this.mes--;
        } else if (isValida((byte) 29, (byte) (this.mes - 1), this.ano)) {
            this.dia = (byte) 29;
            this.mes--;
        } else if (isValida((byte) 28, (byte) (this.mes - 1), this.ano)) {
            this.dia = (byte) 28;
            this.mes--;
        } else {
            this.dia = (byte) 31;
            this.mes = (byte) 12;
            this.ano--;
            if (this.ano == 0)
                this.ano--;
            if (this.ano == -44)
                throw new Exception("Antes de 45ac, nao");
        }
    }

    public void retrocedaVoid(int qtdDias) throws Exception {
        if (qtdDias <= 0)
            throw new Exception("Quantidade invalida");

        for (int i = 0; i < qtdDias; i++)
            this.retrocedaUmDia();
    }

    public Data getDataHa(int qtdDias) throws Exception {
        Data nova = new Data(this.dia, this.mes, this.ano);

        nova.retrocedaVoid(qtdDias);

        return nova;
    }

    public Data getDiaAnterior() {
        Data ret = null;
        try {
            ret = new Data((byte) (this.dia - 1), this.mes, this.ano);
        } catch (Exception erro1) {
            try {
                ret = new Data((byte) (this.dia - 10), this.mes, this.ano);
            } catch (Exception erro2) {
                try {
                    ret = new Data((byte) 31, (byte) (this.mes - 1), this.ano);
                } catch (Exception erro3) {
                    try {
                        ret = new Data((byte) 30, (byte) (this.mes - 1), this.ano);
                    } catch (Exception erro4) {
                        try {
                            ret = new Data((byte) 29, (byte) (this.mes - 1), this.ano);
                        } catch (Exception erro5) {
                            try {
                                ret = new Data((byte) 28, (byte) (this.mes - 1), this.ano);
                            } catch (Exception erro6) {
                                try {
                                    ret = new Data((byte) 31, (byte) 12, (short) (this.ano - 1));
                                } catch (Exception erro7) {
                                    try {
                                        ret = new Data((byte) 31, (byte) 12, (short) (this.ano - 2));
                                    } catch (Exception erro8) {
                                        try {
                                            ret = new Data((byte) 4, (byte) 10, (short) 1582);
                                        } catch (Exception erro9) {

                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

        }
        return ret;
    }

    public Data retrocedaData(int qntDias) throws Exception {

        Data novaData = new Data(this);

        if (qntDias <= 0) {
            throw new Exception("Quantidade inválida");
        }
        while (qntDias > 0) {
            novaData = novaData.getDiaAnterior();
            qntDias--;
        }

        return novaData;
    }

    public Data avance(int qtdDias) throws Exception {

        Data novaData = (Data) this.clone();

        if (qtdDias <= 0)
            throw new Exception("Quantidade inválida!");

        while (qtdDias > 0) {

            novaData = novaData.getDiaSeguinte();
            qtdDias--;
        }

        return novaData;
    }

    public Data getDiaSeguinte() {
        Data ret = null;

        try {
            ret = new Data((byte) (this.dia + 1), this.mes, this.ano);
        } catch (Exception erro1) {
            try {
                ret = new Data((byte) 1, (byte) (this.mes + 1), this.ano);
            } catch (Exception erro2) {
                try {
                    ret = new Data((byte) 1, (byte) 1, (short) (this.ano + 1));
                } catch (Exception erro3) {
                    try {
                        ret = new Data((byte) 1, (byte) 1, (short) (this.ano + 2));
                    } catch (Exception erro4) {
                        try {
                            ret = new Data((byte) 15, (byte) 10, (short) 1582);
                        } catch (Exception ignored) {
                        }
                    }
                }
            }
        }
        return ret;
    }
}