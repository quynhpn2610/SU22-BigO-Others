package DataAbstraction;

import java.util.*;

class Apple implements Comparable<Apple>{
    int weight, price;

    // Constructor

    public Apple(int weight, int price) {
        this.weight = weight;
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    // toString
    @Override
    public String toString(){
        return String.format("%d %d", weight, price);
    }

    // Compare
    @Override
    public int compareTo(Apple a) {
        if (this.weight == a.weight){
            return Integer.compare(this.price, a.price);
        }
        return Integer.compare(this.weight, a.weight);
    }
}

public class AppleMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Apple[] arr = new Apple[n];
        int weight, price;
        for (int i = 0; i < n; i++) {
            weight = sc.nextInt();
            price = sc.nextInt();
            arr[i] = new Apple(weight, price);
        }

        int indexOfMax = 0;
        int maxW = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i].getWeight() > maxW){
                maxW = arr[i].getWeight();
                indexOfMax = i;
            }
            else if (arr[i].getWeight() == maxW){
                if (arr[i].getPrice() > arr[indexOfMax].getPrice()){
                    indexOfMax = i;
                }
            }
        }

        System.out.println(indexOfMax);

        sc.close();
    }
}
