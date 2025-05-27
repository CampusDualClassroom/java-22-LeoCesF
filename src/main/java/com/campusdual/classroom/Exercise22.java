package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Exercise22 {

    public static List<String> createArrayList() {
        List<String> listaArray = new ArrayList<>();
        listaArray.add("GKFFD");
        listaArray.add("TNANA");
        listaArray.add("MPMSL");
        listaArray.add("PSWME");
        listaArray.add("LZMLF");
        listaArray.add("JYEBV");
        listaArray.add("YELNT");
        listaArray.add("JSNKR");
        listaArray.add("JFESF");
        listaArray.add("TMJLL");

        return listaArray;
    }

    public static void printElementsAndIndex(List<String> customList) {
        for (int i = 0; i < customList.size(); i++) {
            System.out.println("Element at index " + i + " : " + customList.get(i));
        }
    }

    public static boolean addElementToList(List<String> customList, String element) {
        customList.add(element);
        return true;
    }

    public static void main(String[] args) {
        List<String> newListaArray = createArrayList();
        boolean anhadido = addElementToList(newListaArray, "AAAAA");
        printElementsAndIndex(newListaArray);
    }
}
