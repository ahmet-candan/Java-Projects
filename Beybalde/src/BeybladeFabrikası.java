public class BeybladeFabrikası {
    public Beyblade beybladeUret(String beyblad_turu) {
        if (beyblad_turu.equals("Dragon")) {
            return new Dragon("Takao", 800, 300, "Mavi Ejderha", "Kutsal canavarla konuşma");

        }
        else if (beyblad_turu.equals("Dranza")) {
            return new Dranza("Kai", 600, 400, "Kırmızı Anka Kuşu");

        }

        else if (beyblad_turu.equals("Drayga")) {
            return new Drayga("Rei", 800, 250, "Beyaz Kaplan");

        }

        else if (beyblad_turu.equals("Draciel")) {
            return new Draciel("Rei", 800, 250, "Beyaz Kaplan");

        }

        else{
            return null;
        }


    }
}

