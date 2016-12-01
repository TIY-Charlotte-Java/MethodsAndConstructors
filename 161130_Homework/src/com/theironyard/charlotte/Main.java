package com.theironyard.charlotte;

import com.sun.org.apache.xml.internal.security.encryption.AgreementMethod;

public class Main {

    public static void main(String[] args) {
        Character harry = new Character("Harry Potter", 15, true);
        harry.house = "Gryffindor";
        harry.year = 5;

        harry.hadBirthday();
        System.out.println("Harry's age is " + harry.getAge());

        Aggressor voldemort = new Aggressor( "voldemort", 9000, 1);
        voldemort.isItYouKnowWho = true;
        voldemort.spellOfChoice = "Avada Kedavra";

        voldemort.attackedHarry();
        System.out.println(voldemort.outcome);

        FantasticBeast buckbeak = new FantasticBeast("hippogriff", 4, 1 );
        buckbeak.color = "silver";
        buckbeak.numberOfLegs = 4;

        buckbeak.beastIsProvoked();
        System.out.println(buckbeak.outcome);

        House gryffindor = new House("Gryffindor", 19);
        gryffindor.headOfHouse = "Minerva McGonagall";
        gryffindor.houseColor = "Scarlett and Gold";
        gryffindor.numberOfRooms = 3;

        gryffindor.newYear();
        System.out.println("Gryffindor now has " + gryffindor.getNumberOfStudents() + " students!");

        Spell avadaKedavra = new Spell("killing curse", 7);
        avadaKedavra.defense = "Mother's love";
        avadaKedavra.deadly = true;
        avadaKedavra.timesHit = 1;

        avadaKedavra.spellCast();
        System.out.println(avadaKedavra.outcome);

        gryffindor.houseCup();
        System.out.println(gryffindor.outcome);

        gryffindor.expandingCharm();
        System.out.println("Too many students! Perform an expanding charm so we will have " + gryffindor.numberOfRooms + " rooms!");

        avadaKedavra.counterCurse();
        System.out.println(avadaKedavra.outcome);

        Spell crucio = new Spell("unforgivable curse", 6);
        crucio.levelOfInjury = 5;

        crucio.iveBeenHit();
        System.out.println(crucio.outcome);

        FantasticBeast hydra = new FantasticBeast("water snake", 7, 5);

        hydra.cutOffHead();
        System.out.println("Don't cut off its head! Now it has " + hydra.getNumberOfHeads() + "!");

        FantasticBeast bane = new FantasticBeast("horse/man", 6, 1);
        bane.numberOfLegs = 4;

        bane.humanOrCentaur();
        System.out.println("Is he a human or a centaur? " + bane.outcome + " duh");

        harry.sortingHat();
        System.out.println("You've been sorted into " + harry.outcome);

        harry.owls();
        System.out.println("You've passed your OWLs! Welcome to year " + harry.year);

        Aggressor dracoMalfoy = new Aggressor("dracoMalfoy", 4, 1);
        dracoMalfoy.isItYouKnowWho = false;

        dracoMalfoy.wizardsDuel();
        System.out.println(dracoMalfoy.outcome);

        dracoMalfoy.harryFights();
        System.out.println(dracoMalfoy.outcome);

    }
}