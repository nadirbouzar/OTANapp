package com.example.otanapp;

import java.util.ArrayList;
import java.util.List;

//import javax.swing.ComboBox;


public class Pays {
    String nompays;
    String motdepasse;
    String membre;

    ArrayList<Stock> Stocks = new ArrayList<>(); // new ArrayList<>();
    ArrayList<Stock> StockUkraine = new ArrayList<>();//Stock pour l'Ukraine
    ArrayList<Pays> ListePays = new ArrayList<>();
    //JComboBox<Object> LesMedicaments2 = new JComboBox();

    public String getNom() {
        return nompays;
    }

    public ArrayList<Stock> getStocks() {
        return Stocks;
    }

    public void setStocks(ArrayList<Stock> stocks) {
        Stocks = stocks;
    }

    public void setNom(String nompays) {
        this.nompays = nompays;
    }

    public Pays(String nompays, String motdepasse) {
        this.nompays = nompays;
        this.motdepasse = motdepasse;
        this.Stocks = Stocks;
    }

    public String getMotdepasse() {
        return motdepasse;
    }

    public void setMotdepasse(String motdepasse) {
        this.motdepasse = motdepasse;
    }

    public void addStock(Stock Arme){
        Stocks.add(Arme);
    }


    int quantiteU=0;

    public void addStockU(Stock Arme){
        StockUkraine.add(Arme);
    }

    int don;

   /* Pays Ukraine = new Pays("Ukraine","ukraine99");
    public void livraison(String membre, String demande) {
		for (int i =0 ; i < list_pays.size(); i++) {
    		if (membre == list_pays.get(i).getNom()) {
    			for (int j = 0; j < Stocks.size(); j++) {
    				quantiteU = (StockUkraine.get(j).getQuantite());
    				if ((demande == Stocks.get(j).getNom()) && (quantiteU==0)) {
    					int quantite = (Stocks.get(j).getQuantite());
    					quantiteU += don;
    					quantite = quantite - quantiteU;
    					Ukraine.addStockU(new Stock (Stocks.get(j).getNom(), quantiteU));
    				}else if ((demande == StockUkraine.get(j).getNom())) {
    					quantiteU = (StockUkraine.get(j).getQuantite());
    					quantiteU += don;
    				}
    			}
    			}
    		}

    	}*/
    /*public static void main(String[] args) {
        List<Stock> Stocks = new ArrayList<>();
        List<Pays> ListePays = new ArrayList<>();

        Pays Espagne = new Pays("Espagne", "espana82");
        Espagne.addStock(new Stock("Uzi à balles traçantes", 10000));

        Pays France = new Pays("France", "france12",Stocks);
        France.ListePays.add(France);
        Pays EU = new Pays("EU", "eu34",Stocks);
        EU.ListePays.add(EU);
        Pays Allemagne = new Pays("Allemagne", "allemagne56",Stocks);
        Allemagne.ListePays.add(Allemagne);
        Pays UK = new Pays("UK", "uk78",Stocks);
        UK.ListePays.add(UK);
        Pays Italie = new Pays("Italie", "italie90",Stocks);
        Italie.ListePays.add(Italie);
        Pays Ukraine = new Pays("Ukraine", "ukraine99",Stocks);
        Ukraine.ListePays.add(Ukraine);
        System.out.println(ListePays);

        //EU
        Stock Predator = new Stock("Predator", 2);
        Stock SystemeHIRMAS = new Stock('SystemeHIRMAS', 4);
        Stock Stryker = new Stock('Stryker', 10);
        Stock F35 = new Stock('F35', 6);
        Predator.Stocks.add(Predator);
        Stocks.add(SystemeHIRMAS);
        Stryker.Stocks.add(Stryker);
        F35.Stocks.add(F35);

        //France
        Stock CanonCaesar = new Stock('Canon Caesar', 12);
        Stock AMX10RC = new Stock('AMX10RC', 10);
        Stock Formation = new Stock('Formation sur Mirage2000', 50);
        Stock TIGRE = new Stock('TIGRE', 5);
        Stock Milan = new Stock('Missile anti-char Milan', 13);
        CanonCaesar.Stocks.add(CanonCaesar);
        AMX10RC.Stocks.add(AMX10RC);
        Formation.Stocks.add(Formation);
        TIGRE.Stocks.add(TIGRE);
        Milan.Stocks.add(Milan);

        //Allemagne
        Stock Marder = new Stock('Blindé Marder (transport)', 10);
        Stock Patriot = new Stock('Système antiaérien Patriot', 4);
        Stock Leopard2 = new Stock('Leopard2', 6);
        Stock Sidewinder = new Stock('Missile Sidewinder', 11);
        Stock Fennek = new Stock('Fennek vehicule attaque', 6);
        Marder.Stocks.add(Marder);
        Patriot.Stocks.add(Patriot);
        Leopard2.Stocks.add(Leopard2);
        Sidewinder.Stocks.add(Sidewinder);
        Fennek.Stocks.add(Fennek);

        //Italie
        Stock MAMBA = new Stock('MAMBA', 4);
        Stock Stinger = new Stock('Missile Stinger Portatif', 12);
        Stock Berreta = new Stock('Armme de poing Berreta', 20);
        MAMBA.Stocks.add(MAMBA);
        Stinger.Stocks.add(Stinger);
        Berreta.Stocks.add(Berreta);

        //UK
        Stock SeaKing = new Stock('Helicoptere Sea King', 5);
        Stock Munitions = new Stock('Munitions', 3000);
        Stock Challenger2 = new Stock('Challenger2', 5);
        Stock M270MLRS = new Stock('Système artiellerie longue M270 MLRS', 3);
        SeaKing.Stocks.add(SeaKing);
        Munitions.Stocks.add(Munitions);
        Challenger2.Stocks.add(Challenger2);
        M270MLRS.Stocks.add(M270MLRS);

        System.out.println(Stocks);
    }*/
}