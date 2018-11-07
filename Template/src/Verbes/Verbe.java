package Verbes;

public abstract class Verbe {

    protected String radical;
    protected String terminaison;

    public Verbe(String radical, String terminaison) {
        this.terminaison = terminaison;
        if(!this.checkTerminaison(radical)){
            throw new IllegalArgumentException("mauvaise classification");
        }
        this.radical = radical.substring(0, radical.length()-terminaison.length());
    }

    protected boolean checkTerminaison(String radical){
        return this.checkTerminaison(radical, this.terminaison);
    }

    protected boolean checkTerminaison(String radical, String terminaison){
        return radical.endsWith(terminaison);
    }

    abstract String conjugue1erePersonneSingulier();
    abstract String conjugue1erePersonnePluriel();
    abstract String conjugueParticipePresent();
    abstract String conjugueParticipePasse();

    @Override
    public String toString() {
        return radical+terminaison;
    }
}
