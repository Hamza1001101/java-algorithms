package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

        String s = "45E";
        System.out.println(Integer.parseInt(s, 16));
    }
    
    public int binaryToDecimal(String str) {
        return Integer.parseInt(str, 2);
    }

    public ArrayList<Integer> topK(ArrayList<Integer> array, int k) {
        // code here

        var map = new TreeMap<Integer, Integer>();
        array.forEach(integer -> {
            map.merge(integer, 1, Integer::sum);
        });
        ArrayList<Integer> integerList = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toList())
                .stream()
                .skip(map.entrySet().size() - k)
                .map(Map.Entry::getKey)
                .collect(Collectors.toCollection(ArrayList::new));

        Collections.reverse(integerList);
        return integerList;
    }

    //Function to reverse words in a given string.
    public String reverseWords(String S) {
        // code here 
        String[] toArr = S.split("\\.");
        String reversed = "";
        for (int i = toArr.length - 1; i >= 0; i--) {
            reversed += toArr[i] + ".";

        }
        return reversed.substring(0, reversed.length() - 1);
    }

    public String arrangeString(String s) {
        //split into array  "AC2BEW3" [A, C, 2, B, E, W, 3]
        //sort [A B C E W 2 3]
        var characters = new ArrayList<Character>();
        var numbers = new ArrayList<Character>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                numbers.add(ch);
            } else if (Character.isAlphabetic(ch)) {
                characters.add(ch);
            }
        }

        Collections.sort(characters);
        String sortedString = "";
        for (int i = 0; i < characters.size(); i++) {
            sortedString += Character.toString(characters.get(i));
        }

        return sortedString.concat(Integer.toString(sumNumbers(numbers)));
    }

    public ArrayList<Integer> primeRange(int M, int N) {
        // code here
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = M; i <= N; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }


    public String newIPAdd(String S) {
        // your code here
        String[] toStr = S.split("\\.");

        List<String> list = new ArrayList<>(Arrays.asList(toStr));
        List<String> listWithoutZeroes = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            listWithoutZeroes.add(removeLeadingZeros(list.get(i)));
        }

        return buildIPAddress(listWithoutZeroes);
    }

    private static int sumNumbers(ArrayList<Character> numbers) {
        return numbers.stream()
                .mapToInt(value -> value - '0')
                .sum();
    }

    private int[] twoSumHashMap(int[] arr, int target) {
        var map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            int compliment = target - arr[i];
            if (map.containsKey(compliment))
                return new int[]{map.get(compliment), i};
            map.put(arr[i], i);
        }
        throw new IllegalArgumentException("No such file found");
    }

    private int[] twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No such value here");
    }

    private boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private String removeLeadingZeros(String str) {
        String regex = "^0+(?!$)";
        return str.replaceAll(regex, "");
    }

    private String buildIPAddress(List<String> num) {
        String result = "";
        for (int i = 0; i < num.size(); i++) {
            result += num.get(i) + ".";
        }
        return result.substring(0, result.length() - 1);

    }

}
