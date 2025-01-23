import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ConducteurTest {

    private Driver conducteur;

    @BeforeEach
    public void setUp() {
        conducteur = new Driver("John", 20);
    }

    @Test
    public void testEstAdulte() {
        assertThat(conducteur.isAdult()).isTrue();
    }

    @Test
    public void testDemarrerVoiture() {
        Car voiture = new Car("Sedan", "Bleu");
        conducteur.startCar(voiture);
        // How to assert that the demarrerVoiture method was called?
    }

    @Test
    public void testArreterVoiture() {
        Car voiture = new Car("Sedan", "Bleu");
        conducteur.stopCar(voiture);
        // How to assert that the arreterVoiture method was called?
    }

    @Test
    public void testChangerVitesse() {
        Car voiture = new Car("Sedan", "Bleu");

        conducteur.changeSpeed(voiture, 80);
        assertThat(voiture.getSpeed()).isEqualTo(80);
    }
}
