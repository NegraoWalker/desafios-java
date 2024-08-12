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

    Exemplos:
    [1,2,3] => [1,2] ou [1,3]
    [1,2,4,8] => [1,2,4,8]

    1 % 2 == 0 => no
    1 % 3 == 0 => no
    2 % 1 == 0 => yes
    2 % 3 == 0 => no
    3 % 1 == 0 => yes
    3 % 2 == 0 => no

    1 % 2 == 0 => no
    1 % 4 == 0 => no
    1 % 8 == 0 => no
    2 % 1 == 0 => yes
    2 % 4 == 0 => yes
    2 % 8 == 0 => yes
    4 % 1 == 0 => yes
    4 % 2 == 0 => yes
    4 % 8 == 0 => yes
    8 % 1 == 0 => yes
    8 % 2 == 0 => yes
    8 % 4 == 0 => yes
 */

/*
    ALGORITMO:
    1. RECEBER UMA COLEÇÃO DE NÚMEROS INTEIROS DISTINTOS;
    2.
 */