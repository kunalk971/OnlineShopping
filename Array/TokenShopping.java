 package Array;


import java.util.*;

class Item {
    String name;
    int cost;

    public Item(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }
}

public class TokenShopping {

    static List<String> getItemsToBuy(int n, int[] tokens, int[] claim, int k, List<Item> items) {
        List<String> result = new ArrayList<>();

        int maxTokens = 0;
        int startIndex = 0;

        // Find the starting index for the bumper offer
        for (int i = 0; i <= n - k; ++i) {
            int currentTokens = 0;
            for (int j = i; j < i + k; ++j) {
                if (claim[j] == 0) {
                    currentTokens += tokens[j];
                }
            }

            if (currentTokens > maxTokens) {
                maxTokens = currentTokens;
                startIndex = i;
            }
        }

        // Calculate the total tokens and find the item(s) to buy
        int totalTokens = 0;
        Map<String, Integer> availableItems = new HashMap<>();

        for (int i = startIndex; i < startIndex + k; ++i) {
            if (claim[i] == 0) {
                totalTokens += tokens[i];
            }
        }

        for (Item item : items) {
            if (item.cost <= totalTokens) {
                availableItems.put(item.name, item.cost);
            }
        }

        // Find the minimal wastage and lexicographically smallest item(s)
        int minimalWastage = totalTokens;
        for (Item item : items) {
            if (availableItems.containsKey(item.name)) {
                int wastage = totalTokens - availableItems.get(item.name);
                if (wastage < minimalWastage) {
                    minimalWastage = wastage;
                    result.clear();
                    result.add(item.name);
                } else if (wastage == minimalWastage) {
                    result.add(item.name);
                }
            }
        }

        Collections.sort(result); // Ensure lexicographical order
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] tokens = new int[n];
        for (int i = 0; i < n; ++i) {
            tokens[i] = scanner.nextInt();
        }

        int[] claim = new int[n];
        for (int i = 0; i < n; ++i) {
            claim[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String itemsInput = scanner.nextLine();
        List<Item> items = new ArrayList<>();

        String[] itemTokens = itemsInput.split(" ");
        for (String token : itemTokens) {
            String[] parts = token.split(":");
            if (parts.length == 2) {
                String itemName = parts[0];
                int itemCost = Integer.parseInt(parts[1]);
                items.add(new Item(itemName, itemCost));
            }
        }

        List<String> result = getItemsToBuy(n, tokens, claim, k, items);

        for (String item : result) {
            System.out.println(item);
        }
    }
}


// import java.util.*;

// class Item {
//     String name;
//     int cost;

//     public Item(String name, int cost) {
//         this.name = name;
//         this.cost = cost;
//     }
// }

// public class TokenShopping {

//     static List<String> getItemsToBuy(int n, int[] tokens, int[] claim, int k, List<Item> items) {
//         List<String> result = new ArrayList<>();

//         int maxTokens = 0;
//         int startIndex = 0;

//         for (int i = 0; i <= n - k; ++i) {
//             int currentTokens = 0;
//             for (int j = i; j < i + k; ++j) {
//                 if (claim[j] == 0) {
//                     currentTokens += tokens[j];
//                 }
//             }

//             if (currentTokens > maxTokens) {
//                 maxTokens = currentTokens;
//                 startIndex = i;
//             }
//         }

//         int totalTokens = 0;
//         Map<String, Integer> availableItems = new HashMap<>();

//         for (int i = startIndex; i < startIndex + k; ++i) {
//             if (claim[i] == 0) {
//                 totalTokens += tokens[i];
//             }
//         }

//         for (Item item : items) {
//             if (item.cost <= totalTokens) {
//                 availableItems.put(item.name, item.cost);
//             }
//         }

//         int minimalWastage = totalTokens;
//         for (Item item : items) {
//             if (availableItems.containsKey(item.name)) {
//                 int wastage = totalTokens - availableItems.get(item.name);
//                 if (wastage < minimalWastage) {
//                     minimalWastage = wastage;
//                     result.clear();
//                     result.add(item.name);
//                 } else if (wastage == minimalWastage) {
//                     result.add(item.name);
//                 }
//             }
//         }

//         Collections.sort(result);
//         return result;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter number of days (n): ");
//         int n = scanner.nextInt();

//         int[] tokens = new int[n];
//         System.out.println("Enter tokens for each day:");
//         for (int i = 0; i < n; ++i) {
//             tokens[i] = scanner.nextInt();
//         }

//         int[] claim = new int[n];
//         System.out.println("Enter claim status for each day (0 or 1):");
//         for (int i = 0; i < n; ++i) {
//             claim[i] = scanner.nextInt();
//         }

//         System.out.print("Enter number of consecutive days (k): ");
//         int k = scanner.nextInt();
//         scanner.nextLine(); // consume newline

//         System.out.print("Enter number of items: ");
//         int itemCount = Integer.parseInt(scanner.nextLine());

//         List<Item> items = new ArrayList<>();
//         System.out.println("Enter items in format 'name cost' (one per line):");
//         for (int i = 0; i < itemCount; ++i) {
//             String[] parts = scanner.nextLine().split(" ");
//             String name = parts[0];
//             int cost = Integer.parseInt(parts[1]);
//             items.add(new Item(name, cost));
//         }

//         List<String> result = getItemsToBuy(n, tokens, claim, k, items);

//         System.out.println("Item(s) to buy:");
//         for (String item : result) {
//             System.out.println(item);
//         }
//     }
// }