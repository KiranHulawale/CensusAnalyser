package com.bridgelabz;

public class StateCensusAnalyser {

    public static void main(String[] args) {
        CSVStateCensus csvStateCensus = new CSVStateCensus();
        int statesCensus;
        statesCensus = csvStateCensus.readStatesCensusCsv("D:\\Java Projects Fellowship\\Day29_IndianCensus\\src\\main\\java\\com\\bridgelabz\\StateCensusData.csv");
        System.out.println(statesCensus);
    }
}