package leetcode;

import java.util.*;

public class LargestDivisibleSubset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe uma sequência de números inteiros distintos separados por vírgula: ");
        List<Integer> integerList = new ArrayList<>();
        List<Integer> subIntegerList = new ArrayList<>();
        String input = scanner.nextLine();
        String[] collectionStringNumbers = input.split(","); //Array de Strings
        for (String number: collectionStringNumbers) {
            int integerNumber = Integer.parseInt(number);
            integerList.add(integerNumber);
        }
        int j = 1;
        for (int i = 0; i < integerList.size() - 1; i++) {
            if (integerList.get(i) % integerList.get(j) == 0 || integerList.get(j) % integerList.get(i) == 0) {
                j++;
                subIntegerList.add(integerList.get(i));
            }
        }
        System.out.println("Input: " + integerList);
        System.out.println("Output: " + subIntegerList);
        scanner.close();
    }
}



/*
    Maior subconjunto divisível:
       Dado um conjunto de números inteiros positivos distintos nums, retorne a maior resposta do subconjunto tal que cada par (resposta[i], resposta[j])
       de elementos neste subconjunto satisfaça:
       resposta[i] % resposta[j] == 0, ou
       resposta[j] % resposta[i] == 0
    Se houver várias soluções, retorne qualquer uma delas.

 */

/*
    Tenho que receber uma coleção de inteiros distintos;
    Tenho que dividir cada número inteiro armazenado pelos demais sendo do inicio para o final ou do final para o inicio
    retornar os numeros que são divisiveis
 */