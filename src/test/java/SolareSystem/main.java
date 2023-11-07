package SolareSystem;

public class main {
    public static <Planet1> void main(String[] args) {

        SolarSystemBasics solarSys=new SolarSystemBasics();
        solarSys.Sun="2";
        solarSys.Moon="2";
        solarSys.stars="20";
        solarSys.planets="2";
        //************Feature Sun***************

        FeatureSun Sun=new FeatureSun();
        Sun.name="panther";
        Sun.color="black";
        Sun.temp="12131234khk";


        //Planet2
        Planet2 shah=new Planet2();
        shah.name="Rasol";
        shah.color="white";
        shah.size="123km";

        // Planet1

        Planet1 planet1=new Planet1();
        planet1.color="green";
        planet1.name="abacadarba";
        planet1.temp="100000k";
        planet1.radius="800000km";




    }
}
