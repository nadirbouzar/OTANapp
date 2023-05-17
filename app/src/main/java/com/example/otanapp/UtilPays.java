package com.example.otanapp;

import java.util.ArrayList;
import java.util.List;

public class UtilPays {
    public static ArrayList<Pays> getPays() {
        ArrayList<Pays> list_pays = new ArrayList<>();

        //France
        Pays France = new Pays("France", "france12");
        France.addStock(new Stock("AMX10RC",10));
        France.addStock(new Stock("Formation sur Mirage2000",50));
        France.addStock(new Stock("TIGRE",5));
        France.addStock(new Stock("Canon Caesar",12));
        France.addStock(new Stock("Missile anti-char Milan",13));
        list_pays.add(France);

        //EU
        Pays EU = new Pays("EU", "eu34");
        EU.addStock(new Stock("Predator",2));
        EU.addStock(new Stock("SystemeHIRMAS",4));
        EU.addStock(new Stock("Stryker",10));
        EU.addStock(new Stock("F35",6));
        list_pays.add(EU);

        //Allemagne
        Pays Allemagne = new Pays("Allemagne", "allemagne56");
        Allemagne.addStock(new Stock("Blinde Marder(transport)",10));
        Allemagne.addStock(new Stock("Systeme antiaerien Patriot",4));
        Allemagne.addStock(new Stock("Leopard2",6));
        Allemagne.addStock(new Stock("Missile sidewinder",11));
        Allemagne.addStock(new Stock("Fennek vehicule attaque",6));
        list_pays.add(Allemagne);

        //UK
        Pays UK = new Pays("UK", "uk78");
        UK.addStock(new Stock("Helicoptere SeaKing",5));
        UK.addStock(new Stock("Munitions",3000));
        UK.addStock(new Stock("Challenger2",5));
        UK.addStock(new Stock("Système artiellerie longue M270 MLRS",3));
        list_pays.add(UK);

        //Italie
        Pays Italie = new Pays("Italie", "italie90");
        Italie.addStock(new Stock("MAMBA",4));
        Italie.addStock(new Stock("Missile Stinger portatif",12));
        Italie.addStock(new Stock("Arme de poing Berreta",1000));
        //Italie.addStock(new Stock("test",1));
        list_pays.add(Italie);

        //Ukraine
        Pays Ukraine = new Pays("Ukraine","ukraine99");
        //Ukraine.livraison("","");
        //Ukraine.addStockU(1, new Stock ("MAMBA",3));
        list_pays.add(Ukraine);

        return list_pays;
    }
}
