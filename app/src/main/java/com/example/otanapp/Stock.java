package com.example.otanapp;

import java.util.ArrayList;
import java.util.List;

//import javax.swing.ComboBox;

public class Stock {
    ArrayList<Stock> Stocks = new ArrayList<>(); // new ArrayList<>();
    ArrayList<Stock> StockUkraine;//Stock pour l'Ukraine
    ArrayList<Pays> ListePays = new ArrayList<>();
    //JComboBox<Object> LesMedicaments2 = new JComboBox();
    String nom;
    int quantite;

    public List<Stock> getStocks() {
        return Stocks;
    }

    /*public void setStocks(List<Stock> stocks) {
        Stocks = stocks;
    }*/

    public List<Pays> getListePays() {
        return ListePays;
    }

    /*public void setListePays(List<Pays> listePays) {
        ListePays = listePays;
    }*/

    public String getNom() {
        return nom;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Stock(String nom, int quantite){
        this.nom=nom;
        this.quantite=quantite;
    }

    /*public void addStock(Stock Arme){
        Stocks.add(Arme);
    }*/


    int quantiteU=0;

    /*public void addStockU(String nomstock, int quantiteU){
        StockUkraine.add(quantiteU,nomstock);
    }

    int don;

    public void livraison(Stock Arme, int quantiteU, int don, String reference) {
    	for (int i = 0; i < list_pays.size(); i++) {
    		if (reference == list_pays.get(i).getNom()) {
    			quantiteU = (list_pays.get(i).getQuantite()-don);
    			(list_pays.get(i).getQuantite()) -= don;
    			Ukraine.addStockU(list_pays.get(i).getNom(),quantiteU);
    		}
    	}
    	}*/
}
