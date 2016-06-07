package com.thoughtworks.fairrations;


public class FairRations {

    public String toString(int[] initialDistribution) {

        String output = "";
        int totalBread = 0;


        for (int i = 0; i < initialDistribution.length - 1; i++) {

            if(isOdd(initialDistribution[i])){

                initialDistribution[i] += 1;
                initialDistribution[i+1] += 1;
                totalBread += 2;

            }
        }

        for (int i = 0; i < initialDistribution.length ; i++) {
            if(isOdd(initialDistribution[i])){
                return "NO";
            }
            else if (isEven(initialDistribution[i])){
                output = String.valueOf(totalBread);
            }
        }


        return output;
    }

    private boolean isEven(int i) {
        return i %2 == 0;
    }

    private boolean isOdd(int i) {
        return i % 2 != 0;
    }


}
