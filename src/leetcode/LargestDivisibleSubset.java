package leetcode;

import java.util.*;

public class LargestDivisibleSubset {
    public static void main(String[] args) {
        int[] nums = {1,2,4,8};
        System.out.println(largestDivisibleSubset(nums));
    }

    public static List<Integer> largestDivisibleSubset(int[] nums) {
        // Se o array estiver vazio, retornar uma lista vazia
        if (nums.length == 0) {
            return new ArrayList<>();
        }

        // Ordena o array
        Arrays.sort(nums);

        // Inicializa arrays dp e prev
        int[] dp = new int[nums.length];
        int[] prev = new int[nums.length];
        Arrays.fill(dp, 1);
        Arrays.fill(prev, -1);

        int maxIndex = 0;

        // Preencher dp e prev
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0 && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                    prev[i] = j;
                }
            }
            if (dp[i] > dp[maxIndex]) {
                maxIndex = i;
            }
        }

        // Reconstruir o maior subconjunto divisível
        List<Integer> result = new ArrayList<>();
        int k = maxIndex;
        while (k >= 0) {
            result.add(nums[k]);
            k = prev[k];
        }

        // Inverter o resultado para a ordem correta
        return result;
    }

}



/*
O problema Largest Divisible Subset pede para encontrar o maior subconjunto de números dentro de um array de inteiros, onde qualquer
par de números dentro desse subconjunto deve ser tal que um número divide o outro. Isso significa que, para qualquer par de números
x e y no subconjunto, ou x % y == 0 ou y % x == 0.

Exemplos:
array1 = [1,2,3]
1 % 2 == 0 => não
1 % 3 == 0 => não
2 % 1 == 0 => sim => subconjunto: [1,2]
3 % 1 == 0 => sim => subconjunto: [1,3]
2 % 3 == 0 => não
3 % 2 == 0 => não
 */

