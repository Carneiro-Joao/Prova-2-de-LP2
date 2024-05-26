public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data() {
    }

    public Data(int dia, int mes, int ano) {
        this.setData(dia, mes, ano);
    }

    public Data(int dia, String mes, int ano) {
        this.setData(dia, mes, ano);
    }

    public Data(int diaDoAno, int ano) {
        this.setData(diaDoAno, ano);
    }

    public void setData(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void setData(int dia, String mes, int ano) {
        this.dia = dia;
        this.mes = converteMesParaNumero(mes);
        this.ano = ano;
    }

    public void setData(int diaDoAno, int ano) {
        this.ano = ano;
        setDateFromDayOfTheYear(diaDoAno, ano);
    }

    private int converteMesParaNumero(String mes) {
        switch (mes.toLowerCase()) {
            case "janeiro":
                return 1;
            case "fevereiro":
                return 2;
            case "março":
                return 3;
            case "abril":
                return 4;
            case "maio":
                return 5;
            case "junho":
                return 6;
            case "julho":
                return 7;
            case "agosto":
                return 8;
            case "setembro":
                return 9;
            case "outubro":
                return 10;
            case "novembro":
                return 11;
            case "dezembro":
                return 12;
            default:
                return 0;
        }
    }

    private void setDateFromDayOfTheYear(int diaDoAno, int ano) {
        int[] diasNoMes = {
                31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };

        if (isLeapYear(ano)) {
            diasNoMes[1] = 29;
        }

        int dia = diaDoAno;
        int mes = 0;
        for (int i = 0; i < diasNoMes.length; i++) {
            if (dia <= diasNoMes[i]) {
                mes = i + 1;
                break;
            } else {
                dia -= diasNoMes[i];
            }
        }
        this.dia = dia;
        this.mes = mes;
    }

    private boolean isLeapYear(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%d", dia, mes, ano);
    }

    public static void main(String[] args) {
        // Testes dos construtores
        Data d1 = new Data(29, 5, 2023);
        System.out.println(d1); // Saída esperada: 29/05/2023

        Data d2 = new Data(29, "Maio", 2023);
        System.out.println(d2); // Saída esperada: 29/05/2023

        Data d3 = new Data(149, 2023);
        System.out.println(d3); // Saída esperada: 29/05/2023 (149º dia de 2023)

        // Testes dos métodos setData
        Data dl = new Data();
        dl.setData(29, 5, 2023);
        System.out.println(dl); // Saída esperada: 29/05/2023

        dl.setData(29, "Maio", 2023);
        System.out.println(dl); // Saída esperada: 29/05/2023

        dl.setData(149, 2023);
        System.out.println(dl); // Saída esperada: 29/05/2023 (149º dia de 2023)
    }
}
