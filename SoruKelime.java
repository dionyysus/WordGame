package word_game;

public class SoruKelime {
    private String soru;
    private String kelime;
    public SoruKelime(){}
    public void SoruKelime(String soru, String kelime) {
        this.soru = soru;
        this.kelime = kelime;
    }

    public String getSoru() {
        return soru;
    }

    public void setSoru(String soru) {
        this.soru = soru;
    }

    public String getKelime() {
        return kelime;
    }

    public void setKelime(String kelime) {
        this.kelime = kelime;
    }

    @Override
    public String toString() {
        return "SoruKelime{" + "soru=" + soru + ", kelime=" + kelime + '}';
    }
    
    
    
}
