class Client {
    String name;
    int riskScore;
    double accountBalance;

    Client(String name, int risk, double balance) {
        this.name = name; this.riskScore = risk; this.accountBalance = balance;
    }
}

class ClientSorter {
    // Bubble Sort ascending riskScore
    static void bubbleSort(Client[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j].riskScore > arr[j+1].riskScore) {
                    Client temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // Insertion Sort descending riskScore + accountBalance
    static void insertionSort(Client[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Client key = arr[i];
            int j = i - 1;
            while (j >= 0 && 
                  (arr[j].riskScore < key.riskScore || 
                  (arr[j].riskScore == key.riskScore && arr[j].accountBalance < key.accountBalance))) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    static void topRisks(Client[] arr, int k) {
        for (int i = 0; i < k && i < arr.length; i++) {
            System.out.println(arr[i].name + " risk=" + arr[i].riskScore);
        }
    }
}
