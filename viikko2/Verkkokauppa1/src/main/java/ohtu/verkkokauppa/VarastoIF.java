

package ohtu.verkkokauppa;

/**
 * [duplikaattikoodin testaus]
 * @author Santeri
 */
public interface VarastoIF {

    Tuote haeTuote(int id);

    void otaVarastosta(Tuote t);

    void palautaVarastoon(Tuote t);

    int saldo(int id);
    
}
