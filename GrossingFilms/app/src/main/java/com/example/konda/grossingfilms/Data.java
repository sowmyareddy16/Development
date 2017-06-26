package com.example.konda.grossingfilms;

import android.provider.ContactsContract;
import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by konda on 4/27/2017.
 */

public class Data {
    String title;
    String distributor;
    int gross;


    Data(String title, String distributor, int gross) {
        this.title = title;
        this.distributor = distributor;
        this.gross = gross;

    }

    public static List<Data> getData() {
        List<Data> dataList = new ArrayList<>();
        dataList.add(new Data("CaptianAmerica:Civil war", "Disney", 1153304495));
        dataList.add(new Data("RogueOne:A star Wars story", "Disney", 1052352131));
        dataList.add(new Data("FindingDory", "Disney", 1028213633));
        dataList.add(new Data("Zootopia", "Disney", 1023784195));
        dataList.add(new Data("The Jungle Book", "Disney", 966550600));
        dataList.add(new Data("The secret Life of pets", "Universal", 875457937));
        dataList.add(new Data("Batman v  Superman:Dawn of justice", "Warner Bros", 873260194));
        dataList.add(new Data("Fantastic Beasts and where to find them", "Warner Bros", 812012652));
        dataList.add(new Data("Deadpool", "20th century fox", 783112979));
        dataList.add(new Data("suicide Squad", "Warner Bros", 745600054));
        return dataList;
    }
}
