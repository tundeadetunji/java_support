package com.tundeadetunji.support;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists<T> {
    private ArrayList<T> arrayList;

    public ArrayLists(ArrayList<T> arrayList) {
        this.arrayList = arrayList;
    }

    public ArrayList<T> getArrayList() {
        return this.arrayList;
    }

    public ArrayList<T> sortAscending() {
        Collections.sort((List) this.arrayList);
        return this.arrayList;
    }

    public ArrayList<T> sortDescending() {
        Collections.sort(this.arrayList, Collections.reverseOrder());
        return this.arrayList;
    }
}
