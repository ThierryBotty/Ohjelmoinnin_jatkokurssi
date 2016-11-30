
import java.util.*;

public class Kayttoliittyma {
    
    private Map<String, List<String>> numerot;
    private Map<String, String> numeroidenOmistajat;
    private Scanner lukija;
    private Map<String, Henkilo> henkilot;
    
    public Kayttoliittyma(Scanner lukija) {
        this.lukija = lukija;
        this.henkilot = new HashMap<>();
        this.numerot = new HashMap<>();
        this.numeroidenOmistajat = new HashMap<>();
        
    }
    
    public void kaynnista() {
        System.out.println(" numerotiedustelu\n"
                + " käytettävissä olevat komennot:\n"
                + " 1 lisää numero\n"
                + " 2 hae numerot\n"
                + " 3 hae puhelinnumeroa vastaava henkilö\n"
                + " 4 lisää osoite\n"
                + " 5 hae henkilön tiedot\n"
                + " 6 poista henkilön tiedot\n"
                + " 7 filtteröity listaus\n"
                + " x lopeta");
        
        suoritaKomento(this.lukija);
    }
    
    private void suoritaKomento(Scanner lukija) {
        
        while (true) {
            System.out.print("\nkomento: ");
            String komento = lukija.nextLine();
            
            if (komento.equals("1")) {
                
                System.out.print("kenelle: ");
                String nimi = lukija.nextLine();
                System.out.print("numero: ");
                String numero = lukija.nextLine();
                
                if (!numerot.containsKey(nimi)) {
                    numerot.put(nimi, new ArrayList<>());
                }
                
                numerot.get(nimi).add(numero);
                numeroidenOmistajat.put(numero, nimi);
                
                if (!henkilot.containsKey(nimi)) {
                    henkilot.put(nimi, new Henkilo(nimi));
                }
                
            } else if (komento.equals("2")) {
                System.out.print("kenen: ");
                String nimi = lukija.nextLine();
                
                if (!numerot.containsKey(nimi)) {
                    System.out.println(" ei löytynyt");
                    
                } else {
                    tulostaNumerot(nimi);
                }
                
            } else if (komento.equals("3")) {
                System.out.print("numero: ");
                String numero = lukija.nextLine();
                
                if (!numeroidenOmistajat.containsKey(numero)) {
                    System.out.println(" ei löytynyt");
                    
                } else {
                    System.out.println(numeroidenOmistajat.get(numero));
                }
                
            } else if (komento.equals("4")) {
                System.out.print("kenelle: ");
                String nimi = lukija.nextLine();
                System.out.print("katu: ");
                String katu = lukija.nextLine();
                System.out.print("kaupunki: ");
                String kaupunki = lukija.nextLine();
                
                if (!henkilot.containsKey(nimi)) {
                    Henkilo henkilo = new Henkilo(nimi);
                    henkilo.lisaaOsoite(katu, kaupunki);
                    henkilot.put(nimi, henkilo);
                    
                } else {
                    henkilot.get(nimi).lisaaOsoite(katu, kaupunki);
                }
                
            } else if (komento.equals("5")) {
                System.out.print("kenen: ");
                String nimi = lukija.nextLine();
                
                tulostaTiedot(nimi);
                
            } else if (komento.equals("6")) {
                System.out.println(" kenet");
                String nimi = lukija.nextLine();
                henkilot.remove(nimi);
                numerot.remove(nimi);
                
            } else if (komento.equals("7")) {
                System.out.println("hakusana (jos tyhjä, listataan kaikki): ");
                List<Henkilo> tulostettavatHenkilot = new ArrayList<>();
                String haettava = lukija.nextLine();
                
                if (haettava.isEmpty()) {
                    for (Henkilo henkilo : henkilot.values()) {
                        jarjestaJaTulosta(tulostettavatHenkilot);
                    }
                    
                } else {
                    boolean loytyiko = false;
                    
                    for (Henkilo henkilo : henkilot.values()) {
                        
                        if (henkilo.haeNimi().contains(haettava) || henkilo.haeOsoite().contains(haettava)) {
                            tulostettavatHenkilot.add(henkilo);
                            loytyiko = true;
                        }
                    }
                    if (loytyiko == false) {
                        System.out.println(" Ei löytynyt");
                    } else {
                        jarjestaJaTulosta(tulostettavatHenkilot);
                    }
                }
                
            } else if (komento.equals("x")) {
                break;
            }
        }
    }
    
    private void jarjestaJaTulosta(List<Henkilo> tulostettavatHenkilot) {
        Collections.sort(tulostettavatHenkilot);
        for (Henkilo henkilo : tulostettavatHenkilot) {
            System.out.println(henkilo.haeNimi());
            tulostaTiedot(henkilo.haeNimi());
        }
    }
    
    private void tulostaTiedot(String nimi) {
        if (!henkilot.containsKey(nimi) && !numerot.containsKey(nimi)) {
            System.out.println(" ei löytynyt");
        } else {
            if (!henkilot.containsKey(nimi) || henkilot.get(nimi).haeOsoite().isEmpty()) {
                System.out.println(" osoite ei tiedossa");
            } else {
                System.out.println(" " + henkilot.get(nimi));
            }
            
            if (!numerot.containsKey(nimi)) {
                System.out.println(" ei puhelinta");
                
            } else {
                System.out.println(" puhelinnumerot:");
                tulostaNumerot(nimi);
            }
        }
    }
    
    private void tulostaNumerot(String nimi) {
        for (String numero : numerot.get(nimi)) {
            System.out.println(" " + numero);
        }
    }
}
