package desafioPwc;

// a. “Rio Branco 23” -> {“Rio Branco”, “23”}
// b. “Quirino dos Santos 23 b” -> {“Quirino dos Santos”, ”23 b”}

// a. “4, Rue de la République” -> {"Rue de la République", "4"}
// b. “100 Broadway Av” -> {"Broadway Av", "100"}
// c. “Calle Sagasta, 26” -> {“Calle Sagasta”, “26”}
// d. “Calle 44 No 1991” -> {“Calle 44”, “No 1991”}

import java.util.Arrays;

public class DesafioPwc2024 {

    public static void main(String[] args) {
        
        String[] listaDeCasosSimples = {"Miritiba 339", "Babaçu 500", "Cambuí 804B"};
        String[] listaDeCasosMaisComplicados = {"Rio Branco 23", "Quirino dos Santos 23 b"};
        String[] listaDeCasosComplexos = {"4, Rue de la République", "100 Broadway Av", "Calle Sagasta, 26", "Calle 44 No 1991"};


        exibir(listaDeCasosSimples);
        exibir(listaDeCasosMaisComplicados);
        exibir(listaDeCasosComplexos);
        
    }

    public static String[] separarEndereco(String enderecoCompleto) {
        // Separar o enderecoCompleto e armazenar em uma lista
        String[] lista = enderecoCompleto.split(" ");
        String endereco = "";
        String numero = "";
     
        if (lista.length == 2) {
            endereco = lista[0];
            numero = lista[1];

        } else {
  
            if (isNumeric(lista[lista.length - 1])) { // Verifica se o último elemento é um dígito
            endereco = String.join(" ", java.util.Arrays.copyOfRange(lista, 0, lista.length - 1));
            numero = lista[lista.length -1];
            
            } else if (isNumeric(lista[lista.length - 2])) { // Verifica se o penúltimo elemento da lista é um dígito
                endereco = String.join(" ", java.util.Arrays.copyOfRange(lista, 0, lista.length - 2));
                numero = lista[lista.length - 2] + " " + lista[lista.length - 1];

            } else if (isNumeric(lista[0])) { // Verifica se o primeiro elemento da lista é um dígito
                endereco = String.join(" ", java.util.Arrays.copyOfRange(lista, 1, lista.length));
                numero = lista[0];
            } 

            if (enderecoCompleto.contains(", ")) { // Verifica se no endereço fornecido há uma vírgula
                String[] partes = enderecoCompleto.split(", ");

                if (partes[1].length() > partes[0].length()) {
                    endereco = partes[1];
                    numero = partes[0];

                } else {
                    endereco = partes[0];
                    numero = partes[1];
                }
            
            if (enderecoCompleto.contains("No")) {

                int indice = Arrays.asList(lista).indexOf("No");
                endereco = String.join(" ", java.util.Arrays.copyOfRange(lista, 0, indice - 2));
                numero = String.join(" ", java.util.Arrays.copyOfRange(lista, indice +2, lista.length));
                numero = ", " + numero;
            }
            
            }
        }

        return new String[]{endereco, numero};
    }
        
    public static void exibir(String[] listaDeEnderecos) {
        for (String endereco : listaDeEnderecos) {
            System.out.println();
            String[] resultado = separarEndereco(endereco);
            System.out.println(resultado[0] + ", " + resultado[1]);
        }
    }

    private static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }

}